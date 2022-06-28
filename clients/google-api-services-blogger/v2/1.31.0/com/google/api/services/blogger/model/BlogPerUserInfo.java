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

package com.google.api.services.blogger.model;

/**
 * Model definition for BlogPerUserInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BlogPerUserInfo extends com.google.api.client.json.GenericJson {

  /**
   * ID of the Blog resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blogId;

  /**
   * True if the user has Admin level access to the blog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasAdminAccess;

  /**
   * The kind of this entity. Always blogger#blogPerUserInfo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The Photo Album Key for the user when adding photos to the blog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photosAlbumKey;

  /**
   * Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * ID of the User.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * ID of the Blog resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getBlogId() {
    return blogId;
  }

  /**
   * ID of the Blog resource.
   * @param blogId blogId or {@code null} for none
   */
  public BlogPerUserInfo setBlogId(java.lang.String blogId) {
    this.blogId = blogId;
    return this;
  }

  /**
   * True if the user has Admin level access to the blog.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasAdminAccess() {
    return hasAdminAccess;
  }

  /**
   * True if the user has Admin level access to the blog.
   * @param hasAdminAccess hasAdminAccess or {@code null} for none
   */
  public BlogPerUserInfo setHasAdminAccess(java.lang.Boolean hasAdminAccess) {
    this.hasAdminAccess = hasAdminAccess;
    return this;
  }

  /**
   * The kind of this entity. Always blogger#blogPerUserInfo.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entity. Always blogger#blogPerUserInfo.
   * @param kind kind or {@code null} for none
   */
  public BlogPerUserInfo setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The Photo Album Key for the user when adding photos to the blog.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotosAlbumKey() {
    return photosAlbumKey;
  }

  /**
   * The Photo Album Key for the user when adding photos to the blog.
   * @param photosAlbumKey photosAlbumKey or {@code null} for none
   */
  public BlogPerUserInfo setPhotosAlbumKey(java.lang.String photosAlbumKey) {
    this.photosAlbumKey = photosAlbumKey;
    return this;
  }

  /**
   * Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER).
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Access permissions that the user has for the blog (ADMIN, AUTHOR, or READER).
   * @param role role or {@code null} for none
   */
  public BlogPerUserInfo setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * ID of the User.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * ID of the User.
   * @param userId userId or {@code null} for none
   */
  public BlogPerUserInfo setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public BlogPerUserInfo set(String fieldName, Object value) {
    return (BlogPerUserInfo) super.set(fieldName, value);
  }

  @Override
  public BlogPerUserInfo clone() {
    return (BlogPerUserInfo) super.clone();
  }

}
