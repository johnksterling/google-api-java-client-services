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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Bidder endpoint that receives bid requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Endpoint extends com.google.api.client.json.GenericJson {

  /**
   * The protocol that the bidder endpoint is using.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bidProtocol;

  /**
   * The maximum number of queries per second allowed to be sent to this server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maximumQps;

  /**
   * Output only. Name of the endpoint resource that must follow the pattern
   * `bidders/{bidderAccountId}/endpoints/{endpointId}`, where {bidderAccountId} is the account ID
   * of the bidder who operates this endpoint, and {endpointId} is a unique ID assigned by the
   * server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The trading location that bid requests should be sent from. See https://developers.google.com
   * /authorized-buyers/rtb/peer-guide#trading-locations for further information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tradingLocation;

  /**
   * Output only. The URL that bid requests should be sent to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The protocol that the bidder endpoint is using.
   * @return value or {@code null} for none
   */
  public java.lang.String getBidProtocol() {
    return bidProtocol;
  }

  /**
   * The protocol that the bidder endpoint is using.
   * @param bidProtocol bidProtocol or {@code null} for none
   */
  public Endpoint setBidProtocol(java.lang.String bidProtocol) {
    this.bidProtocol = bidProtocol;
    return this;
  }

  /**
   * The maximum number of queries per second allowed to be sent to this server.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaximumQps() {
    return maximumQps;
  }

  /**
   * The maximum number of queries per second allowed to be sent to this server.
   * @param maximumQps maximumQps or {@code null} for none
   */
  public Endpoint setMaximumQps(java.lang.Long maximumQps) {
    this.maximumQps = maximumQps;
    return this;
  }

  /**
   * Output only. Name of the endpoint resource that must follow the pattern
   * `bidders/{bidderAccountId}/endpoints/{endpointId}`, where {bidderAccountId} is the account ID
   * of the bidder who operates this endpoint, and {endpointId} is a unique ID assigned by the
   * server.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the endpoint resource that must follow the pattern
   * `bidders/{bidderAccountId}/endpoints/{endpointId}`, where {bidderAccountId} is the account ID
   * of the bidder who operates this endpoint, and {endpointId} is a unique ID assigned by the
   * server.
   * @param name name or {@code null} for none
   */
  public Endpoint setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The trading location that bid requests should be sent from. See https://developers.google.com
   * /authorized-buyers/rtb/peer-guide#trading-locations for further information.
   * @return value or {@code null} for none
   */
  public java.lang.String getTradingLocation() {
    return tradingLocation;
  }

  /**
   * The trading location that bid requests should be sent from. See https://developers.google.com
   * /authorized-buyers/rtb/peer-guide#trading-locations for further information.
   * @param tradingLocation tradingLocation or {@code null} for none
   */
  public Endpoint setTradingLocation(java.lang.String tradingLocation) {
    this.tradingLocation = tradingLocation;
    return this;
  }

  /**
   * Output only. The URL that bid requests should be sent to.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Output only. The URL that bid requests should be sent to.
   * @param url url or {@code null} for none
   */
  public Endpoint setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Endpoint set(String fieldName, Object value) {
    return (Endpoint) super.set(fieldName, value);
  }

  @Override
  public Endpoint clone() {
    return (Endpoint) super.clone();
  }

}
