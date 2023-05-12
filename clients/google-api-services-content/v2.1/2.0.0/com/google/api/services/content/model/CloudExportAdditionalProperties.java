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

package com.google.api.services.content.model;

/**
 * Product property for the Cloud Retail API. For example, properties for a TV product could be
 * "Screen-Resolution" or "Screen-Size".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudExportAdditionalProperties extends com.google.api.client.json.GenericJson {

  /**
   * Boolean value of the given property. For example for a TV product, "True" or "False" if the
   * screen is UHD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * Float values of the given property. For example for a TV product 1.2345. Maximum number of
   * specified values for this field is 400. Values are stored in an arbitrary but consistent order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> floatValue;

  /**
   * Integer values of the given property. For example, 1080 for a screen resolution of a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> intValue;

  /**
   * Maximum float value of the given property. For example for a TV product 100.00.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxValue;

  /**
   * Minimum float value of the given property. For example for a TV product 1.00.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float minValue;

  /**
   * Name of the given property. For example, "Screen-Resolution" for a TV product. Maximum string
   * size is 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String propertyName;

  /**
   * Text value of the given property. For example, "8K(UHD)" could be a text value for a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order. Maximum string size is 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> textValue;

  /**
   * Unit of the given property. For example, "Pixels" for a TV product. Maximum string size is 256
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitCode;

  /**
   * Boolean value of the given property. For example for a TV product, "True" or "False" if the
   * screen is UHD.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * Boolean value of the given property. For example for a TV product, "True" or "False" if the
   * screen is UHD.
   * @param boolValue boolValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Float values of the given property. For example for a TV product 1.2345. Maximum number of
   * specified values for this field is 400. Values are stored in an arbitrary but consistent order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getFloatValue() {
    return floatValue;
  }

  /**
   * Float values of the given property. For example for a TV product 1.2345. Maximum number of
   * specified values for this field is 400. Values are stored in an arbitrary but consistent order.
   * @param floatValue floatValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setFloatValue(java.util.List<java.lang.Float> floatValue) {
    this.floatValue = floatValue;
    return this;
  }

  /**
   * Integer values of the given property. For example, 1080 for a screen resolution of a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getIntValue() {
    return intValue;
  }

  /**
   * Integer values of the given property. For example, 1080 for a screen resolution of a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order.
   * @param intValue intValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setIntValue(java.util.List<java.lang.Long> intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Maximum float value of the given property. For example for a TV product 100.00.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxValue() {
    return maxValue;
  }

  /**
   * Maximum float value of the given property. For example for a TV product 100.00.
   * @param maxValue maxValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setMaxValue(java.lang.Float maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Minimum float value of the given property. For example for a TV product 1.00.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMinValue() {
    return minValue;
  }

  /**
   * Minimum float value of the given property. For example for a TV product 1.00.
   * @param minValue minValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setMinValue(java.lang.Float minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Name of the given property. For example, "Screen-Resolution" for a TV product. Maximum string
   * size is 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPropertyName() {
    return propertyName;
  }

  /**
   * Name of the given property. For example, "Screen-Resolution" for a TV product. Maximum string
   * size is 256 characters.
   * @param propertyName propertyName or {@code null} for none
   */
  public CloudExportAdditionalProperties setPropertyName(java.lang.String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Text value of the given property. For example, "8K(UHD)" could be a text value for a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order. Maximum string size is 256 characters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTextValue() {
    return textValue;
  }

  /**
   * Text value of the given property. For example, "8K(UHD)" could be a text value for a TV
   * product. Maximum number of specified values for this field is 400. Values are stored in an
   * arbitrary but consistent order. Maximum string size is 256 characters.
   * @param textValue textValue or {@code null} for none
   */
  public CloudExportAdditionalProperties setTextValue(java.util.List<java.lang.String> textValue) {
    this.textValue = textValue;
    return this;
  }

  /**
   * Unit of the given property. For example, "Pixels" for a TV product. Maximum string size is 256
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitCode() {
    return unitCode;
  }

  /**
   * Unit of the given property. For example, "Pixels" for a TV product. Maximum string size is 256
   * bytes.
   * @param unitCode unitCode or {@code null} for none
   */
  public CloudExportAdditionalProperties setUnitCode(java.lang.String unitCode) {
    this.unitCode = unitCode;
    return this;
  }

  @Override
  public CloudExportAdditionalProperties set(String fieldName, Object value) {
    return (CloudExportAdditionalProperties) super.set(fieldName, value);
  }

  @Override
  public CloudExportAdditionalProperties clone() {
    return (CloudExportAdditionalProperties) super.clone();
  }

}