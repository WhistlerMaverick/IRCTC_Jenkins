package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "/Users/RA20463861/Documents/JavaWorkSpace/IrctcProject/src/main/java/Feature/petStore_login.feature",
		// path of step definition file
		glue = { "PetStore_Binding" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"json:target/cucumber-reports/reportsLogin.json", "junit:target/cucumber-reports/CucumberLogin.xml",
				"html:target/cucumber-reports/reports2Login.html" })
public class petStore_login_runnerFile {

}
