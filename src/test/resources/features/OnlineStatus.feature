@HECW-362
Feature: Online Status Functionality

  Background: User is on the Online Status Page
    Given user navigates to the URL
    When user enters valid credentials
    Then user should verify the home page


  Scenario Outline: User should be able to change online status as <status>

    When Clicks on "User Menu" button
    And  Clicks on "Set Status" button
    Then Verify "Online status" menu is displayed
    When Change the status as "<status>"
    Then Verify Online Status is displayed as "<status>"


    Examples: // control alt L
      | status         |
      | Do not disturb |
      | Invisible      |
      | Away           |
      | Online         |









