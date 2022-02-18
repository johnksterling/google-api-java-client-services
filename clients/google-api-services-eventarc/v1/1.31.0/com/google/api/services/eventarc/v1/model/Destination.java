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

package com.google.api.services.eventarc.v1.model;

/**
 * Represents a target of an invocation over HTTP.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Destination extends com.google.api.client.json.GenericJson {

  /**
   * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format:
   * `projects/{project}/locations/{location}/functions/{function}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudFunction;

  /**
   * Cloud Run fully-managed resource that receives the events. The resource should be in the same
   * project as the trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudRun cloudRun;

  /**
   * A GKE service capable of receiving events. The service should be running in the same project as
   * the trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GKE gke;

  /**
   * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format:
   * `projects/{project}/locations/{location}/functions/{function}`
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudFunction() {
    return cloudFunction;
  }

  /**
   * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format:
   * `projects/{project}/locations/{location}/functions/{function}`
   * @param cloudFunction cloudFunction or {@code null} for none
   */
  public Destination setCloudFunction(java.lang.String cloudFunction) {
    this.cloudFunction = cloudFunction;
    return this;
  }

  /**
   * Cloud Run fully-managed resource that receives the events. The resource should be in the same
   * project as the trigger.
   * @return value or {@code null} for none
   */
  public CloudRun getCloudRun() {
    return cloudRun;
  }

  /**
   * Cloud Run fully-managed resource that receives the events. The resource should be in the same
   * project as the trigger.
   * @param cloudRun cloudRun or {@code null} for none
   */
  public Destination setCloudRun(CloudRun cloudRun) {
    this.cloudRun = cloudRun;
    return this;
  }

  /**
   * A GKE service capable of receiving events. The service should be running in the same project as
   * the trigger.
   * @return value or {@code null} for none
   */
  public GKE getGke() {
    return gke;
  }

  /**
   * A GKE service capable of receiving events. The service should be running in the same project as
   * the trigger.
   * @param gke gke or {@code null} for none
   */
  public Destination setGke(GKE gke) {
    this.gke = gke;
    return this;
  }

  @Override
  public Destination set(String fieldName, Object value) {
    return (Destination) super.set(fieldName, value);
  }

  @Override
  public Destination clone() {
    return (Destination) super.clone();
  }

}
