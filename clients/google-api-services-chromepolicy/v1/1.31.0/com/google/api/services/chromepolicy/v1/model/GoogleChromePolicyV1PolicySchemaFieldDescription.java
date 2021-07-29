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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Provides detailed information for a particular field that is part of a PolicySchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyV1PolicySchemaFieldDescription extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The description for the field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The name of the field for associated with this description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * Output only. Provides a list of fields and the values they must have for this field to be
   * allowed to be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1PolicySchemaFieldDependencies> fieldDependencies;

  static {
    // hack to force ProGuard to consider GoogleChromePolicyV1PolicySchemaFieldDependencies used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromePolicyV1PolicySchemaFieldDependencies.class);
  }

  /**
   * Output only. Any input constraints associated on the values for the field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputConstraint;

  /**
   * Output only. If the field has a set of know values, this field will provide a description for
   * these values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1PolicySchemaFieldKnownValueDescription> knownValueDescriptions;

  /**
   * Output only. Provides the description of the fields nested in this field, if the field is a
   * message type that defines multiple fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> nestedFieldDescriptions;

  /**
   * Output only. The description for the field.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. The description for the field.
   * @param description description or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The name of the field for associated with this description.
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * Output only. The name of the field for associated with this description.
   * @param field field or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * Output only. Provides a list of fields and the values they must have for this field to be
   * allowed to be set.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1PolicySchemaFieldDependencies> getFieldDependencies() {
    return fieldDependencies;
  }

  /**
   * Output only. Provides a list of fields and the values they must have for this field to be
   * allowed to be set.
   * @param fieldDependencies fieldDependencies or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setFieldDependencies(java.util.List<GoogleChromePolicyV1PolicySchemaFieldDependencies> fieldDependencies) {
    this.fieldDependencies = fieldDependencies;
    return this;
  }

  /**
   * Output only. Any input constraints associated on the values for the field.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputConstraint() {
    return inputConstraint;
  }

  /**
   * Output only. Any input constraints associated on the values for the field.
   * @param inputConstraint inputConstraint or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setInputConstraint(java.lang.String inputConstraint) {
    this.inputConstraint = inputConstraint;
    return this;
  }

  /**
   * Output only. If the field has a set of know values, this field will provide a description for
   * these values.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1PolicySchemaFieldKnownValueDescription> getKnownValueDescriptions() {
    return knownValueDescriptions;
  }

  /**
   * Output only. If the field has a set of know values, this field will provide a description for
   * these values.
   * @param knownValueDescriptions knownValueDescriptions or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setKnownValueDescriptions(java.util.List<GoogleChromePolicyV1PolicySchemaFieldKnownValueDescription> knownValueDescriptions) {
    this.knownValueDescriptions = knownValueDescriptions;
    return this;
  }

  /**
   * Output only. Provides the description of the fields nested in this field, if the field is a
   * message type that defines multiple fields.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> getNestedFieldDescriptions() {
    return nestedFieldDescriptions;
  }

  /**
   * Output only. Provides the description of the fields nested in this field, if the field is a
   * message type that defines multiple fields.
   * @param nestedFieldDescriptions nestedFieldDescriptions or {@code null} for none
   */
  public GoogleChromePolicyV1PolicySchemaFieldDescription setNestedFieldDescriptions(java.util.List<GoogleChromePolicyV1PolicySchemaFieldDescription> nestedFieldDescriptions) {
    this.nestedFieldDescriptions = nestedFieldDescriptions;
    return this;
  }

  @Override
  public GoogleChromePolicyV1PolicySchemaFieldDescription set(String fieldName, Object value) {
    return (GoogleChromePolicyV1PolicySchemaFieldDescription) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyV1PolicySchemaFieldDescription clone() {
    return (GoogleChromePolicyV1PolicySchemaFieldDescription) super.clone();
  }

}
