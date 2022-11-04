package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LogOutPage;
import com.Hectorware.pages.LoginPageTimur;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOut_Timur_StepDef {
    LogOutPage logOutPage = new LogOutPage();
    LoginPageTimur loginPageTimur = new LoginPageTimur();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        loginPageTimur.username.sendKeys("Employee1");
        loginPageTimur.password.sendKeys("Employee123");
        loginPageTimur.loginBtn.click();
    }
    @When("the user clicks on the account dropdown button")
    public void the_user_clicks_on_the_account_dropdown_button() {
        logOutPage.accountDrpDwnBtn.click();
    }
    @When("verify the Log out option is displayed")
    public void verify_the_log_out_option_is_displayed() {
        Assert.assertTrue(logOutPage.LogOutOpt.isDisplayed());
    }
    @When("the user clicks the Log out option")
    public void the_user_clicks_the_log_out_option() {
        logOutPage.LogOutOpt.click();
    }
    @Then("verify user is back to the Log in page")
    public void verify_user_is_back_to_the_log_in_page() {
        Driver.getDriver().getCurrentUrl().contains("login");
    }

}
