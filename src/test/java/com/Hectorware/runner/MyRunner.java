package com.Hectorware.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/Hectorware/stepDefinitions",
        dryRun = false,
        tags =  "@HECW-439" // unique tag names, leave blank
        //publish = false

)
public class MyRunner {
}
