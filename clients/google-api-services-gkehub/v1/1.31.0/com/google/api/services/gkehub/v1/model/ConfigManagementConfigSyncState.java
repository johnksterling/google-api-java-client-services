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

package com.google.api.services.gkehub.v1.model;

/**
 * State information for ConfigSync
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementConfigSyncState extends com.google.api.client.json.GenericJson {

  /**
   * Information about the deployment of ConfigSync, including the version of the various Pods
   * deployed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSyncDeploymentState deploymentState;

  /**
   * The state of ConfigSync's process to sync configs to a cluster
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementSyncState syncState;

  /**
   * The version of ConfigSync deployed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSyncVersion version;

  /**
   * Information about the deployment of ConfigSync, including the version of the various Pods
   * deployed
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState getDeploymentState() {
    return deploymentState;
  }

  /**
   * Information about the deployment of ConfigSync, including the version of the various Pods
   * deployed
   * @param deploymentState deploymentState or {@code null} for none
   */
  public ConfigManagementConfigSyncState setDeploymentState(ConfigManagementConfigSyncDeploymentState deploymentState) {
    this.deploymentState = deploymentState;
    return this;
  }

  /**
   * The state of ConfigSync's process to sync configs to a cluster
   * @return value or {@code null} for none
   */
  public ConfigManagementSyncState getSyncState() {
    return syncState;
  }

  /**
   * The state of ConfigSync's process to sync configs to a cluster
   * @param syncState syncState or {@code null} for none
   */
  public ConfigManagementConfigSyncState setSyncState(ConfigManagementSyncState syncState) {
    this.syncState = syncState;
    return this;
  }

  /**
   * The version of ConfigSync deployed
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSyncVersion getVersion() {
    return version;
  }

  /**
   * The version of ConfigSync deployed
   * @param version version or {@code null} for none
   */
  public ConfigManagementConfigSyncState setVersion(ConfigManagementConfigSyncVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public ConfigManagementConfigSyncState set(String fieldName, Object value) {
    return (ConfigManagementConfigSyncState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementConfigSyncState clone() {
    return (ConfigManagementConfigSyncState) super.clone();
  }

}
