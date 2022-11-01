package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.ContactsPage;
import com.Hectorware.pages.LoginPageHalim;
import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contacts_Stepdefs {

    LoginPageHalim login = new LoginPageHalim();

    ContactsPage contactsPage = new ContactsPage();

    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        login.username.sendKeys("Employee55");
        //login.password.click();
        login.password.sendKeys("Employee123");
        login.LoginButton.click();
    }


    @When("the user clicks on Contacts Module on the ribbon menu")
    public void the_user_clicks_on_contacts_module_on_the_ribbon_menu() {
        contactsPage.contactsBtn.click();
    }
    @Then("the user should see the Contacts page")
    public void the_user_should_see_the_contacts_page() {

        String expectedTitle = "Contacts - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle);

    }

}
