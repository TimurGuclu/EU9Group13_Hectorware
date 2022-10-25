package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginHalim_StepDefs {

    LoginPageHalim login = new LoginPageHalim();

    @Given("user navigates to the URL")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
       //login.username.click();
       login.username.sendKeys("Employee1");
       //login.password.click();
       login.password.sendKeys("Employee123");
    }

    @Then("user should verify the home page")
    public void user_should_verify_the_home_page() {
      login.LoginButton.click();

      String expectedTitle = "Files - Hectorware - QA";
      String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
