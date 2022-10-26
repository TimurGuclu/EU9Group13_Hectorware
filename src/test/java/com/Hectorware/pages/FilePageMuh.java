package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePageMuh {

    public FilePageMuh()
    { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//a[@class='active'][1]")
    public WebElement fileIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']")
    public WebElement dropDownList;


}
