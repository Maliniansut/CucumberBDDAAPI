package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features ={"src/test/resources/DemoRestAPITest.feature"},
        glue={"step.definitions"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "json:build/cucumber-reports/cucumber.json",
                "html:build/cucumber-reports/cucumber.html",
                "rerun:build/cucumber-reports/rerun.txt"
        })
public class TestRunner extends AbstractTestNGCucumberTests {



}
