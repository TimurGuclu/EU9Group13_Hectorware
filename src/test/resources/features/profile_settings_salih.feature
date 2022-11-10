Feature: Profile Settings Functionality

	@Salih
	@HECW-399
	Scenario: Profile Settings functionality
		Given the user tries to successfully login in
		When types the correct login data
		Then user opens the Settings Page and can see the Personal Information

		@HECW-459
	Scenario: Profile Settings functionality - Display Profil Settings Test
		Given the user logins with valid credentials
		When user opens Settings Page
		Then user verifies Settings Page