package com.Hectorware.pages;

import com.Hectorware.utilities.BrowserUtils;
import com.Hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineStatusPage_Metin extends BasePage {

    @FindBy(xpath = "//a[contains(@class,'user-status-menu')]")
    public WebElement setStatusButton;

    @FindBy(id = "expand")
    public WebElement userMenuButton;
    @FindBy(xpath = "//button[contains(@class,'action-item action')]")
    public WebElement closeButton;

    public void clickToButton(String button) {
        if (button.equals("Set Status")) {
            setStatusButton.click();

        } else if (button.equals("User Menu")) {
            userMenuButton.click();
        } else {

            // Dynamic web elementini method icinde degiskenle 'button' localiser ettim.

            String path1 = "//*[normalize-space(text())=\"" + button + "\"]";
            String path2 = "(//*[normalize-space(text())=\"" + button + "\"])[2]";
            try {
                Driver.getDriver().findElement(By.xpath(path1)).click();
            } catch (ElementClickInterceptedException e) {
                Driver.getDriver().findElement(By.xpath(path2)).click();
            }
        }
    }

    public boolean isMenuDisplayed(String menu) {
        BrowserUtils.waitFor(1);
        return getElementByText(menu).isDisplayed();

    }

    public boolean isStatusChanged(String expectedStatus) {
        BrowserUtils.waitForVisibility(closeButton, 5);
        closeButton.click();
        BrowserUtils.waitFor(1);
        userMenuButton.click();
        BrowserUtils.waitFor(1);

        // trim diyerek string in basindaki ve sonundaki bosluklar atilir
        String actualStatus = setStatusButton.getText().trim();
        return actualStatus.equals(expectedStatus);


    }
}
