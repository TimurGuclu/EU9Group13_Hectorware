
Feature: Login feature
  @Timur
  Scenario: Login with valid credentials
    Given user navigates to the URL
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then any user should verify the home page
  @Timur2
    Scenario: Login with invalid credentials
      Given user navigates to the URL
      When user enters valid username
      And user enters invalid password
      And user clicks on login button
      Then any user should verify error message
  @Timur3
    Scenario: Login with invalid credentials
      Given user navigates to the URL
      When user enters invalid username
      And user enters valid password
      And user clicks on login button
      Then any user should verify error message
  @Timur4
  Scenario: Login with invalid credentials
    Given user navigates to the URL
    When user enters invalid username
    And user enters invalid password
    And user clicks on login button
    Then any user should verify error message
  @Timur5
  Scenario: Login without credentials
    Given user navigates to the URL
    When user keeps username blank
    And user keeps password blank
    And user clicks on login button
    Then any user should verify please fill out this field message
  @Timur6
  Scenario: Login without password credentials
    Given user navigates to the URL
    When user enters valid username
    And user keeps password blank
    And user clicks on login button
    Then any user should verify please fill out this field message on password space