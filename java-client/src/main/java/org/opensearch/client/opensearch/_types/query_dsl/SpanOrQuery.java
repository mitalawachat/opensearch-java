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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _types.query_dsl.SpanOrQuery
public final class SpanOrQuery extends QueryBase {
	@Nullable
	private final List<SpanQuery> clauses;

	// ---------------------------------------------------------------------------------------------

	protected SpanOrQuery(Builder builder) {
		super(builder);
		this.clauses = builder.clauses;

	}

	/**
	 * API name: {@code clauses}
	 */
	@Nullable
	public List<SpanQuery> clauses() {
		return this.clauses;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.clauses != null) {

			generator.writeKey("clauses");
			generator.writeStartArray();
			for (SpanQuery item0 : this.clauses) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanOrQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanOrQuery> {
		@Nullable
		private List<SpanQuery> clauses;

		/**
		 * API name: {@code clauses}
		 */
		public Builder clauses(@Nullable List<SpanQuery> value) {
			this.clauses = value;
			return this;
		}

		/**
		 * API name: {@code clauses}
		 */
		public Builder clauses(SpanQuery... value) {
			this.clauses = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #clauses(List)}, creating the list if needed.
		 */
		public Builder addClauses(SpanQuery value) {
			if (this.clauses == null) {
				this.clauses = new ArrayList<>();
			}
			this.clauses.add(value);
			return this;
		}

		/**
		 * Set {@link #clauses(List)} to a singleton list.
		 */
		public Builder clauses(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.clauses(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * Add a value to {@link #clauses(List)}, creating the list if needed.
		 */
		public Builder addClauses(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.addClauses(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanOrQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanOrQuery build() {

			return new SpanOrQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SpanOrQuery
	 */
	public static final JsonpDeserializer<SpanOrQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SpanOrQuery::setupSpanOrQueryDeserializer);

	protected static void setupSpanOrQueryDeserializer(DelegatingDeserializer<SpanOrQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::clauses, JsonpDeserializer.arrayDeserializer(SpanQuery.DESERIALIZER), "clauses");

	}

}
