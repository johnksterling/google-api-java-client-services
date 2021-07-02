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

package com.google.api.services.fcm.v1;

/**
 * Service definition for FirebaseCloudMessaging (v1).
 *
 * <p>
 * FCM send API that provides a cross-platform messaging solution to reliably deliver messages at no cost.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://firebase.google.com/docs/cloud-messaging" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link FirebaseCloudMessagingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class FirebaseCloudMessaging extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.32.1 of the Firebase Cloud Messaging API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://fcm.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://fcm.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public FirebaseCloudMessaging(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  FirebaseCloudMessaging(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code FirebaseCloudMessaging fcm = new FirebaseCloudMessaging(...);}
   *   {@code FirebaseCloudMessaging.Projects.List request = fcm.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * An accessor for creating requests from the Messages collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code FirebaseCloudMessaging fcm = new FirebaseCloudMessaging(...);}
     *   {@code FirebaseCloudMessaging.Messages.List request = fcm.messages().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Messages messages() {
      return new Messages();
    }

    /**
     * The "messages" collection of methods.
     */
    public class Messages {

      /**
       * Send a message to specified target (a registration token, topic or condition).
       *
       * Create a request for the method "messages.send".
       *
       * This request holds the parameters needed by the fcm server.  After setting any optional
       * parameters, call the {@link Send#execute()} method to invoke the remote operation.
       *
       * @param parent Required. It contains the Firebase project id (i.e. the unique identifier for your Firebase
       *        project), in the format of `projects/{project_id}`. For legacy support, the numeric
       *        project number with no padding is also supported in the format of
       *        `projects/{project_number}`.
       * @param content the {@link com.google.api.services.fcm.v1.model.SendMessageRequest}
       * @return the request
       */
      public Send send(java.lang.String parent, com.google.api.services.fcm.v1.model.SendMessageRequest content) throws java.io.IOException {
        Send result = new Send(parent, content);
        initialize(result);
        return result;
      }

      public class Send extends FirebaseCloudMessagingRequest<com.google.api.services.fcm.v1.model.Message> {

        private static final String REST_PATH = "v1/{+parent}/messages:send";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * Send a message to specified target (a registration token, topic or condition).
         *
         * Create a request for the method "messages.send".
         *
         * This request holds the parameters needed by the the fcm server.  After setting any optional
         * parameters, call the {@link Send#execute()} method to invoke the remote operation. <p> {@link
         * Send#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Required. It contains the Firebase project id (i.e. the unique identifier for your Firebase
       *        project), in the format of `projects/{project_id}`. For legacy support, the numeric
       *        project number with no padding is also supported in the format of
       *        `projects/{project_number}`.
         * @param content the {@link com.google.api.services.fcm.v1.model.SendMessageRequest}
         * @since 1.13
         */
        protected Send(java.lang.String parent, com.google.api.services.fcm.v1.model.SendMessageRequest content) {
          super(FirebaseCloudMessaging.this, "POST", REST_PATH, content, com.google.api.services.fcm.v1.model.Message.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public Send set$Xgafv(java.lang.String $Xgafv) {
          return (Send) super.set$Xgafv($Xgafv);
        }

        @Override
        public Send setAccessToken(java.lang.String accessToken) {
          return (Send) super.setAccessToken(accessToken);
        }

        @Override
        public Send setAlt(java.lang.String alt) {
          return (Send) super.setAlt(alt);
        }

        @Override
        public Send setCallback(java.lang.String callback) {
          return (Send) super.setCallback(callback);
        }

        @Override
        public Send setFields(java.lang.String fields) {
          return (Send) super.setFields(fields);
        }

        @Override
        public Send setKey(java.lang.String key) {
          return (Send) super.setKey(key);
        }

        @Override
        public Send setOauthToken(java.lang.String oauthToken) {
          return (Send) super.setOauthToken(oauthToken);
        }

        @Override
        public Send setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Send) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Send setQuotaUser(java.lang.String quotaUser) {
          return (Send) super.setQuotaUser(quotaUser);
        }

        @Override
        public Send setUploadType(java.lang.String uploadType) {
          return (Send) super.setUploadType(uploadType);
        }

        @Override
        public Send setUploadProtocol(java.lang.String uploadProtocol) {
          return (Send) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. It contains the Firebase project id (i.e. the unique identifier for your
         * Firebase project), in the format of `projects/{project_id}`. For legacy support, the
         * numeric project number with no padding is also supported in the format of
         * `projects/{project_number}`.
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Required. It contains the Firebase project id (i.e. the unique identifier for your Firebase
       project), in the format of `projects/{project_id}`. For legacy support, the numeric project number
       with no padding is also supported in the format of `projects/{project_number}`.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Required. It contains the Firebase project id (i.e. the unique identifier for your
         * Firebase project), in the format of `projects/{project_id}`. For legacy support, the
         * numeric project number with no padding is also supported in the format of
         * `projects/{project_number}`.
         */
        public Send setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Send set(String parameterName, Object value) {
          return (Send) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link FirebaseCloudMessaging}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link FirebaseCloudMessaging}. */
    @Override
    public FirebaseCloudMessaging build() {
      return new FirebaseCloudMessaging(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link FirebaseCloudMessagingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setFirebaseCloudMessagingRequestInitializer(
        FirebaseCloudMessagingRequestInitializer firebasecloudmessagingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(firebasecloudmessagingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
