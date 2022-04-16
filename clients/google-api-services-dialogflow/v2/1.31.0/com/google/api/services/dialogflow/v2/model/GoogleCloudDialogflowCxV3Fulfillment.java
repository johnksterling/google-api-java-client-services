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

package com.google.api.services.dialogflow.v2.model;

/**
 * A fulfillment can do one or more of the following actions at the same time: * Generate rich
 * message responses. * Set parameter values. * Call the webhook. Fulfillments can be called at
 * various stages in the Page or Form lifecycle. For example, when a DetectIntentRequest drives a
 * session to enter a new page, the page's entry fulfillment can add a static response to the
 * QueryResult in the returning DetectIntentResponse, call the webhook (for example, to load user
 * data from a database), or both.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3Fulfillment extends com.google.api.client.json.GenericJson {

  /**
   * Conditional cases for this fulfillment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCases> conditionalCases;

  /**
   * The list of rich message responses to present to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3ResponseMessage> messages;

  /**
   * Whether Dialogflow should return currently queued fulfillment response messages in streaming
   * APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This
   * flag only affects streaming API. Responses are still queued and returned once in non-streaming
   * API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will
   * be returned. You may only want to apply it to fulfillments that have slow webhooks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnPartialResponses;

  /**
   * Set parameter values before executing the webhook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3FulfillmentSetParameterAction> setParameterActions;

  /**
   * The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by
   * Dialogflow when the associated webhook is called. The tag is typically used by the webhook
   * service to identify which fulfillment is being called, but it could be used for other purposes.
   * This field is required if `webhook` is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The webhook to call. Format: `projects//locations//agents//webhooks/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webhook;

  /**
   * Conditional cases for this fulfillment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCases> getConditionalCases() {
    return conditionalCases;
  }

  /**
   * Conditional cases for this fulfillment.
   * @param conditionalCases conditionalCases or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setConditionalCases(java.util.List<GoogleCloudDialogflowCxV3FulfillmentConditionalCases> conditionalCases) {
    this.conditionalCases = conditionalCases;
    return this;
  }

  /**
   * The list of rich message responses to present to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3ResponseMessage> getMessages() {
    return messages;
  }

  /**
   * The list of rich message responses to present to the user.
   * @param messages messages or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setMessages(java.util.List<GoogleCloudDialogflowCxV3ResponseMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Whether Dialogflow should return currently queued fulfillment response messages in streaming
   * APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This
   * flag only affects streaming API. Responses are still queued and returned once in non-streaming
   * API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will
   * be returned. You may only want to apply it to fulfillments that have slow webhooks.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnPartialResponses() {
    return returnPartialResponses;
  }

  /**
   * Whether Dialogflow should return currently queued fulfillment response messages in streaming
   * APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This
   * flag only affects streaming API. Responses are still queued and returned once in non-streaming
   * API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will
   * be returned. You may only want to apply it to fulfillments that have slow webhooks.
   * @param returnPartialResponses returnPartialResponses or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setReturnPartialResponses(java.lang.Boolean returnPartialResponses) {
    this.returnPartialResponses = returnPartialResponses;
    return this;
  }

  /**
   * Set parameter values before executing the webhook.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3FulfillmentSetParameterAction> getSetParameterActions() {
    return setParameterActions;
  }

  /**
   * Set parameter values before executing the webhook.
   * @param setParameterActions setParameterActions or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setSetParameterActions(java.util.List<GoogleCloudDialogflowCxV3FulfillmentSetParameterAction> setParameterActions) {
    this.setParameterActions = setParameterActions;
    return this;
  }

  /**
   * The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by
   * Dialogflow when the associated webhook is called. The tag is typically used by the webhook
   * service to identify which fulfillment is being called, but it could be used for other purposes.
   * This field is required if `webhook` is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by
   * Dialogflow when the associated webhook is called. The tag is typically used by the webhook
   * service to identify which fulfillment is being called, but it could be used for other purposes.
   * This field is required if `webhook` is specified.
   * @param tag tag or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The webhook to call. Format: `projects//locations//agents//webhooks/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebhook() {
    return webhook;
  }

  /**
   * The webhook to call. Format: `projects//locations//agents//webhooks/`.
   * @param webhook webhook or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment setWebhook(java.lang.String webhook) {
    this.webhook = webhook;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3Fulfillment set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3Fulfillment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3Fulfillment clone() {
    return (GoogleCloudDialogflowCxV3Fulfillment) super.clone();
  }

}
