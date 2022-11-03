package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPageKaisar {

    { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(partialLinkText = "files")
    public WebElement fileIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']")
    public WebElement dropDownList;

}