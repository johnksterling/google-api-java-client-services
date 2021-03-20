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

package com.google.api.services.retail.v2alpha.model;

/**
 * Request message for Predict method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaPredictRequest extends com.google.api.client.json.GenericJson {

  /**
   * Filter for restricting prediction results with a length limit of 5,000 characters. Accepts
   * values for tags and the `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions
   * to products that match all of the specified tags. Boolean operators `OR` and `NOT` are
   * supported if the expression is enclosed in parentheses, and must be separated from the tag
   * values by a space. `-"tagA"` is also supported and is equivalent to `NOT "tagA"`. Tag values
   * must be double quoted UTF-8 encoded strings with a size limit of 1,000 characters. Note:
   * "Recently viewed" models don't support tag filtering at the moment. * filterOutOfStockItems.
   * Restricts predictions to products that do not have a stockState value of OUT_OF_STOCK.
   * Examples: * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional") *
   * filterOutOfStockItems tag=(-"promotional") * filterOutOfStockItems If your filter blocks all
   * prediction results, nothing will be returned. If you want generic (unfiltered) popular products
   * to be returned instead, set `strictFiltering` to false in `PredictRequest.params`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The labels for the predict request. * Label keys can contain lowercase letters, digits and
   * hyphens, must start with a letter, and must end with a letter or digit. * Non-zero label values
   * can contain lowercase letters, digits and hyphens, must start with a letter, and must end with
   * a letter or digit. * No more than 64 labels can be associated with a given request. See
   * https://goo.gl/xmQnxf for more information on and examples of labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Maximum number of results to return per page. Set this property to the number of prediction
   * results needed. If zero, the service will choose a reasonable default. The maximum allowed
   * value is 100. Values above 100 will be coerced to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The previous PredictResponse.next_page_token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Additional domain specific parameters for the predictions. Allowed values: * `returnProduct`:
   * Boolean. If set to true, the associated product object will be returned in the
   * `results.metadata` field in the prediction response. * `returnScore`: Boolean. If set to true,
   * the prediction 'score' corresponding to each returned product will be set in the
   * `results.metadata` field in the prediction response. The given 'score' indicates the
   * probability of an product being clicked/purchased given the user's context and history. *
   * `strictFiltering`: Boolean. True by default. If set to false, the service will return generic
   * (unfiltered) popular products instead of empty if your filter blocks all prediction results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> params;

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaUserEvent userEvent;

  /**
   * Use validate only mode for this prediction query. If set to true, a dummy model will be used
   * that returns arbitrary products. Note that the validate only mode should only be used for
   * testing the API, or if the model is not ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * Filter for restricting prediction results with a length limit of 5,000 characters. Accepts
   * values for tags and the `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions
   * to products that match all of the specified tags. Boolean operators `OR` and `NOT` are
   * supported if the expression is enclosed in parentheses, and must be separated from the tag
   * values by a space. `-"tagA"` is also supported and is equivalent to `NOT "tagA"`. Tag values
   * must be double quoted UTF-8 encoded strings with a size limit of 1,000 characters. Note:
   * "Recently viewed" models don't support tag filtering at the moment. * filterOutOfStockItems.
   * Restricts predictions to products that do not have a stockState value of OUT_OF_STOCK.
   * Examples: * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional") *
   * filterOutOfStockItems tag=(-"promotional") * filterOutOfStockItems If your filter blocks all
   * prediction results, nothing will be returned. If you want generic (unfiltered) popular products
   * to be returned instead, set `strictFiltering` to false in `PredictRequest.params`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Filter for restricting prediction results with a length limit of 5,000 characters. Accepts
   * values for tags and the `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions
   * to products that match all of the specified tags. Boolean operators `OR` and `NOT` are
   * supported if the expression is enclosed in parentheses, and must be separated from the tag
   * values by a space. `-"tagA"` is also supported and is equivalent to `NOT "tagA"`. Tag values
   * must be double quoted UTF-8 encoded strings with a size limit of 1,000 characters. Note:
   * "Recently viewed" models don't support tag filtering at the moment. * filterOutOfStockItems.
   * Restricts predictions to products that do not have a stockState value of OUT_OF_STOCK.
   * Examples: * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional") *
   * filterOutOfStockItems tag=(-"promotional") * filterOutOfStockItems If your filter blocks all
   * prediction results, nothing will be returned. If you want generic (unfiltered) popular products
   * to be returned instead, set `strictFiltering` to false in `PredictRequest.params`.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The labels for the predict request. * Label keys can contain lowercase letters, digits and
   * hyphens, must start with a letter, and must end with a letter or digit. * Non-zero label values
   * can contain lowercase letters, digits and hyphens, must start with a letter, and must end with
   * a letter or digit. * No more than 64 labels can be associated with a given request. See
   * https://goo.gl/xmQnxf for more information on and examples of labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels for the predict request. * Label keys can contain lowercase letters, digits and
   * hyphens, must start with a letter, and must end with a letter or digit. * Non-zero label values
   * can contain lowercase letters, digits and hyphens, must start with a letter, and must end with
   * a letter or digit. * No more than 64 labels can be associated with a given request. See
   * https://goo.gl/xmQnxf for more information on and examples of labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Maximum number of results to return per page. Set this property to the number of prediction
   * results needed. If zero, the service will choose a reasonable default. The maximum allowed
   * value is 100. Values above 100 will be coerced to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum number of results to return per page. Set this property to the number of prediction
   * results needed. If zero, the service will choose a reasonable default. The maximum allowed
   * value is 100. Values above 100 will be coerced to 100.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The previous PredictResponse.next_page_token.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The previous PredictResponse.next_page_token.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Additional domain specific parameters for the predictions. Allowed values: * `returnProduct`:
   * Boolean. If set to true, the associated product object will be returned in the
   * `results.metadata` field in the prediction response. * `returnScore`: Boolean. If set to true,
   * the prediction 'score' corresponding to each returned product will be set in the
   * `results.metadata` field in the prediction response. The given 'score' indicates the
   * probability of an product being clicked/purchased given the user's context and history. *
   * `strictFiltering`: Boolean. True by default. If set to false, the service will return generic
   * (unfiltered) popular products instead of empty if your filter blocks all prediction results.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParams() {
    return params;
  }

  /**
   * Additional domain specific parameters for the predictions. Allowed values: * `returnProduct`:
   * Boolean. If set to true, the associated product object will be returned in the
   * `results.metadata` field in the prediction response. * `returnScore`: Boolean. If set to true,
   * the prediction 'score' corresponding to each returned product will be set in the
   * `results.metadata` field in the prediction response. The given 'score' indicates the
   * probability of an product being clicked/purchased given the user's context and history. *
   * `strictFiltering`: Boolean. True by default. If set to false, the service will return generic
   * (unfiltered) popular products instead of empty if your filter blocks all prediction results.
   * @param params params or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setParams(java.util.Map<String, java.lang.Object> params) {
    this.params = params;
    return this;
  }

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaUserEvent getUserEvent() {
    return userEvent;
  }

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * @param userEvent userEvent or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setUserEvent(GoogleCloudRetailV2alphaUserEvent userEvent) {
    this.userEvent = userEvent;
    return this;
  }

  /**
   * Use validate only mode for this prediction query. If set to true, a dummy model will be used
   * that returns arbitrary products. Note that the validate only mode should only be used for
   * testing the API, or if the model is not ready.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * Use validate only mode for this prediction query. If set to true, a dummy model will be used
   * that returns arbitrary products. Note that the validate only mode should only be used for
   * testing the API, or if the model is not ready.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPredictRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaPredictRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaPredictRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaPredictRequest clone() {
    return (GoogleCloudRetailV2alphaPredictRequest) super.clone();
  }

}
