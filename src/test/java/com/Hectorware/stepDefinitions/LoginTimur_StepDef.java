package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageTimur;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTimur_StepDef {
    LoginPageTimur login = new LoginPageTimur();

    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }
    @When("the user enters username")
    public void the_user_enters_username() {
        //login.username.click();
        login.username.sendKeys("Employee300");
    }
    @When("the user enters password")
    public void the_user_enters_password() {
        //login.password.click();
        login.password.sendKeys("Employee123");
    }
    @Then("the user should see the main page")
    public void the_user_should_see_the_main_page() {
        login.LoginButton.click();

        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
