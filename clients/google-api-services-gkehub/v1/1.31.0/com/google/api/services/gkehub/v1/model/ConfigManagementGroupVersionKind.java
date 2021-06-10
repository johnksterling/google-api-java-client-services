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

package com.google.api.services.gkehub.v1.model;

/**
 * A Kubernetes object's GVK
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementGroupVersionKind extends com.google.api.client.json.GenericJson {

  /**
   * Kubernetes Group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * Kubernetes Kind
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Kubernetes Version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Kubernetes Group
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * Kubernetes Group
   * @param group group or {@code null} for none
   */
  public ConfigManagementGroupVersionKind setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * Kubernetes Kind
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kubernetes Kind
   * @param kind kind or {@code null} for none
   */
  public ConfigManagementGroupVersionKind setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kubernetes Version
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Kubernetes Version
   * @param version version or {@code null} for none
   */
  public ConfigManagementGroupVersionKind setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public ConfigManagementGroupVersionKind set(String fieldName, Object value) {
    return (ConfigManagementGroupVersionKind) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementGroupVersionKind clone() {
    return (ConfigManagementGroupVersionKind) super.clone();
  }

}
