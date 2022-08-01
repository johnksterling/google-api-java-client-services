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

package com.google.api.services.tpu.v2alpha1.model;

/**
 * Network related configurations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * Allows the TPU node to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use the TPU workers to forward routes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canIpForward;

  /**
   * Indicates that external IP addresses would be associated with the TPU workers. If set to false,
   * the specified subnetwork or network should have Private Google Access enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableExternalIps;

  /**
   * The name of the network for the TPU node. It must be a preexisting Google Compute Engine
   * network. If none is provided, "default" will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine
   * subnetwork. If none is provided, "default" will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * Allows the TPU node to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use the TPU workers to forward routes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanIpForward() {
    return canIpForward;
  }

  /**
   * Allows the TPU node to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use the TPU workers to forward routes.
   * @param canIpForward canIpForward or {@code null} for none
   */
  public NetworkConfig setCanIpForward(java.lang.Boolean canIpForward) {
    this.canIpForward = canIpForward;
    return this;
  }

  /**
   * Indicates that external IP addresses would be associated with the TPU workers. If set to false,
   * the specified subnetwork or network should have Private Google Access enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableExternalIps() {
    return enableExternalIps;
  }

  /**
   * Indicates that external IP addresses would be associated with the TPU workers. If set to false,
   * the specified subnetwork or network should have Private Google Access enabled.
   * @param enableExternalIps enableExternalIps or {@code null} for none
   */
  public NetworkConfig setEnableExternalIps(java.lang.Boolean enableExternalIps) {
    this.enableExternalIps = enableExternalIps;
    return this;
  }

  /**
   * The name of the network for the TPU node. It must be a preexisting Google Compute Engine
   * network. If none is provided, "default" will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The name of the network for the TPU node. It must be a preexisting Google Compute Engine
   * network. If none is provided, "default" will be used.
   * @param network network or {@code null} for none
   */
  public NetworkConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine
   * subnetwork. If none is provided, "default" will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine
   * subnetwork. If none is provided, "default" will be used.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkConfig setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
