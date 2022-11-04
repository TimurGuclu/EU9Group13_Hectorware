

Feature: Notes Functionality
  @cafer  @HECW-406
  Scenario:User can view Notes module
    Given user is on the home page
    When user clicks notes icon
    And user clicks new note icon
    Then user should verify writeable  field is displayed


