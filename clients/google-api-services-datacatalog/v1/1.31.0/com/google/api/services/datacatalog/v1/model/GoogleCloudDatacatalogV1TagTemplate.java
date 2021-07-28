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

package com.google.api.services.datacatalog.v1.model;

/**
 * A tag template defines a tag that can have one or more typed fields. The template is used to
 * create tags that are attached to GCP resources. [Tag template roles]
 * (https://cloud.google.com/iam/docs/understanding-roles#data-catalog-roles) provide permissions to
 * create, edit, and use the template. For example, see the [TagTemplate User]
 * (https://cloud.google.com/data-catalog/docs/how-to/template-user) role that includes a permission
 * to use the tag template to tag resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1TagTemplate extends com.google.api.client.json.GenericJson {

  /**
   * Display name for this template. Defaults to an empty string. The name must contain only Unicode
   * letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with
   * spaces. The maximum length is 200 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. Map of tag template field IDs to the settings for the field. This map is an
   * exhaustive list of the allowed fields. The map must contain at least one field and at most 500
   * fields. The keys to this map are tag template field IDs. The IDs have the following
   * limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_).
   * * Must be at least 1 character and at most 64 characters long. * Must start with a letter or
   * underscore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDatacatalogV1TagTemplateField> fields;

  /**
   * Indicates whether this is a public tag template. Every user has view access to a *public* tag
   * template by default. This means that: * Every user can use this tag template to tag an entry. *
   * If an entry is tagged using the tag template, the tag is always shown in the response to
   * ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you
   * need view access either on the project or the organization the tag template resides in but no
   * other permission is needed. * Operations on the tag template other than viewing (for example,
   * editing IAM policies) follow standard IAM structures. Tags created with a public tag template
   * are referred to as public tags. You can search for a public tag by value with a simple search
   * query instead of using a ``tag:`` predicate. Public tag templates may not appear in search
   * results depending on scope, see: include_public_tag_templates Note: If an [IAM domain
   * restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-
   * domains) is configured in the tag template's location, the public access will not be enabled
   * but the simple search for tag values will still work.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPubliclyReadable;

  /**
   * The resource name of the tag template in URL format. Note: The tag template itself and its
   * child resources might not be stored in the location specified in its name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Display name for this template. Defaults to an empty string. The name must contain only Unicode
   * letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with
   * spaces. The maximum length is 200 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for this template. Defaults to an empty string. The name must contain only Unicode
   * letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with
   * spaces. The maximum length is 200 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1TagTemplate setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. Map of tag template field IDs to the settings for the field. This map is an
   * exhaustive list of the allowed fields. The map must contain at least one field and at most 500
   * fields. The keys to this map are tag template field IDs. The IDs have the following
   * limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_).
   * * Must be at least 1 character and at most 64 characters long. * Must start with a letter or
   * underscore.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDatacatalogV1TagTemplateField> getFields() {
    return fields;
  }

  /**
   * Required. Map of tag template field IDs to the settings for the field. This map is an
   * exhaustive list of the allowed fields. The map must contain at least one field and at most 500
   * fields. The keys to this map are tag template field IDs. The IDs have the following
   * limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_).
   * * Must be at least 1 character and at most 64 characters long. * Must start with a letter or
   * underscore.
   * @param fields fields or {@code null} for none
   */
  public GoogleCloudDatacatalogV1TagTemplate setFields(java.util.Map<String, GoogleCloudDatacatalogV1TagTemplateField> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Indicates whether this is a public tag template. Every user has view access to a *public* tag
   * template by default. This means that: * Every user can use this tag template to tag an entry. *
   * If an entry is tagged using the tag template, the tag is always shown in the response to
   * ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you
   * need view access either on the project or the organization the tag template resides in but no
   * other permission is needed. * Operations on the tag template other than viewing (for example,
   * editing IAM policies) follow standard IAM structures. Tags created with a public tag template
   * are referred to as public tags. You can search for a public tag by value with a simple search
   * query instead of using a ``tag:`` predicate. Public tag templates may not appear in search
   * results depending on scope, see: include_public_tag_templates Note: If an [IAM domain
   * restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-
   * domains) is configured in the tag template's location, the public access will not be enabled
   * but the simple search for tag values will still work.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPubliclyReadable() {
    return isPubliclyReadable;
  }

  /**
   * Indicates whether this is a public tag template. Every user has view access to a *public* tag
   * template by default. This means that: * Every user can use this tag template to tag an entry. *
   * If an entry is tagged using the tag template, the tag is always shown in the response to
   * ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you
   * need view access either on the project or the organization the tag template resides in but no
   * other permission is needed. * Operations on the tag template other than viewing (for example,
   * editing IAM policies) follow standard IAM structures. Tags created with a public tag template
   * are referred to as public tags. You can search for a public tag by value with a simple search
   * query instead of using a ``tag:`` predicate. Public tag templates may not appear in search
   * results depending on scope, see: include_public_tag_templates Note: If an [IAM domain
   * restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-
   * domains) is configured in the tag template's location, the public access will not be enabled
   * but the simple search for tag values will still work.
   * @param isPubliclyReadable isPubliclyReadable or {@code null} for none
   */
  public GoogleCloudDatacatalogV1TagTemplate setIsPubliclyReadable(java.lang.Boolean isPubliclyReadable) {
    this.isPubliclyReadable = isPubliclyReadable;
    return this;
  }

  /**
   * The resource name of the tag template in URL format. Note: The tag template itself and its
   * child resources might not be stored in the location specified in its name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the tag template in URL format. Note: The tag template itself and its
   * child resources might not be stored in the location specified in its name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1TagTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1TagTemplate set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1TagTemplate) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1TagTemplate clone() {
    return (GoogleCloudDatacatalogV1TagTemplate) super.clone();
  }

}
