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

package com.google.api.services.retail.v2beta.model;

/**
 * Detailed completion information including completion attribution token and clicked completion
 * info.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaCompletionDetail extends com.google.api.client.json.GenericJson {

  /**
   * Completion attribution token in CompleteQueryResponse.attribution_token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String completionAttributionToken;

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion position, starting from 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer selectedPosition;

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selectedSuggestion;

  /**
   * Completion attribution token in CompleteQueryResponse.attribution_token.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompletionAttributionToken() {
    return completionAttributionToken;
  }

  /**
   * Completion attribution token in CompleteQueryResponse.attribution_token.
   * @param completionAttributionToken completionAttributionToken or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompletionDetail setCompletionAttributionToken(java.lang.String completionAttributionToken) {
    this.completionAttributionToken = completionAttributionToken;
    return this;
  }

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion position, starting from 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSelectedPosition() {
    return selectedPosition;
  }

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion position, starting from 0.
   * @param selectedPosition selectedPosition or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompletionDetail setSelectedPosition(java.lang.Integer selectedPosition) {
    this.selectedPosition = selectedPosition;
    return this;
  }

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelectedSuggestion() {
    return selectedSuggestion;
  }

  /**
   * End user selected CompleteQueryResponse.CompletionResult.suggestion.
   * @param selectedSuggestion selectedSuggestion or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompletionDetail setSelectedSuggestion(java.lang.String selectedSuggestion) {
    this.selectedSuggestion = selectedSuggestion;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaCompletionDetail set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaCompletionDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaCompletionDetail clone() {
    return (GoogleCloudRetailV2betaCompletionDetail) super.clone();
  }

}
