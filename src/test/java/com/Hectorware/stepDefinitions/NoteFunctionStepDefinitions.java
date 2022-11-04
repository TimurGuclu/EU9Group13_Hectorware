package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.NotesPage;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoteFunctionStepDefinitions {

    LoginPageHalim login = new LoginPageHalim();
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        //login.username.click();
        login.username.sendKeys("Employee1");
        //login.password.click();
        login.password.sendKeys("Employee123");
    }

    NotesPage notesPage = new NotesPage();

    @When("user clicks notes icon")
    public void user_clicks_notes_icon() {
        notesPage.notesIcon.click();
    }
    @When("user clicks new note icon")
    public void user_clicks_new_note_icon() {
        notesPage.newNoteIcon.click();
    }
    @Then("user should verify writeable  field is displayed")
    public void user_should_verify_writeable_field_is_displayed() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(notesPage.codeMirror));

        Assert.assertTrue( notesPage.codeMirror.isDisplayed());
    }


}
