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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * The root node in the resource hierarchy to which a particular entity's (e.g., company) resources
 * belong.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Organization extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the Organization was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Timestamp when the Organization was requested for deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directoryCustomerId;

  /**
   * Output only. A human-readable string that refers to the Organization in the GCP Console UI.
   * This string is set by the server and cannot be changed. The string will be set to the primary
   * domain (for example, "google.com") of the G Suite customer that owns the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. A checksum computed by the server based on the current value of the Organization
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The organization's current lifecycle state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Timestamp when the Organization was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when the Organization was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the Organization was created.
   * @param createTime createTime or {@code null} for none
   */
  public Organization setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Timestamp when the Organization was requested for deletion.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. Timestamp when the Organization was requested for deletion.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Organization setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirectoryCustomerId() {
    return directoryCustomerId;
  }

  /**
   * Immutable. The G Suite / Workspace customer id used in the Directory API.
   * @param directoryCustomerId directoryCustomerId or {@code null} for none
   */
  public Organization setDirectoryCustomerId(java.lang.String directoryCustomerId) {
    this.directoryCustomerId = directoryCustomerId;
    return this;
  }

  /**
   * Output only. A human-readable string that refers to the Organization in the GCP Console UI.
   * This string is set by the server and cannot be changed. The string will be set to the primary
   * domain (for example, "google.com") of the G Suite customer that owns the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. A human-readable string that refers to the Organization in the GCP Console UI.
   * This string is set by the server and cannot be changed. The string will be set to the primary
   * domain (for example, "google.com") of the G Suite customer that owns the organization.
   * @param displayName displayName or {@code null} for none
   */
  public Organization setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. A checksum computed by the server based on the current value of the Organization
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. A checksum computed by the server based on the current value of the Organization
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public Organization setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * @param name name or {@code null} for none
   */
  public Organization setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The organization's current lifecycle state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The organization's current lifecycle state.
   * @param state state or {@code null} for none
   */
  public Organization setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Timestamp when the Organization was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the Organization was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Organization setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Organization set(String fieldName, Object value) {
    return (Organization) super.set(fieldName, value);
  }

  @Override
  public Organization clone() {
    return (Organization) super.clone();
  }

}
