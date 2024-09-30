package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./features/admin.feature",
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		tags = "@dataDriven"
		)

public class Testrunner {

}
