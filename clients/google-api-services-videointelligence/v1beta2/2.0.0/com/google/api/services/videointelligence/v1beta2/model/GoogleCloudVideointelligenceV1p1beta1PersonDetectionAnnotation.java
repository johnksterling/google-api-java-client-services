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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Person detection annotation per video.
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
public final class GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The detected tracks of a person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1Track> tracks;

  /**
   * Feature version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The detected tracks of a person.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1Track> getTracks() {
    return tracks;
  }

  /**
   * The detected tracks of a person.
   * @param tracks tracks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation setTracks(java.util.List<GoogleCloudVideointelligenceV1p1beta1Track> tracks) {
    this.tracks = tracks;
    return this;
  }

  /**
   * Feature version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Feature version.
   * @param version version or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p1beta1PersonDetectionAnnotation) super.clone();
  }

}
