package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]/a")
    public WebElement contactsBtn;


}
