package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.UploadFilePage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFile_StepDefs {

    UploadFilePage file = new UploadFilePage();
    LoginPageHalim login = new LoginPageHalim();

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        //login.username.click();
        login.username.sendKeys("Employee1");
        //login.password.click();
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
    }

    @When("user clicks files icon")
    public void userClicksFilesIcon() {
        // click on file icon
        file.fileIcon.click();
    }

    @And("user clicks plus icon")
    public void userClicksPlusIcon() {
        // click on plus icon
        file.plusIcon.click();
    }

    @Then("user should verify upload file dropdown is displayed")
    public void userShouldVerifyUploadFileDropdownIsDisplayed() {
        //verify file dropdown list is displayed
        file.dropDownList.isDisplayed();
    }


}
