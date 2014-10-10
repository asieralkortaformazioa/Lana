package net.caf.tests.runners;

import java.io.IOException;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by developer on 10/9/14.
 */
@CucumberOptions(
		//features = "features/rf02.08_GestionarErroresDeProyecto.feature.wip",
		//		features = "features/rf00.00_Login.feature",
		features = { "src/it/resources/genericCrudFeatures/" },// "genericCrudFeatures/","features/"
		format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" },
		tags = { "@GenericCrud" }
)
@Test
public class GenericCrudCucumberTestRunnerTestNg extends AbstractTestNGCucumberTests {

	public GenericCrudCucumberTestRunnerTestNg() {
		System.out.println("Running GenericCrudCucumberTestRunnerTestNg...");
	}

	@Test(groups = { "GenericCrud" })
	@Override
	public void run_cukes() throws IOException {
		super.run_cukes();
	}
}
