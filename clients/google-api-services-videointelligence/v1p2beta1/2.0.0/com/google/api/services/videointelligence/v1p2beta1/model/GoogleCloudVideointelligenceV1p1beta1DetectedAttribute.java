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

package com.google.api.services.videointelligence.v1p2beta1.model;

/**
 * A generic detected attribute represented by name in string format.
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
public final class GoogleCloudVideointelligenceV1p1beta1DetectedAttribute extends com.google.api.client.json.GenericJson {

  /**
   * Detected attribute confidence. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The name of the attribute, for example, glasses, dark_glasses, mouth_open. A full list of
   * supported type names will be provided in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Text value of the detection result. For example, the value for "HairColor" can be "black",
   * "blonde", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Detected attribute confidence. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Detected attribute confidence. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1DetectedAttribute setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The name of the attribute, for example, glasses, dark_glasses, mouth_open. A full list of
   * supported type names will be provided in the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the attribute, for example, glasses, dark_glasses, mouth_open. A full list of
   * supported type names will be provided in the document.
   * @param name name or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1DetectedAttribute setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Text value of the detection result. For example, the value for "HairColor" can be "black",
   * "blonde", etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Text value of the detection result. For example, the value for "HairColor" can be "black",
   * "blonde", etc.
   * @param value value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1DetectedAttribute setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1DetectedAttribute set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1DetectedAttribute) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1DetectedAttribute clone() {
    return (GoogleCloudVideointelligenceV1p1beta1DetectedAttribute) super.clone();
  }

}
