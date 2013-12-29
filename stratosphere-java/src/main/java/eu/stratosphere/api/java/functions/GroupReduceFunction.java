/***********************************************************************************************************************
 *
 * Copyright (C) 2010-2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/
package eu.stratosphere.api.java.functions;

import java.util.Iterator;

import eu.stratosphere.api.common.functions.AbstractFunction;
import eu.stratosphere.api.java.tuple.Tuple;
import eu.stratosphere.util.Collector;


public abstract class GroupReduceFunction<IN extends Tuple, OUT extends Tuple> extends AbstractFunction {
	
	public abstract Iterator<OUT> reduceGroup(Iterator<IN> values) throws Exception;
	
	
	public void reduce(Iterator<IN> values, Collector<OUT> out) throws Exception {
		for (Iterator<OUT> iter = reduceGroup(values); iter.hasNext(); ) {
			out.collect(iter.next());
		}
	}
}
