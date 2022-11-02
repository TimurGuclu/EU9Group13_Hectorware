package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSettings_StepDefs {
    LoginPageHalim login = new LoginPageHalim();

    @Given("the user tries to successfully login in")
    public void the_user_tries_to_successfully_login_in() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @When("types the correct login data")
    public void types_the_correct_login_data() {
        login.username.click();
        login.username.sendKeys("Employee1");
        login.password.click();
        login.password.sendKeys("Employee123");
        login.LoginButton.click();

    }

    @FindBy(id = "expand")
    public WebElement MenuToggle;

    @When("User clicks on profile the dropdown is displayed")
    public void user_clicks_on_profile() {
        this.MenuToggle.click();
    }

    @FindBy(id = "settings")
    public WebElement Settings;

    @And("clicking on Settings displays the profile")
    public void user_clicks_on_settings() {
        this.Settings.click();
    }

    @FindBy(id = "displayname")
    public WebElement DisplayName;
    @FindBy(id = "phone")
    public WebElement PhoneNumber;
    @FindBy(id = "email")
    public WebElement Email;
    @FindBy(id = "address")
    public WebElement Address;

    @Then("User can edit the profile of the account")
    public void user_can_see_personal_information() {
        this.DisplayName.click();
        this.DisplayName.sendKeys("Salih Akyilmaz");
        this.PhoneNumber.click();
        this.PhoneNumber.sendKeys("+43123456789");
        this.Email.click();
        this.Email.sendKeys("salihTestCase@Cydeo.com");
        this.Address.click();
        this.Address.sendKeys("Burger King next to the park");
    }

}