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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * AnthosVMSubFeatureState contains the state of the AnthosVM subfeatures.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnthosVMSubFeatureState extends com.google.api.client.json.GenericJson {

  /**
   * Description represents human readable description of the subfeature state. If the deployment
   * failed, this should also contain the reason for the failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * InstallationState represents the state of installation of the subfeature in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installationState;

  /**
   * MigrateState represents the state of the Migrate subfeature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MigrateState migrateState;

  /**
   * ServiceMeshState represents the state of the Service Mesh subfeature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshState serviceMeshState;

  /**
   * Description represents human readable description of the subfeature state. If the deployment
   * failed, this should also contain the reason for the failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description represents human readable description of the subfeature state. If the deployment
   * failed, this should also contain the reason for the failure.
   * @param description description or {@code null} for none
   */
  public AnthosVMSubFeatureState setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * InstallationState represents the state of installation of the subfeature in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstallationState() {
    return installationState;
  }

  /**
   * InstallationState represents the state of installation of the subfeature in the cluster.
   * @param installationState installationState or {@code null} for none
   */
  public AnthosVMSubFeatureState setInstallationState(java.lang.String installationState) {
    this.installationState = installationState;
    return this;
  }

  /**
   * MigrateState represents the state of the Migrate subfeature.
   * @return value or {@code null} for none
   */
  public MigrateState getMigrateState() {
    return migrateState;
  }

  /**
   * MigrateState represents the state of the Migrate subfeature.
   * @param migrateState migrateState or {@code null} for none
   */
  public AnthosVMSubFeatureState setMigrateState(MigrateState migrateState) {
    this.migrateState = migrateState;
    return this;
  }

  /**
   * ServiceMeshState represents the state of the Service Mesh subfeature.
   * @return value or {@code null} for none
   */
  public ServiceMeshState getServiceMeshState() {
    return serviceMeshState;
  }

  /**
   * ServiceMeshState represents the state of the Service Mesh subfeature.
   * @param serviceMeshState serviceMeshState or {@code null} for none
   */
  public AnthosVMSubFeatureState setServiceMeshState(ServiceMeshState serviceMeshState) {
    this.serviceMeshState = serviceMeshState;
    return this;
  }

  @Override
  public AnthosVMSubFeatureState set(String fieldName, Object value) {
    return (AnthosVMSubFeatureState) super.set(fieldName, value);
  }

  @Override
  public AnthosVMSubFeatureState clone() {
    return (AnthosVMSubFeatureState) super.clone();
  }

}
