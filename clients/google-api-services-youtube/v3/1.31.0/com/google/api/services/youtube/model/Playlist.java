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

package com.google.api.services.youtube.model;

/**
 * A *playlist* resource represents a YouTube playlist. A playlist is a collection of videos that
 * can be viewed sequentially and shared with other users. A playlist can contain up to 200 videos,
 * and YouTube does not limit the number of playlists that each user creates. By default, playlists
 * are publicly visible to other users, but playlists can be public or private. YouTube also uses
 * playlists to identify special collections of videos for a channel, such as: - uploaded videos -
 * favorite videos - positively rated (liked) videos - watch history - watch later To be more
 * specific, these lists are associated with a channel, which is a collection of a person, group, or
 * company's videos, playlists, and other YouTube information. You can retrieve the playlist IDs for
 * each of these lists from the channel resource for a given channel. You can then use the
 * playlistItems.list method to retrieve any of those lists. You can also add or remove items from
 * those lists by calling the playlistItems.insert and playlistItems.delete methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Playlist extends com.google.api.client.json.GenericJson {

  /**
   * The contentDetails object contains information like video count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PlaylistContentDetails contentDetails;

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube uses to uniquely identify the playlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#playlist".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Localizations for different languages
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PlaylistLocalization> localizations;

  /**
   * The player object contains information that you would use to play the playlist in an embedded
   * player.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PlaylistPlayer player;

  /**
   * The snippet object contains basic details about the playlist, such as its title and
   * description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PlaylistSnippet snippet;

  /**
   * The status object contains status information for the playlist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PlaylistStatus status;

  /**
   * The contentDetails object contains information like video count.
   * @return value or {@code null} for none
   */
  public PlaylistContentDetails getContentDetails() {
    return contentDetails;
  }

  /**
   * The contentDetails object contains information like video count.
   * @param contentDetails contentDetails or {@code null} for none
   */
  public Playlist setContentDetails(PlaylistContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public Playlist setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the playlist.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube uses to uniquely identify the playlist.
   * @param id id or {@code null} for none
   */
  public Playlist setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#playlist".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#playlist".
   * @param kind kind or {@code null} for none
   */
  public Playlist setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Localizations for different languages
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PlaylistLocalization> getLocalizations() {
    return localizations;
  }

  /**
   * Localizations for different languages
   * @param localizations localizations or {@code null} for none
   */
  public Playlist setLocalizations(java.util.Map<String, PlaylistLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  /**
   * The player object contains information that you would use to play the playlist in an embedded
   * player.
   * @return value or {@code null} for none
   */
  public PlaylistPlayer getPlayer() {
    return player;
  }

  /**
   * The player object contains information that you would use to play the playlist in an embedded
   * player.
   * @param player player or {@code null} for none
   */
  public Playlist setPlayer(PlaylistPlayer player) {
    this.player = player;
    return this;
  }

  /**
   * The snippet object contains basic details about the playlist, such as its title and
   * description.
   * @return value or {@code null} for none
   */
  public PlaylistSnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the playlist, such as its title and
   * description.
   * @param snippet snippet or {@code null} for none
   */
  public Playlist setSnippet(PlaylistSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * The status object contains status information for the playlist.
   * @return value or {@code null} for none
   */
  public PlaylistStatus getStatus() {
    return status;
  }

  /**
   * The status object contains status information for the playlist.
   * @param status status or {@code null} for none
   */
  public Playlist setStatus(PlaylistStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public Playlist set(String fieldName, Object value) {
    return (Playlist) super.set(fieldName, value);
  }

  @Override
  public Playlist clone() {
    return (Playlist) super.clone();
  }

}
