
Feature: Login feature
  @Timur
  Scenario: Login with valid credentials
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then any user should verify the home page

    Scenario: Login with invalid credentials
      Given user navigates to the URL
      When user enters valid username
      And user enters invalid password
      And user clicks on login button
      Then any user should verify error message