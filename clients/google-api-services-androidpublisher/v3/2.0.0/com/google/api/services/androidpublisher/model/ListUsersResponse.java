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

package com.google.api.services.androidpublisher.model;

/**
 * A response containing one or more users with access to an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListUsersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to pass to subsequent calls in order to retrieve subsequent results. This will not be
   * set if there are no more results to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The resulting users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<User> users;

  /**
   * A token to pass to subsequent calls in order to retrieve subsequent results. This will not be
   * set if there are no more results to return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to pass to subsequent calls in order to retrieve subsequent results. This will not be
   * set if there are no more results to return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListUsersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The resulting users.
   * @return value or {@code null} for none
   */
  public java.util.List<User> getUsers() {
    return users;
  }

  /**
   * The resulting users.
   * @param users users or {@code null} for none
   */
  public ListUsersResponse setUsers(java.util.List<User> users) {
    this.users = users;
    return this;
  }

  @Override
  public ListUsersResponse set(String fieldName, Object value) {
    return (ListUsersResponse) super.set(fieldName, value);
  }

  @Override
  public ListUsersResponse clone() {
    return (ListUsersResponse) super.clone();
  }

}
