package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteFunctionStepDefinitions {

    LoginPageHalim login = new LoginPageHalim();
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        //login.username.click();
        login.username.sendKeys("Employee1");
        //login.password.click();
        login.password.sendKeys("Employee123");
    }

    @When("user clicks notes icon")
    public void user_clicks_notes_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks new note icon")
    public void user_clicks_new_note_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should verify writeable  field is displayed")
    public void user_should_verify_writeable_field_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
