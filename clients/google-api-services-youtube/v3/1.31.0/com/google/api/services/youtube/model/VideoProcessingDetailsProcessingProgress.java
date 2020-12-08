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
 * Video processing progress and completion time estimate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoProcessingDetailsProcessingProgress extends com.google.api.client.json.GenericJson {

  /**
   * The number of parts of the video that YouTube has already processed. You can estimate the
   * percentage of the video that YouTube has already processed by calculating: 100 *
   * parts_processed / parts_total Note that since the estimated number of parts could increase
   * without a corresponding increase in the number of parts that have already been processed, it is
   * possible that the calculated progress could periodically decrease while YouTube processes a
   * video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger partsProcessed;

  /**
   * An estimate of the total number of parts that need to be processed for the video. The number
   * may be updated with more precise estimates while YouTube processes the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger partsTotal;

  /**
   * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the
   * video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger timeLeftMs;

  /**
   * The number of parts of the video that YouTube has already processed. You can estimate the
   * percentage of the video that YouTube has already processed by calculating: 100 *
   * parts_processed / parts_total Note that since the estimated number of parts could increase
   * without a corresponding increase in the number of parts that have already been processed, it is
   * possible that the calculated progress could periodically decrease while YouTube processes a
   * video.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getPartsProcessed() {
    return partsProcessed;
  }

  /**
   * The number of parts of the video that YouTube has already processed. You can estimate the
   * percentage of the video that YouTube has already processed by calculating: 100 *
   * parts_processed / parts_total Note that since the estimated number of parts could increase
   * without a corresponding increase in the number of parts that have already been processed, it is
   * possible that the calculated progress could periodically decrease while YouTube processes a
   * video.
   * @param partsProcessed partsProcessed or {@code null} for none
   */
  public VideoProcessingDetailsProcessingProgress setPartsProcessed(java.math.BigInteger partsProcessed) {
    this.partsProcessed = partsProcessed;
    return this;
  }

  /**
   * An estimate of the total number of parts that need to be processed for the video. The number
   * may be updated with more precise estimates while YouTube processes the video.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getPartsTotal() {
    return partsTotal;
  }

  /**
   * An estimate of the total number of parts that need to be processed for the video. The number
   * may be updated with more precise estimates while YouTube processes the video.
   * @param partsTotal partsTotal or {@code null} for none
   */
  public VideoProcessingDetailsProcessingProgress setPartsTotal(java.math.BigInteger partsTotal) {
    this.partsTotal = partsTotal;
    return this;
  }

  /**
   * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the
   * video.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTimeLeftMs() {
    return timeLeftMs;
  }

  /**
   * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the
   * video.
   * @param timeLeftMs timeLeftMs or {@code null} for none
   */
  public VideoProcessingDetailsProcessingProgress setTimeLeftMs(java.math.BigInteger timeLeftMs) {
    this.timeLeftMs = timeLeftMs;
    return this;
  }

  @Override
  public VideoProcessingDetailsProcessingProgress set(String fieldName, Object value) {
    return (VideoProcessingDetailsProcessingProgress) super.set(fieldName, value);
  }

  @Override
  public VideoProcessingDetailsProcessingProgress clone() {
    return (VideoProcessingDetailsProcessingProgress) super.clone();
  }

}
