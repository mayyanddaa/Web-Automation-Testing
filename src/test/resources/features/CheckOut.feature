@CheckOut
  Feature: CheckOut
    As a user checkout the product

  Scenario Outline:
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    Then User add products to cart
    When User click cart button
    Then User already on cart page
    When User remove one item product
    And User checkout product
    Then User already on checkout page
    When User input "<firstName>" as firstName, input "<lastName>" as lastName and  input "<postalCode>" as postalCode
    Then User already on detail checkout page
    And User check total checkout
    And User already on final checkout page

  Examples:
    | firstName | lastName | postalCode |
    | Min       | Yoongi   | Daegu      |
