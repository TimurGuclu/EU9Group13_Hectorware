package com.Hectorware.stepDefinitions;

import com.Hectorware.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp() {
       Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown() {
        Driver.closeDriver();
    }

}



