package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.FilesPageKaisar;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.LoginPageTimur;
import com.Hectorware.utilities.BrowserUtils;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FilesKaisar_Stepdefs {

    LoginPageHalim login = new LoginPageHalim();
    FilesPageKaisar files = new FilesPageKaisar();

    @Given("user navigates to URL")
    public void user_navigates_to_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        login.username.sendKeys("Employee8");
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
    }

    @Then("user should see the home page")
    public void user_should_verify_the_home_page() {

        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("user clicks on file button")
    public void user_clicks_on_file_button() {

        BrowserUtils.waitFor(2);
        files.filesButton.click();
    }

    @When("files page should be displayed")
    public void files_page_should_be_displayed() {

        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("user clicks on the <+> button")
    public void user_clicks_on_the_button() {

        BrowserUtils.waitFor(2);
        files.plusButton.click();


    }

    @When("dropdown menu is displayed")
    public void dropdown_menu_is_displayed() {

        BrowserUtils.waitFor(2);
        files.dropDownMenu.isDisplayed();

    }

    @When("user uploads a file to the files page")
    public void user_uploads_a_file_to_the_files_page() {

        BrowserUtils.waitFor(2);
        files.uploadButton.sendKeys(files.filePath);





    }

    @Then("the uploaded file should be visible on the files page")
    public void the_uploaded_file_should_be_visible_on_the_files_page() {

    }


}
