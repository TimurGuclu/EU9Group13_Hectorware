package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {


    public NotesPage(){PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(id = "user")
    public WebElement username;








}
