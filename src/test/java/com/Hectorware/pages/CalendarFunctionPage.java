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




        @FindBy(xpath ="//ul[@class='inverted']/li[7]")
                public WebElement module;



    }



