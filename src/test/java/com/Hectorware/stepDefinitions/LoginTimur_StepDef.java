package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.LoginPageTimur;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTimur_StepDef {

    LoginPageTimur loginPageTimur= new LoginPageTimur();
    LoginPageHalim loginPageHalim= new LoginPageHalim();
    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPageTimur.username.sendKeys("Employee300");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
       loginPageTimur.password.sendKeys("Employee123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
    loginPageTimur.loginBtn.click();
    }
    @Then("any user should verify the home page")
    public void any_user_should_verify_the_home_page() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle= "Files - Hectorware - QA";
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPageTimur.password.sendKeys("Employee124");
    }
    @Then("any user should verify error message")
    public void any_user_should_verify_error_message() {
        loginPageTimur.errorMsg.isDisplayed();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle= "Hectorware - QA";
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
