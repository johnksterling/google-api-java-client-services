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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * An alert that gets triggered when a user enables autoforwarding to an email which is outside of
 * its domain
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OutOfDomainForwarding extends com.google.api.client.json.GenericJson {

  /**
   * Email of the actor who triggered the alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actorEmail;

  /**
   * The time the email forwarding was enabled
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String enableTime;

  /**
   * Email to which emails are being forwarded
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String forwardeeEmail;

  /**
   * IP address of the user while enabling forwarding
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Email of the actor who triggered the alert.
   * @return value or {@code null} for none
   */
  public java.lang.String getActorEmail() {
    return actorEmail;
  }

  /**
   * Email of the actor who triggered the alert.
   * @param actorEmail actorEmail or {@code null} for none
   */
  public OutOfDomainForwarding setActorEmail(java.lang.String actorEmail) {
    this.actorEmail = actorEmail;
    return this;
  }

  /**
   * The time the email forwarding was enabled
   * @return value or {@code null} for none
   */
  public String getEnableTime() {
    return enableTime;
  }

  /**
   * The time the email forwarding was enabled
   * @param enableTime enableTime or {@code null} for none
   */
  public OutOfDomainForwarding setEnableTime(String enableTime) {
    this.enableTime = enableTime;
    return this;
  }

  /**
   * Email to which emails are being forwarded
   * @return value or {@code null} for none
   */
  public java.lang.String getForwardeeEmail() {
    return forwardeeEmail;
  }

  /**
   * Email to which emails are being forwarded
   * @param forwardeeEmail forwardeeEmail or {@code null} for none
   */
  public OutOfDomainForwarding setForwardeeEmail(java.lang.String forwardeeEmail) {
    this.forwardeeEmail = forwardeeEmail;
    return this;
  }

  /**
   * IP address of the user while enabling forwarding
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP address of the user while enabling forwarding
   * @param ipAddress ipAddress or {@code null} for none
   */
  public OutOfDomainForwarding setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  @Override
  public OutOfDomainForwarding set(String fieldName, Object value) {
    return (OutOfDomainForwarding) super.set(fieldName, value);
  }

  @Override
  public OutOfDomainForwarding clone() {
    return (OutOfDomainForwarding) super.clone();
  }

}
