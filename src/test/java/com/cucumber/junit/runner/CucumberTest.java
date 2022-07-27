package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports", "json:tager/cucumber-reports/CucumberTest.json"},
        monochrome = true,
        tags= "@Parallel",
        glue = "com.cucumber.junit",
        features = "src/test/resources/com/cucumber/junit/features"
)
public class CucumberTest {
}
