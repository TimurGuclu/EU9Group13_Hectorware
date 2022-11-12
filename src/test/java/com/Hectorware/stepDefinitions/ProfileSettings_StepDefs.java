package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProfileSettings_StepDefs {
    LoginPageHalim login = new LoginPageHalim();

    @Given("the user tries to successfully login in")
    public void the_user_tries_to_successfully_login_in() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }


    @When("types the correct login data")
    public void types_the_correct_login_data() {
        login.username.click();
        login.username.sendKeys("Employee12");
        login.password.click();
        login.password.sendKeys("Employee123");
        login.LoginButton.click();

    }


    @Then("user opens the Settings Page and can see the Personal Information")
    public void the_user_goes_to_settings_page() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/settings/user");

    }
}