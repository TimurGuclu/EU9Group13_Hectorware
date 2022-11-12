package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.CalendarFunctionPage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarChanges {

    CalendarFunctionPage calendarFunctionPage = new CalendarFunctionPage();
    LoginPageHalim login = new LoginPageHalim();

    @When("the user logins with valid credentials")
    public void the_user_logins_with_valid_credentials() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        login.username.sendKeys("Employee12");
        login.password.sendKeys("Employee123");
        login.LoginButton.click();

    }


    @When("user click on Calendar menu button")
    public void user_click_on_calendar_menu_button() {
        calendarFunctionPage.calendarButton.click();
    }

    @When("user click on view options button")
    public void user_click_on_view_options_button() {
        calendarFunctionPage.viewDropdownOptions.click();

    }

    @When("click on day option")
    public void click_on_day_option() throws InterruptedException {
        calendarFunctionPage.DayBtn.click();
        Thread.sleep(3000);
    }

    @When("click on week option")
    public void click_on_week_option() throws InterruptedException {
        calendarFunctionPage.WeekBtn.click();
        Thread.sleep(3000);
    }

    @Then("click on month option")
    public void click_on_month_option() throws InterruptedException {
        calendarFunctionPage.MonthBtn.click();
        Thread.sleep(3000);
    }

    @Then("user verify screen view changed")
    public void userVerifyScreenViewChanged() {
        String expectedTitle = "November 2022 - Calendar - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle,expectedTitle);


    }
}



