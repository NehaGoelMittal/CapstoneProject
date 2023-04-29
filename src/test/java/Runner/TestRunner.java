package Runner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/features", glue="stepDefs",
//plugin = "json:target/cucumber-reports/CucumberTestReport.json")

@CucumberOptions(features = "src/test/resources/features/register.feature", glue = "stepDefs", plugin = {
		"json:target/cucumber-reports/CucumberTestReport.json" })

public class TestRunner extends AbstractTestNGCucumberTests {
	private TestRunner testNGCucumberRunner;

}