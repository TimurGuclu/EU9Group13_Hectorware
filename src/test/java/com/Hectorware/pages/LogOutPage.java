package com.Hectorware.pages;

import com.Hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "expand")
    public WebElement accountDrpDwnBtn;

    @FindBy(xpath = "//*[@id='expanddiv']/ul/li[5]/a")
    public WebElement LogOutOpt;



}
