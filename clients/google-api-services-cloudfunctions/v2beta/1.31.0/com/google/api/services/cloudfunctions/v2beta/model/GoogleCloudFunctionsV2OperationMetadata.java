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

package com.google.api.services.cloudfunctions.v2beta.model;

/**
 * Represents the metadata of the long-running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudFunctionsV2OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * API version used to start the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cancelRequested;

  /**
   * The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The original request that started the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> requestResource;

  /**
   * Mechanism for reporting in-progress stages
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudFunctionsV2Stage> stages;

  /**
   * Human-readable status of the operation, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusDetail;

  /**
   * Server-defined resource path for the target of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Name of the verb executed by the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * API version used to start the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * API version used to start the operation.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCancelRequested() {
    return cancelRequested;
  }

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * @param cancelRequested cancelRequested or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setCancelRequested(java.lang.Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  /**
   * The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The original request that started the operation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getRequestResource() {
    return requestResource;
  }

  /**
   * The original request that started the operation.
   * @param requestResource requestResource or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setRequestResource(java.util.Map<String, java.lang.Object> requestResource) {
    this.requestResource = requestResource;
    return this;
  }

  /**
   * Mechanism for reporting in-progress stages
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudFunctionsV2Stage> getStages() {
    return stages;
  }

  /**
   * Mechanism for reporting in-progress stages
   * @param stages stages or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setStages(java.util.List<GoogleCloudFunctionsV2Stage> stages) {
    this.stages = stages;
    return this;
  }

  /**
   * Human-readable status of the operation, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusDetail() {
    return statusDetail;
  }

  /**
   * Human-readable status of the operation, if any.
   * @param statusDetail statusDetail or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setStatusDetail(java.lang.String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Server-defined resource path for the target of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Server-defined resource path for the target of the operation.
   * @param target target or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the verb executed by the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Name of the verb executed by the operation.
   * @param verb verb or {@code null} for none
   */
  public GoogleCloudFunctionsV2OperationMetadata setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  @Override
  public GoogleCloudFunctionsV2OperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudFunctionsV2OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudFunctionsV2OperationMetadata clone() {
    return (GoogleCloudFunctionsV2OperationMetadata) super.clone();
  }

}
