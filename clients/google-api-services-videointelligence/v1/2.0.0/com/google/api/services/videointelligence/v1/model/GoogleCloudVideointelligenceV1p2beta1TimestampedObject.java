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

package com.google.api.services.videointelligence.v1.model;

/**
 * For tracking related features. An object at time_offset with attributes, and located with
 * normalized_bounding_box.
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
public final class GoogleCloudVideointelligenceV1p2beta1TimestampedObject extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The attributes of the object in the bounding box.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedAttribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p2beta1DetectedAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p2beta1DetectedAttribute.class);
  }

  /**
   * Optional. The detected landmarks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedLandmark> landmarks;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p2beta1DetectedLandmark used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p2beta1DetectedLandmark.class);
  }

  /**
   * Normalized Bounding box in a frame, where the object is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox normalizedBoundingBox;

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeOffset;

  /**
   * Optional. The attributes of the object in the bounding box.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Optional. The attributes of the object in the bounding box.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject setAttributes(java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Optional. The detected landmarks.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedLandmark> getLandmarks() {
    return landmarks;
  }

  /**
   * Optional. The detected landmarks.
   * @param landmarks landmarks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject setLandmarks(java.util.List<GoogleCloudVideointelligenceV1p2beta1DetectedLandmark> landmarks) {
    this.landmarks = landmarks;
    return this;
  }

  /**
   * Normalized Bounding box in a frame, where the object is located.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox getNormalizedBoundingBox() {
    return normalizedBoundingBox;
  }

  /**
   * Normalized Bounding box in a frame, where the object is located.
   * @param normalizedBoundingBox normalizedBoundingBox or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject setNormalizedBoundingBox(GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox normalizedBoundingBox) {
    this.normalizedBoundingBox = normalizedBoundingBox;
    return this;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * object.
   * @return value or {@code null} for none
   */
  public String getTimeOffset() {
    return timeOffset;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * object.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p2beta1TimestampedObject) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1TimestampedObject clone() {
    return (GoogleCloudVideointelligenceV1p2beta1TimestampedObject) super.clone();
  }

}
