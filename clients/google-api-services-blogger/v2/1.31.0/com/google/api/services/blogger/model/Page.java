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
 * Model definition for Page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Page extends com.google.api.client.json.GenericJson {

  /**
   * The author of this Page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Author author;

  /**
   * Data about the blog containing this Page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Blog blog;

  /**
   * The body content of this Page, in HTML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Etag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The identifier for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The kind of this entity. Always blogger#page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * RFC 3339 date-time when this Page was published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String published;

  /**
   * The API REST URL to fetch this resource from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The status of the page for admin resources (either LIVE or DRAFT).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The title of this entity. This is the name displayed in the Admin user interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * RFC 3339 date-time when this Page was trashed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trashed;

  /**
   * RFC 3339 date-time when this Page was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updated;

  /**
   * The URL that this Page is displayed at.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The author of this Page.
   * @return value or {@code null} for none
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * The author of this Page.
   * @param author author or {@code null} for none
   */
  public Page setAuthor(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Data about the blog containing this Page.
   * @return value or {@code null} for none
   */
  public Blog getBlog() {
    return blog;
  }

  /**
   * Data about the blog containing this Page.
   * @param blog blog or {@code null} for none
   */
  public Page setBlog(Blog blog) {
    this.blog = blog;
    return this;
  }

  /**
   * The body content of this Page, in HTML.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The body content of this Page, in HTML.
   * @param content content or {@code null} for none
   */
  public Page setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Etag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Page setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The identifier for this resource.
   * @param id id or {@code null} for none
   */
  public Page setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of this entity. Always blogger#page.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entity. Always blogger#page.
   * @param kind kind or {@code null} for none
   */
  public Page setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * RFC 3339 date-time when this Page was published.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublished() {
    return published;
  }

  /**
   * RFC 3339 date-time when this Page was published.
   * @param published published or {@code null} for none
   */
  public Page setPublished(java.lang.String published) {
    this.published = published;
    return this;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @param selfLink selfLink or {@code null} for none
   */
  public Page setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The status of the page for admin resources (either LIVE or DRAFT).
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the page for admin resources (either LIVE or DRAFT).
   * @param status status or {@code null} for none
   */
  public Page setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The title of this entity. This is the name displayed in the Admin user interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this entity. This is the name displayed in the Admin user interface.
   * @param title title or {@code null} for none
   */
  public Page setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * RFC 3339 date-time when this Page was trashed.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrashed() {
    return trashed;
  }

  /**
   * RFC 3339 date-time when this Page was trashed.
   * @param trashed trashed or {@code null} for none
   */
  public Page setTrashed(java.lang.String trashed) {
    this.trashed = trashed;
    return this;
  }

  /**
   * RFC 3339 date-time when this Page was last updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdated() {
    return updated;
  }

  /**
   * RFC 3339 date-time when this Page was last updated.
   * @param updated updated or {@code null} for none
   */
  public Page setUpdated(java.lang.String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The URL that this Page is displayed at.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL that this Page is displayed at.
   * @param url url or {@code null} for none
   */
  public Page setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Page set(String fieldName, Object value) {
    return (Page) super.set(fieldName, value);
  }

  @Override
  public Page clone() {
    return (Page) super.clone();
  }

  /**
   * The author of this Page.
   */
  public static final class Author extends com.google.api.client.json.GenericJson {

    /**
     * The display name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * The identifier of the creator.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The creator's avatar.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image image;

    /**
     * The URL of the creator's Profile page.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The display name.
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * The display name.
     * @param displayName displayName or {@code null} for none
     */
    public Author setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The identifier of the creator.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the creator.
     * @param id id or {@code null} for none
     */
    public Author setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The creator's avatar.
     * @return value or {@code null} for none
     */
    public Image getImage() {
      return image;
    }

    /**
     * The creator's avatar.
     * @param image image or {@code null} for none
     */
    public Author setImage(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The URL of the creator's Profile page.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL of the creator's Profile page.
     * @param url url or {@code null} for none
     */
    public Author setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public Author set(String fieldName, Object value) {
      return (Author) super.set(fieldName, value);
    }

    @Override
    public Author clone() {
      return (Author) super.clone();
    }

    /**
     * The creator's avatar.
     */
    public static final class Image extends com.google.api.client.json.GenericJson {

      /**
       * The creator's avatar URL.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * The creator's avatar URL.
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * The creator's avatar URL.
       * @param url url or {@code null} for none
       */
      public Image setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public Image set(String fieldName, Object value) {
        return (Image) super.set(fieldName, value);
      }

      @Override
      public Image clone() {
        return (Image) super.clone();
      }

    }
  }

  /**
   * Data about the blog containing this Page.
   */
  public static final class Blog extends com.google.api.client.json.GenericJson {

    /**
     * The identifier of the blog containing this page.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The identifier of the blog containing this page.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the blog containing this page.
     * @param id id or {@code null} for none
     */
    public Blog setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public Blog set(String fieldName, Object value) {
      return (Blog) super.set(fieldName, value);
    }

    @Override
    public Blog clone() {
      return (Blog) super.clone();
    }

  }

}
