package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.LoginPageTimur;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class LoginTimur_StepDef {

    LoginPageTimur loginPageTimur = new LoginPageTimur();
//    LoginPageHalim loginPageHalim = new LoginPageHalim();

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

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        loginPageTimur.username.sendKeys("Employee301");
    }

    @When("user keeps username blank")
    public void user_keeps_username_blank() {
        loginPageTimur.username.sendKeys("");
    }

    @When("user keeps password blank")
    public void user_keeps_password_blank() {
        loginPageTimur.password.sendKeys("");
    }

    @Then("any user should verify please fill out this field message")
    public void any_user_should_verify_please_fill_out_this_field_message() {
        String validationMsg = loginPageTimur.username.getAttribute("validationMessage");
        System.out.println("validationMsg = " + validationMsg);
        Assert.assertEquals("Lütfen bu alanı doldurun.", validationMsg);


    }


    @Then("any user should verify the home page")
    public void any_user_should_verify_the_home_page() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Files - Hectorware - QA";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPageTimur.password.sendKeys("Employee124");
    }

    @Then("any user should verify error message")
    public void any_user_should_verify_error_message() {
        loginPageTimur.errorMsg.isDisplayed();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Hectorware - QA";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Then("any user should verify please fill out this field message on password space")
    public void anyUserShouldVerifyPleaseFillOutThisFieldMessageOnPasswordSpace() {
        String validationMsgPsw = loginPageTimur.password.getAttribute("validationMessage");
        System.out.println("validationMsgPsw = " + validationMsgPsw);
        Assert.assertEquals("Lütfen bu alanı doldurun.", validationMsgPsw);

    }

    @And("user enters {string} , {string}")
    public void user_enters_and(String username, String password) {
        loginPageTimur.login(username, password);

    }


    @Then("user should verify the displayed error message")
    public void user_should_verify_the_error_message() {

        if (loginPageTimur.username.equals("")) {
            String validationMessage = loginPageTimur.username.getAttribute("validationMessage");
            System.out.println("validationMessage = " + validationMessage);
            Assert.assertEquals("Fill out message is displayed test", "Please fill out this field.", validationMessage);
        } else if (loginPageTimur.password.equals("")) {
            String validationMessage = loginPageTimur.password.getAttribute("validationMessage");
            System.out.println("validationMessage = " + validationMessage);
            Assert.assertEquals("Fill out message is displayed test", "Please fill out this field.", validationMessage);
        }
    }
}