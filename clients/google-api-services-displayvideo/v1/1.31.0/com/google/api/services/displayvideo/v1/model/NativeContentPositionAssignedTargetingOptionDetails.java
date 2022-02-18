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

package com.google.api.services.displayvideo.v1.model;

/**
 * Details for native content position assigned targeting option. This will be populated in the
 * native_content_position_details field when targeting_type is
 * `TARGETING_TYPE_NATIVE_CONTENT_POSITION`. Explicitly targeting all options is not supported.
 * Remove all native content position targeting options to achieve this effect.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NativeContentPositionAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * The content position. Output only in v1. Required in v2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentPosition;

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_NATIVE_CONTENT_POSITION`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * The content position. Output only in v1. Required in v2.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentPosition() {
    return contentPosition;
  }

  /**
   * The content position. Output only in v1. Required in v2.
   * @param contentPosition contentPosition or {@code null} for none
   */
  public NativeContentPositionAssignedTargetingOptionDetails setContentPosition(java.lang.String contentPosition) {
    this.contentPosition = contentPosition;
    return this;
  }

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_NATIVE_CONTENT_POSITION`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_NATIVE_CONTENT_POSITION`.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public NativeContentPositionAssignedTargetingOptionDetails setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  @Override
  public NativeContentPositionAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (NativeContentPositionAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public NativeContentPositionAssignedTargetingOptionDetails clone() {
    return (NativeContentPositionAssignedTargetingOptionDetails) super.clone();
  }

}
