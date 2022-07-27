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
 * Response of the ExportUserEventsRequest. If the long running operation was successful, then this
 * message is returned by the google.longrunning.Operations.response field if the operation was
 * successful.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaExportUserEventsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A sample of errors encountered while processing the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> errorSamples;

  /**
   * This field is never set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaExportErrorsConfig errorsConfig;

  /**
   * Output result indicating where the data were exported to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaOutputResult outputResult;

  /**
   * A sample of errors encountered while processing the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getErrorSamples() {
    return errorSamples;
  }

  /**
   * A sample of errors encountered while processing the request.
   * @param errorSamples errorSamples or {@code null} for none
   */
  public GoogleCloudRetailV2betaExportUserEventsResponse setErrorSamples(java.util.List<GoogleRpcStatus> errorSamples) {
    this.errorSamples = errorSamples;
    return this;
  }

  /**
   * This field is never set.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaExportErrorsConfig getErrorsConfig() {
    return errorsConfig;
  }

  /**
   * This field is never set.
   * @param errorsConfig errorsConfig or {@code null} for none
   */
  public GoogleCloudRetailV2betaExportUserEventsResponse setErrorsConfig(GoogleCloudRetailV2betaExportErrorsConfig errorsConfig) {
    this.errorsConfig = errorsConfig;
    return this;
  }

  /**
   * Output result indicating where the data were exported to.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaOutputResult getOutputResult() {
    return outputResult;
  }

  /**
   * Output result indicating where the data were exported to.
   * @param outputResult outputResult or {@code null} for none
   */
  public GoogleCloudRetailV2betaExportUserEventsResponse setOutputResult(GoogleCloudRetailV2betaOutputResult outputResult) {
    this.outputResult = outputResult;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaExportUserEventsResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaExportUserEventsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaExportUserEventsResponse clone() {
    return (GoogleCloudRetailV2betaExportUserEventsResponse) super.clone();
  }

}
