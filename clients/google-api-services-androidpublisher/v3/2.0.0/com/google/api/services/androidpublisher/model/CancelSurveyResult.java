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

package com.google.api.services.androidpublisher.model;

/**
 * Result of the cancel survey when the subscription was canceled by the user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CancelSurveyResult extends com.google.api.client.json.GenericJson {

  /**
   * The reason the user selected in the cancel survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Only set for CANCEL_SURVEY_REASON_OTHERS. This is the user's freeform response to the survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reasonUserInput;

  /**
   * The reason the user selected in the cancel survey.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason the user selected in the cancel survey.
   * @param reason reason or {@code null} for none
   */
  public CancelSurveyResult setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Only set for CANCEL_SURVEY_REASON_OTHERS. This is the user's freeform response to the survey.
   * @return value or {@code null} for none
   */
  public java.lang.String getReasonUserInput() {
    return reasonUserInput;
  }

  /**
   * Only set for CANCEL_SURVEY_REASON_OTHERS. This is the user's freeform response to the survey.
   * @param reasonUserInput reasonUserInput or {@code null} for none
   */
  public CancelSurveyResult setReasonUserInput(java.lang.String reasonUserInput) {
    this.reasonUserInput = reasonUserInput;
    return this;
  }

  @Override
  public CancelSurveyResult set(String fieldName, Object value) {
    return (CancelSurveyResult) super.set(fieldName, value);
  }

  @Override
  public CancelSurveyResult clone() {
    return (CancelSurveyResult) super.clone();
  }

}
