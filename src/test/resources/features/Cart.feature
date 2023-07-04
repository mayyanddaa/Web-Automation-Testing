@Cart
Feature: Cart
  As a user check products on cart page

  Scenario: User sort product cart
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    Then User add products to cart
    When User click cart button
    Then User already on cart page
    When User remove one item product
    And User checkout product
    Then User already on checkout page
