package com.Hectorware.pages;

import com.Hectorware.stepDefinitions.Contacts_Stepdefs;
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

    @FindBy(xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContactBtn;

    @FindBy(id = "contact-fullname" )
    public WebElement fulnameField;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/header/div[1]/div/div[1]/div")
    public WebElement nameInitials;

    @FindBy(xpath = "//*[@id=\"contacts-list\"]/div[1]//div//*[contains(text(), 'John Reese')]")
    public WebElement contactsList;

}
