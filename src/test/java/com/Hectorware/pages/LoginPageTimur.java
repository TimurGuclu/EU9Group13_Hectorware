package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTimur {
    public LoginPageTimur(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//input[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@id='body-login']/div[1]/div/main/div/div/form/fieldset/p[3]")
    public WebElement  errorMsg;





}
