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

package org.opensearch.client.opensearch.cluster;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch.cluster.pending_tasks.PendingTask;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.pending_tasks.Response
public final class PendingTasksResponse implements ToJsonp {
	private final List<PendingTask> tasks;

	// ---------------------------------------------------------------------------------------------

	protected PendingTasksResponse(Builder builder) {

		this.tasks = Objects.requireNonNull(builder.tasks, "tasks");

	}

	/**
	 * API name: {@code tasks}
	 */
	public List<PendingTask> tasks() {
		return this.tasks;
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

		generator.writeKey("tasks");
		generator.writeStartArray();
		for (PendingTask item0 : this.tasks) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTasksResponse}.
	 */
	public static class Builder implements ObjectBuilder<PendingTasksResponse> {
		private List<PendingTask> tasks;

		/**
		 * API name: {@code tasks}
		 */
		public Builder tasks(List<PendingTask> value) {
			this.tasks = value;
			return this;
		}

		/**
		 * API name: {@code tasks}
		 */
		public Builder tasks(PendingTask... value) {
			this.tasks = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tasks(List)}, creating the list if needed.
		 */
		public Builder addTasks(PendingTask value) {
			if (this.tasks == null) {
				this.tasks = new ArrayList<>();
			}
			this.tasks.add(value);
			return this;
		}

		/**
		 * Set {@link #tasks(List)} to a singleton list.
		 */
		public Builder tasks(Function<PendingTask.Builder, ObjectBuilder<PendingTask>> fn) {
			return this.tasks(fn.apply(new PendingTask.Builder()).build());
		}

		/**
		 * Add a value to {@link #tasks(List)}, creating the list if needed.
		 */
		public Builder addTasks(Function<PendingTask.Builder, ObjectBuilder<PendingTask>> fn) {
			return this.addTasks(fn.apply(new PendingTask.Builder()).build());
		}

		/**
		 * Builds a {@link PendingTasksResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTasksResponse build() {

			return new PendingTasksResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PendingTasksResponse
	 */
	public static final JsonpDeserializer<PendingTasksResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PendingTasksResponse::setupPendingTasksResponseDeserializer);

	protected static void setupPendingTasksResponseDeserializer(
			DelegatingDeserializer<PendingTasksResponse.Builder> op) {

		op.add(Builder::tasks, JsonpDeserializer.arrayDeserializer(PendingTask.DESERIALIZER), "tasks");

	}

}
