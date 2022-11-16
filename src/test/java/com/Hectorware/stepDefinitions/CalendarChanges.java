package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.CalendarFunctionPage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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



      // create new event


    @When("User can click on the Calendar module")
    public void user_can_click_on_the_calendar_module()throws InterruptedException {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        login.username.sendKeys("Employee12");
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
        calendarFunctionPage.calendarButton.click();
        Thread.sleep(3000);
    }
    @When("User can click + New event button")
    public void user_can_click_new_event_button() {
        calendarFunctionPage.NewEventBtn.click();

    }
    @When("User can enter Event title")
    public void user_can_enter_event_title()throws InterruptedException {
        calendarFunctionPage.EventTitleBtn.sendKeys("SDET summit 2022");
        Thread.sleep(3000);



    }
    @When("User can pick start day, month, year and time of event")
    public void user_can_pick_start_day_month_year_and_time_of_event()throws InterruptedException {
        calendarFunctionPage.DateTimeBox.click();
        calendarFunctionPage.DateBtn.isDisplayed();
        calendarFunctionPage.TimeBtn.isDisplayed();
        Thread.sleep(3000);




    }
    @When("User can pick a time zone")
    public void user_can_pick_a_time_zone()throws InterruptedException {
        calendarFunctionPage.TimeZoneBtn.click();
        calendarFunctionPage.ZoneTime.click();
        calendarFunctionPage.location.sendKeys("Madrid");
        calendarFunctionPage.location.sendKeys(Keys.ENTER);



    }
    @When("User can pick end day, month, year and time of event")
    public void user_can_pick_end_day_month_year_and_time_of_event() throws InterruptedException{
        calendarFunctionPage.dayMonthYearEnd.click();
        calendarFunctionPage.dateOfEventEnd.isDisplayed();
        Thread.sleep(3000);

    }

    @And("User can pick a end time zone")
    public void userCanPickAEndTimeZone()throws  InterruptedException{
        calendarFunctionPage.endTimeZone.click();
        calendarFunctionPage.timeZonePickerEnd.click();
        calendarFunctionPage.locationEnd.sendKeys("Moscow");
        calendarFunctionPage.locationEnd.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }



    @Then("User can click on Save button")
    public void user_can_click_on_save_button() {
        calendarFunctionPage.saveButton.click();

    }
}




