package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt" // so go to target and then go to rerun where we have our failed scenario and this way run our failed test


)


public class FailedTestRunner {




}
/*
features = "src/test/resources/features",
this is from cukes runner and pointing to step def (glue) and to features
but for failes scenario it points to text file which is rerun.txt

 */