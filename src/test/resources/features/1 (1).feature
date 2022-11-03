Feature: Default

	#*US:*
	#
	#As a user, I should be able to create and update a new event under the Calendar module so that I can use the app
	#
	#*AC:*
	#User can see the Calendar module
	@HECW-397
	Scenario: user can see the calendar module 
		Given the user navigate to calendar homepage 
		When the user should see the calendar module 
		Then the user verify calendar module is displayed