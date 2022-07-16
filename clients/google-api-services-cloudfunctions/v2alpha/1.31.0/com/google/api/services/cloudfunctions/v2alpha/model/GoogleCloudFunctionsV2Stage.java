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

package com.google.api.services.cloudfunctions.v2alpha.model;

/**
 * Each Stage of the deployment process
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudFunctionsV2Stage extends com.google.api.client.json.GenericJson {

  /**
   * Message describing the Stage
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Name of the Stage. This will be unique for each Stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Resource of the Stage
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * Link to the current Stage resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUri;

  /**
   * Current state of the Stage
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * State messages from the current Stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudFunctionsV2StateMessage> stateMessages;

  /**
   * Message describing the Stage
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Message describing the Stage
   * @param message message or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Name of the Stage. This will be unique for each Stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the Stage. This will be unique for each Stage.
   * @param name name or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource of the Stage
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Resource of the Stage
   * @param resource resource or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Link to the current Stage resource
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUri() {
    return resourceUri;
  }

  /**
   * Link to the current Stage resource
   * @param resourceUri resourceUri or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setResourceUri(java.lang.String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * Current state of the Stage
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Current state of the Stage
   * @param state state or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * State messages from the current Stage.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudFunctionsV2StateMessage> getStateMessages() {
    return stateMessages;
  }

  /**
   * State messages from the current Stage.
   * @param stateMessages stateMessages or {@code null} for none
   */
  public GoogleCloudFunctionsV2Stage setStateMessages(java.util.List<GoogleCloudFunctionsV2StateMessage> stateMessages) {
    this.stateMessages = stateMessages;
    return this;
  }

  @Override
  public GoogleCloudFunctionsV2Stage set(String fieldName, Object value) {
    return (GoogleCloudFunctionsV2Stage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudFunctionsV2Stage clone() {
    return (GoogleCloudFunctionsV2Stage) super.clone();
  }

}
