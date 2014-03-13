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

import com.hazelcast.mapreduce.Combiner;
import com.hazelcast.mapreduce.CombinerFactory;

public class WordCountCombinerFactory
        implements CombinerFactory<String, Long, Long> {

    @Override
    public Combiner<String, Long, Long> newCombiner(String key) {
        return new WordCountCombiner();
    }

    private class WordCountCombiner
            extends Combiner<String, Long, Long> {

        private long sum = 0;

        @Override
        public void combine(String key, Long value) {
            sum++;
        }

        @Override
        public Long finalizeChunk() {
            long chunk = sum;
            sum = 0;
            return chunk;
        }
    }
}