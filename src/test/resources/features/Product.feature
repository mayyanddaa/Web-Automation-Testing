@Product
Feature: Product
  As a user add products to cart

  Scenario: User sort product cart
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    Then User add products to cart
    When User click cart button
    Then User already on cart page