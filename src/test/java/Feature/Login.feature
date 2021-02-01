Feature: Login Feature
  In this feature, we are going to test the login functionality of the banking application

  Scenario: Login with correct username and password
    Given : I navigate to the login page of the application
    And I entered username and password
    And I click on Login Button
    Then I should see the Manager tab on the left