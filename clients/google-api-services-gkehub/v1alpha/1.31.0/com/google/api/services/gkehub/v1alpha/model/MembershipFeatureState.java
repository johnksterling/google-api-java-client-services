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
 * MembershipFeatureState contains Feature status information for a single Membership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipFeatureState extends com.google.api.client.json.GenericJson {

  /**
   * AnthosVM state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnthosVMMembershipState anthosvm;

  /**
   * Appdevexperience specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppDevExperienceFeatureState appdevexperience;

  /**
   * Config Management-specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementMembershipState configmanagement;

  /**
   * Identity Service-specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IdentityServiceMembershipState identityservice;

  /**
   * Metering-specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MeteringMembershipState metering;

  /**
   * Policycontroller-specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerMembershipState policycontroller;

  /**
   * Service Mesh-specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshMembershipState servicemesh;

  /**
   * The high-level state of this Feature for a single membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FeatureState state;

  /**
   * AnthosVM state.
   * @return value or {@code null} for none
   */
  public AnthosVMMembershipState getAnthosvm() {
    return anthosvm;
  }

  /**
   * AnthosVM state.
   * @param anthosvm anthosvm or {@code null} for none
   */
  public MembershipFeatureState setAnthosvm(AnthosVMMembershipState anthosvm) {
    this.anthosvm = anthosvm;
    return this;
  }

  /**
   * Appdevexperience specific state.
   * @return value or {@code null} for none
   */
  public AppDevExperienceFeatureState getAppdevexperience() {
    return appdevexperience;
  }

  /**
   * Appdevexperience specific state.
   * @param appdevexperience appdevexperience or {@code null} for none
   */
  public MembershipFeatureState setAppdevexperience(AppDevExperienceFeatureState appdevexperience) {
    this.appdevexperience = appdevexperience;
    return this;
  }

  /**
   * Config Management-specific state.
   * @return value or {@code null} for none
   */
  public ConfigManagementMembershipState getConfigmanagement() {
    return configmanagement;
  }

  /**
   * Config Management-specific state.
   * @param configmanagement configmanagement or {@code null} for none
   */
  public MembershipFeatureState setConfigmanagement(ConfigManagementMembershipState configmanagement) {
    this.configmanagement = configmanagement;
    return this;
  }

  /**
   * Identity Service-specific state.
   * @return value or {@code null} for none
   */
  public IdentityServiceMembershipState getIdentityservice() {
    return identityservice;
  }

  /**
   * Identity Service-specific state.
   * @param identityservice identityservice or {@code null} for none
   */
  public MembershipFeatureState setIdentityservice(IdentityServiceMembershipState identityservice) {
    this.identityservice = identityservice;
    return this;
  }

  /**
   * Metering-specific spec.
   * @return value or {@code null} for none
   */
  public MeteringMembershipState getMetering() {
    return metering;
  }

  /**
   * Metering-specific spec.
   * @param metering metering or {@code null} for none
   */
  public MembershipFeatureState setMetering(MeteringMembershipState metering) {
    this.metering = metering;
    return this;
  }

  /**
   * Policycontroller-specific state.
   * @return value or {@code null} for none
   */
  public PolicyControllerMembershipState getPolicycontroller() {
    return policycontroller;
  }

  /**
   * Policycontroller-specific state.
   * @param policycontroller policycontroller or {@code null} for none
   */
  public MembershipFeatureState setPolicycontroller(PolicyControllerMembershipState policycontroller) {
    this.policycontroller = policycontroller;
    return this;
  }

  /**
   * Service Mesh-specific state.
   * @return value or {@code null} for none
   */
  public ServiceMeshMembershipState getServicemesh() {
    return servicemesh;
  }

  /**
   * Service Mesh-specific state.
   * @param servicemesh servicemesh or {@code null} for none
   */
  public MembershipFeatureState setServicemesh(ServiceMeshMembershipState servicemesh) {
    this.servicemesh = servicemesh;
    return this;
  }

  /**
   * The high-level state of this Feature for a single membership.
   * @return value or {@code null} for none
   */
  public FeatureState getState() {
    return state;
  }

  /**
   * The high-level state of this Feature for a single membership.
   * @param state state or {@code null} for none
   */
  public MembershipFeatureState setState(FeatureState state) {
    this.state = state;
    return this;
  }

  @Override
  public MembershipFeatureState set(String fieldName, Object value) {
    return (MembershipFeatureState) super.set(fieldName, value);
  }

  @Override
  public MembershipFeatureState clone() {
    return (MembershipFeatureState) super.clone();
  }

}
