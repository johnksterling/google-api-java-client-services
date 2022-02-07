/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudbuild.v1alpha2.model;

/**
 * Details about how a build should be executed on a `WorkerPool`. See [running builds in a private
 * pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more
 * information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PoolOption extends com.google.api.client.json.GenericJson {

  /**
   * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use`
   * on the project hosting the WorkerPool. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Configuration per workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsCloudbuildV1BuildOptionsPoolOptionWorkerConfig workerConfig;

  /**
   * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use`
   * on the project hosting the WorkerPool. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use`
   * on the project hosting the WorkerPool. Format
   * projects/{project}/locations/{location}/workerPools/{workerPoolId}
   * @param name name or {@code null} for none
   */
  public PoolOption setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Configuration per workload.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV1BuildOptionsPoolOptionWorkerConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Configuration per workload.
   * @param workerConfig workerConfig or {@code null} for none
   */
  public PoolOption setWorkerConfig(GoogleDevtoolsCloudbuildV1BuildOptionsPoolOptionWorkerConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  @Override
  public PoolOption set(String fieldName, Object value) {
    return (PoolOption) super.set(fieldName, value);
  }

  @Override
  public PoolOption clone() {
    return (PoolOption) super.clone();
  }

}
