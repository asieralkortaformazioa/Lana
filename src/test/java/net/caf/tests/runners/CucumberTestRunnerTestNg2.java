package net.caf.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by developer on 10/9/14.
 */

@CucumberOptions(
		//features = "features/rf02.08_GestionarErroresDeProyecto.feature.wip",
//		features = "features/rf00.00_Login.feature",
		features = "genericCrudFeatures/00_PlutoLogin.feature",
		format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" },
		tags = {"@GenericCrud"}
)
public class CucumberTestRunnerTestNg2 extends AbstractTestNGCucumberTests {

}
