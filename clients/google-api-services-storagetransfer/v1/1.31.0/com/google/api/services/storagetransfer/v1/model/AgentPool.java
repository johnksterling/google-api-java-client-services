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

package com.google.api.services.storagetransfer.v1.model;

/**
 * Represents an On-Premises Agent pool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentPool extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the bandwidth limit details. If this field is unspecified, the default value is set
   * as 'No Limit'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BandwidthLimit bandwidthLimit;

  /**
   * Specifies the client-specified AgentPool description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. Specifies a unique string that identifies the agent pool. Format:
   * projects/{project_id}/agentPools/{agent_pool_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Specifies the state of the AgentPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Specifies the bandwidth limit details. If this field is unspecified, the default value is set
   * as 'No Limit'.
   * @return value or {@code null} for none
   */
  public BandwidthLimit getBandwidthLimit() {
    return bandwidthLimit;
  }

  /**
   * Specifies the bandwidth limit details. If this field is unspecified, the default value is set
   * as 'No Limit'.
   * @param bandwidthLimit bandwidthLimit or {@code null} for none
   */
  public AgentPool setBandwidthLimit(BandwidthLimit bandwidthLimit) {
    this.bandwidthLimit = bandwidthLimit;
    return this;
  }

  /**
   * Specifies the client-specified AgentPool description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Specifies the client-specified AgentPool description.
   * @param displayName displayName or {@code null} for none
   */
  public AgentPool setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. Specifies a unique string that identifies the agent pool. Format:
   * projects/{project_id}/agentPools/{agent_pool_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Specifies a unique string that identifies the agent pool. Format:
   * projects/{project_id}/agentPools/{agent_pool_id}
   * @param name name or {@code null} for none
   */
  public AgentPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Specifies the state of the AgentPool.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Specifies the state of the AgentPool.
   * @param state state or {@code null} for none
   */
  public AgentPool setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public AgentPool set(String fieldName, Object value) {
    return (AgentPool) super.set(fieldName, value);
  }

  @Override
  public AgentPool clone() {
    return (AgentPool) super.clone();
  }

}
