package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.BasePage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkFunctionality_StepDefinitions {

    LoginPageHalim loginPageHalim = new LoginPageHalim();

    BasePage basePage = new BasePage();

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
}
