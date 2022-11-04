package com.Hectorware.pages;

import com.Hectorware.utilities.BrowserUtils;
import com.Hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkFunctionalityButton;

    public WebElement getElementByText(String text) {
        String path = "//*[text()=\"" + text + "\"]";
        BrowserUtils.waitForVisibility(By.xpath(path),10);
        return Driver.getDriver().findElement(By.xpath(path));
    }



}
