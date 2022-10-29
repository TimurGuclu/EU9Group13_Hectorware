Feature: File Functionality
  @muh
  Scenario: Upload File Dropdown is displayed
    Given user is on the home page
    When user clicks files icon
    And user clicks plus icon
    Then user should verify upload file dropdown is displayed