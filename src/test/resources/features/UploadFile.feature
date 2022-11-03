Feature: Default

	#_{color:#de350b}*User Story:*{color}_
	#
	#As a user, I'd like to be able to verify that upload file dropdown is displayed.
	#
	#_*{color:#de350b}AC:{color}*_
	#
	#*Verify that the user can see upload file dropdown.*
	#
	# 
	@HECW-402
	Scenario: Upload file dropdown is displayed.
		Given user is on the home page
		When user clicks files icon
		And user clicks plus icon
		Then user should verify upload file dropdown is displayed