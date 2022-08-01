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

package com.google.api.services.sheets.v4.model;

/**
 * Metadata about a value in a pivot grouping.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PivotGroupValueMetadata extends com.google.api.client.json.GenericJson {

  /**
   * True if the data corresponding to the value is collapsed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean collapsed;

  /**
   * The calculated value the metadata corresponds to. (Note that formulaValue is not valid, because
   * the values will be calculated.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedValue value;

  /**
   * True if the data corresponding to the value is collapsed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCollapsed() {
    return collapsed;
  }

  /**
   * True if the data corresponding to the value is collapsed.
   * @param collapsed collapsed or {@code null} for none
   */
  public PivotGroupValueMetadata setCollapsed(java.lang.Boolean collapsed) {
    this.collapsed = collapsed;
    return this;
  }

  /**
   * The calculated value the metadata corresponds to. (Note that formulaValue is not valid, because
   * the values will be calculated.)
   * @return value or {@code null} for none
   */
  public ExtendedValue getValue() {
    return value;
  }

  /**
   * The calculated value the metadata corresponds to. (Note that formulaValue is not valid, because
   * the values will be calculated.)
   * @param value value or {@code null} for none
   */
  public PivotGroupValueMetadata setValue(ExtendedValue value) {
    this.value = value;
    return this;
  }

  @Override
  public PivotGroupValueMetadata set(String fieldName, Object value) {
    return (PivotGroupValueMetadata) super.set(fieldName, value);
  }

  @Override
  public PivotGroupValueMetadata clone() {
    return (PivotGroupValueMetadata) super.clone();
  }

}
