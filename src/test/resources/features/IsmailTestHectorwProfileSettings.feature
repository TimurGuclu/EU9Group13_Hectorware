Feature: Default

	#AC: 
	#|User can see the Profile Info settings under the Profile module|
	#
	#US:
	#|As a user, I should be able to change profile info settings under the Profile module so that I can use the app|
	@HECW-416
	Scenario: Profile Settings functionality
		Given the user tries to successfully login in
		When types the correct login data
		Then user opens the Settings Page and can see the Personal Information