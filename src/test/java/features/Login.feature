Feature: This Feature would be used to design the Login page of the application

  Background: Open the Swaglab application
    Given I have opened the application in browser
 @Sanity   
  Scenario Outline: Validate the successful Login
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login Button
    Then I should be Landed on the product page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |
@Regression
  Scenario Outline: Validate the Negative Login
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login Button
    Then I should be getting the "<Error>"

    Examples: 
      | UserName   | Password     | Error                                                                     |
      | Dp@xyz.com | secret_sauce | Epic sadface: Username and password do not match any user in this service |
