Feature: Login feature

  @halim
  Scenario: Login with valid credentials
    Given user navigates to the URL
    When user enters valid credentials
    Then user should verify the home page

  @tryCalendar
  Scenario: Display calendar view options
    When the user logins with valid credentials
    And types the correct login data
    And user click on Calendar menu button
    And user click on view options button
    And click on week option
    Then user should see weekly view on calendar page
  @halim
  Scenario Outline: Login - Negative Scenarios
    Given user navigates to the URL
    And user enters "<username>" and "<password>"
    Then user should verify the error message
    Examples:
      | username  | password    |
      |           |             |
      | Employee1 |             |
      |           | Employee123 |