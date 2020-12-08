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

package com.google.api.services.youtube.model;

/**
 * Recording information associated with the video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoRecordingDetails extends com.google.api.client.json.GenericJson {

  /**
   * The geolocation information associated with the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoPoint location;

  /**
   * The text description of the location where the video was recorded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationDescription;

  /**
   * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sssZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordingDate;

  /**
   * The geolocation information associated with the video.
   * @return value or {@code null} for none
   */
  public GeoPoint getLocation() {
    return location;
  }

  /**
   * The geolocation information associated with the video.
   * @param location location or {@code null} for none
   */
  public VideoRecordingDetails setLocation(GeoPoint location) {
    this.location = location;
    return this;
  }

  /**
   * The text description of the location where the video was recorded.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationDescription() {
    return locationDescription;
  }

  /**
   * The text description of the location where the video was recorded.
   * @param locationDescription locationDescription or {@code null} for none
   */
  public VideoRecordingDetails setLocationDescription(java.lang.String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sssZ) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordingDate() {
    return recordingDate;
  }

  /**
   * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sssZ) format.
   * @param recordingDate recordingDate or {@code null} for none
   */
  public VideoRecordingDetails setRecordingDate(java.lang.String recordingDate) {
    this.recordingDate = recordingDate;
    return this;
  }

  @Override
  public VideoRecordingDetails set(String fieldName, Object value) {
    return (VideoRecordingDetails) super.set(fieldName, value);
  }

  @Override
  public VideoRecordingDetails clone() {
    return (VideoRecordingDetails) super.clone();
  }

}
