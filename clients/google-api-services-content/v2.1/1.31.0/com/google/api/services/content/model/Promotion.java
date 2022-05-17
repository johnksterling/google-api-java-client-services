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

package com.google.api.services.content.model;

/**
 * The Promotions feature is publicly available for the US, CA, IN, UK, AU target countries (en
 * language only) in Content API for Shopping. Represents a promotion. See the following articles
 * for more details. * [Promotions feed
 * specification](https://support.google.com/merchants/answer/2906014) * [Local promotions feed
 * specification](https://support.google.com/merchants/answer/10146130) * [Promotions on Buy on
 * Google product data specification](https://support.google.com/merchants/answer/9173673)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Promotion extends com.google.api.client.json.GenericJson {

  /**
   * Product filter by brand for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> brand;

  /**
   * Product filter by brand exclusion for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> brandExclusion;

  /**
   * Required. The content language used as part of the unique identifier. Currently only en value
   * is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Required. Coupon value type for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String couponValueType;

  /**
   * Free gift description for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeGiftDescription;

  /**
   * Free gift item id for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeGiftItemId;

  /**
   * Free gift value for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PriceAmount freeGiftValue;

  /**
   * Generic redemption code for the promotion. To be used with the above field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String genericRedemptionCode;

  /**
   * The number of items discounted in the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer getThisQuantityDiscounted;

  /**
   * Required. Output only. The REST promotion id to uniquely identify the promotion. Content API
   * methods that operate on promotions take this as their promotionId parameter. The REST ID for a
   * promotion is of the form [channel]:contentLanguage:targetCountry:promotionId The channel field
   * will have a value of "online", "in_store", or "online_in_store".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Product filter by item group id for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> itemGroupId;

  /**
   * Product filter by item group id exclusion for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> itemGroupIdExclusion;

  /**
   * Product filter by item id for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> itemId;

  /**
   * Product filter by item id exclusion for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> itemIdExclusion;

  /**
   * Maximum purchase quantity for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer limitQuantity;

  /**
   * Maximum purchase value for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PriceAmount limitValue;

  /**
   * Required. Long title for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longTitle;

  /**
   * Minimum purchase amount for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PriceAmount minimumPurchaseAmount;

  /**
   * Minimum purchase quantity for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minimumPurchaseQuantity;

  /**
   * Promotion cost cap of the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PriceAmount moneyBudget;

  /**
   * The money off amount offered in the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PriceAmount moneyOffAmount;

  /**
   * Required. Type of the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerType;

  /**
   * Order limit for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer orderLimit;

  /**
   * The percentage discount offered in the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percentOff;

  /**
   * Required. Applicability of the promotion to either all products or only specific products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productApplicability;

  /**
   * Product filter by product type for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productType;

  /**
   * Product filter by product type exclusion for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productTypeExclusion;

  /**
   * Destination ID for the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> promotionDestinationIds;

  /**
   * String representation of the promotion display dates (deprecated: Use
   * promotion_display_time_period instead).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String promotionDisplayDates;

  /**
   * TimePeriod representation of the promotion display dates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimePeriod promotionDisplayTimePeriod;

  /**
   * String representation of the promotion effective dates (deprecated: Use
   * promotion_effective_time_period instead).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String promotionEffectiveDates;

  /**
   * Required. TimePeriod representation of the promotion effective dates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimePeriod promotionEffectiveTimePeriod;

  /**
   * Required. The user provided promotion id to uniquely identify the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String promotionId;

  /**
   * Required. Redemption channel for the promotion. At least one channel is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> redemptionChannel;

  /**
   * Shipping service names for thse promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> shippingServiceNames;

  /**
   * Required. The target country used as part of the unique identifier. Currently only US and CA
   * are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetCountry;

  /**
   * Product filter by brand for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBrand() {
    return brand;
  }

  /**
   * Product filter by brand for the promotion.
   * @param brand brand or {@code null} for none
   */
  public Promotion setBrand(java.util.List<java.lang.String> brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Product filter by brand exclusion for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBrandExclusion() {
    return brandExclusion;
  }

  /**
   * Product filter by brand exclusion for the promotion.
   * @param brandExclusion brandExclusion or {@code null} for none
   */
  public Promotion setBrandExclusion(java.util.List<java.lang.String> brandExclusion) {
    this.brandExclusion = brandExclusion;
    return this;
  }

  /**
   * Required. The content language used as part of the unique identifier. Currently only en value
   * is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Required. The content language used as part of the unique identifier. Currently only en value
   * is supported.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public Promotion setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Required. Coupon value type for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getCouponValueType() {
    return couponValueType;
  }

  /**
   * Required. Coupon value type for the promotion.
   * @param couponValueType couponValueType or {@code null} for none
   */
  public Promotion setCouponValueType(java.lang.String couponValueType) {
    this.couponValueType = couponValueType;
    return this;
  }

  /**
   * Free gift description for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeGiftDescription() {
    return freeGiftDescription;
  }

  /**
   * Free gift description for the promotion.
   * @param freeGiftDescription freeGiftDescription or {@code null} for none
   */
  public Promotion setFreeGiftDescription(java.lang.String freeGiftDescription) {
    this.freeGiftDescription = freeGiftDescription;
    return this;
  }

  /**
   * Free gift item id for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeGiftItemId() {
    return freeGiftItemId;
  }

  /**
   * Free gift item id for the promotion.
   * @param freeGiftItemId freeGiftItemId or {@code null} for none
   */
  public Promotion setFreeGiftItemId(java.lang.String freeGiftItemId) {
    this.freeGiftItemId = freeGiftItemId;
    return this;
  }

  /**
   * Free gift value for the promotion.
   * @return value or {@code null} for none
   */
  public PriceAmount getFreeGiftValue() {
    return freeGiftValue;
  }

  /**
   * Free gift value for the promotion.
   * @param freeGiftValue freeGiftValue or {@code null} for none
   */
  public Promotion setFreeGiftValue(PriceAmount freeGiftValue) {
    this.freeGiftValue = freeGiftValue;
    return this;
  }

  /**
   * Generic redemption code for the promotion. To be used with the above field.
   * @return value or {@code null} for none
   */
  public java.lang.String getGenericRedemptionCode() {
    return genericRedemptionCode;
  }

  /**
   * Generic redemption code for the promotion. To be used with the above field.
   * @param genericRedemptionCode genericRedemptionCode or {@code null} for none
   */
  public Promotion setGenericRedemptionCode(java.lang.String genericRedemptionCode) {
    this.genericRedemptionCode = genericRedemptionCode;
    return this;
  }

  /**
   * The number of items discounted in the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGetThisQuantityDiscounted() {
    return getThisQuantityDiscounted;
  }

  /**
   * The number of items discounted in the promotion.
   * @param getThisQuantityDiscounted getThisQuantityDiscounted or {@code null} for none
   */
  public Promotion setGetThisQuantityDiscounted(java.lang.Integer getThisQuantityDiscounted) {
    this.getThisQuantityDiscounted = getThisQuantityDiscounted;
    return this;
  }

  /**
   * Required. Output only. The REST promotion id to uniquely identify the promotion. Content API
   * methods that operate on promotions take this as their promotionId parameter. The REST ID for a
   * promotion is of the form [channel]:contentLanguage:targetCountry:promotionId The channel field
   * will have a value of "online", "in_store", or "online_in_store".
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. Output only. The REST promotion id to uniquely identify the promotion. Content API
   * methods that operate on promotions take this as their promotionId parameter. The REST ID for a
   * promotion is of the form [channel]:contentLanguage:targetCountry:promotionId The channel field
   * will have a value of "online", "in_store", or "online_in_store".
   * @param id id or {@code null} for none
   */
  public Promotion setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Product filter by item group id for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getItemGroupId() {
    return itemGroupId;
  }

  /**
   * Product filter by item group id for the promotion.
   * @param itemGroupId itemGroupId or {@code null} for none
   */
  public Promotion setItemGroupId(java.util.List<java.lang.String> itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  /**
   * Product filter by item group id exclusion for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getItemGroupIdExclusion() {
    return itemGroupIdExclusion;
  }

  /**
   * Product filter by item group id exclusion for the promotion.
   * @param itemGroupIdExclusion itemGroupIdExclusion or {@code null} for none
   */
  public Promotion setItemGroupIdExclusion(java.util.List<java.lang.String> itemGroupIdExclusion) {
    this.itemGroupIdExclusion = itemGroupIdExclusion;
    return this;
  }

  /**
   * Product filter by item id for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getItemId() {
    return itemId;
  }

  /**
   * Product filter by item id for the promotion.
   * @param itemId itemId or {@code null} for none
   */
  public Promotion setItemId(java.util.List<java.lang.String> itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Product filter by item id exclusion for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getItemIdExclusion() {
    return itemIdExclusion;
  }

  /**
   * Product filter by item id exclusion for the promotion.
   * @param itemIdExclusion itemIdExclusion or {@code null} for none
   */
  public Promotion setItemIdExclusion(java.util.List<java.lang.String> itemIdExclusion) {
    this.itemIdExclusion = itemIdExclusion;
    return this;
  }

  /**
   * Maximum purchase quantity for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLimitQuantity() {
    return limitQuantity;
  }

  /**
   * Maximum purchase quantity for the promotion.
   * @param limitQuantity limitQuantity or {@code null} for none
   */
  public Promotion setLimitQuantity(java.lang.Integer limitQuantity) {
    this.limitQuantity = limitQuantity;
    return this;
  }

  /**
   * Maximum purchase value for the promotion.
   * @return value or {@code null} for none
   */
  public PriceAmount getLimitValue() {
    return limitValue;
  }

  /**
   * Maximum purchase value for the promotion.
   * @param limitValue limitValue or {@code null} for none
   */
  public Promotion setLimitValue(PriceAmount limitValue) {
    this.limitValue = limitValue;
    return this;
  }

  /**
   * Required. Long title for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getLongTitle() {
    return longTitle;
  }

  /**
   * Required. Long title for the promotion.
   * @param longTitle longTitle or {@code null} for none
   */
  public Promotion setLongTitle(java.lang.String longTitle) {
    this.longTitle = longTitle;
    return this;
  }

  /**
   * Minimum purchase amount for the promotion.
   * @return value or {@code null} for none
   */
  public PriceAmount getMinimumPurchaseAmount() {
    return minimumPurchaseAmount;
  }

  /**
   * Minimum purchase amount for the promotion.
   * @param minimumPurchaseAmount minimumPurchaseAmount or {@code null} for none
   */
  public Promotion setMinimumPurchaseAmount(PriceAmount minimumPurchaseAmount) {
    this.minimumPurchaseAmount = minimumPurchaseAmount;
    return this;
  }

  /**
   * Minimum purchase quantity for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinimumPurchaseQuantity() {
    return minimumPurchaseQuantity;
  }

  /**
   * Minimum purchase quantity for the promotion.
   * @param minimumPurchaseQuantity minimumPurchaseQuantity or {@code null} for none
   */
  public Promotion setMinimumPurchaseQuantity(java.lang.Integer minimumPurchaseQuantity) {
    this.minimumPurchaseQuantity = minimumPurchaseQuantity;
    return this;
  }

  /**
   * Promotion cost cap of the promotion.
   * @return value or {@code null} for none
   */
  public PriceAmount getMoneyBudget() {
    return moneyBudget;
  }

  /**
   * Promotion cost cap of the promotion.
   * @param moneyBudget moneyBudget or {@code null} for none
   */
  public Promotion setMoneyBudget(PriceAmount moneyBudget) {
    this.moneyBudget = moneyBudget;
    return this;
  }

  /**
   * The money off amount offered in the promotion.
   * @return value or {@code null} for none
   */
  public PriceAmount getMoneyOffAmount() {
    return moneyOffAmount;
  }

  /**
   * The money off amount offered in the promotion.
   * @param moneyOffAmount moneyOffAmount or {@code null} for none
   */
  public Promotion setMoneyOffAmount(PriceAmount moneyOffAmount) {
    this.moneyOffAmount = moneyOffAmount;
    return this;
  }

  /**
   * Required. Type of the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferType() {
    return offerType;
  }

  /**
   * Required. Type of the promotion.
   * @param offerType offerType or {@code null} for none
   */
  public Promotion setOfferType(java.lang.String offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Order limit for the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOrderLimit() {
    return orderLimit;
  }

  /**
   * Order limit for the promotion.
   * @param orderLimit orderLimit or {@code null} for none
   */
  public Promotion setOrderLimit(java.lang.Integer orderLimit) {
    this.orderLimit = orderLimit;
    return this;
  }

  /**
   * The percentage discount offered in the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercentOff() {
    return percentOff;
  }

  /**
   * The percentage discount offered in the promotion.
   * @param percentOff percentOff or {@code null} for none
   */
  public Promotion setPercentOff(java.lang.Integer percentOff) {
    this.percentOff = percentOff;
    return this;
  }

  /**
   * Required. Applicability of the promotion to either all products or only specific products.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductApplicability() {
    return productApplicability;
  }

  /**
   * Required. Applicability of the promotion to either all products or only specific products.
   * @param productApplicability productApplicability or {@code null} for none
   */
  public Promotion setProductApplicability(java.lang.String productApplicability) {
    this.productApplicability = productApplicability;
    return this;
  }

  /**
   * Product filter by product type for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductType() {
    return productType;
  }

  /**
   * Product filter by product type for the promotion.
   * @param productType productType or {@code null} for none
   */
  public Promotion setProductType(java.util.List<java.lang.String> productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Product filter by product type exclusion for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductTypeExclusion() {
    return productTypeExclusion;
  }

  /**
   * Product filter by product type exclusion for the promotion.
   * @param productTypeExclusion productTypeExclusion or {@code null} for none
   */
  public Promotion setProductTypeExclusion(java.util.List<java.lang.String> productTypeExclusion) {
    this.productTypeExclusion = productTypeExclusion;
    return this;
  }

  /**
   * Destination ID for the promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPromotionDestinationIds() {
    return promotionDestinationIds;
  }

  /**
   * Destination ID for the promotion.
   * @param promotionDestinationIds promotionDestinationIds or {@code null} for none
   */
  public Promotion setPromotionDestinationIds(java.util.List<java.lang.String> promotionDestinationIds) {
    this.promotionDestinationIds = promotionDestinationIds;
    return this;
  }

  /**
   * String representation of the promotion display dates (deprecated: Use
   * promotion_display_time_period instead).
   * @return value or {@code null} for none
   */
  public java.lang.String getPromotionDisplayDates() {
    return promotionDisplayDates;
  }

  /**
   * String representation of the promotion display dates (deprecated: Use
   * promotion_display_time_period instead).
   * @param promotionDisplayDates promotionDisplayDates or {@code null} for none
   */
  public Promotion setPromotionDisplayDates(java.lang.String promotionDisplayDates) {
    this.promotionDisplayDates = promotionDisplayDates;
    return this;
  }

  /**
   * TimePeriod representation of the promotion display dates.
   * @return value or {@code null} for none
   */
  public TimePeriod getPromotionDisplayTimePeriod() {
    return promotionDisplayTimePeriod;
  }

  /**
   * TimePeriod representation of the promotion display dates.
   * @param promotionDisplayTimePeriod promotionDisplayTimePeriod or {@code null} for none
   */
  public Promotion setPromotionDisplayTimePeriod(TimePeriod promotionDisplayTimePeriod) {
    this.promotionDisplayTimePeriod = promotionDisplayTimePeriod;
    return this;
  }

  /**
   * String representation of the promotion effective dates (deprecated: Use
   * promotion_effective_time_period instead).
   * @return value or {@code null} for none
   */
  public java.lang.String getPromotionEffectiveDates() {
    return promotionEffectiveDates;
  }

  /**
   * String representation of the promotion effective dates (deprecated: Use
   * promotion_effective_time_period instead).
   * @param promotionEffectiveDates promotionEffectiveDates or {@code null} for none
   */
  public Promotion setPromotionEffectiveDates(java.lang.String promotionEffectiveDates) {
    this.promotionEffectiveDates = promotionEffectiveDates;
    return this;
  }

  /**
   * Required. TimePeriod representation of the promotion effective dates.
   * @return value or {@code null} for none
   */
  public TimePeriod getPromotionEffectiveTimePeriod() {
    return promotionEffectiveTimePeriod;
  }

  /**
   * Required. TimePeriod representation of the promotion effective dates.
   * @param promotionEffectiveTimePeriod promotionEffectiveTimePeriod or {@code null} for none
   */
  public Promotion setPromotionEffectiveTimePeriod(TimePeriod promotionEffectiveTimePeriod) {
    this.promotionEffectiveTimePeriod = promotionEffectiveTimePeriod;
    return this;
  }

  /**
   * Required. The user provided promotion id to uniquely identify the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getPromotionId() {
    return promotionId;
  }

  /**
   * Required. The user provided promotion id to uniquely identify the promotion.
   * @param promotionId promotionId or {@code null} for none
   */
  public Promotion setPromotionId(java.lang.String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  /**
   * Required. Redemption channel for the promotion. At least one channel is required.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRedemptionChannel() {
    return redemptionChannel;
  }

  /**
   * Required. Redemption channel for the promotion. At least one channel is required.
   * @param redemptionChannel redemptionChannel or {@code null} for none
   */
  public Promotion setRedemptionChannel(java.util.List<java.lang.String> redemptionChannel) {
    this.redemptionChannel = redemptionChannel;
    return this;
  }

  /**
   * Shipping service names for thse promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getShippingServiceNames() {
    return shippingServiceNames;
  }

  /**
   * Shipping service names for thse promotion.
   * @param shippingServiceNames shippingServiceNames or {@code null} for none
   */
  public Promotion setShippingServiceNames(java.util.List<java.lang.String> shippingServiceNames) {
    this.shippingServiceNames = shippingServiceNames;
    return this;
  }

  /**
   * Required. The target country used as part of the unique identifier. Currently only US and CA
   * are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetCountry() {
    return targetCountry;
  }

  /**
   * Required. The target country used as part of the unique identifier. Currently only US and CA
   * are supported.
   * @param targetCountry targetCountry or {@code null} for none
   */
  public Promotion setTargetCountry(java.lang.String targetCountry) {
    this.targetCountry = targetCountry;
    return this;
  }

  @Override
  public Promotion set(String fieldName, Object value) {
    return (Promotion) super.set(fieldName, value);
  }

  @Override
  public Promotion clone() {
    return (Promotion) super.clone();
  }

}
