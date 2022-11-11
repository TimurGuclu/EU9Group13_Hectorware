package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.ContactsPage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.ConfigurationReader;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contacts_Stepdefs {

    LoginPageHalim login = new LoginPageHalim();

    ContactsPage contactsPage = new ContactsPage();

    WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), 1);

    @Given("user navigates to the url")
    public void the_user_navigates_to_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    @When("user clicks Contacts Module on the top menu")
    public void the_user_clicks_on_contacts_module_on_the_ribbon_menu() {
        contactsPage.contactsBtn.click();
    }
    @Then("user should see the Contacts page")
    public void the_user_should_see_the_contacts_page() {

        String expectedTitle = "Contacts - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("user is at the Contacts page")
    public void user_is_at_the_contacts_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        contactsPage.contactsBtn.click();
    }

    @When("user clicks new contact button")
    public void user_clicks_new_contact_button() {
        contactsPage.newContactBtn.click();
    }

    @Then("user should see New Contact creation form")
    public void user_should_see_new_contact_creation_form() {
        Assert.assertTrue(contactsPage.fulnameField.isDisplayed());
    }
    @When("user clicks Name filed")
    public void user_clicks_name_filed() {
        contactsPage.fulnameField.click();
    }
    @When("user enters a name and a last name")
    public void user_enters_a_name_and_a_last_name() {
        contactsPage.fulnameField.sendKeys("John Reese");
    }
    @When("user presses tab button")
    public void user_presses_tab_button() {
        contactsPage.fulnameField.sendKeys(Keys.TAB);
    }
    @Then("user should see name and a last name in the name field")
    public void user_should_see_name_and_a_last_name_in_the_name_field(){
        String actualText = contactsPage.contactsList.getText();
        //System.out.println("contactsPage.fulnameField.getText() = " + contactsPage.contactsList.getText());
        String expectedText = "John Reese";
        Assert.assertEquals(expectedText, actualText);
    }

}