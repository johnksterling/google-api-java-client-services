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

package com.google.api.services.genomics.v1.model;

/**
 * An event generated after a worker VM has been assigned to run the pipeline.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerAssignedEvent extends com.google.api.client.json.GenericJson {

  /**
   * The worker's instance name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * The machine type that was assigned for the worker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The zone the worker is running in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The worker's instance name.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * The worker's instance name.
   * @param instance instance or {@code null} for none
   */
  public WorkerAssignedEvent setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * The machine type that was assigned for the worker.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * The machine type that was assigned for the worker.
   * @param machineType machineType or {@code null} for none
   */
  public WorkerAssignedEvent setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The zone the worker is running in.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The zone the worker is running in.
   * @param zone zone or {@code null} for none
   */
  public WorkerAssignedEvent setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public WorkerAssignedEvent set(String fieldName, Object value) {
    return (WorkerAssignedEvent) super.set(fieldName, value);
  }

  @Override
  public WorkerAssignedEvent clone() {
    return (WorkerAssignedEvent) super.clone();
  }

}
