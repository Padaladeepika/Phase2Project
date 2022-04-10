Feature: This feature is used to Validate the Product prices

  Background: Open the Swag Labs application
    Given Iam on SauceDemo login page
    When I enter Username "standard_user" and Password "secret_sauce"
    And I click on Login button

  Scenario: To Validate the Product prices
    When Iam on Product page
    Then I compare the below product price
      | Sauce Labs Backpack   | $29.99 |
