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

package com.google.api.services.redis.v1.model;

/**
 * An endpoint exposed by a cluster. In the future we will add an enum to identify whether this
 * endpoint is read/write or read-only when the feature is ready.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Endpoint extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @param host host or {@code null} for none
   */
  public Endpoint setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @param port port or {@code null} for none
   */
  public Endpoint setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  @Override
  public Endpoint set(String fieldName, Object value) {
    return (Endpoint) super.set(fieldName, value);
  }

  @Override
  public Endpoint clone() {
    return (Endpoint) super.clone();
  }

}
