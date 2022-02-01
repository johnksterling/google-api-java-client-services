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

package com.google.api.services.run.v1.model;

/**
 * ListExecutionsResponse is a list of Executions resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListExecutionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call such as "run.googleapis.com/v1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * List of Executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Execution> items;

  static {
    // hack to force ProGuard to consider Execution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Execution.class);
  }

  /**
   * The kind of this resource, in this case "ExecutionsList".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this executions list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListMeta metadata;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The API version for this call such as "run.googleapis.com/v1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call such as "run.googleapis.com/v1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public ListExecutionsResponse setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * List of Executions.
   * @return value or {@code null} for none
   */
  public java.util.List<Execution> getItems() {
    return items;
  }

  /**
   * List of Executions.
   * @param items items or {@code null} for none
   */
  public ListExecutionsResponse setItems(java.util.List<Execution> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of this resource, in this case "ExecutionsList".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this resource, in this case "ExecutionsList".
   * @param kind kind or {@code null} for none
   */
  public ListExecutionsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this executions list.
   * @return value or {@code null} for none
   */
  public ListMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this executions list.
   * @param metadata metadata or {@code null} for none
   */
  public ListExecutionsResponse setMetadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListExecutionsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListExecutionsResponse set(String fieldName, Object value) {
    return (ListExecutionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListExecutionsResponse clone() {
    return (ListExecutionsResponse) super.clone();
  }

}
