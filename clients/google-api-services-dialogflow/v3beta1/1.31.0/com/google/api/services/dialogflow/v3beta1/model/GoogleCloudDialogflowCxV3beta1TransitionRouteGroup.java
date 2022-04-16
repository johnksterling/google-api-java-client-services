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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * An TransitionRouteGroup represents a group of `TransitionRoutes` to be used by a Page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteGroup extends com.google.api.client.json.GenericJson {

  /**
   * Required. The human-readable name of the transition route group, unique within the flow. The
   * display name can be no longer than 30 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The unique identifier of the transition route group.
   * TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format:
   * `projects//locations//agents//flows//transitionRouteGroups/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Transition routes associated with the TransitionRouteGroup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRoute> transitionRoutes;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3beta1TransitionRoute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3beta1TransitionRoute.class);
  }

  /**
   * Required. The human-readable name of the transition route group, unique within the flow. The
   * display name can be no longer than 30 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human-readable name of the transition route group, unique within the flow. The
   * display name can be no longer than 30 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The unique identifier of the transition route group.
   * TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format:
   * `projects//locations//agents//flows//transitionRouteGroups/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the transition route group.
   * TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format:
   * `projects//locations//agents//flows//transitionRouteGroups/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Transition routes associated with the TransitionRouteGroup.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRoute> getTransitionRoutes() {
    return transitionRoutes;
  }

  /**
   * Transition routes associated with the TransitionRouteGroup.
   * @param transitionRoutes transitionRoutes or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup setTransitionRoutes(java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRoute> transitionRoutes) {
    this.transitionRoutes = transitionRoutes;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroup) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup clone() {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroup) super.clone();
  }

}
