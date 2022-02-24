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

package com.google.api.services.chat.v1.model;

/**
 * An action that describes the behavior when the form is submitted. For example, an Apps Script can
 * be invoked to handle the form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Action extends com.google.api.client.json.GenericJson {

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * Specifies the loading indicator that the action displays while making the call to the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String loadIndicator;

  /**
   * List of action parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1ActionParameter> parameters;

  /**
   * Indicates whether form values persist after the action. The default value is `false`. If
   * `true`, form values remain after the action is triggered. When using
   * [LoadIndicator.NONE](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * actions, `persist_values` = `true`is recommended, as it ensures that any changes made by the
   * user after form or on change actions are sent to the server are not overwritten by the
   * response. If `false`, the form values are cleared when the action is triggered. When
   * `persist_values` is set to `false`, it is strongly recommended that the card use
   * [LoadIndicator.SPINNER](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * all actions, as this locks the UI to ensure no changes are made by the user while the action is
   * being processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean persistValues;

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * @param function function or {@code null} for none
   */
  public GoogleAppsCardV1Action setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * Specifies the loading indicator that the action displays while making the call to the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getLoadIndicator() {
    return loadIndicator;
  }

  /**
   * Specifies the loading indicator that the action displays while making the call to the action.
   * @param loadIndicator loadIndicator or {@code null} for none
   */
  public GoogleAppsCardV1Action setLoadIndicator(java.lang.String loadIndicator) {
    this.loadIndicator = loadIndicator;
    return this;
  }

  /**
   * List of action parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1ActionParameter> getParameters() {
    return parameters;
  }

  /**
   * List of action parameters.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleAppsCardV1Action setParameters(java.util.List<GoogleAppsCardV1ActionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Indicates whether form values persist after the action. The default value is `false`. If
   * `true`, form values remain after the action is triggered. When using
   * [LoadIndicator.NONE](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * actions, `persist_values` = `true`is recommended, as it ensures that any changes made by the
   * user after form or on change actions are sent to the server are not overwritten by the
   * response. If `false`, the form values are cleared when the action is triggered. When
   * `persist_values` is set to `false`, it is strongly recommended that the card use
   * [LoadIndicator.SPINNER](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * all actions, as this locks the UI to ensure no changes are made by the user while the action is
   * being processed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPersistValues() {
    return persistValues;
  }

  /**
   * Indicates whether form values persist after the action. The default value is `false`. If
   * `true`, form values remain after the action is triggered. When using
   * [LoadIndicator.NONE](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * actions, `persist_values` = `true`is recommended, as it ensures that any changes made by the
   * user after form or on change actions are sent to the server are not overwritten by the
   * response. If `false`, the form values are cleared when the action is triggered. When
   * `persist_values` is set to `false`, it is strongly recommended that the card use
   * [LoadIndicator.SPINNER](workspace/add-ons/reference/rpc/google.apps.card.v1#loadindicator) for
   * all actions, as this locks the UI to ensure no changes are made by the user while the action is
   * being processed.
   * @param persistValues persistValues or {@code null} for none
   */
  public GoogleAppsCardV1Action setPersistValues(java.lang.Boolean persistValues) {
    this.persistValues = persistValues;
    return this;
  }

  @Override
  public GoogleAppsCardV1Action set(String fieldName, Object value) {
    return (GoogleAppsCardV1Action) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Action clone() {
    return (GoogleAppsCardV1Action) super.clone();
  }

}
