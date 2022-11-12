Feature: Default

	#*US:*
	#
	#As a user, I should be able to create and update a new event under the Calendar module so that I can use the app
	#
	#*AC:*
	#User can see the Calendar module

	Scenario: user can see the calendar module 
		Given the user navigate to calendar homepage 
		And the user should see the calendar module
		Then the user should be able to click on calendar button
		Then the user verify calendar module is displayed

	@HECW-397
	Scenario: Display calendar view options
		When the user logins with valid credentials
		And user click on Calendar menu button
		And user click on view options button
		And click on day option
		And click on week option
		And click on month option
		Then user verify screen view changed