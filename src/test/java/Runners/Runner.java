package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/Features"},
        glue = {"StepDefinition"},
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests
{


}