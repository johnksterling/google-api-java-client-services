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
 * Represents a targetable age range. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_AGE_RANGE`.
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
public final class AgeRangeAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * The age range of an audience. We only support targeting a continuous age range of an audience.
   * Thus, the age range represented in this field can be 1) targeted solely, or, 2) part of a
   * larger continuous age range. The reach of a continuous age range targeting can be expanded by
   * also targeting an audience of an unknown age. Output only in v1. Required in v2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ageRange;

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AGE_RANGE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * The age range of an audience. We only support targeting a continuous age range of an audience.
   * Thus, the age range represented in this field can be 1) targeted solely, or, 2) part of a
   * larger continuous age range. The reach of a continuous age range targeting can be expanded by
   * also targeting an audience of an unknown age. Output only in v1. Required in v2.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgeRange() {
    return ageRange;
  }

  /**
   * The age range of an audience. We only support targeting a continuous age range of an audience.
   * Thus, the age range represented in this field can be 1) targeted solely, or, 2) part of a
   * larger continuous age range. The reach of a continuous age range targeting can be expanded by
   * also targeting an audience of an unknown age. Output only in v1. Required in v2.
   * @param ageRange ageRange or {@code null} for none
   */
  public AgeRangeAssignedTargetingOptionDetails setAgeRange(java.lang.String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AGE_RANGE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AGE_RANGE`.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public AgeRangeAssignedTargetingOptionDetails setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  @Override
  public AgeRangeAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (AgeRangeAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public AgeRangeAssignedTargetingOptionDetails clone() {
    return (AgeRangeAssignedTargetingOptionDetails) super.clone();
  }

}
