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

package com.google.api.services.spanner.v1.model;

/**
 * A Cloud Spanner database role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseRole extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the database role. Values are of the form
   * `projects//instances//databases//databaseRoles/ {role}`, where `` is as specified in the
   * `CREATE ROLE` DDL statement. This name can be passed to Get/Set IAMPolicy methods to identify
   * the database role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The name of the database role. Values are of the form
   * `projects//instances//databases//databaseRoles/ {role}`, where `` is as specified in the
   * `CREATE ROLE` DDL statement. This name can be passed to Get/Set IAMPolicy methods to identify
   * the database role.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the database role. Values are of the form
   * `projects//instances//databases//databaseRoles/ {role}`, where `` is as specified in the
   * `CREATE ROLE` DDL statement. This name can be passed to Get/Set IAMPolicy methods to identify
   * the database role.
   * @param name name or {@code null} for none
   */
  public DatabaseRole setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public DatabaseRole set(String fieldName, Object value) {
    return (DatabaseRole) super.set(fieldName, value);
  }

  @Override
  public DatabaseRole clone() {
    return (DatabaseRole) super.clone();
  }

}
