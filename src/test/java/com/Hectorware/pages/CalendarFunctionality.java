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



}
