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

package com.google.api.services.policyanalyzer.v1beta1.model;

/**
 * Represents data observation period.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Analyzer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicyanalyzerV1beta1ObservationPeriod extends com.google.api.client.json.GenericJson {

  /**
   * The observation end time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The observation start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The observation end time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The observation end time.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudPolicyanalyzerV1beta1ObservationPeriod setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The observation start time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The observation start time.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudPolicyanalyzerV1beta1ObservationPeriod setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudPolicyanalyzerV1beta1ObservationPeriod set(String fieldName, Object value) {
    return (GoogleCloudPolicyanalyzerV1beta1ObservationPeriod) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicyanalyzerV1beta1ObservationPeriod clone() {
    return (GoogleCloudPolicyanalyzerV1beta1ObservationPeriod) super.clone();
  }

}
