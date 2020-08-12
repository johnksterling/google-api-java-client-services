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

package com.google.api.services.cloudidentity.v1.model;

/**
 * Model definition for LookupMembershipNameResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LookupMembershipNameResponse extends com.google.api.client.json.GenericJson {

  /**
   * [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership being
   * looked up. Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique
   * ID assigned to the Group to which Membership belongs to, and `member_id` is the unique ID
   * assigned to the member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership being
   * looked up. Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique
   * ID assigned to the Group to which Membership belongs to, and `member_id` is the unique ID
   * assigned to the member.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Resource name](https://cloud.google.com/apis/design/resource_names) of the Membership being
   * looked up. Format: `groups/{group_id}/memberships/{member_id}`, where `group_id` is the unique
   * ID assigned to the Group to which Membership belongs to, and `member_id` is the unique ID
   * assigned to the member.
   * @param name name or {@code null} for none
   */
  public LookupMembershipNameResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public LookupMembershipNameResponse set(String fieldName, Object value) {
    return (LookupMembershipNameResponse) super.set(fieldName, value);
  }

  @Override
  public LookupMembershipNameResponse clone() {
    return (LookupMembershipNameResponse) super.clone();
  }

}
