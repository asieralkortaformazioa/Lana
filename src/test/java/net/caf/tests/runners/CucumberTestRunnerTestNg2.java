package net.caf.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.IOException;

/**
 * Created by developer on 10/9/14.
 */

@CucumberOptions(
		features = "features/rf02.08_GestionarErroresDeProyecto.feature",
		format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" }
)
public class CucumberTestRunnerTestNg2 extends AbstractTestNGCucumberTests {

}
