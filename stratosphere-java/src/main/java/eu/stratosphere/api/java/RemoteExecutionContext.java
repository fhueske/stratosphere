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
package eu.stratosphere.api.java;


public class RemoteExecutionContext extends ExecutionContext {
	
	private final String host;
	
	private final int port;
	
	
	
	public RemoteExecutionContext(String host, int port) {
		super();
		
		if (host == null)
			throw new NullPointerException("Host must not be null.");
		
		if (port < 1 || port >= 0xffff)
			throw new IllegalArgumentException("Port out of range");
		
		this.host = host;
		this.port = port;
	}

	@Override
	public String toString() {
		return "Remote Context (" + this.host + ":" + this.port + " - DOP = " + getDegreeOfParallelism() + ") : " + getIdString();
	}
}