package com.Hectorware.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/Hectorware/stepDefinitions",
        dryRun = false,
        tags = "@Timur"      // unique tag names, leave blank
        //publish = false

)
public class MyRunner {
}

