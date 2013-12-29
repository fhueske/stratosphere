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

// --------------------------------------------------------------
//  THIS IS A GENERATED SOURCE FILE. DO NOT EDIT!
// --------------------------------------------------------------


package eu.stratosphere.api.java.tuple;

public final class Tuple2<T1, T2> extends Tuple {

	public T1 _1;
	public T2 _2;

	public Tuple2() {}

	public Tuple2(T1 _1, T2 _2) {
		this._1 = _1;
		this._2 = _2;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getField(int pos) {
		switch(pos) {
			case 1: return (T) this._1;
			case 2: return (T) this._2;
			default: throw new IndexOutOfBoundsException(String.valueOf(pos));
		}
	}
	@Override
	@SuppressWarnings("unchecked")
	public <T> void setField(T value, int pos) {
		switch(pos) {
			case 1:
				this._1 = (T1) value;
				break;
			case 2:
				this._2 = (T2) value;
				break;
			default: throw new IndexOutOfBoundsException(String.valueOf(pos));
		}
	}
}
