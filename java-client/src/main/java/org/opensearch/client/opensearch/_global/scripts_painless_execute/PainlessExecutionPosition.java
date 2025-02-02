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

package org.opensearch.client.opensearch._global.scripts_painless_execute;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: _global.scripts_painless_execute.PainlessExecutionPosition
public final class PainlessExecutionPosition implements ToJsonp {
	private final Number offset;

	private final Number start;

	private final Number end;

	// ---------------------------------------------------------------------------------------------

	protected PainlessExecutionPosition(Builder builder) {

		this.offset = Objects.requireNonNull(builder.offset, "offset");
		this.start = Objects.requireNonNull(builder.start, "start");
		this.end = Objects.requireNonNull(builder.end, "end");

	}

	/**
	 * API name: {@code offset}
	 */
	public Number offset() {
		return this.offset;
	}

	/**
	 * API name: {@code start}
	 */
	public Number start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	public Number end() {
		return this.end;
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

		generator.writeKey("offset");
		generator.write(this.offset.doubleValue());

		generator.writeKey("start");
		generator.write(this.start.doubleValue());

		generator.writeKey("end");
		generator.write(this.end.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PainlessExecutionPosition}.
	 */
	public static class Builder implements ObjectBuilder<PainlessExecutionPosition> {
		private Number offset;

		private Number start;

		private Number end;

		/**
		 * API name: {@code offset}
		 */
		public Builder offset(Number value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(Number value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(Number value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link PainlessExecutionPosition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PainlessExecutionPosition build() {

			return new PainlessExecutionPosition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PainlessExecutionPosition
	 */
	public static final JsonpDeserializer<PainlessExecutionPosition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PainlessExecutionPosition::setupPainlessExecutionPositionDeserializer);

	protected static void setupPainlessExecutionPositionDeserializer(
			DelegatingDeserializer<PainlessExecutionPosition.Builder> op) {

		op.add(Builder::offset, JsonpDeserializer.numberDeserializer(), "offset");
		op.add(Builder::start, JsonpDeserializer.numberDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.numberDeserializer(), "end");

	}

}
