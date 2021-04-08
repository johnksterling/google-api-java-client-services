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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Meals, snacks, and beverages available at the property.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FoodAndDrink extends com.google.api.client.json.GenericJson {

  /**
   * Bar. A designated room, lounge or area of an on-site restaurant with seating at a counter
   * behind which a hotel staffer takes the guest's order and provides the requested alcoholic
   * drink. Can be indoors or outdoors. Also known as Pub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bar;

  /**
   * Bar exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String barException;

  /**
   * Breakfast available. The morning meal is offered to all guests. Can be free or for a fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean breakfastAvailable;

  /**
   * Breakfast available exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String breakfastAvailableException;

  /**
   * Breakfast buffet. Breakfast meal service where guests serve themselves from a variety of
   * dishes/foods that are put out on a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean breakfastBuffet;

  /**
   * Breakfast buffet exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String breakfastBuffetException;

  /**
   * Buffet. A type of meal where guests serve themselves from a variety of dishes/foods that are
   * put out on a table. Includes lunch and/or dinner meals. A breakfast-only buffet is not
   * sufficient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean buffet;

  /**
   * Buffet exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buffetException;

  /**
   * Dinner buffet. Dinner meal service where guests serve themselves from a variety of dishes/foods
   * that are put out on a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dinnerBuffet;

  /**
   * Dinner buffet exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dinnerBuffetException;

  /**
   * Free breakfast. Breakfast is offered for free to all guests. Does not apply if limited to
   * certain room packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean freeBreakfast;

  /**
   * Free breakfast exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeBreakfastException;

  /**
   * Restaurant. A business onsite at the hotel that is open to the public as well as guests, and
   * offers meals and beverages to consume at tables or counters. May or may not include table
   * service. Also known as cafe, buffet, eatery. A "breakfast room" where the hotel serves
   * breakfast only to guests (not the general public) does not count as a restaurant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restaurant;

  /**
   * Restaurant exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restaurantException;

  /**
   * Restaurants count. The number of restaurants at the hotel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer restaurantsCount;

  /**
   * Restaurants count exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restaurantsCountException;

  /**
   * Room service. A hotel staffer delivers meals prepared onsite to a guest's room as per their
   * request. May or may not be available during specific hours. Services should be available to all
   * guests (not based on rate/room booked/reward program, etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean roomService;

  /**
   * Room service exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roomServiceException;

  /**
   * Table service. A restaurant in which a staff member is assigned to a guest's table to take
   * their order, deliver and clear away food, and deliver the bill, if applicable. Also known as
   * sit-down restaurant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean tableService;

  /**
   * Table service exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableServiceException;

  /**
   * 24hr room service. Room service is available 24 hours a day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean twentyFourHourRoomService;

  /**
   * 24hr room service exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String twentyFourHourRoomServiceException;

  /**
   * Vending machine. A glass-fronted mechanized cabinet displaying and dispensing snacks and
   * beverages for purchase by coins, paper money and/or credit cards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vendingMachine;

  /**
   * Vending machine exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vendingMachineException;

  /**
   * Bar. A designated room, lounge or area of an on-site restaurant with seating at a counter
   * behind which a hotel staffer takes the guest's order and provides the requested alcoholic
   * drink. Can be indoors or outdoors. Also known as Pub.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBar() {
    return bar;
  }

  /**
   * Bar. A designated room, lounge or area of an on-site restaurant with seating at a counter
   * behind which a hotel staffer takes the guest's order and provides the requested alcoholic
   * drink. Can be indoors or outdoors. Also known as Pub.
   * @param bar bar or {@code null} for none
   */
  public FoodAndDrink setBar(java.lang.Boolean bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Bar exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBarException() {
    return barException;
  }

  /**
   * Bar exception.
   * @param barException barException or {@code null} for none
   */
  public FoodAndDrink setBarException(java.lang.String barException) {
    this.barException = barException;
    return this;
  }

  /**
   * Breakfast available. The morning meal is offered to all guests. Can be free or for a fee.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBreakfastAvailable() {
    return breakfastAvailable;
  }

  /**
   * Breakfast available. The morning meal is offered to all guests. Can be free or for a fee.
   * @param breakfastAvailable breakfastAvailable or {@code null} for none
   */
  public FoodAndDrink setBreakfastAvailable(java.lang.Boolean breakfastAvailable) {
    this.breakfastAvailable = breakfastAvailable;
    return this;
  }

  /**
   * Breakfast available exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBreakfastAvailableException() {
    return breakfastAvailableException;
  }

  /**
   * Breakfast available exception.
   * @param breakfastAvailableException breakfastAvailableException or {@code null} for none
   */
  public FoodAndDrink setBreakfastAvailableException(java.lang.String breakfastAvailableException) {
    this.breakfastAvailableException = breakfastAvailableException;
    return this;
  }

  /**
   * Breakfast buffet. Breakfast meal service where guests serve themselves from a variety of
   * dishes/foods that are put out on a table.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBreakfastBuffet() {
    return breakfastBuffet;
  }

  /**
   * Breakfast buffet. Breakfast meal service where guests serve themselves from a variety of
   * dishes/foods that are put out on a table.
   * @param breakfastBuffet breakfastBuffet or {@code null} for none
   */
  public FoodAndDrink setBreakfastBuffet(java.lang.Boolean breakfastBuffet) {
    this.breakfastBuffet = breakfastBuffet;
    return this;
  }

  /**
   * Breakfast buffet exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBreakfastBuffetException() {
    return breakfastBuffetException;
  }

  /**
   * Breakfast buffet exception.
   * @param breakfastBuffetException breakfastBuffetException or {@code null} for none
   */
  public FoodAndDrink setBreakfastBuffetException(java.lang.String breakfastBuffetException) {
    this.breakfastBuffetException = breakfastBuffetException;
    return this;
  }

  /**
   * Buffet. A type of meal where guests serve themselves from a variety of dishes/foods that are
   * put out on a table. Includes lunch and/or dinner meals. A breakfast-only buffet is not
   * sufficient.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBuffet() {
    return buffet;
  }

  /**
   * Buffet. A type of meal where guests serve themselves from a variety of dishes/foods that are
   * put out on a table. Includes lunch and/or dinner meals. A breakfast-only buffet is not
   * sufficient.
   * @param buffet buffet or {@code null} for none
   */
  public FoodAndDrink setBuffet(java.lang.Boolean buffet) {
    this.buffet = buffet;
    return this;
  }

  /**
   * Buffet exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuffetException() {
    return buffetException;
  }

  /**
   * Buffet exception.
   * @param buffetException buffetException or {@code null} for none
   */
  public FoodAndDrink setBuffetException(java.lang.String buffetException) {
    this.buffetException = buffetException;
    return this;
  }

  /**
   * Dinner buffet. Dinner meal service where guests serve themselves from a variety of dishes/foods
   * that are put out on a table.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDinnerBuffet() {
    return dinnerBuffet;
  }

  /**
   * Dinner buffet. Dinner meal service where guests serve themselves from a variety of dishes/foods
   * that are put out on a table.
   * @param dinnerBuffet dinnerBuffet or {@code null} for none
   */
  public FoodAndDrink setDinnerBuffet(java.lang.Boolean dinnerBuffet) {
    this.dinnerBuffet = dinnerBuffet;
    return this;
  }

  /**
   * Dinner buffet exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getDinnerBuffetException() {
    return dinnerBuffetException;
  }

  /**
   * Dinner buffet exception.
   * @param dinnerBuffetException dinnerBuffetException or {@code null} for none
   */
  public FoodAndDrink setDinnerBuffetException(java.lang.String dinnerBuffetException) {
    this.dinnerBuffetException = dinnerBuffetException;
    return this;
  }

  /**
   * Free breakfast. Breakfast is offered for free to all guests. Does not apply if limited to
   * certain room packages.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFreeBreakfast() {
    return freeBreakfast;
  }

  /**
   * Free breakfast. Breakfast is offered for free to all guests. Does not apply if limited to
   * certain room packages.
   * @param freeBreakfast freeBreakfast or {@code null} for none
   */
  public FoodAndDrink setFreeBreakfast(java.lang.Boolean freeBreakfast) {
    this.freeBreakfast = freeBreakfast;
    return this;
  }

  /**
   * Free breakfast exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeBreakfastException() {
    return freeBreakfastException;
  }

  /**
   * Free breakfast exception.
   * @param freeBreakfastException freeBreakfastException or {@code null} for none
   */
  public FoodAndDrink setFreeBreakfastException(java.lang.String freeBreakfastException) {
    this.freeBreakfastException = freeBreakfastException;
    return this;
  }

  /**
   * Restaurant. A business onsite at the hotel that is open to the public as well as guests, and
   * offers meals and beverages to consume at tables or counters. May or may not include table
   * service. Also known as cafe, buffet, eatery. A "breakfast room" where the hotel serves
   * breakfast only to guests (not the general public) does not count as a restaurant.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestaurant() {
    return restaurant;
  }

  /**
   * Restaurant. A business onsite at the hotel that is open to the public as well as guests, and
   * offers meals and beverages to consume at tables or counters. May or may not include table
   * service. Also known as cafe, buffet, eatery. A "breakfast room" where the hotel serves
   * breakfast only to guests (not the general public) does not count as a restaurant.
   * @param restaurant restaurant or {@code null} for none
   */
  public FoodAndDrink setRestaurant(java.lang.Boolean restaurant) {
    this.restaurant = restaurant;
    return this;
  }

  /**
   * Restaurant exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestaurantException() {
    return restaurantException;
  }

  /**
   * Restaurant exception.
   * @param restaurantException restaurantException or {@code null} for none
   */
  public FoodAndDrink setRestaurantException(java.lang.String restaurantException) {
    this.restaurantException = restaurantException;
    return this;
  }

  /**
   * Restaurants count. The number of restaurants at the hotel.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRestaurantsCount() {
    return restaurantsCount;
  }

  /**
   * Restaurants count. The number of restaurants at the hotel.
   * @param restaurantsCount restaurantsCount or {@code null} for none
   */
  public FoodAndDrink setRestaurantsCount(java.lang.Integer restaurantsCount) {
    this.restaurantsCount = restaurantsCount;
    return this;
  }

  /**
   * Restaurants count exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestaurantsCountException() {
    return restaurantsCountException;
  }

  /**
   * Restaurants count exception.
   * @param restaurantsCountException restaurantsCountException or {@code null} for none
   */
  public FoodAndDrink setRestaurantsCountException(java.lang.String restaurantsCountException) {
    this.restaurantsCountException = restaurantsCountException;
    return this;
  }

  /**
   * Room service. A hotel staffer delivers meals prepared onsite to a guest's room as per their
   * request. May or may not be available during specific hours. Services should be available to all
   * guests (not based on rate/room booked/reward program, etc).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRoomService() {
    return roomService;
  }

  /**
   * Room service. A hotel staffer delivers meals prepared onsite to a guest's room as per their
   * request. May or may not be available during specific hours. Services should be available to all
   * guests (not based on rate/room booked/reward program, etc).
   * @param roomService roomService or {@code null} for none
   */
  public FoodAndDrink setRoomService(java.lang.Boolean roomService) {
    this.roomService = roomService;
    return this;
  }

  /**
   * Room service exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoomServiceException() {
    return roomServiceException;
  }

  /**
   * Room service exception.
   * @param roomServiceException roomServiceException or {@code null} for none
   */
  public FoodAndDrink setRoomServiceException(java.lang.String roomServiceException) {
    this.roomServiceException = roomServiceException;
    return this;
  }

  /**
   * Table service. A restaurant in which a staff member is assigned to a guest's table to take
   * their order, deliver and clear away food, and deliver the bill, if applicable. Also known as
   * sit-down restaurant.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTableService() {
    return tableService;
  }

  /**
   * Table service. A restaurant in which a staff member is assigned to a guest's table to take
   * their order, deliver and clear away food, and deliver the bill, if applicable. Also known as
   * sit-down restaurant.
   * @param tableService tableService or {@code null} for none
   */
  public FoodAndDrink setTableService(java.lang.Boolean tableService) {
    this.tableService = tableService;
    return this;
  }

  /**
   * Table service exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableServiceException() {
    return tableServiceException;
  }

  /**
   * Table service exception.
   * @param tableServiceException tableServiceException or {@code null} for none
   */
  public FoodAndDrink setTableServiceException(java.lang.String tableServiceException) {
    this.tableServiceException = tableServiceException;
    return this;
  }

  /**
   * 24hr room service. Room service is available 24 hours a day.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTwentyFourHourRoomService() {
    return twentyFourHourRoomService;
  }

  /**
   * 24hr room service. Room service is available 24 hours a day.
   * @param twentyFourHourRoomService twentyFourHourRoomService or {@code null} for none
   */
  public FoodAndDrink setTwentyFourHourRoomService(java.lang.Boolean twentyFourHourRoomService) {
    this.twentyFourHourRoomService = twentyFourHourRoomService;
    return this;
  }

  /**
   * 24hr room service exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getTwentyFourHourRoomServiceException() {
    return twentyFourHourRoomServiceException;
  }

  /**
   * 24hr room service exception.
   * @param twentyFourHourRoomServiceException twentyFourHourRoomServiceException or {@code null} for none
   */
  public FoodAndDrink setTwentyFourHourRoomServiceException(java.lang.String twentyFourHourRoomServiceException) {
    this.twentyFourHourRoomServiceException = twentyFourHourRoomServiceException;
    return this;
  }

  /**
   * Vending machine. A glass-fronted mechanized cabinet displaying and dispensing snacks and
   * beverages for purchase by coins, paper money and/or credit cards.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVendingMachine() {
    return vendingMachine;
  }

  /**
   * Vending machine. A glass-fronted mechanized cabinet displaying and dispensing snacks and
   * beverages for purchase by coins, paper money and/or credit cards.
   * @param vendingMachine vendingMachine or {@code null} for none
   */
  public FoodAndDrink setVendingMachine(java.lang.Boolean vendingMachine) {
    this.vendingMachine = vendingMachine;
    return this;
  }

  /**
   * Vending machine exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getVendingMachineException() {
    return vendingMachineException;
  }

  /**
   * Vending machine exception.
   * @param vendingMachineException vendingMachineException or {@code null} for none
   */
  public FoodAndDrink setVendingMachineException(java.lang.String vendingMachineException) {
    this.vendingMachineException = vendingMachineException;
    return this;
  }

  @Override
  public FoodAndDrink set(String fieldName, Object value) {
    return (FoodAndDrink) super.set(fieldName, value);
  }

  @Override
  public FoodAndDrink clone() {
    return (FoodAndDrink) super.clone();
  }

}
