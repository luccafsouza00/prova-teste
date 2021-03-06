package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features",
		glue = "tests",
		tags = "@executa and not @nexecuta",
		plugin = {"pretty","html:target/report.html", "json:target/cucumber.json"},
		monochrome = true,
		dryRun = false
		)

public class Run {

}
