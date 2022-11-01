Feature: Notes Functionality
  @cafer
  Scenario: Writeable Area is displayed
    Given user is on the home page
    When user clicks notes icon
    And user clicks new note icon
    Then user should verify writeable  field is displayed