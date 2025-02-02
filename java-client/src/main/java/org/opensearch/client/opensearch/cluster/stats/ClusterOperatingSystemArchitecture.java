/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cluster.stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster.stats.ClusterOperatingSystemArchitecture
public final class ClusterOperatingSystemArchitecture implements ToJsonp {
	private final Number count;

	private final String arch;

	// ---------------------------------------------------------------------------------------------

	protected ClusterOperatingSystemArchitecture(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.arch = Objects.requireNonNull(builder.arch, "arch");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code arch}
	 */
	public String arch() {
		return this.arch;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("arch");
		generator.write(this.arch);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemArchitecture}.
	 */
	public static class Builder implements ObjectBuilder<ClusterOperatingSystemArchitecture> {
		private Number count;

		private String arch;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code arch}
		 */
		public Builder arch(String value) {
			this.arch = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemArchitecture}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemArchitecture build() {

			return new ClusterOperatingSystemArchitecture(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterOperatingSystemArchitecture
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemArchitecture> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClusterOperatingSystemArchitecture::setupClusterOperatingSystemArchitectureDeserializer);

	protected static void setupClusterOperatingSystemArchitectureDeserializer(
			DelegatingDeserializer<ClusterOperatingSystemArchitecture.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::arch, JsonpDeserializer.stringDeserializer(), "arch");

	}

}
