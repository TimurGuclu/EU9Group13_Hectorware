Feature: Profile Settings Functionality

	@Salih
	@HECW-399
	Scenario: Profile Settings functionality
		Given the user tries to successfully login in
		And types the correct login data
		When User clicks on profile the dropdown is displayed
		And clicking on Settings displays the profile
		Then User can edit the profile of the account