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


	Scenario: Display calendar view options
		When the user logins with valid credentials
		And user click on Calendar menu button
		And user click on view options button
		And click on day option
		And click on week option
		And click on month option
		Then user verify screen view changed



	Scenario: User can create a new event in Calendar
		When User can click on the Calendar module
		And User can click + New event button
		And User can enter Event title
		And User can pick start day, month, year and time of event
		And User can pick a time zone
		And User can pick end day, month, year and time of event
		And User can pick a end time zone
		Then User can click on Save button
	@HECW-397
	Scenario: User can update any event
		Given user updates created event
		When User click on any event
		And User can click on More button
		And User can change event title
		And User can add a location
		And User can add a description
		And User can click od Reminders button
		And User can add a reminder
		Then User can save updates