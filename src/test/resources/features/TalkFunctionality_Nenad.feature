Feature: Default

	#*US:*
	#As an application basic user, I should be able to create, edit or delete a new group conversation so that I can communicate with
	#
	#*AC:*
	#
	#Display all conversation lists under the Talk module
	@nenad
	Scenario: Talk Functionality - automation test
		Given User is successfully logged in on Hectoware homepage
		When User clicks on Talk functionality button
		Then Verify Talk page is displayed as expected