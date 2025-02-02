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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch._types.LatLon;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.GeoBounds
public final class GeoBounds implements ToJsonp {
	private final LatLon bottomRight;

	private final LatLon topLeft;

	// ---------------------------------------------------------------------------------------------

	protected GeoBounds(Builder builder) {

		this.bottomRight = Objects.requireNonNull(builder.bottomRight, "bottom_right");
		this.topLeft = Objects.requireNonNull(builder.topLeft, "top_left");

	}

	/**
	 * API name: {@code bottom_right}
	 */
	public LatLon bottomRight() {
		return this.bottomRight;
	}

	/**
	 * API name: {@code top_left}
	 */
	public LatLon topLeft() {
		return this.topLeft;
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

		generator.writeKey("bottom_right");
		this.bottomRight.toJsonp(generator, mapper);

		generator.writeKey("top_left");
		this.topLeft.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBounds}.
	 */
	public static class Builder implements ObjectBuilder<GeoBounds> {
		private LatLon bottomRight;

		private LatLon topLeft;

		/**
		 * API name: {@code bottom_right}
		 */
		public Builder bottomRight(LatLon value) {
			this.bottomRight = value;
			return this;
		}

		/**
		 * API name: {@code bottom_right}
		 */
		public Builder bottomRight(Function<LatLon.Builder, ObjectBuilder<LatLon>> fn) {
			return this.bottomRight(fn.apply(new LatLon.Builder()).build());
		}

		/**
		 * API name: {@code top_left}
		 */
		public Builder topLeft(LatLon value) {
			this.topLeft = value;
			return this;
		}

		/**
		 * API name: {@code top_left}
		 */
		public Builder topLeft(Function<LatLon.Builder, ObjectBuilder<LatLon>> fn) {
			return this.topLeft(fn.apply(new LatLon.Builder()).build());
		}

		/**
		 * Builds a {@link GeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBounds build() {

			return new GeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoBounds
	 */
	public static final JsonpDeserializer<GeoBounds> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoBounds::setupGeoBoundsDeserializer);

	protected static void setupGeoBoundsDeserializer(DelegatingDeserializer<GeoBounds.Builder> op) {

		op.add(Builder::bottomRight, LatLon.DESERIALIZER, "bottom_right");
		op.add(Builder::topLeft, LatLon.DESERIALIZER, "top_left");

	}

}
