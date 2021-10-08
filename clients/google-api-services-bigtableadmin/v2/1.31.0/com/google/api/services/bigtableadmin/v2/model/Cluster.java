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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * A resizable group of nodes in a particular cloud location, capable of serving all Tables in the
 * parent Instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Cluster extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The type of storage used by this cluster to serve its parent instance's tables,
   * unless explicitly overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultStorageType;

  /**
   * Immutable. The encryption configuration for CMEK-protected clusters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfig encryptionConfig;

  /**
   * Immutable. The location where this cluster's nodes and storage reside. For best performance,
   * clients should be located as close as possible to this cluster. Currently only zones are
   * supported, so values should be of the form `projects/{project}/locations/{zone}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The unique name of the cluster. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/a-z*`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The number of nodes allocated to this cluster. More nodes enable higher throughput
   * and more consistent performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer serveNodes;

  /**
   * Output only. The current state of the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Immutable. The type of storage used by this cluster to serve its parent instance's tables,
   * unless explicitly overridden.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultStorageType() {
    return defaultStorageType;
  }

  /**
   * Immutable. The type of storage used by this cluster to serve its parent instance's tables,
   * unless explicitly overridden.
   * @param defaultStorageType defaultStorageType or {@code null} for none
   */
  public Cluster setDefaultStorageType(java.lang.String defaultStorageType) {
    this.defaultStorageType = defaultStorageType;
    return this;
  }

  /**
   * Immutable. The encryption configuration for CMEK-protected clusters.
   * @return value or {@code null} for none
   */
  public EncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  /**
   * Immutable. The encryption configuration for CMEK-protected clusters.
   * @param encryptionConfig encryptionConfig or {@code null} for none
   */
  public Cluster setEncryptionConfig(EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Immutable. The location where this cluster's nodes and storage reside. For best performance,
   * clients should be located as close as possible to this cluster. Currently only zones are
   * supported, so values should be of the form `projects/{project}/locations/{zone}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Immutable. The location where this cluster's nodes and storage reside. For best performance,
   * clients should be located as close as possible to this cluster. Currently only zones are
   * supported, so values should be of the form `projects/{project}/locations/{zone}`.
   * @param location location or {@code null} for none
   */
  public Cluster setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The unique name of the cluster. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/a-z*`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique name of the cluster. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/a-z*`.
   * @param name name or {@code null} for none
   */
  public Cluster setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The number of nodes allocated to this cluster. More nodes enable higher throughput
   * and more consistent performance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getServeNodes() {
    return serveNodes;
  }

  /**
   * Required. The number of nodes allocated to this cluster. More nodes enable higher throughput
   * and more consistent performance.
   * @param serveNodes serveNodes or {@code null} for none
   */
  public Cluster setServeNodes(java.lang.Integer serveNodes) {
    this.serveNodes = serveNodes;
    return this;
  }

  /**
   * Output only. The current state of the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the cluster.
   * @param state state or {@code null} for none
   */
  public Cluster setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Cluster set(String fieldName, Object value) {
    return (Cluster) super.set(fieldName, value);
  }

  @Override
  public Cluster clone() {
    return (Cluster) super.clone();
  }

}
