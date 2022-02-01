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

package com.google.api.services.container.v1beta1.model;

/**
 * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetMaintenancePolicyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the cluster to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * Required. The maintenance policy to be set for the cluster. An empty field clears the existing
   * maintenance policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenancePolicy maintenancePolicy;

  /**
   * The name (project, location, cluster name) of the cluster to set maintenance policy. Specified
   * in the format `projects/locations/clusters`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. The name of the cluster to update.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Required. The name of the cluster to update.
   * @param clusterId clusterId or {@code null} for none
   */
  public SetMaintenancePolicyRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * Required. The maintenance policy to be set for the cluster. An empty field clears the existing
   * maintenance policy.
   * @return value or {@code null} for none
   */
  public MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * Required. The maintenance policy to be set for the cluster. An empty field clears the existing
   * maintenance policy.
   * @param maintenancePolicy maintenancePolicy or {@code null} for none
   */
  public SetMaintenancePolicyRequest setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
    return this;
  }

  /**
   * The name (project, location, cluster name) of the cluster to set maintenance policy. Specified
   * in the format `projects/locations/clusters`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster name) of the cluster to set maintenance policy. Specified
   * in the format `projects/locations/clusters`.
   * @param name name or {@code null} for none
   */
  public SetMaintenancePolicyRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * @param projectId projectId or {@code null} for none
   */
  public SetMaintenancePolicyRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Required. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * @param zone zone or {@code null} for none
   */
  public SetMaintenancePolicyRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public SetMaintenancePolicyRequest set(String fieldName, Object value) {
    return (SetMaintenancePolicyRequest) super.set(fieldName, value);
  }

  @Override
  public SetMaintenancePolicyRequest clone() {
    return (SetMaintenancePolicyRequest) super.clone();
  }

}
