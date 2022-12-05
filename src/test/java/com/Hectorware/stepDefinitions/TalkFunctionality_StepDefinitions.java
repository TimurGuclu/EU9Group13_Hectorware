package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.BasePage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.TalkModulePage;
import com.Hectorware.utilities.BrowserUtils;
import com.Hectorware.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalkFunctionality_StepDefinitions {

    Faker faker = new Faker();

    String convName = (faker.animal().name()) + " Conversation";

    LoginPageHalim loginPageHalim = new LoginPageHalim();

    BasePage basePage = new BasePage();

    TalkModulePage talkModulePage = new TalkModulePage();

    WebElement conversation;

    WebElement conversationName;

    String renamedConversation = faker.beer().name() + " Conversation";

    String oldConversationName;

    int randomNumber = faker.number().numberBetween(1,15);

    String employeeToSelect = "Employee" + faker.number().numberBetween(100,300);

    String convoNameChangedMessage;

    String employeeAddedVerification;

    @Given("user is successfully logged in on Hectorware dashboard")
    public void user_is_successfully_logged_in_on_hectorware_dashboard() {

        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");


        loginPageHalim.login("Employee1" , "Employee123");

    }
    @When("user clicks on Talk functionality button")
    public void user_clicks_on_talk_functionality_button() {

        basePage.talkFunctionalityButton.click();

    }
    @Then("Verify all conversation lists are displayed")
    public void verify_all_conversation_lists_are_displayed() {

    }


    @When("user clicks on plus sign to create new conversation")
    public void user_clicks_on_plus_sign_to_create_new_conversation() {


        talkModulePage.plusSign.click();

    }
    @When("user enters {string}")
    public void user_enters(String string) {

        string = convName;

        talkModulePage.inputBox.sendKeys(string);

    }
    @When("user clicks on AddParticipants button")
    public void user_clicks_on_add_participants_button() {

        talkModulePage.addParticipantsButton.click();

    }
    @When("user selects participants he or she wants to add")
    public void user_selects_participants_he_or_she_wants_to_add() {

        talkModulePage.firstEmployeeButton.click();
        talkModulePage.secondEmployeeButton.click();

    }
    @When("user clicks Create conversation button")
    public void user_clicks_create_conversation_button() {

        talkModulePage.createConversationButton.click();

    }
    @Then("verify new conversation is created under the talk module")
    public void verify_new_conversation_is_created_under_the_talk_module() {

        BrowserUtils.sleep(5);

        Assert.assertTrue(talkModulePage.conversationName.getText().equals(convName));

    }

    @When("user clicks on conversation that wants to be edited")
    public void user_clicks_on_conversation_that_wants_to_be_edited() {

        oldConversationName = talkModulePage.conversationNamesList.get(randomNumber).getText();

        conversation = talkModulePage.conversations.get(randomNumber);

        conversation.click();


    }
    @When("user clicks on three dots next to start call button")
    public void user_clicks_on_three_dots_next_to_start_call_button() {

        talkModulePage.threeDots.click();

    }
    @When("user selects Rename Conversation from the dropdown")
    public void user_selects_rename_conversation_from_the_dropdown() {

        talkModulePage.renameConversation.click();



    }
    @When("user changes the name of the Conversation in input box")
    public void user_changes_the_name_of_the_conversation_in_input_box() {

        talkModulePage.inputBoxRenameTitle.clear();

        talkModulePage.inputBoxRenameTitle.sendKeys(renamedConversation);

        talkModulePage.inputBoxRenameTitle.sendKeys(Keys.ENTER);

        BrowserUtils.sleep(5);

    }
    @When("user clicks on Add participants to the conversation input box")
    public void user_clicks_on_add_participants_to_the_conversation_input_box() {

        talkModulePage.addParticipantsInputBox.click();


    }
    @When("user types names of participants that wants to add")
    public void user_types_names_of_participants_that_wants_to_add() {

        talkModulePage.addParticipantsInputBox.sendKeys(employeeToSelect);



    }
    @When("user clicks on user that wants to be added to the conversation")
    public void user_clicks_on_user_that_wants_to_be_added_to_the_conversation() {

        talkModulePage.addParticipantToConv.click();

        BrowserUtils.sleep(5);

    }
    @Then("verify that Conversation name has been successfully changed and new user\\(s) have been added to the conversation")
    public void verify_that_conversation_name_has_been_successfully_changed_and_new_user_s_have_been_added_to_the_conversation() {


        for (WebElement each : talkModulePage.conversationChangedMessageList) {

            if (each.getText().equals("You renamed the conversation from " + "\"" + oldConversationName + "\"" + " to " +
            "\"" + renamedConversation + "\"")) {

                convoNameChangedMessage = each.getText();

                System.out.println(each.getText());
            }

        }

        Assert.assertEquals(convoNameChangedMessage,"You renamed the conversation from " + "\"" + oldConversationName + "\"" + " to " +
                "\"" + renamedConversation + "\"");


        for (WebElement each : talkModulePage.listOfParticipants) {

            if (each.getText().equals(employeeToSelect)){

               employeeAddedVerification = each.getText();

                System.out.println(each.getText());
            }

        }

        Assert.assertEquals(employeeAddedVerification,employeeToSelect);





    }
}
