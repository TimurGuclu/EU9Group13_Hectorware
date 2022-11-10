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
		And the user should see the calendar module
		Then the user should be able to click on calendar button
		Then the user verify calendar module is displayed

	@HECW-397
		Scenario: user can change the calendar view
			Given the user should see the dropdown option next to Today button
			When the user should be able to click on dropdown option
			And the user should be able to click on Day
		    And the user should be able to click on Week button
		    And the user should click on Month button
			Then the user should verify screen has changed