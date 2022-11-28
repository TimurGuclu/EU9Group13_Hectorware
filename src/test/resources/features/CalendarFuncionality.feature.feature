Feature: Default

	#*US: As a user, I should be able to create and update a new event under the Calendar module so that I can use the app*
	#
	# 
	#
	#*AC:* 
	#
	#User can see the Calendar module
	#
	#User can change the view by day, week, month
	#
	#User can create a new event
	#
	#User can update any even

	@HECW-330
	Scenario: user can log in on Hectorware
		Given User can see Log in and Password box
		When User enters Username
		And User enters Password
		And User clicks on Log in button
		Then User sees new page

	@HECW-359
	Scenario: user can see the calendar module
		Given the user navigate to calendar homepage
		And the user should see the calendar module
		Then the user should be able to click on calendar button
		Then the user verify calendar module is displayed

	@HECW-437
	Scenario: Display calendar view options
		When the user logins with valid credentials
		And types the correct login data
		And user click on Calendar menu button
		And user click on view options button
		And click on day option
		And click on week option
		Then click on month option


	@HECW-438
	Scenario: User can create a new event in Calendar
		When User can click on the Calendar module
		And User can click + New event button
		And User can enter Event title
		And User can pick start day, month, year and time of event
		And User can pick a start time zone
		And User can pick end day, month, year and time of event
		And User can pick a end time zone
		Then User can click on Save button

	@HECW-439
	Scenario: User can update any event
		Given User updates created event
		When User click on any event
		And User can click on More button
		And User can change event title
		And User can add location
		And User can add a description
		And User can click on Reminders button
		And User can add a reminder
		Then User can save updates


