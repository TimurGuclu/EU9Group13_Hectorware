package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {


    public NotesPage(){PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]/a")
    public WebElement notesIcon;

    @FindBy(id = "notes_new_note")
    public WebElement newNoteIcon;

    @FindBy(xpath = "//*[@id=\"note-container\"]/div/div[2]/div/div[1]/div[6]/div[1]/div/div/div/div[5]/pre")
    public WebElement codeMirror;

    @FindBy(xpath = "//*[@id=\"note-container\"]/div/div[2]/div/div[1]/div[6]/div[1]/div/div/div/div[5]/pre/span")
    public WebElement editibleCodeMirror;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/a/span")
    public WebElement todayIsSunny;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/div/div/div/div/button")
    public WebElement threeDot;

    @FindBy(xpath = "//span[@class='action-button__text']")
    public WebElement rename;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/div/form/input")
    public WebElement input;

    @FindBy(xpath = "//button[@class='icon-confirm']")
    public WebElement arrow;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[4]/a/span")
    public WebElement firstPage;







}
