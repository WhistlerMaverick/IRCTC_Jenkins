package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "/Users/RA20463861/Documents/JavaWorkSpace/IrctcProject/src/main/java/Feature/nyka_search.feature",
		// path of step definition file
		glue = { "Bindings" },tags="@Brand", dryRun = false, monochrome = true, plugin = { "pretty",
				"json:target/cucumber-reports/reports.json", "junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports/reports2.html" })
public class nyka_search_runnerFile {

}
