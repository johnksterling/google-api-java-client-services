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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * `StreamingAnnotateVideoResponse` is the only message returned to the client by
 * `StreamingAnnotateVideo`. A series of zero or more `StreamingAnnotateVideoResponse` messages are
 * streamed back to the client.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends com.google.api.client.json.GenericJson {

  /**
   * Streaming annotation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults annotationResults;

  /**
   * Google Cloud Storage URI that stores annotation results of one streaming session in JSON
   * format. It is the annotation_result_storage_directory from the request followed by
   * '/cloud_project_number-session_id'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationResultsUri;

  /**
   * If set, returns a google.rpc.Status message that specifies the error for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus error;

  /**
   * Streaming annotation results.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults getAnnotationResults() {
    return annotationResults;
  }

  /**
   * Streaming annotation results.
   * @param annotationResults annotationResults or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse setAnnotationResults(GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults annotationResults) {
    this.annotationResults = annotationResults;
    return this;
  }

  /**
   * Google Cloud Storage URI that stores annotation results of one streaming session in JSON
   * format. It is the annotation_result_storage_directory from the request followed by
   * '/cloud_project_number-session_id'.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationResultsUri() {
    return annotationResultsUri;
  }

  /**
   * Google Cloud Storage URI that stores annotation results of one streaming session in JSON
   * format. It is the annotation_result_storage_directory from the request followed by
   * '/cloud_project_number-session_id'.
   * @param annotationResultsUri annotationResultsUri or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse setAnnotationResultsUri(java.lang.String annotationResultsUri) {
    this.annotationResultsUri = annotationResultsUri;
    return this;
  }

  /**
   * If set, returns a google.rpc.Status message that specifies the error for the operation.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getError() {
    return error;
  }

  /**
   * If set, returns a google.rpc.Status message that specifies the error for the operation.
   * @param error error or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse setError(GoogleRpcStatus error) {
    this.error = error;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse clone() {
    return (GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse) super.clone();
  }

}
