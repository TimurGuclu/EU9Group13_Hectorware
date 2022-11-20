

Feature: Notes Functionality
 @HECW-406
  Scenario:User can view Notes module
    Given user is on the home page
    When user clicks notes icon
    And user clicks new note icon
    Then user should verify writeable  field is displayed


  @cafer
  Scenario: user can create a new note
      Given user is on the notes page
     When user clicks new note icon
    And user edits "Today is sunny"
    And user clicks three dot on the left side of the page just on the right of Today is sunny note
    And user clicks rename button
    And user deletes the default name in the box
    And user edits the First Note in to the inbox
    And user clicks arrow
    Then verify user views First Note on the page

