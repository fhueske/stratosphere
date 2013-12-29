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

public final class Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> extends Tuple {

	public T1 _1;
	public T2 _2;
	public T3 _3;
	public T4 _4;
	public T5 _5;
	public T6 _6;
	public T7 _7;
	public T8 _8;
	public T9 _9;
	public T10 _10;
	public T11 _11;
	public T12 _12;
	public T13 _13;

	public Tuple13() {}

	public Tuple13(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13) {
		this._1 = _1;
		this._2 = _2;
		this._3 = _3;
		this._4 = _4;
		this._5 = _5;
		this._6 = _6;
		this._7 = _7;
		this._8 = _8;
		this._9 = _9;
		this._10 = _10;
		this._11 = _11;
		this._12 = _12;
		this._13 = _13;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getField(int pos) {
		switch(pos) {
			case 1: return (T) this._1;
			case 2: return (T) this._2;
			case 3: return (T) this._3;
			case 4: return (T) this._4;
			case 5: return (T) this._5;
			case 6: return (T) this._6;
			case 7: return (T) this._7;
			case 8: return (T) this._8;
			case 9: return (T) this._9;
			case 10: return (T) this._10;
			case 11: return (T) this._11;
			case 12: return (T) this._12;
			case 13: return (T) this._13;
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
			case 3:
				this._3 = (T3) value;
				break;
			case 4:
				this._4 = (T4) value;
				break;
			case 5:
				this._5 = (T5) value;
				break;
			case 6:
				this._6 = (T6) value;
				break;
			case 7:
				this._7 = (T7) value;
				break;
			case 8:
				this._8 = (T8) value;
				break;
			case 9:
				this._9 = (T9) value;
				break;
			case 10:
				this._10 = (T10) value;
				break;
			case 11:
				this._11 = (T11) value;
				break;
			case 12:
				this._12 = (T12) value;
				break;
			case 13:
				this._13 = (T13) value;
				break;
			default: throw new IndexOutOfBoundsException(String.valueOf(pos));
		}
	}
}