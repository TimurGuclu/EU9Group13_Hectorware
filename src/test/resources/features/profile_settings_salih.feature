Feature: Profile Settings Functionality

	@Salih
	@HECW-399
	Scenario: Profile Settings functionality
		Given the user tries to successfully login in
		When types the correct login data
		Then user opens the Settings Page and can see the Personal Information