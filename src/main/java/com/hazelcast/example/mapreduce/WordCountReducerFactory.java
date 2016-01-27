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

import com.hazelcast.mapreduce.Reducer;
import com.hazelcast.mapreduce.ReducerFactory;

public class WordCountReducerFactory
        implements ReducerFactory<String, Long, Long> {

    @Override
    public Reducer<Long, Long> newReducer(String key) {
        // Create a new Reducer for the given key
        return new WordCountReducer();
    }

    private class WordCountReducer
            extends Reducer<Long, Long> {

        private volatile long sum = 0;

        @Override
        public void reduce(Long value) {
            // Just increment the sum by the pre combined chunk value
            sum += value.longValue();
        }

        @Override
        public Long finalizeReduce() {
            // Return the final reduced sum
            return sum;
        }
    }
}
