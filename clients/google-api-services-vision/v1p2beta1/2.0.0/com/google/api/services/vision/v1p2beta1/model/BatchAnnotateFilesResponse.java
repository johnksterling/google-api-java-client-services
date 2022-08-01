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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * A list of file annotation responses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchAnnotateFilesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of file annotation responses, each response corresponding to each AnnotateFileRequest
   * in BatchAnnotateFilesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnnotateFileResponse> responses;

  static {
    // hack to force ProGuard to consider AnnotateFileResponse used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AnnotateFileResponse.class);
  }

  /**
   * The list of file annotation responses, each response corresponding to each AnnotateFileRequest
   * in BatchAnnotateFilesRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<AnnotateFileResponse> getResponses() {
    return responses;
  }

  /**
   * The list of file annotation responses, each response corresponding to each AnnotateFileRequest
   * in BatchAnnotateFilesRequest.
   * @param responses responses or {@code null} for none
   */
  public BatchAnnotateFilesResponse setResponses(java.util.List<AnnotateFileResponse> responses) {
    this.responses = responses;
    return this;
  }

  @Override
  public BatchAnnotateFilesResponse set(String fieldName, Object value) {
    return (BatchAnnotateFilesResponse) super.set(fieldName, value);
  }

  @Override
  public BatchAnnotateFilesResponse clone() {
    return (BatchAnnotateFilesResponse) super.clone();
  }

}
