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
 * A zone is a subtree of the DNS namespace under one administrative responsibility. A ManagedZone
 * is a resource that represents a DNS zone hosted by the Cloud DNS service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZone extends com.google.api.client.json.GenericJson {

  /**
   * The time that this resource was created on the server. This is in RFC3339 text format. Output
   * only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTime;

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the managed zone's function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The DNS name of this managed zone, for instance "example.com.".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dnsName;

  /**
   * DNSSEC configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZoneDnsSecConfig dnssecConfig;

  /**
   * The presence for this field indicates that outbound forwarding is enabled for this zone. The
   * value of this field contains the set of destinations to forward to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZoneForwardingConfig forwardingConfig;

  /**
   * Unique identifier for the resource; defined by the server (output only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * User labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * User assigned name for this resource. Must be unique within the project. The name must be 1-63
   * characters long, must begin with a letter, end with a letter or digit, and only contain
   * lowercase letters, digits or dashes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
   * name servers that all host the same ManagedZones. Most users leave this field unset. If you
   * need to use this field, contact your account team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nameServerSet;

  /**
   * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nameServers;

  /**
   * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
   * this field contains the network to peer with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZonePeeringConfig peeringConfig;

  /**
   * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
   * visible from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZonePrivateVisibilityConfig privateVisibilityConfig;

  /**
   * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS
   * resolves reverse lookup queries using automatically configured records for VPC resources. This
   * only applies to networks listed under private_visibility_config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZoneReverseLookupConfig reverseLookupConfig;

  /**
   * This field links to the associated service directory namespace. Do not set this field for
   * public zones or forwarding zones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZoneServiceDirectoryConfig serviceDirectoryConfig;

  /**
   * The zone's visibility: public zones are exposed to the Internet, while private zones are
   * visible only to Virtual Private Cloud resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visibility;

  /**
   * The time that this resource was created on the server. This is in RFC3339 text format. Output
   * only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTime() {
    return creationTime;
  }

  /**
   * The time that this resource was created on the server. This is in RFC3339 text format. Output
   * only.
   * @param creationTime creationTime or {@code null} for none
   */
  public ManagedZone setCreationTime(java.lang.String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the managed zone's function.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the managed zone's function.
   * @param description description or {@code null} for none
   */
  public ManagedZone setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The DNS name of this managed zone, for instance "example.com.".
   * @return value or {@code null} for none
   */
  public java.lang.String getDnsName() {
    return dnsName;
  }

  /**
   * The DNS name of this managed zone, for instance "example.com.".
   * @param dnsName dnsName or {@code null} for none
   */
  public ManagedZone setDnsName(java.lang.String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  /**
   * DNSSEC configuration.
   * @return value or {@code null} for none
   */
  public ManagedZoneDnsSecConfig getDnssecConfig() {
    return dnssecConfig;
  }

  /**
   * DNSSEC configuration.
   * @param dnssecConfig dnssecConfig or {@code null} for none
   */
  public ManagedZone setDnssecConfig(ManagedZoneDnsSecConfig dnssecConfig) {
    this.dnssecConfig = dnssecConfig;
    return this;
  }

  /**
   * The presence for this field indicates that outbound forwarding is enabled for this zone. The
   * value of this field contains the set of destinations to forward to.
   * @return value or {@code null} for none
   */
  public ManagedZoneForwardingConfig getForwardingConfig() {
    return forwardingConfig;
  }

  /**
   * The presence for this field indicates that outbound forwarding is enabled for this zone. The
   * value of this field contains the set of destinations to forward to.
   * @param forwardingConfig forwardingConfig or {@code null} for none
   */
  public ManagedZone setForwardingConfig(ManagedZoneForwardingConfig forwardingConfig) {
    this.forwardingConfig = forwardingConfig;
    return this;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only)
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only)
   * @param id id or {@code null} for none
   */
  public ManagedZone setId(java.math.BigInteger id) {
    this.id = id;
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
  public ManagedZone setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * User labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User labels.
   * @param labels labels or {@code null} for none
   */
  public ManagedZone setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * User assigned name for this resource. Must be unique within the project. The name must be 1-63
   * characters long, must begin with a letter, end with a letter or digit, and only contain
   * lowercase letters, digits or dashes.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User assigned name for this resource. Must be unique within the project. The name must be 1-63
   * characters long, must begin with a letter, end with a letter or digit, and only contain
   * lowercase letters, digits or dashes.
   * @param name name or {@code null} for none
   */
  public ManagedZone setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
   * name servers that all host the same ManagedZones. Most users leave this field unset. If you
   * need to use this field, contact your account team.
   * @return value or {@code null} for none
   */
  public java.lang.String getNameServerSet() {
    return nameServerSet;
  }

  /**
   * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
   * name servers that all host the same ManagedZones. Most users leave this field unset. If you
   * need to use this field, contact your account team.
   * @param nameServerSet nameServerSet or {@code null} for none
   */
  public ManagedZone setNameServerSet(java.lang.String nameServerSet) {
    this.nameServerSet = nameServerSet;
    return this;
  }

  /**
   * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNameServers() {
    return nameServers;
  }

  /**
   * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
   * @param nameServers nameServers or {@code null} for none
   */
  public ManagedZone setNameServers(java.util.List<java.lang.String> nameServers) {
    this.nameServers = nameServers;
    return this;
  }

  /**
   * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
   * this field contains the network to peer with.
   * @return value or {@code null} for none
   */
  public ManagedZonePeeringConfig getPeeringConfig() {
    return peeringConfig;
  }

  /**
   * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
   * this field contains the network to peer with.
   * @param peeringConfig peeringConfig or {@code null} for none
   */
  public ManagedZone setPeeringConfig(ManagedZonePeeringConfig peeringConfig) {
    this.peeringConfig = peeringConfig;
    return this;
  }

  /**
   * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
   * visible from.
   * @return value or {@code null} for none
   */
  public ManagedZonePrivateVisibilityConfig getPrivateVisibilityConfig() {
    return privateVisibilityConfig;
  }

  /**
   * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
   * visible from.
   * @param privateVisibilityConfig privateVisibilityConfig or {@code null} for none
   */
  public ManagedZone setPrivateVisibilityConfig(ManagedZonePrivateVisibilityConfig privateVisibilityConfig) {
    this.privateVisibilityConfig = privateVisibilityConfig;
    return this;
  }

  /**
   * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS
   * resolves reverse lookup queries using automatically configured records for VPC resources. This
   * only applies to networks listed under private_visibility_config.
   * @return value or {@code null} for none
   */
  public ManagedZoneReverseLookupConfig getReverseLookupConfig() {
    return reverseLookupConfig;
  }

  /**
   * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS
   * resolves reverse lookup queries using automatically configured records for VPC resources. This
   * only applies to networks listed under private_visibility_config.
   * @param reverseLookupConfig reverseLookupConfig or {@code null} for none
   */
  public ManagedZone setReverseLookupConfig(ManagedZoneReverseLookupConfig reverseLookupConfig) {
    this.reverseLookupConfig = reverseLookupConfig;
    return this;
  }

  /**
   * This field links to the associated service directory namespace. Do not set this field for
   * public zones or forwarding zones.
   * @return value or {@code null} for none
   */
  public ManagedZoneServiceDirectoryConfig getServiceDirectoryConfig() {
    return serviceDirectoryConfig;
  }

  /**
   * This field links to the associated service directory namespace. Do not set this field for
   * public zones or forwarding zones.
   * @param serviceDirectoryConfig serviceDirectoryConfig or {@code null} for none
   */
  public ManagedZone setServiceDirectoryConfig(ManagedZoneServiceDirectoryConfig serviceDirectoryConfig) {
    this.serviceDirectoryConfig = serviceDirectoryConfig;
    return this;
  }

  /**
   * The zone's visibility: public zones are exposed to the Internet, while private zones are
   * visible only to Virtual Private Cloud resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisibility() {
    return visibility;
  }

  /**
   * The zone's visibility: public zones are exposed to the Internet, while private zones are
   * visible only to Virtual Private Cloud resources.
   * @param visibility visibility or {@code null} for none
   */
  public ManagedZone setVisibility(java.lang.String visibility) {
    this.visibility = visibility;
    return this;
  }

  @Override
  public ManagedZone set(String fieldName, Object value) {
    return (ManagedZone) super.set(fieldName, value);
  }

  @Override
  public ManagedZone clone() {
    return (ManagedZone) super.clone();
  }

}
