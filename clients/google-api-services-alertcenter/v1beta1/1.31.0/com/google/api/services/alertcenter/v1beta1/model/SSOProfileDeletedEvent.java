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
 * Event occurred when SSO Profile deleted in customer's account. The event are being received from
 * insight forwarder
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
public final class SSOProfileDeletedEvent extends com.google.api.client.json.GenericJson {

  /**
   * sso profile name which got deleted
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inboundSsoProfileName;

  /**
   * sso profile name which got deleted
   * @return value or {@code null} for none
   */
  public java.lang.String getInboundSsoProfileName() {
    return inboundSsoProfileName;
  }

  /**
   * sso profile name which got deleted
   * @param inboundSsoProfileName inboundSsoProfileName or {@code null} for none
   */
  public SSOProfileDeletedEvent setInboundSsoProfileName(java.lang.String inboundSsoProfileName) {
    this.inboundSsoProfileName = inboundSsoProfileName;
    return this;
  }

  @Override
  public SSOProfileDeletedEvent set(String fieldName, Object value) {
    return (SSOProfileDeletedEvent) super.set(fieldName, value);
  }

  @Override
  public SSOProfileDeletedEvent clone() {
    return (SSOProfileDeletedEvent) super.clone();
  }

}
