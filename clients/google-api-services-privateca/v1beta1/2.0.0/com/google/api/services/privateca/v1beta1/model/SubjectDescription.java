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

package com.google.api.services.privateca.v1beta1.model;

/**
 * These values describe fields in an issued X.509 certificate such as the distinguished name,
 * subject alternative names, serial number, and lifetime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubjectDescription extends com.google.api.client.json.GenericJson {

  /**
   * The "common name" of the distinguished name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commonName;

  /**
   * The serial number encoded in lowercase hexadecimal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hexSerialNumber;

  /**
   * For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time'
   * - 'not_before_time'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lifetime;

  /**
   * The time at which the certificate expires.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String notAfterTime;

  /**
   * The time at which the certificate becomes valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String notBeforeTime;

  /**
   * Contains distinguished name fields such as the location and organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Subject subject;

  /**
   * The subject alternative name fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubjectAltNames subjectAltName;

  /**
   * The "common name" of the distinguished name.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommonName() {
    return commonName;
  }

  /**
   * The "common name" of the distinguished name.
   * @param commonName commonName or {@code null} for none
   */
  public SubjectDescription setCommonName(java.lang.String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * The serial number encoded in lowercase hexadecimal.
   * @return value or {@code null} for none
   */
  public java.lang.String getHexSerialNumber() {
    return hexSerialNumber;
  }

  /**
   * The serial number encoded in lowercase hexadecimal.
   * @param hexSerialNumber hexSerialNumber or {@code null} for none
   */
  public SubjectDescription setHexSerialNumber(java.lang.String hexSerialNumber) {
    this.hexSerialNumber = hexSerialNumber;
    return this;
  }

  /**
   * For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time'
   * - 'not_before_time'.
   * @return value or {@code null} for none
   */
  public String getLifetime() {
    return lifetime;
  }

  /**
   * For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time'
   * - 'not_before_time'.
   * @param lifetime lifetime or {@code null} for none
   */
  public SubjectDescription setLifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  /**
   * The time at which the certificate expires.
   * @return value or {@code null} for none
   */
  public String getNotAfterTime() {
    return notAfterTime;
  }

  /**
   * The time at which the certificate expires.
   * @param notAfterTime notAfterTime or {@code null} for none
   */
  public SubjectDescription setNotAfterTime(String notAfterTime) {
    this.notAfterTime = notAfterTime;
    return this;
  }

  /**
   * The time at which the certificate becomes valid.
   * @return value or {@code null} for none
   */
  public String getNotBeforeTime() {
    return notBeforeTime;
  }

  /**
   * The time at which the certificate becomes valid.
   * @param notBeforeTime notBeforeTime or {@code null} for none
   */
  public SubjectDescription setNotBeforeTime(String notBeforeTime) {
    this.notBeforeTime = notBeforeTime;
    return this;
  }

  /**
   * Contains distinguished name fields such as the location and organization.
   * @return value or {@code null} for none
   */
  public Subject getSubject() {
    return subject;
  }

  /**
   * Contains distinguished name fields such as the location and organization.
   * @param subject subject or {@code null} for none
   */
  public SubjectDescription setSubject(Subject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The subject alternative name fields.
   * @return value or {@code null} for none
   */
  public SubjectAltNames getSubjectAltName() {
    return subjectAltName;
  }

  /**
   * The subject alternative name fields.
   * @param subjectAltName subjectAltName or {@code null} for none
   */
  public SubjectDescription setSubjectAltName(SubjectAltNames subjectAltName) {
    this.subjectAltName = subjectAltName;
    return this;
  }

  @Override
  public SubjectDescription set(String fieldName, Object value) {
    return (SubjectDescription) super.set(fieldName, value);
  }

  @Override
  public SubjectDescription clone() {
    return (SubjectDescription) super.clone();
  }

}
