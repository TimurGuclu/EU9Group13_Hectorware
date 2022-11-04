@kai
Feature: File Functionality


  Background: User is on the Files Page
    Given user navigates to URL
    When user logs in with valid credentials
    Then user should see the home page

  Scenario: User should be able to upload a file to the files page

    When user clicks on file button
    And  files page should be displayed
    When user clicks on the <+> button
    And  dropdown menu is displayed
    When user uploads a file to the files page
    Then the uploaded file should be visible on the files page












