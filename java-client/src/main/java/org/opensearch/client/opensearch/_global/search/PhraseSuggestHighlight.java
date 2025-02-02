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

package org.opensearch.client.opensearch._global.search;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: _global.search._types.PhraseSuggestHighlight
public final class PhraseSuggestHighlight implements ToJsonp {
	private final String postTag;

	private final String preTag;

	// ---------------------------------------------------------------------------------------------

	protected PhraseSuggestHighlight(Builder builder) {

		this.postTag = Objects.requireNonNull(builder.postTag, "post_tag");
		this.preTag = Objects.requireNonNull(builder.preTag, "pre_tag");

	}

	/**
	 * API name: {@code post_tag}
	 */
	public String postTag() {
		return this.postTag;
	}

	/**
	 * API name: {@code pre_tag}
	 */
	public String preTag() {
		return this.preTag;
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

		generator.writeKey("post_tag");
		generator.write(this.postTag);

		generator.writeKey("pre_tag");
		generator.write(this.preTag);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestHighlight}.
	 */
	public static class Builder implements ObjectBuilder<PhraseSuggestHighlight> {
		private String postTag;

		private String preTag;

		/**
		 * API name: {@code post_tag}
		 */
		public Builder postTag(String value) {
			this.postTag = value;
			return this;
		}

		/**
		 * API name: {@code pre_tag}
		 */
		public Builder preTag(String value) {
			this.preTag = value;
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggestHighlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestHighlight build() {

			return new PhraseSuggestHighlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PhraseSuggestHighlight
	 */
	public static final JsonpDeserializer<PhraseSuggestHighlight> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PhraseSuggestHighlight::setupPhraseSuggestHighlightDeserializer);

	protected static void setupPhraseSuggestHighlightDeserializer(
			DelegatingDeserializer<PhraseSuggestHighlight.Builder> op) {

		op.add(Builder::postTag, JsonpDeserializer.stringDeserializer(), "post_tag");
		op.add(Builder::preTag, JsonpDeserializer.stringDeserializer(), "pre_tag");

	}

}
