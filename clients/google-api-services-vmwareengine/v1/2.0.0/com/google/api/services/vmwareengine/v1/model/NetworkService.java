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

package com.google.api.services.vmwareengine.v1.model;

/**
 * Represents a network service that is managed by a `NetworkPolicy` resource. A network service
 * provides a way to control an aspect of external access to VMware workloads. For example, whether
 * the VMware workloads in the private clouds governed by a network policy can access or be accessed
 * from the internet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VMware Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkService extends com.google.api.client.json.GenericJson {

  /**
   * True if the service is enabled; false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Output only. State of the service. New values may be added to this enum when appropriate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * True if the service is enabled; false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * True if the service is enabled; false otherwise.
   * @param enabled enabled or {@code null} for none
   */
  public NetworkService setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Output only. State of the service. New values may be added to this enum when appropriate.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the service. New values may be added to this enum when appropriate.
   * @param state state or {@code null} for none
   */
  public NetworkService setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public NetworkService set(String fieldName, Object value) {
    return (NetworkService) super.set(fieldName, value);
  }

  @Override
  public NetworkService clone() {
    return (NetworkService) super.clone();
  }

}
