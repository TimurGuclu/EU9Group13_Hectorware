package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.ProfileSettingsPage;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSettingsStepIsmail {

    ProfileSettingsPage enterLogin = new ProfileSettingsPage();

    @Given("user tries to successfully login in")
    public void user_tries_to_successfully_login_in() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");

    }

    @When("enters the correct login data")
    public void enters_the_correct_login_data() {
        enterLogin.username.click();
        enterLogin.username.sendKeys("Employee1");
        enterLogin.password.click();
        enterLogin.password.sendKeys("Employee123");
        enterLogin.loginBtn.click();

    }

    @Then("user should see the Settings Page and can see the Personal Information")
    public void user_should_see_the_settings_page_and_can_see_the_personal_information() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/settings/user");

    }
}