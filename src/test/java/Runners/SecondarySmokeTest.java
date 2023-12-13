package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SecondarySmoke",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class SecondarySmokeTest extends AbstractTestNGCucumberTests { }