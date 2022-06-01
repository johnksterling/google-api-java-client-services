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

package com.google.api.services.cloudasset.v1p1beta1.model;

/**
 * Defines the conditions under which an EgressPolicy matches a request. Conditions are based on
 * information about the ApiOperation intended to be performed on the `resources` specified. Note
 * that if the destination of the request is also protected by a ServicePerimeter, then that
 * ServicePerimeter must have an IngressPolicy which allows access in order for this request to
 * succeed. The request must match `operations` AND `resources` fields in order to be allowed egress
 * out of the perimeter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1EgressTo extends com.google.api.client.json.GenericJson {

  /**
   * A list of external resources that are allowed to be accessed. A request matches if it contains
   * an external resource in this list (Example: s3://bucket/path). Currently '*' is not allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> externalResources;

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in the corresponding
   * EgressFrom. A request matches if it uses an operation/service in this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleIdentityAccesscontextmanagerV1ApiOperation> operations;

  static {
    // hack to force ProGuard to consider GoogleIdentityAccesscontextmanagerV1ApiOperation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleIdentityAccesscontextmanagerV1ApiOperation.class);
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, that are allowed to be
   * accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a
   * resource in this list. If `*` is specified for `resources`, then this EgressTo rule will
   * authorize access to all resources outside the perimeter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resources;

  /**
   * A list of external resources that are allowed to be accessed. A request matches if it contains
   * an external resource in this list (Example: s3://bucket/path). Currently '*' is not allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExternalResources() {
    return externalResources;
  }

  /**
   * A list of external resources that are allowed to be accessed. A request matches if it contains
   * an external resource in this list (Example: s3://bucket/path). Currently '*' is not allowed.
   * @param externalResources externalResources or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressTo setExternalResources(java.util.List<java.lang.String> externalResources) {
    this.externalResources = externalResources;
    return this;
  }

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in the corresponding
   * EgressFrom. A request matches if it uses an operation/service in this list.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleIdentityAccesscontextmanagerV1ApiOperation> getOperations() {
    return operations;
  }

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in the corresponding
   * EgressFrom. A request matches if it uses an operation/service in this list.
   * @param operations operations or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressTo setOperations(java.util.List<GoogleIdentityAccesscontextmanagerV1ApiOperation> operations) {
    this.operations = operations;
    return this;
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, that are allowed to be
   * accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a
   * resource in this list. If `*` is specified for `resources`, then this EgressTo rule will
   * authorize access to all resources outside the perimeter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResources() {
    return resources;
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, that are allowed to be
   * accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a
   * resource in this list. If `*` is specified for `resources`, then this EgressTo rule will
   * authorize access to all resources outside the perimeter.
   * @param resources resources or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressTo setResources(java.util.List<java.lang.String> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1EgressTo set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1EgressTo) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1EgressTo clone() {
    return (GoogleIdentityAccesscontextmanagerV1EgressTo) super.clone();
  }

}
