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

package com.google.api.services.servicemanagement.model;

/**
 * Output generated from semantically comparing two versions of a service configuration. Includes
 * detailed information about a field that have changed with applicable advice about potential
 * consequences for the change, such as backwards-incompatibility.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigChange extends com.google.api.client.json.GenericJson {

  /**
   * Collection of advice provided for this change, useful for determining the possible impact of
   * this change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Advice> advices;

  static {
    // hack to force ProGuard to consider Advice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Advice.class);
  }

  /**
   * The type for this change, either ADDED, REMOVED, or MODIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changeType;

  /**
   * Object hierarchy path to the change, with levels separated by a '.' character. For repeated
   * fields, an applicable unique identifier field is used for the index (usually selector, name, or
   * id). For maps, the term 'key' is used. If the field has no unique identifier, the numeric index
   * is used. Examples: - visibility.rules[selector=="google.LibraryService.ListBooks"].restriction
   * - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value -
   * logging.producer_destinations[0]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String element;

  /**
   * Value of the changed object in the new Service configuration, in JSON format. This field will
   * not be populated if ChangeType == REMOVED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newValue;

  /**
   * Value of the changed object in the old Service configuration, in JSON format. This field will
   * not be populated if ChangeType == ADDED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oldValue;

  /**
   * Collection of advice provided for this change, useful for determining the possible impact of
   * this change.
   * @return value or {@code null} for none
   */
  public java.util.List<Advice> getAdvices() {
    return advices;
  }

  /**
   * Collection of advice provided for this change, useful for determining the possible impact of
   * this change.
   * @param advices advices or {@code null} for none
   */
  public ConfigChange setAdvices(java.util.List<Advice> advices) {
    this.advices = advices;
    return this;
  }

  /**
   * The type for this change, either ADDED, REMOVED, or MODIFIED.
   * @return value or {@code null} for none
   */
  public java.lang.String getChangeType() {
    return changeType;
  }

  /**
   * The type for this change, either ADDED, REMOVED, or MODIFIED.
   * @param changeType changeType or {@code null} for none
   */
  public ConfigChange setChangeType(java.lang.String changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Object hierarchy path to the change, with levels separated by a '.' character. For repeated
   * fields, an applicable unique identifier field is used for the index (usually selector, name, or
   * id). For maps, the term 'key' is used. If the field has no unique identifier, the numeric index
   * is used. Examples: - visibility.rules[selector=="google.LibraryService.ListBooks"].restriction
   * - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value -
   * logging.producer_destinations[0]
   * @return value or {@code null} for none
   */
  public java.lang.String getElement() {
    return element;
  }

  /**
   * Object hierarchy path to the change, with levels separated by a '.' character. For repeated
   * fields, an applicable unique identifier field is used for the index (usually selector, name, or
   * id). For maps, the term 'key' is used. If the field has no unique identifier, the numeric index
   * is used. Examples: - visibility.rules[selector=="google.LibraryService.ListBooks"].restriction
   * - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value -
   * logging.producer_destinations[0]
   * @param element element or {@code null} for none
   */
  public ConfigChange setElement(java.lang.String element) {
    this.element = element;
    return this;
  }

  /**
   * Value of the changed object in the new Service configuration, in JSON format. This field will
   * not be populated if ChangeType == REMOVED.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewValue() {
    return newValue;
  }

  /**
   * Value of the changed object in the new Service configuration, in JSON format. This field will
   * not be populated if ChangeType == REMOVED.
   * @param newValue newValue or {@code null} for none
   */
  public ConfigChange setNewValue(java.lang.String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * Value of the changed object in the old Service configuration, in JSON format. This field will
   * not be populated if ChangeType == ADDED.
   * @return value or {@code null} for none
   */
  public java.lang.String getOldValue() {
    return oldValue;
  }

  /**
   * Value of the changed object in the old Service configuration, in JSON format. This field will
   * not be populated if ChangeType == ADDED.
   * @param oldValue oldValue or {@code null} for none
   */
  public ConfigChange setOldValue(java.lang.String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  @Override
  public ConfigChange set(String fieldName, Object value) {
    return (ConfigChange) super.set(fieldName, value);
  }

  @Override
  public ConfigChange clone() {
    return (ConfigChange) super.clone();
  }

}
