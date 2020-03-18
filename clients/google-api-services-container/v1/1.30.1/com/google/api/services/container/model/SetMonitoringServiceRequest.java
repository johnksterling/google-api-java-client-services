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

package com.google.api.services.container.model;

/**
 * SetMonitoringServiceRequest sets the monitoring service of a cluster.
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
public final class SetMonitoringServiceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * Required. The monitoring service the cluster should use to write metrics. Currently available
   * options:
   *
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-
   * native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   * longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster.
   *
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String monitoringService;

  /**
   * The name (project, location, cluster) of the cluster to set monitoring. Specified in the format
   * 'projects/locations/clusters'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public SetMonitoringServiceRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * Required. The monitoring service the cluster should use to write metrics. Currently available
   * options:
   *
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-
   * native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   * longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster.
   *
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getMonitoringService() {
    return monitoringService;
  }

  /**
   * Required. The monitoring service the cluster should use to write metrics. Currently available
   * options:
   *
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-
   * native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   * longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster.
   *
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or
   * `monitoring.googleapis.com` for earlier versions.
   * @param monitoringService monitoringService or {@code null} for none
   */
  public SetMonitoringServiceRequest setMonitoringService(java.lang.String monitoringService) {
    this.monitoringService = monitoringService;
    return this;
  }

  /**
   * The name (project, location, cluster) of the cluster to set monitoring. Specified in the format
   * 'projects/locations/clusters'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster) of the cluster to set monitoring. Specified in the format
   * 'projects/locations/clusters'.
   * @param name name or {@code null} for none
   */
  public SetMonitoringServiceRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public SetMonitoringServiceRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public SetMonitoringServiceRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public SetMonitoringServiceRequest set(String fieldName, Object value) {
    return (SetMonitoringServiceRequest) super.set(fieldName, value);
  }

  @Override
  public SetMonitoringServiceRequest clone() {
    return (SetMonitoringServiceRequest) super.clone();
  }

}
