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

package com.google.api.services.dns.model;

/**
 * Model definition for PolicyAlternativeNameServerConfigTargetNameServer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyAlternativeNameServerConfigTargetNameServer extends com.google.api.client.json.GenericJson {

  /**
   * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes
   * forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network,
   * non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries
   * through the VPC network for this target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String forwardingPath;

  /**
   * IPv4 address to forward to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv4Address;

  /**
   * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6Address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes
   * forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network,
   * non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries
   * through the VPC network for this target.
   * @return value or {@code null} for none
   */
  public java.lang.String getForwardingPath() {
    return forwardingPath;
  }

  /**
   * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes
   * forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network,
   * non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries
   * through the VPC network for this target.
   * @param forwardingPath forwardingPath or {@code null} for none
   */
  public PolicyAlternativeNameServerConfigTargetNameServer setForwardingPath(java.lang.String forwardingPath) {
    this.forwardingPath = forwardingPath;
    return this;
  }

  /**
   * IPv4 address to forward to.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv4Address() {
    return ipv4Address;
  }

  /**
   * IPv4 address to forward to.
   * @param ipv4Address ipv4Address or {@code null} for none
   */
  public PolicyAlternativeNameServerConfigTargetNameServer setIpv4Address(java.lang.String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6Address() {
    return ipv6Address;
  }

  /**
   * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
   * @param ipv6Address ipv6Address or {@code null} for none
   */
  public PolicyAlternativeNameServerConfigTargetNameServer setIpv6Address(java.lang.String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public PolicyAlternativeNameServerConfigTargetNameServer setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public PolicyAlternativeNameServerConfigTargetNameServer set(String fieldName, Object value) {
    return (PolicyAlternativeNameServerConfigTargetNameServer) super.set(fieldName, value);
  }

  @Override
  public PolicyAlternativeNameServerConfigTargetNameServer clone() {
    return (PolicyAlternativeNameServerConfigTargetNameServer) super.clone();
  }

}
