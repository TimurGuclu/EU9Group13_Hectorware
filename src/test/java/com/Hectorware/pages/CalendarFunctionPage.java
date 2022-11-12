package com.Hectorware.pages;

import com.Hectorware.stepDefinitions.CalendarFunction;
import com.Hectorware.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Calendar;

public class CalendarFunctionPage {

 public CalendarFunctionPage()
        { PageFactory.initElements(Driver.getDriver(), this); }

    // calendar tryout items
    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement viewDropdownOptions;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement DayBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement WeekBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement MonthBtn;




    }



