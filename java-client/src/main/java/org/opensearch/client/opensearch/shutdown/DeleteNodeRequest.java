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

package org.opensearch.client.opensearch.shutdown;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Objects;

// typedef: shutdown.delete_node.Request
public final class DeleteNodeRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String nodeId;

	private final String stub;

	// ---------------------------------------------------------------------------------------------

	protected DeleteNodeRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * Auto generated - missing in the input spec
	 *
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code stub}
	 */
	public String stub() {
		return this.stub;
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

		generator.writeKey("stub");
		generator.write(this.stub);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteNodeRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteNodeRequest> {
		@Nullable
		private String nodeId;

		private String stub;

		/**
		 * Auto generated - missing in the input spec
		 *
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(String value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteNodeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteNodeRequest build() {

			return new DeleteNodeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeleteNodeRequest
	 */
	public static final JsonpDeserializer<DeleteNodeRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DeleteNodeRequest::setupDeleteNodeRequestDeserializer);

	protected static void setupDeleteNodeRequestDeserializer(DelegatingDeserializer<DeleteNodeRequest.Builder> op) {

		op.add(Builder::stub, JsonpDeserializer.stringDeserializer(), "stub");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code shutdown.delete_node}".
	 */
	public static final Endpoint<DeleteNodeRequest, DeleteNodeResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId);
					buf.append("/shutdown");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, DeleteNodeResponse.DESERIALIZER);
}
