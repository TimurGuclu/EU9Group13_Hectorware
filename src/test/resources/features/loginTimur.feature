
Feature:Login feature

	#US:
	#As a user, I should be able to login with valid credentials so that I can use the app.
	#
	#AC:
	#All the users should be able to log in with valid credentials and launch to the homepage.


@Timur
Scenario: As a user, I want to login so that  I can access the app's main features.
Given the user navigates to the url
When the user enters username
And the user enters password
Then the user should see the main page

