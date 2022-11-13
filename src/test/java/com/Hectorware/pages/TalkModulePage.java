package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {


    public TalkModulePage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement plusSign;

    @FindBy (xpath = "//input[@placeholder='Conversation name']")
    public WebElement inputBox;

    @FindBy (xpath = "//button[contains(@class,'navigation__button')]")
    public WebElement addParticipantsButton;

    @FindBy (xpath = "(//div[@class='participants-search-results scrollable']//div//ul//li)[1]")
    public WebElement firstEmployeeButton;

    @FindBy (xpath = "(//div[@class='participants-search-results scrollable']//div//ul//li)[2]")
    public WebElement secondEmployeeButton;

    @FindBy (xpath = "(//div[@class='navigation']//button)[2]")
    public WebElement createConversationButton;

    @FindBy (xpath = "//div[@class='acli__content__line-one']//span")
    public WebElement conversationName;







}
