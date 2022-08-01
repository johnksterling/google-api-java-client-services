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
 * `SourceContext` represents information about the source of a protobuf element, like the file in
 * which it is defined.
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
public final class SourceContext extends com.google.api.client.json.GenericJson {

  /**
   * The path-qualified name of the .proto file that contained the associated protobuf element. For
   * example: `"google/protobuf/source_context.proto"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileName;

  /**
   * The path-qualified name of the .proto file that contained the associated protobuf element. For
   * example: `"google/protobuf/source_context.proto"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * The path-qualified name of the .proto file that contained the associated protobuf element. For
   * example: `"google/protobuf/source_context.proto"`.
   * @param fileName fileName or {@code null} for none
   */
  public SourceContext setFileName(java.lang.String fileName) {
    this.fileName = fileName;
    return this;
  }

  @Override
  public SourceContext set(String fieldName, Object value) {
    return (SourceContext) super.set(fieldName, value);
  }

  @Override
  public SourceContext clone() {
    return (SourceContext) super.clone();
  }

}
