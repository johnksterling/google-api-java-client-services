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
 * Describes a complete .proto file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Proto2FileDescriptorProto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Proto2EnumDescriptorProto> enumType;

  static {
    // hack to force ProGuard to consider Proto2EnumDescriptorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Proto2EnumDescriptorProto.class);
  }

  /**
   * All top-level definitions in this file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Proto2DescriptorProto> messageType;

  static {
    // hack to force ProGuard to consider Proto2DescriptorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Proto2DescriptorProto.class);
  }

  /**
   * file name, relative to root of source tree
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * e.g. "foo", "foo.bar", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private java.lang.String package__;

  /**
   * The syntax of the proto file. The supported values are "proto2", "proto3", and "editions". If
   * `edition` is present, this value must be "editions".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syntax;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Proto2EnumDescriptorProto> getEnumType() {
    return enumType;
  }

  /**
   * @param enumType enumType or {@code null} for none
   */
  public Proto2FileDescriptorProto setEnumType(java.util.List<Proto2EnumDescriptorProto> enumType) {
    this.enumType = enumType;
    return this;
  }

  /**
   * All top-level definitions in this file.
   * @return value or {@code null} for none
   */
  public java.util.List<Proto2DescriptorProto> getMessageType() {
    return messageType;
  }

  /**
   * All top-level definitions in this file.
   * @param messageType messageType or {@code null} for none
   */
  public Proto2FileDescriptorProto setMessageType(java.util.List<Proto2DescriptorProto> messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * file name, relative to root of source tree
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * file name, relative to root of source tree
   * @param name name or {@code null} for none
   */
  public Proto2FileDescriptorProto setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * e.g. "foo", "foo.bar", etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackage() {
    return package__;
  }

  /**
   * e.g. "foo", "foo.bar", etc.
   * @param package__ package__ or {@code null} for none
   */
  public Proto2FileDescriptorProto setPackage(java.lang.String package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * The syntax of the proto file. The supported values are "proto2", "proto3", and "editions". If
   * `edition` is present, this value must be "editions".
   * @return value or {@code null} for none
   */
  public java.lang.String getSyntax() {
    return syntax;
  }

  /**
   * The syntax of the proto file. The supported values are "proto2", "proto3", and "editions". If
   * `edition` is present, this value must be "editions".
   * @param syntax syntax or {@code null} for none
   */
  public Proto2FileDescriptorProto setSyntax(java.lang.String syntax) {
    this.syntax = syntax;
    return this;
  }

  @Override
  public Proto2FileDescriptorProto set(String fieldName, Object value) {
    return (Proto2FileDescriptorProto) super.set(fieldName, value);
  }

  @Override
  public Proto2FileDescriptorProto clone() {
    return (Proto2FileDescriptorProto) super.clone();
  }

}
