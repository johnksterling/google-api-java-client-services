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

package com.google.api.services.servicecontrol.v2.model;

/**
 * This message defines attributes for an HTTP request. If the actual request is not an HTTP
 * request, the runtime system should try to map the actual request to an equivalent HTTP request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Request extends com.google.api.client.json.GenericJson {

  /**
   * The request authentication. May be absent for unauthenticated requests. Derived from the HTTP
   * request `Authorization` header or equivalent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Auth auth;

  /**
   * The HTTP request headers. If multiple headers share the same key, they must be merged according
   * to the HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The HTTP request `Host` header value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * The unique ID for a request, which can be propagated to downstream systems. The ID should have
   * low probability of collision within a single day for a specific service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The HTTP request method, such as `GET`, `POST`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The HTTP URL path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The network protocol used with the request, such as "http/1.1", "spdy/3", "h2", "h2c",
   * "webrtc", "tcp", "udp", "quic". See https://www.iana.org/assignments/tls-extensiontype-values
   * /tls-extensiontype-values.xhtml#alpn-protocol-ids for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * The HTTP URL query in the format of `name1=value1=value2`, as it appears in the first line of
   * the HTTP request. No decoding is performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * A special parameter for request reason. It is used by security systems to associate auditing
   * information with a request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The HTTP URL scheme, such as `http` and `https`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scheme;

  /**
   * The HTTP request size in bytes. If unknown, it must be -1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long size;

  /**
   * The timestamp when the `destination` service receives the last byte of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String time;

  /**
   * The request authentication. May be absent for unauthenticated requests. Derived from the HTTP
   * request `Authorization` header or equivalent.
   * @return value or {@code null} for none
   */
  public Auth getAuth() {
    return auth;
  }

  /**
   * The request authentication. May be absent for unauthenticated requests. Derived from the HTTP
   * request `Authorization` header or equivalent.
   * @param auth auth or {@code null} for none
   */
  public Request setAuth(Auth auth) {
    this.auth = auth;
    return this;
  }

  /**
   * The HTTP request headers. If multiple headers share the same key, they must be merged according
   * to the HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * The HTTP request headers. If multiple headers share the same key, they must be merged according
   * to the HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * @param headers headers or {@code null} for none
   */
  public Request setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The HTTP request `Host` header value.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * The HTTP request `Host` header value.
   * @param host host or {@code null} for none
   */
  public Request setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * The unique ID for a request, which can be propagated to downstream systems. The ID should have
   * low probability of collision within a single day for a specific service.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID for a request, which can be propagated to downstream systems. The ID should have
   * low probability of collision within a single day for a specific service.
   * @param id id or {@code null} for none
   */
  public Request setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The HTTP request method, such as `GET`, `POST`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * The HTTP request method, such as `GET`, `POST`.
   * @param method method or {@code null} for none
   */
  public Request setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * The HTTP URL path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The HTTP URL path.
   * @param path path or {@code null} for none
   */
  public Request setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The network protocol used with the request, such as "http/1.1", "spdy/3", "h2", "h2c",
   * "webrtc", "tcp", "udp", "quic". See https://www.iana.org/assignments/tls-extensiontype-values
   * /tls-extensiontype-values.xhtml#alpn-protocol-ids for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * The network protocol used with the request, such as "http/1.1", "spdy/3", "h2", "h2c",
   * "webrtc", "tcp", "udp", "quic". See https://www.iana.org/assignments/tls-extensiontype-values
   * /tls-extensiontype-values.xhtml#alpn-protocol-ids for details.
   * @param protocol protocol or {@code null} for none
   */
  public Request setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * The HTTP URL query in the format of `name1=value1=value2`, as it appears in the first line of
   * the HTTP request. No decoding is performed.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The HTTP URL query in the format of `name1=value1=value2`, as it appears in the first line of
   * the HTTP request. No decoding is performed.
   * @param query query or {@code null} for none
   */
  public Request setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * A special parameter for request reason. It is used by security systems to associate auditing
   * information with a request.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * A special parameter for request reason. It is used by security systems to associate auditing
   * information with a request.
   * @param reason reason or {@code null} for none
   */
  public Request setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The HTTP URL scheme, such as `http` and `https`.
   * @return value or {@code null} for none
   */
  public java.lang.String getScheme() {
    return scheme;
  }

  /**
   * The HTTP URL scheme, such as `http` and `https`.
   * @param scheme scheme or {@code null} for none
   */
  public Request setScheme(java.lang.String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * The HTTP request size in bytes. If unknown, it must be -1.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * The HTTP request size in bytes. If unknown, it must be -1.
   * @param size size or {@code null} for none
   */
  public Request setSize(java.lang.Long size) {
    this.size = size;
    return this;
  }

  /**
   * The timestamp when the `destination` service receives the last byte of the request.
   * @return value or {@code null} for none
   */
  public String getTime() {
    return time;
  }

  /**
   * The timestamp when the `destination` service receives the last byte of the request.
   * @param time time or {@code null} for none
   */
  public Request setTime(String time) {
    this.time = time;
    return this;
  }

  @Override
  public Request set(String fieldName, Object value) {
    return (Request) super.set(fieldName, value);
  }

  @Override
  public Request clone() {
    return (Request) super.clone();
  }

}
