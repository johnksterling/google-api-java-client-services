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

package com.google.api.services.recommender.v1.model;

/**
 * Configuration for a Recommender.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1RecommenderConfig extends com.google.api.client.json.GenericJson {

  /**
   * Allows clients to store small amounts of arbitrary data. Annotations must follow the Kubernetes
   * syntax. The total size of all keys and values combined is limited to 256k. Key can have 2
   * segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS
   * subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes
   * (-), underscores (_), dots (.), and alphanumerics between.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * A user-settable field to provide a human-readable name to be used in user interfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Fingerprint of the RecommenderConfig. Provides optimistic locking when updating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Name of recommender config. Eg,
   * projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * RecommenderGenerationConfig which configures the Generation of recommendations for this
   * recommender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1RecommenderGenerationConfig recommenderGenerationConfig;

  /**
   * Output only. Immutable. The revision ID of the config. A new revision is committed whenever the
   * config is changed in any way. The format is an 8-character hexadecimal string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Last time when the config was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Allows clients to store small amounts of arbitrary data. Annotations must follow the Kubernetes
   * syntax. The total size of all keys and values combined is limited to 256k. Key can have 2
   * segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS
   * subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes
   * (-), underscores (_), dots (.), and alphanumerics between.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Allows clients to store small amounts of arbitrary data. Annotations must follow the Kubernetes
   * syntax. The total size of all keys and values combined is limited to 256k. Key can have 2
   * segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS
   * subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes
   * (-), underscores (_), dots (.), and alphanumerics between.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * A user-settable field to provide a human-readable name to be used in user interfaces.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A user-settable field to provide a human-readable name to be used in user interfaces.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Fingerprint of the RecommenderConfig. Provides optimistic locking when updating.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Fingerprint of the RecommenderConfig. Provides optimistic locking when updating.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Name of recommender config. Eg,
   * projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of recommender config. Eg,
   * projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config
   * @param name name or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * RecommenderGenerationConfig which configures the Generation of recommendations for this
   * recommender.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderGenerationConfig getRecommenderGenerationConfig() {
    return recommenderGenerationConfig;
  }

  /**
   * RecommenderGenerationConfig which configures the Generation of recommendations for this
   * recommender.
   * @param recommenderGenerationConfig recommenderGenerationConfig or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setRecommenderGenerationConfig(GoogleCloudRecommenderV1RecommenderGenerationConfig recommenderGenerationConfig) {
    this.recommenderGenerationConfig = recommenderGenerationConfig;
    return this;
  }

  /**
   * Output only. Immutable. The revision ID of the config. A new revision is committed whenever the
   * config is changed in any way. The format is an 8-character hexadecimal string.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. Immutable. The revision ID of the config. A new revision is committed whenever the
   * config is changed in any way. The format is an 8-character hexadecimal string.
   * @param revisionId revisionId or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Last time when the config was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Last time when the config was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommenderConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1RecommenderConfig set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1RecommenderConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1RecommenderConfig clone() {
    return (GoogleCloudRecommenderV1RecommenderConfig) super.clone();
  }

}
