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

    @Given("the user succesfully login in")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @Given("the user succesfully login in")
    public void user_enters_valid_credentials() {
        //login.username.click();
        login.username.sendKeys("Employee1");
        //login.password.click();
        login.password.sendKeys("Employee123");
    }

    @FindBy(id = "expand")
    public WebElement MenuToggle;

    @When("User clicks on profile the dropdown is displayed")
    public void userclicksonprofile() {
        this.MenuToggle.click();
    }

    @FindBy(id = "settings")
    public WebElement Settings;

    @And("cliking on Settings displays the profile")
    public void userclicksonsettings() {
        this.Settings.click();
    }

    @FindBy(id = "displayname")
    public WebElement DisplayName;
    @FindBy(id = "phone")
    public WebElement PhoneNumber;
    @FindBy(id = "languageinput")
    public WebElement Language;
    @FindBy(id = "email")
    public WebElement Email;
    @FindBy(id ="address")
    public WebElement Address;

    @Then("User can edit the profile of the account")
    public void usercanseepersonalinfo() {
    this.DisplayName.getText();
    this.PhoneNumber.getText();
    this.Email.getText();
    this.Language.getText();
    this.Address.getText();
    }

}