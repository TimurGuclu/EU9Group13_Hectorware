package com.Hectorware.stepDefinitions;

import com.Hectorware.pages.OnlineStatusPage_Metin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatusStepDef_Metin  {
                                              // control space
    OnlineStatusPage_Metin onlineStatusPage = new OnlineStatusPage_Metin();

    @When("Clicks on {string} button")
    public void clicksOnButton(String button) {

        onlineStatusPage.clickToButton(button);
    }

    @Then("Verify {string} menu is displayed")
    public void verifyOnlineStatusMenuIsDisplayed(String menu){
        boolean menuDisplayed = onlineStatusPage.isMenuDisplayed(menu);
        Assert.assertTrue(menuDisplayed);
    }
    @When("Change the status as {string}")
    public void changeTheStatusAs(String status) {
        onlineStatusPage.clickToButton(status);
    }

    @Then("Verify Online Status is displayed as {string}")
    public void verifyOnlineStatusIsDisplayedAs(String status) {
        boolean statusChanged = onlineStatusPage.isStatusChanged(status);
        Assert.assertTrue(statusChanged);


    }
}
