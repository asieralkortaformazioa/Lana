package net.caf.tests.runners;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * Created by developer on 7/29/14.
 */
// Associates Cucumber JVM with the JUnit runner
@RunWith(Cucumber.class)
//    @Cucumber.Options(format={"pretty", "html:target/cucumber"})
@CucumberOptions(
		features = "src/it/resources/features/rf02.08_GestionarErroresDeProyecto.feature.wip",
		format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" })
public class CucumberTestRunner {

	//groups = "examples-testng",
	@Test(description = "Example of using TestNGCucumberRunner to invoke Cucumber")
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
	}
}
