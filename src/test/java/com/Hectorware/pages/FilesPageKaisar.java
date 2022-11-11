package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPageKaisar {

    { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(partialLinkText = "files")
    public WebElement filesButton;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadButton;

    public String filePath = "C:\\Users\\StormBreaker\\Desktop\\file.txt";





}
