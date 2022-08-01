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
public final class GoogleCloudVideointelligenceV1p3beta1FaceAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * All video frames where a face was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceFrame> frames;

  /**
   * All video segments where a face was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceSegment> segments;

  /**
   * Thumbnail of a representative face view (in JPEG format).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnail;

  /**
   * All video frames where a face was detected.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceFrame> getFrames() {
    return frames;
  }

  /**
   * All video frames where a face was detected.
   * @param frames frames or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation setFrames(java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceFrame> frames) {
    this.frames = frames;
    return this;
  }

  /**
   * All video segments where a face was detected.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceSegment> getSegments() {
    return segments;
  }

  /**
   * All video segments where a face was detected.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation setSegments(java.util.List<GoogleCloudVideointelligenceV1p3beta1FaceSegment> segments) {
    this.segments = segments;
    return this;
  }

  /**
   * Thumbnail of a representative face view (in JPEG format).
   * @see #decodeThumbnail()
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnail() {
    return thumbnail;
  }

  /**
   * Thumbnail of a representative face view (in JPEG format).
   * @see #getThumbnail()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeThumbnail() {
    return com.google.api.client.util.Base64.decodeBase64(thumbnail);
  }

  /**
   * Thumbnail of a representative face view (in JPEG format).
   * @see #encodeThumbnail()
   * @param thumbnail thumbnail or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation setThumbnail(java.lang.String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Thumbnail of a representative face view (in JPEG format).
   * @see #setThumbnail()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation encodeThumbnail(byte[] thumbnail) {
    this.thumbnail = com.google.api.client.util.Base64.encodeBase64URLSafeString(thumbnail);
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1FaceAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1FaceAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p3beta1FaceAnnotation) super.clone();
  }

}
