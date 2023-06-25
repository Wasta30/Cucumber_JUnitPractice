package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={ "html:target/cucumber-report.html", // provide multiple type of report here
                   "rerun:target/rerun.txt",
                   "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        // this plugin keeps track of failed scenario
        // add rerun here in order to see failure secnario and test
        features = "src/test/resources/features", // providing locatiion of our gfeature
        glue = "com/cydeo/step_definitions",// location where is our step definition
        dryRun = false, // when false it means it turned off , so when of it will execute evrything
        tags = "@scenarioOutline"

)
public class CukesRunner {
}
// we are controlling execution of scenario by using tags