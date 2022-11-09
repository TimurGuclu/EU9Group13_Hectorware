@HECW-470
Feature: Contacts

	Background:
		#@HECW-241
	Scenario: Login with valid credentials
		Given the user login with valid credentials



	@HECW-461
	Scenario: users can display all contacts and contact groups under the Contacts module
		Given user navigates to the url
		When user clicks Contacts Module on the top menu
		Then user should see the Contacts page


	@HECW-467
	Scenario: users can enter a first name and a last name to the "Name" field
		Given user is at the Contacts page
		When user clicks Name filed
		And user enters a name and a last name
		And user presses tab button
		Then user should see name and a last name in the name field


	@HECW-468
	Scenario: users can select their email type from the dropdown menu, which is on the left side of the email field
		Given user is at the Contacts page
		When user clicks email type
		And user selects an email type from the dropdown menu
		Then user should see the email type selected is displayed on the New Contact creation form



	@HECW-466
	Scenario: users can enter a phone number to the "Number" field
		Given user is at the Contacts page
		When user clicks phone number field
		And user enters a phone number
		And user presses tab button
		Then user should see the phone number on the New Contact creation form


	@HECW-465
	Scenario: users can select their phone number type from the dropdown menu, which is on the left side of the phone number field
		Given user is at the Contacts page
		When user clicks phone number type
		And user selects a phone number type from the dropdown menu
		Then user should see the phone number type selected is displayed on the New Contact creation form


	@HECW-464
	Scenario: users can enter a company name to the "Company" field
		Given user is at the Contacts page
		When user clicks Company field
		And user enters a company name
		And user presses tab button
		Then user should see the company name on the New Contact creation form


	@HECW-462
	Scenario: users can click the "+ New contact" button at the Contacts module page and display New contact creation menu
		Given user is at the Contacts page
		When user clicks new contact button
		Then user should see New Contact creation form