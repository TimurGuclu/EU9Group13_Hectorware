Feature: Log out function
#    @wip
	#US:
	#As a user I should be able to Logout
	#
	#AC:
	#All the users should be able to Logout
  @HECW-408
  Scenario: Log out Functionality
    Given the user is on the home page
    When the user clicks on the account dropdown button
    And verify the Log out option is displayed
    And the user clicks the Log out option
    Then verify user is back to the Log in page