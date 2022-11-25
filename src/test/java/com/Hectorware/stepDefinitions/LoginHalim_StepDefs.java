package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginHalim_StepDefs {

    LoginPageHalim login = new LoginPageHalim();

    @Given("user navigates to the URL")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

   /* @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
       //login.username.click();
       login.username.sendKeys("Employee1");
       //login.password.click();
       login.password.sendKeys("Employee123");
    }*/

    @Then("user should verify the home page")
    public void user_should_verify_the_home_page() {
      login.LoginButton.click();

      String expectedTitle = "Files - Hectorware - QA";
      String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("user click on Calendar menu button")
    public void user_click_on_calendar_menu_button() {
        login.calendarButton.click();
    }

    @When("user click on view options button")
    public void user_click_on_view_options_button() {
        login.viewOptions.click();
    }
    @When("click on week option")
    public void click_on_week_option() throws InterruptedException {
        login.viewDropdownWeek.click();
        Thread.sleep(3000);

    }
    @Then("user should see weekly view on calendar page")
    public void user_should_see_weekly_view_on_calendar_page() {

    }

    @Given("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        login.login(username, password);
    }

    @Then("user should verify the error message")
    public void user_should_verify_the_error_message() {
        // 1st way
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("title = " + actualTitle);
        Assert.assertEquals("Not login due to invalid-blank credentials", "Hectorware - QA", actualTitle);

        // 2nd way
        if (login.username.equals("")){
            String validationMessage = login.username.getAttribute("validationMessage");
            System.out.println("validationMessage = " + validationMessage);
            Assert.assertEquals("Fill out message is displayed test","Please fill out this field.",validationMessage);
        }else if(login.password.equals("")){
            String validationMessage = login.password.getAttribute("validationMessage");
            System.out.println("validationMessage = " + validationMessage);
            Assert.assertEquals("Fill out message is displayed test","Please fill out this field.",validationMessage);
        }



    }



}
