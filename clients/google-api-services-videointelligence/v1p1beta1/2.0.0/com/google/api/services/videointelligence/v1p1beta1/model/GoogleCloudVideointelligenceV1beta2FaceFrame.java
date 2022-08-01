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

package com.google.api.services.videointelligence.v1p1beta1.model;

/**
 * Deprecated. No effect.
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
public final class GoogleCloudVideointelligenceV1beta2FaceFrame extends com.google.api.client.json.GenericJson {

  /**
   * Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is
   * detected in multiple locations within the current frame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox> normalizedBoundingBoxes;

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeOffset;

  /**
   * Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is
   * detected in multiple locations within the current frame.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox> getNormalizedBoundingBoxes() {
    return normalizedBoundingBoxes;
  }

  /**
   * Normalized Bounding boxes in a frame. There can be more than one boxes if the same face is
   * detected in multiple locations within the current frame.
   * @param normalizedBoundingBoxes normalizedBoundingBoxes or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2FaceFrame setNormalizedBoundingBoxes(java.util.List<GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox> normalizedBoundingBoxes) {
    this.normalizedBoundingBoxes = normalizedBoundingBoxes;
    return this;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * @return value or {@code null} for none
   */
  public String getTimeOffset() {
    return timeOffset;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2FaceFrame setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2FaceFrame set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2FaceFrame) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2FaceFrame clone() {
    return (GoogleCloudVideointelligenceV1beta2FaceFrame) super.clone();
  }

}
