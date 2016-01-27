/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.example.mapreduce;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.ExecutionCallback;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ICompletableFuture;
import com.hazelcast.core.IMap;
import com.hazelcast.mapreduce.Job;
import com.hazelcast.mapreduce.JobTracker;
import com.hazelcast.mapreduce.KeyValueSource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Map;

/**
 * A basic and simple MapReduce demo application for the Hazelcast MR framework.
 * The example Lorem Ipsum texts were created by this awesome generator: http://www.lipsum.com/
 *
 * For any further questions feel free
 * - to ask at the mailing list: https://groups.google.com/forum/#!forum/hazelcast
 * - read the Javadoc: http://hazelcast.org/docs/latest/javadoc/
 * - read the documentation this demo is for: http://bit.ly/1nQSxhH
 */
public class MapReduceDemo {

    private static final String[] DATA_RESOURCES_TO_LOAD = {"text1.txt", "text2.txt", "text3.txt"};

    public static void main(String[] args)
            throws Exception {

        HazelcastInstance hazelcastInstance = getHazelCastClient();

        try {
            fillMapWithData(hazelcastInstance);

            Map<String, Long> countsPerWord = mapReduce(hazelcastInstance);
            System.out.println("Counts per words over " + DATA_RESOURCES_TO_LOAD.length + " files:");
            for (Map.Entry<String, Long> entry : countsPerWord.entrySet()) {
                System.out.println("\tWord '" + entry.getKey() + "' occured " + entry.getValue() + " times");
            }

            long wordCount = mapReduceCollate(hazelcastInstance);
            System.out.println("All content sums up to " + wordCount + " words.");

        } finally {
            Hazelcast.shutdownAll();
        }
    }

    private static Map<String, Long> mapReduce(HazelcastInstance hazelcastInstance)
            throws Exception {

        // Retrieving the JobTracker by name
        JobTracker jobTracker = hazelcastInstance.getJobTracker("default");

        // Creating the KeyValueSource for a Hazelcast IMap
        IMap<String, String> map = hazelcastInstance.getMap("articles");
        KeyValueSource<String, String> source = KeyValueSource.fromMap(map);

        Job<String, String> job = jobTracker.newJob(source);

        // Creating a new Job
        ICompletableFuture<Map<String, Long>> future = job // returned future
                .mapper(new TokenizerMapper())             // adding a mapper
                .combiner(new WordCountCombinerFactory())  // adding a combiner through the factory
                .reducer(new WordCountReducerFactory())    // adding a reducer through the factory
                .submit();                                 // submit the task

        // Attach a callback listener
        future.andThen(buildCallback());

        // Wait and retrieve the result
        return future.get();
    }

    private static long mapReduceCollate(HazelcastInstance hazelcastInstance)
            throws Exception {

        // Retrieving the JobTracker by name
        JobTracker jobTracker = hazelcastInstance.getJobTracker("default");

        // Creating the KeyValueSource for a Hazelcast IMap
        IMap<String, String> map = hazelcastInstance.getMap("articles");
        KeyValueSource<String, String> source = KeyValueSource.fromMap(map);

        // Creating a new Job
        Job<String, String> job = jobTracker.newJob(source);

        ICompletableFuture<Long> future = job // returned future
                .mapper(new TokenizerMapper())             // adding a mapper
                .combiner(new WordCountCombinerFactory())  // adding a combiner through the factory
                .reducer(new WordCountReducerFactory())    // adding a reducer through the factory
                .submit(new WordCountCollator());          // submit the task and supply a collator

        // Wait and retrieve the result
        return future.get();
    }

    private static ExecutionCallback<Map<String, Long>> buildCallback() {
        return new ExecutionCallback<Map<String, Long>>() {
            @Override
            public void onResponse(Map<String, Long> stringLongMap) {
                System.out.println("Calculation finished! :)");
            }

            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }

    private static void fillMapWithData(HazelcastInstance hazelcastInstance)
            throws Exception {

        IMap<String, String> map = hazelcastInstance.getMap("articles");
        for (String file : DATA_RESOURCES_TO_LOAD) {
            InputStream is = MapReduceDemo.class.getResourceAsStream("/" + file);
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(is));

            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            map.put(file, sb.toString());

            is.close();
            reader.close();
        }
    }

    public static HazelcastInstance getHazelCastClient(){
        /*try {
            ClientConfig clientConfig = new ClientConfig();
            String addresses = "localhost.com:5701";
            clientConfig.setGroupConfig(new GroupConfig("dev","dev-pwd"));
            clientConfig.getNetworkConfig().addAddress(addresses.split(","));
            HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
            return client;
        }catch (Exception e){
            e.printStackTrace();
        }*/
        return Hazelcast.newHazelcastInstance();
    }

}
