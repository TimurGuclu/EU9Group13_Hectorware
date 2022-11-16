package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarFunctionality {

    public CalendarFunctionality(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;






    @FindBy(id = "submit-form")
    public WebElement logInButton;


    LoginPageHalim login = new LoginPageHalim();
    // calendar tryout items
    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement viewOptions;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement viewDropdownWeek;


    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement DayBtn;


    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement MonthBtn;


    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "//div[@class='mx-datepicker']")
    public WebElement dayMonthYear;

    @FindBy(xpath = "//table[@class='mx-table mx-table-date']//tr[4]/td[5]")
    public WebElement dateOfEvent;

    @FindBy(xpath = "//ul[@class='mx-time-list']//li[14]")
    public WebElement time;

    @FindBy(xpath = "//button[@class = 'datetime-picker-inline-icon icon icon-timezone']")
    public WebElement timeZone;

    @FindBy(xpath = "//div[@class='multiselect timezone-popover-wrapper__timezone-select multiselect--above multiselect--single']")
    public WebElement timeZonePicker;

    @FindBy(xpath = "(//input[@placeholder='Type to search timezone'])[2]")
    public WebElement location;

    @FindBy(xpath =  "//div[@class='mx-datepicker'][2]")
    public WebElement dayMonthYearEnd;

    @FindBy(xpath = "//table[@class='mx-table mx-table-date']//tr[3]/td[4]")
    public WebElement dateOfEventEnd;

    @FindBy(xpath = "(//button[@class = 'datetime-picker-inline-icon icon icon-timezone'])[1]")
    public WebElement timeZoneEnd;

    @FindBy(xpath = "(//div[@class='multiselect timezone-popover-wrapper__timezone-select multiselect--above multiselect--single'])[2]")
    public WebElement timeZonePickerEnd;

    @FindBy(xpath = "(//input[@placeholder='Type to search timezone'])[3]")
    public WebElement locationEnd;

    @FindBy(xpath = "//div[@class = 'event-popover__buttons']")
    public WebElement saveButton;


}
