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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * `Context` defines which contexts an API requests. Example: context: rules: - selector: "*"
 * requested: - google.rpc.context.ProjectContext - google.rpc.context.OriginContext The above
 * specifies that all methods in the API request `google.rpc.context.ProjectContext` and
 * `google.rpc.context.OriginContext`. Available context types are defined in package
 * `google.rpc.context`. This also provides mechanism to allowlist any protobuf message extension
 * that can be sent in grpc metadata using “x-goog-ext--bin” and “x-goog-ext--jspb” format. For
 * example, list any service specific protobuf types that can appear in grpc metadata as follows in
 * your yaml file: Example: context: rules: - selector:
 * "google.example.library.v1.LibraryService.CreateBook" allowed_request_extensions: -
 * google.foo.v1.NewExtension allowed_response_extensions: - google.foo.v1.NewExtension You can also
 * specify extension ID instead of fully qualified extension name here.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Context extends com.google.api.client.json.GenericJson {

  /**
   * A list of RPC context rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContextRule> rules;

  /**
   * A list of RPC context rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<ContextRule> getRules() {
    return rules;
  }

  /**
   * A list of RPC context rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Context setRules(java.util.List<ContextRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Context set(String fieldName, Object value) {
    return (Context) super.set(fieldName, value);
  }

  @Override
  public Context clone() {
    return (Context) super.clone();
  }

}
