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

import com.hazelcast.mapreduce.Context;
import com.hazelcast.mapreduce.Mapper;

import java.util.StringTokenizer;

public class TokenizerMapper
        implements Mapper<String, String, String, Long> {

    private static final Long ONE = Long.valueOf(1L);

    @Override

    public void map(String key, String document, Context<String, Long> context) {
        // Just splitting the text by whitespaces
        StringTokenizer tokenizer = new StringTokenizer(document.toLowerCase());

        // For every token in the text (=> per word)
        while (tokenizer.hasMoreTokens()) {
            // Emit a new value in the mapped results
            context.emit(tokenizer.nextToken(), ONE);
        }
    }

}