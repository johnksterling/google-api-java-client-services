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

package com.google.api.services.pubsublite.v1.model;

/**
 * A target publish or event time. Can be used for seeking to or retrieving the corresponding
 * cursor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeTarget extends com.google.api.client.json.GenericJson {

  /**
   * Request the cursor of the first message with event time greater than or equal to `event_time`.
   * If messages are missing an event time, the publish time is used as a fallback. As event times
   * are user supplied, subsequent messages may have event times less than `event_time` and should
   * be filtered by the client, if necessary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Request the cursor of the first message with publish time greater than or equal to
   * `publish_time`. All messages thereafter are guaranteed to have publish times >= `publish_time`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String publishTime;

  /**
   * Request the cursor of the first message with event time greater than or equal to `event_time`.
   * If messages are missing an event time, the publish time is used as a fallback. As event times
   * are user supplied, subsequent messages may have event times less than `event_time` and should
   * be filtered by the client, if necessary.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * Request the cursor of the first message with event time greater than or equal to `event_time`.
   * If messages are missing an event time, the publish time is used as a fallback. As event times
   * are user supplied, subsequent messages may have event times less than `event_time` and should
   * be filtered by the client, if necessary.
   * @param eventTime eventTime or {@code null} for none
   */
  public TimeTarget setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Request the cursor of the first message with publish time greater than or equal to
   * `publish_time`. All messages thereafter are guaranteed to have publish times >= `publish_time`.
   * @return value or {@code null} for none
   */
  public String getPublishTime() {
    return publishTime;
  }

  /**
   * Request the cursor of the first message with publish time greater than or equal to
   * `publish_time`. All messages thereafter are guaranteed to have publish times >= `publish_time`.
   * @param publishTime publishTime or {@code null} for none
   */
  public TimeTarget setPublishTime(String publishTime) {
    this.publishTime = publishTime;
    return this;
  }

  @Override
  public TimeTarget set(String fieldName, Object value) {
    return (TimeTarget) super.set(fieldName, value);
  }

  @Override
  public TimeTarget clone() {
    return (TimeTarget) super.clone();
  }

}
