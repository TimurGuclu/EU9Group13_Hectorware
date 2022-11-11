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

    @FindBy(className = "CodeMirror-line")
    public WebElement codeMirror;





}
