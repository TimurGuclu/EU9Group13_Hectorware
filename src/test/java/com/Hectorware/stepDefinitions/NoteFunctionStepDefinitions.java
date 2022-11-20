package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.pages.NotesPage;
import com.Hectorware.utilities.BrowserUtils;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
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

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //wait.until(ExpectedConditions.visibilityOf(notesPage.codeMirror));

        Assert.assertTrue( notesPage.codeMirror.isDisplayed());
    }

    @Given("user is on the notes page")
    public void user_is_on_the_notes_page() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        //login.username.click();
        login.username.sendKeys("Employee1");
        //login.password.click();
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
        notesPage.notesIcon.click();

    }
    @When("user edits {string}")
    public void user_edits(String string) {

      notesPage.editibleCodeMirror.sendKeys(string);
    }
    @When("user clicks three dot on the left side of the page just on the right of Today is sunny note")
    public void user_clicks_three_dot_on_the_left_side_of_the_page_just_on_the_right_of_today_is_sunny_note() {
        BrowserUtils.scrollToElement(notesPage.todayIsSunny);
        BrowserUtils.clickWithJS(notesPage.threeDot);

    }
    @When("user clicks rename button")
    public void user_clicks_rename_button() {
       notesPage.rename.click();
    }
    @When("user deletes the default name in the box")
    public void user_deletes_the_default_name_in_the_box() {
        BrowserUtils.waitForClickablility(notesPage.input,15 );
        notesPage.input.click();
        notesPage.input.clear();
    }
    @When("user edits the First Note in to the inbox")
    public void user_edits_the_first_note_in_to_the_inbox() {
      notesPage.input.sendKeys("First Note");
    }
    @When("user clicks arrow")
    public void user_clicks_arrow() {
        BrowserUtils.scrollToElement(notesPage.arrow);
      BrowserUtils.clickWithJS(notesPage.arrow);
    }
    @Then("verify user views First Note on the page")
    public void verify_user_views_first_note_on_the_page() {
        BrowserUtils.waitForVisibility(notesPage.firstPage, 5);
        Assert.assertTrue(notesPage.firstPage.isDisplayed());
    }


}
