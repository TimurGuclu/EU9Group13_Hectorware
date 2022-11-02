Feature: Profile Settings Functionality

	@Salih
	@HECW-399
	Scenario: Profile Settings functionality
		Given the user succesfully login in
		When User clicks on profile the dropdown is displayed
		And cliking on Settings displays the profile
		Then User can edit the profile of the account