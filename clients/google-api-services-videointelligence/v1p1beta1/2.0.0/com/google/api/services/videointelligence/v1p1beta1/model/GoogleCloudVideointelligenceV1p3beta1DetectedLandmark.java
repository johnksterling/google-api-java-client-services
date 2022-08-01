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
 * A generic detected landmark represented by name in string format and a 2D location.
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
public final class GoogleCloudVideointelligenceV1p3beta1DetectedLandmark extends com.google.api.client.json.GenericJson {

  /**
   * The confidence score of the detected landmark. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The name of this landmark, for example, left_hand, right_shoulder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The 2D point of the detected landmark using the normalized image coordindate system. The
   * normalized coordinates have the range from 0 to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p3beta1NormalizedVertex point;

  /**
   * The confidence score of the detected landmark. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The confidence score of the detected landmark. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1DetectedLandmark setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The name of this landmark, for example, left_hand, right_shoulder.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this landmark, for example, left_hand, right_shoulder.
   * @param name name or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1DetectedLandmark setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The 2D point of the detected landmark using the normalized image coordindate system. The
   * normalized coordinates have the range from 0 to 1.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1NormalizedVertex getPoint() {
    return point;
  }

  /**
   * The 2D point of the detected landmark using the normalized image coordindate system. The
   * normalized coordinates have the range from 0 to 1.
   * @param point point or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1DetectedLandmark setPoint(GoogleCloudVideointelligenceV1p3beta1NormalizedVertex point) {
    this.point = point;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1DetectedLandmark set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1DetectedLandmark) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1DetectedLandmark clone() {
    return (GoogleCloudVideointelligenceV1p3beta1DetectedLandmark) super.clone();
  }

}
