Feature: Talk Functionality

	#*US:*
	#As an application basic user, I should be able to create, edit or delete a new group conversation so that I can communicate with
	#
	#*AC:*
	#
	#Display all conversation lists under the Talk module
	@HECW-391
	Scenario: Talk Functionality - automation test
		Given user is successfully logged in on Hectorware dashboard
		When user clicks on Talk functionality button
		Then Verify all conversation lists are displayed


	@HECW-400
	Scenario: Talk Functionality - test case 2
		Given user is successfully logged in on Hectorware dashboard
		When user clicks on Talk functionality button
		And user clicks on plus sign to create new conversation
		And user enters "string"
		And user clicks on AddParticipants button
		And user selects participants he or she wants to add
		And user clicks Create conversation button
		Then verify new conversation is created under the talk module


	@HECW-474
	Scenario: Talk functionality - Edit Conversation
		Given user is successfully logged in on Hectorware dashboard
		When user clicks on Talk functionality button
		And user clicks on conversation that wants to be edited
		And user clicks on three dots next to start call button
		And user selects Rename Conversation from the dropdown
		And user changes the name of the Conversation in input box
		And user clicks on Add participants to the conversation input box
		And user types names of participants that wants to add
		And user clicks on user that wants to be added to the conversation
		Then verify that Conversation name has been successfully changed and new user(s) have been added to the conversation

