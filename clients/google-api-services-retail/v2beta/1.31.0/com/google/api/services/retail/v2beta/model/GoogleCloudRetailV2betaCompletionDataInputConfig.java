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
 * The input config source for completion data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaCompletionDataInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-
   * retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an
   * error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaBigQuerySource bigQuerySource;

  /**
   * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-
   * retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an
   * error is thrown.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaBigQuerySource getBigQuerySource() {
    return bigQuerySource;
  }

  /**
   * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-
   * retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an
   * error is thrown.
   * @param bigQuerySource bigQuerySource or {@code null} for none
   */
  public GoogleCloudRetailV2betaCompletionDataInputConfig setBigQuerySource(GoogleCloudRetailV2betaBigQuerySource bigQuerySource) {
    this.bigQuerySource = bigQuerySource;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaCompletionDataInputConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaCompletionDataInputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaCompletionDataInputConfig clone() {
    return (GoogleCloudRetailV2betaCompletionDataInputConfig) super.clone();
  }

}
