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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * A track of an object instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta2Track extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Attributes in the track level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2DetectedAttribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2DetectedAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2DetectedAttribute.class);
  }

  /**
   * Optional. The confidence score of the tracked object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Video segment of a track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2VideoSegment segment;

  /**
   * The object with timestamp and attributes per frame in the track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2TimestampedObject> timestampedObjects;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2TimestampedObject used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2TimestampedObject.class);
  }

  /**
   * Optional. Attributes in the track level.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2DetectedAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Optional. Attributes in the track level.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2Track setAttributes(java.util.List<GoogleCloudVideointelligenceV1beta2DetectedAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Optional. The confidence score of the tracked object.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Optional. The confidence score of the tracked object.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2Track setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Video segment of a track.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoSegment getSegment() {
    return segment;
  }

  /**
   * Video segment of a track.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2Track setSegment(GoogleCloudVideointelligenceV1beta2VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  /**
   * The object with timestamp and attributes per frame in the track.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2TimestampedObject> getTimestampedObjects() {
    return timestampedObjects;
  }

  /**
   * The object with timestamp and attributes per frame in the track.
   * @param timestampedObjects timestampedObjects or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2Track setTimestampedObjects(java.util.List<GoogleCloudVideointelligenceV1beta2TimestampedObject> timestampedObjects) {
    this.timestampedObjects = timestampedObjects;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2Track set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2Track) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2Track clone() {
    return (GoogleCloudVideointelligenceV1beta2Track) super.clone();
  }

}
