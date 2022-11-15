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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalkFunctionality_StepDefinitions {

    Faker faker = new Faker();

    String convName = (faker.superhero().name()) + " Conversation";

    LoginPageHalim loginPageHalim = new LoginPageHalim();

    BasePage basePage = new BasePage();

    TalkModulePage talkModulePage = new TalkModulePage();

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
    @Then("verify {string} is created under the talk module")
    public void verify_new_conversation_is_created_under_the_talk_module(String string) {

        string = convName;

        BrowserUtils.sleep(5);


        Assert.assertTrue(talkModulePage.conversationName.getText().equals(string));

    }
}
