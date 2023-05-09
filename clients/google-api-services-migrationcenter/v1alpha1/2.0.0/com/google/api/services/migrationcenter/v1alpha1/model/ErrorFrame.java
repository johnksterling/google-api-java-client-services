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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Message representing a frame which failed to be processed due to an error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorFrame extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Frame ingestion time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ingestionTime;

  /**
   * Output only. The identifier of the ErrorFrame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The frame that was originally reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetFrame originalFrame;

  /**
   * Output only. All the violations that were detected for the frame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FrameViolationEntry> violations;

  /**
   * Output only. Frame ingestion time.
   * @return value or {@code null} for none
   */
  public String getIngestionTime() {
    return ingestionTime;
  }

  /**
   * Output only. Frame ingestion time.
   * @param ingestionTime ingestionTime or {@code null} for none
   */
  public ErrorFrame setIngestionTime(String ingestionTime) {
    this.ingestionTime = ingestionTime;
    return this;
  }

  /**
   * Output only. The identifier of the ErrorFrame.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The identifier of the ErrorFrame.
   * @param name name or {@code null} for none
   */
  public ErrorFrame setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The frame that was originally reported.
   * @return value or {@code null} for none
   */
  public AssetFrame getOriginalFrame() {
    return originalFrame;
  }

  /**
   * Output only. The frame that was originally reported.
   * @param originalFrame originalFrame or {@code null} for none
   */
  public ErrorFrame setOriginalFrame(AssetFrame originalFrame) {
    this.originalFrame = originalFrame;
    return this;
  }

  /**
   * Output only. All the violations that were detected for the frame.
   * @return value or {@code null} for none
   */
  public java.util.List<FrameViolationEntry> getViolations() {
    return violations;
  }

  /**
   * Output only. All the violations that were detected for the frame.
   * @param violations violations or {@code null} for none
   */
  public ErrorFrame setViolations(java.util.List<FrameViolationEntry> violations) {
    this.violations = violations;
    return this;
  }

  @Override
  public ErrorFrame set(String fieldName, Object value) {
    return (ErrorFrame) super.set(fieldName, value);
  }

  @Override
  public ErrorFrame clone() {
    return (ErrorFrame) super.clone();
  }

}