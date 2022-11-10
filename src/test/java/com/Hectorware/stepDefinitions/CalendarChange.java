package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.CalendarFunctionPage;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarChange {


    CalendarFunctionPage calendarFunctionPage = new CalendarFunctionPage();



    @When("the user should see the dropdown option next to Today button")
    public void the_user_should_see_the_dropdown_option_next_to_today_button() {
        String expectedTitle = "10 Nov 2022 - Calendar - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @When("the user should be able to click on dropdown option")
    public void the_user_should_be_able_to_click_on_dropdown_option() {
        calendarFunctionPage.DropDown.click();

    }

    @When("the user should be able to click on Day")
    public void the_user_should_be_able_to_click_on_day_week_month_button() {

        calendarFunctionPage.DayBtn.click();

    }
    @And("the user should click on Month button")
    public void theUserShouldClickOnMonthButton() {
        calendarFunctionPage.MonthBtn.click();
    }

    @And("the user should be able to click on Week button")
    public void theUserShouldBeAbleToClickOnWeekButton() {
         calendarFunctionPage.WeekBtn.click();
    }

    @Then("the user should verify screen has changed")
    public void theUserShouldVerifyScreenHasChanged() {
        String expectedTitle = "10 Nov 2022 - Calendar - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}