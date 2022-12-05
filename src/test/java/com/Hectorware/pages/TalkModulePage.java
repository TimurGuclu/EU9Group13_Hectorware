package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy (xpath = "//ul[@class='conversations']/li")
    public List<WebElement> conversations;

    @FindBy (xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement threeDots;

    @FindBy (xpath = "//span[@class='action-button__icon icon-rename']")
    public WebElement renameConversation;

    @FindBy (xpath = "//input[@class='app-sidebar-header__maintitle-input']")
    public WebElement inputBoxRenameTitle;

    @FindBy (xpath = "//form[@class='app-navigation-search']/input")
    public WebElement addParticipantsInputBox;

    @FindBy (xpath = "//li[@class='participant-row']")
    public WebElement addParticipantToConv;

    @FindBy (xpath = "//span[@class='acli__content__line-one__title']")
    public List<WebElement> conversationNamesList;

    @FindBy (xpath = "//div[@class='message__main__text system-message']")
    public List<WebElement> conversationChangedMessageList;

    @FindBy (xpath = "//span[@class='participant-row__user-name']")
    public List <WebElement> listOfParticipants;









}
