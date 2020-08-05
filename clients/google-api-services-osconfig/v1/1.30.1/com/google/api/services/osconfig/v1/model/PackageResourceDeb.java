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

package com.google.api.services.osconfig.v1.model;

/**
 * A deb package file. dpkg packages only support INSTALLED state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageResourceDeb extends com.google.api.client.json.GenericJson {

  /**
   * Whether dependencies should also be installed. install when false: `dpkg -i package` install
   * when true: `apt-get update && apt-get -y install package.deb`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pullDeps;

  /**
   * A deb package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private File source;

  /**
   * Whether dependencies should also be installed. install when false: `dpkg -i package` install
   * when true: `apt-get update && apt-get -y install package.deb`
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPullDeps() {
    return pullDeps;
  }

  /**
   * Whether dependencies should also be installed. install when false: `dpkg -i package` install
   * when true: `apt-get update && apt-get -y install package.deb`
   * @param pullDeps pullDeps or {@code null} for none
   */
  public PackageResourceDeb setPullDeps(java.lang.Boolean pullDeps) {
    this.pullDeps = pullDeps;
    return this;
  }

  /**
   * A deb package.
   * @return value or {@code null} for none
   */
  public File getSource() {
    return source;
  }

  /**
   * A deb package.
   * @param source source or {@code null} for none
   */
  public PackageResourceDeb setSource(File source) {
    this.source = source;
    return this;
  }

  @Override
  public PackageResourceDeb set(String fieldName, Object value) {
    return (PackageResourceDeb) super.set(fieldName, value);
  }

  @Override
  public PackageResourceDeb clone() {
    return (PackageResourceDeb) super.clone();
  }

}
