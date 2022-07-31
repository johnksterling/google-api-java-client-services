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

package com.google.api.services.beyondcorp.v1alpha.model;

/**
 * Row of the fetch response consisting of a set of entries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Columns/entries/key-vals in the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal> fieldValues;

  /**
   * Output only. Columns/entries/key-vals in the result.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal> getFieldValues() {
    return fieldValues;
  }

  /**
   * Output only. Columns/entries/key-vals in the result.
   * @param fieldValues fieldValues or {@code null} for none
   */
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow setFieldValues(java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRowFieldVal> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow clone() {
    return (GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow) super.clone();
  }

}
