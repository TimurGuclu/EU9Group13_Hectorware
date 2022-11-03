package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.CalendarFunctionPage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import com.google.common.base.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.text.View;

public class CalendarFunction {

    CalendarFunctionPage calendarFunctionPage= new CalendarFunctionPage();
    LoginPageHalim login = new LoginPageHalim();

    @Given("the user navigate to calendar homepage")
    public void the_user_navigate_to_calendar_homepage() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        login.username.sendKeys("Employee12");
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
    }



    @When("the user should see the calendar module")
    public void the_user_should_see_the_calendar_module() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);




    }
    @Then("the user verify calendar module is displayed")
    public void the_user_verify_calendar_module_is_displayed() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
