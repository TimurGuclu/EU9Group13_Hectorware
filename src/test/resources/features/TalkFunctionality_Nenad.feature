Feature: Talk Functionality

	#*US:*
	#As an application basic user, I should be able to create, edit or delete a new group conversation so that I can communicate with
	#
	#*AC:*
	#
	#Display all conversation lists under the Talk module
	@HECW-391
	Scenario: Talk Functionality - automation test
		Given user is successfully logged in on Hectorware dashboard
		When user clicks on Talk functionality button
		Then Verify all conversation lists are displayed