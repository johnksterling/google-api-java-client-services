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
 * AnthosVMSubFeatureSpec contains the subfeature configuration for a membership/cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnthosVMSubFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the subfeature should be enabled on the cluster or not. If set to true, the
   * subfeature's control plane and resources will be installed in the cluster. If set to false, the
   * oneof spec if present will be ignored and nothing will be installed in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * MigrateSpec repsents the configuration for Migrate subfeature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MigrateSpec migrateSpec;

  /**
   * ServiceMeshSpec repsents the configuration for Service Mesh subfeature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshSpec serviceMeshSpec;

  /**
   * Indicates whether the subfeature should be enabled on the cluster or not. If set to true, the
   * subfeature's control plane and resources will be installed in the cluster. If set to false, the
   * oneof spec if present will be ignored and nothing will be installed in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Indicates whether the subfeature should be enabled on the cluster or not. If set to true, the
   * subfeature's control plane and resources will be installed in the cluster. If set to false, the
   * oneof spec if present will be ignored and nothing will be installed in the cluster.
   * @param enabled enabled or {@code null} for none
   */
  public AnthosVMSubFeatureSpec setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * MigrateSpec repsents the configuration for Migrate subfeature.
   * @return value or {@code null} for none
   */
  public MigrateSpec getMigrateSpec() {
    return migrateSpec;
  }

  /**
   * MigrateSpec repsents the configuration for Migrate subfeature.
   * @param migrateSpec migrateSpec or {@code null} for none
   */
  public AnthosVMSubFeatureSpec setMigrateSpec(MigrateSpec migrateSpec) {
    this.migrateSpec = migrateSpec;
    return this;
  }

  /**
   * ServiceMeshSpec repsents the configuration for Service Mesh subfeature.
   * @return value or {@code null} for none
   */
  public ServiceMeshSpec getServiceMeshSpec() {
    return serviceMeshSpec;
  }

  /**
   * ServiceMeshSpec repsents the configuration for Service Mesh subfeature.
   * @param serviceMeshSpec serviceMeshSpec or {@code null} for none
   */
  public AnthosVMSubFeatureSpec setServiceMeshSpec(ServiceMeshSpec serviceMeshSpec) {
    this.serviceMeshSpec = serviceMeshSpec;
    return this;
  }

  @Override
  public AnthosVMSubFeatureSpec set(String fieldName, Object value) {
    return (AnthosVMSubFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public AnthosVMSubFeatureSpec clone() {
    return (AnthosVMSubFeatureSpec) super.clone();
  }

}
