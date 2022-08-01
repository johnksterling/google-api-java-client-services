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

package com.google.api.services.servicemanagement.model;

/**
 * The full representation of a Service that is managed by Google Service Management.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedService extends com.google.api.client.json.GenericJson {

  /**
   * ID of the project that produces and owns this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producerProjectId;

  /**
   * The name of the service. See the [overview](https://cloud.google.com/service-
   * infrastructure/docs/overview) for naming requirements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * ID of the project that produces and owns this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducerProjectId() {
    return producerProjectId;
  }

  /**
   * ID of the project that produces and owns this service.
   * @param producerProjectId producerProjectId or {@code null} for none
   */
  public ManagedService setProducerProjectId(java.lang.String producerProjectId) {
    this.producerProjectId = producerProjectId;
    return this;
  }

  /**
   * The name of the service. See the [overview](https://cloud.google.com/service-
   * infrastructure/docs/overview) for naming requirements.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of the service. See the [overview](https://cloud.google.com/service-
   * infrastructure/docs/overview) for naming requirements.
   * @param serviceName serviceName or {@code null} for none
   */
  public ManagedService setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  @Override
  public ManagedService set(String fieldName, Object value) {
    return (ManagedService) super.set(fieldName, value);
  }

  @Override
  public ManagedService clone() {
    return (ManagedService) super.clone();
  }

}
