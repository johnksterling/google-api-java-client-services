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

package com.google.api.services.sqladmin.model;

/**
 * Database flags for Cloud SQL instances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseFlags extends com.google.api.client.json.GenericJson {

  /**
   * The name of the flag. These flags are passed at instance startup, so include both server
   * options and system variables. Flags are specified with underscores, not hyphens. For more
   * information, see Configuring Database Flags in the Cloud SQL documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value of the flag. Booleans are set to *on* for true and *off* for false. This field must
   * be omitted if the flag doesn't take a value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The name of the flag. These flags are passed at instance startup, so include both server
   * options and system variables. Flags are specified with underscores, not hyphens. For more
   * information, see Configuring Database Flags in the Cloud SQL documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the flag. These flags are passed at instance startup, so include both server
   * options and system variables. Flags are specified with underscores, not hyphens. For more
   * information, see Configuring Database Flags in the Cloud SQL documentation.
   * @param name name or {@code null} for none
   */
  public DatabaseFlags setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the flag. Booleans are set to *on* for true and *off* for false. This field must
   * be omitted if the flag doesn't take a value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value of the flag. Booleans are set to *on* for true and *off* for false. This field must
   * be omitted if the flag doesn't take a value.
   * @param value value or {@code null} for none
   */
  public DatabaseFlags setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public DatabaseFlags set(String fieldName, Object value) {
    return (DatabaseFlags) super.set(fieldName, value);
  }

  @Override
  public DatabaseFlags clone() {
    return (DatabaseFlags) super.clone();
  }

}
