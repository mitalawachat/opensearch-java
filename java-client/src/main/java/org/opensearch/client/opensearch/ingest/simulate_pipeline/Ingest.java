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

package org.opensearch.client.opensearch.ingest.simulate_pipeline;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;

// typedef: ingest.simulate_pipeline.Ingest
public final class Ingest implements ToJsonp {
	private final String timestamp;

	@Nullable
	private final String pipeline;

	// ---------------------------------------------------------------------------------------------

	protected Ingest(Builder builder) {

		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.pipeline = builder.pipeline;

	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
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

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (this.pipeline != null) {

			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ingest}.
	 */
	public static class Builder implements ObjectBuilder<Ingest> {
		private String timestamp;

		@Nullable
		private String pipeline;

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * Builds a {@link Ingest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ingest build() {

			return new Ingest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Ingest
	 */
	public static final JsonpDeserializer<Ingest> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Ingest::setupIngestDeserializer);

	protected static void setupIngestDeserializer(DelegatingDeserializer<Ingest.Builder> op) {

		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");

	}

}
