package com.Hectorware.pages;

import com.Hectorware.stepDefinitions.CalendarFunction;
import com.Hectorware.utilities.Driver;
import org.apache.xmlbeans.XmlAnySimpleType;
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

    @FindBy(xpath = "//button[@class='button primary new-event']")
   public WebElement NewEventBtn;

    @FindBy(xpath = "//input[@placeholder='Event title']")
     public WebElement EventTitleBtn;

    @FindBy(xpath = "//div[@class='mx-datepicker']")
    public WebElement DateTimeBox;

    @FindBy(xpath = "//table[@class='mx-table mx-table-date']//tr[4]/td[5]")
    public WebElement DateBtn;

    @FindBy(xpath = "//td[@title='2022-11-14']")
    public WebElement TimeBtn;

    @FindBy(xpath = "//button[@class = 'datetime-picker-inline-icon icon icon-timezone']")
    public WebElement TimeZoneBtn;

    @FindBy(xpath =  "//div[@class='multiselect timezone-popover-wrapper__timezone-select multiselect--above multiselect--single']")
    public WebElement ZoneTime;

    @FindBy(xpath = "(//input[@placeholder='Type to search timezone'])[2]")
    public WebElement location;

    @FindBy(xpath =  "//div[@class='mx-datepicker'][2]")
    public WebElement dayMonthYearEnd;

    @FindBy(xpath = "//table[@class='mx-table mx-table-date']//tr[3]/td[4]")
    public WebElement dateOfEventEnd;

    @FindBy(xpath = "(//button[@class = 'datetime-picker-inline-icon icon icon-timezone'])[2]")
    public WebElement endTimeZone;


    @FindBy(xpath = "(//div[@class='multiselect timezone-popover-wrapper__timezone-select multiselect--above multiselect--single'])[2]")
    public WebElement timeZonePickerEnd;



    @FindBy(xpath = "(//input[@placeholder='Type to search timezone'])[3]")
    public WebElement locationEnd;


    @FindBy(xpath = "//div[@class = 'event-popover__buttons']")
    public WebElement saveButton;











    }



