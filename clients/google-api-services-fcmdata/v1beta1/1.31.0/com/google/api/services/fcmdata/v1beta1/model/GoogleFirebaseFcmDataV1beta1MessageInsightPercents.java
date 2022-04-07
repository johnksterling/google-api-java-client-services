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

package com.google.api.services.fcmdata.v1beta1.model;

/**
 * Additional information about message delivery. All percentages are calculated with
 * countMessagesAccepted as the denominator.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging Data API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseFcmDataV1beta1MessageInsightPercents extends com.google.api.client.json.GenericJson {

  /**
   * The percentage of accepted messages that had their priority lowered from high to normal. See
   * [documentation for setting message priority](https://firebase.google.com/docs/cloud-
   * messaging/android/message-priority).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float priorityLowered;

  /**
   * The percentage of accepted messages that had their priority lowered from high to normal. See
   * [documentation for setting message priority](https://firebase.google.com/docs/cloud-
   * messaging/android/message-priority).
   * @return value or {@code null} for none
   */
  public java.lang.Float getPriorityLowered() {
    return priorityLowered;
  }

  /**
   * The percentage of accepted messages that had their priority lowered from high to normal. See
   * [documentation for setting message priority](https://firebase.google.com/docs/cloud-
   * messaging/android/message-priority).
   * @param priorityLowered priorityLowered or {@code null} for none
   */
  public GoogleFirebaseFcmDataV1beta1MessageInsightPercents setPriorityLowered(java.lang.Float priorityLowered) {
    this.priorityLowered = priorityLowered;
    return this;
  }

  @Override
  public GoogleFirebaseFcmDataV1beta1MessageInsightPercents set(String fieldName, Object value) {
    return (GoogleFirebaseFcmDataV1beta1MessageInsightPercents) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseFcmDataV1beta1MessageInsightPercents clone() {
    return (GoogleFirebaseFcmDataV1beta1MessageInsightPercents) super.clone();
  }

}
