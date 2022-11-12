package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.CalendarFunctionality;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarFunctionality_StepDef {

    CalendarFunctionality calendarFunctionality = new CalendarFunctionality();

    @Given("User can see Log in and Password box")
    public void user_can_see_log_in_and_password_box() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @When("User enters Username")
    public void user_enters_username() {
        calendarFunctionality.username.sendKeys("Employee8");
    }

    @When("User enters Password")
    public void user_enters_password() {
        calendarFunctionality.password.sendKeys("Employee123");
    }
    @When("User clicks on Log in button")
    public void user_clicks_on_log_in_button() {
        calendarFunctionality.logInButton.click();
    }

    @Then("User sees new page")
    public void user_sees_new_page() {
        String expectedTitle = "https://qa.hectorware.com/index.php/apps/files/?dir=/&fileid=43157";
        String actualTitle = Driver.getDriver().getTitle();

    }





    @Given("the user navigate to calendar homepage")
    public void the_user_navigate_to_calendar_homepage() {

    }

    @Given("the user should see the calendar module")
    public void the_user_should_see_the_calendar_module() {

    }

    @Then("the user should be able to click on calendar button")
    public void the_user_should_be_able_to_click_on_calendar_button() {

    }

    @Then("the user verify calendar module is displayed")
    public void the_user_verify_calendar_module_is_displayed() {

    }



    //zadnji sprint
    @When("the user logins with valid credentials")
    public void the_user_logins_with_valid_credentials() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @When("types the correct login data")
    public void types_the_correct_login_data() {
        calendarFunctionality.username.sendKeys("Employee8");
        calendarFunctionality.password.sendKeys("Employee123");
        calendarFunctionality.logInButton.click();

    }


    @When("user click on Calendar menu button")
    public void user_click_on_calendar_menu_button() {
        calendarFunctionality.calendarButton.click();
    }

    @When("user click on view options button")
    public void user_click_on_view_options_button() {
        calendarFunctionality.viewOptions.click();
    }

    @When("click on day option")
    public void click_on_day_option() throws InterruptedException {
       calendarFunctionality.DayBtn.click();
        Thread.sleep(3000);
    }



    @When("click on week option")
    public void click_on_week_option() throws InterruptedException {
        calendarFunctionality.viewDropdownWeek.click();
        Thread.sleep(3000);
    }

    @When("click on month option")
    public void click_on_month_option() throws InterruptedException {
        calendarFunctionality.MonthBtn.click();
        Thread.sleep(3000);
    }



    @Then("user should see weekly view on calendar page")
    public void user_should_see_weekly_view_on_calendar_page() {

    }



















    @When("Click on Log in button")
    public void click_on_log_in_button() {


    }
    @Then("User should see Calendar button in upper line")
    public void user_should_see_calendar_button_in_upper_line() {

    }



    @Given("User navigate to Calendar homepage")
    public void user_navigate_to_calendar_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
    @When("User clicks on Calendar button")
    public void user_clicks_on_calendar_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User sees dropdown option next to Today button")
    public void user_sees_dropdown_option_next_to_today_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should be able to click on dropdown option")
    public void user_should_be_able_to_click_on_dropdown_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should be able to see the Day, Week and Month option")
    public void user_should_be_able_to_see_the_day_week_and_month_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should be able to click on Day, Week or Month button")
    public void user_should_be_able_to_click_on_day_week_or_month_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Usr should verify the screen change by clicking each option")
    public void usr_should_verify_the_screen_change_by_clicking_each_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
