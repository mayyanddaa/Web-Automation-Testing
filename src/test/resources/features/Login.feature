@Login
  Feature: Login
    As a user I want to login website sauce demo

  Scenario: Login
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page

#  Scenario: Invalid Login
#      Given User already on login page
#      When User input "standard_user" as userName and input "" as password
#      Then User see "Epic sadface: Password is required" as error text on login page

#  Scenario Outline:
#      Given User already on login page
#      When User input "<username>" as userName and input "<password>" as password
#      Then User see "<errortext>" as error text on login page
#
#  Examples:
#      | username      | password  | errortext                                                                 |
#      | standard_user |           | Epic sadface: Password is required                                        |
#      |               | 124354345 | Epic sadface: Username is required                                        |
#      |               |           | Epic sadface: Username is required                                        |
#      | Mayanda       | 20030703  | Epic sadface: Username and password do not match any user in this service |