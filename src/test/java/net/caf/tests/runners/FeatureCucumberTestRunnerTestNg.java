package net.caf.tests.runners;

import java.io.IOException;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by developer on 7/29/14.
 */
// Associates Cucumber JVM with the JUnit runner
@CucumberOptions(
//features = "features/rf02.08_GestionarErroresDeProyecto.feature.wip",
//		features = "features/rf00.00_Login.feature",
features = { "src/it/resources/features/" },// "genericCrudFeatures/","features/"
format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" },
		tags = { "@gestionDatos" })
@Test
public class FeatureCucumberTestRunnerTestNg extends
		AbstractTestNGCucumberTests {

	public FeatureCucumberTestRunnerTestNg() {
		System.out.println("Running FeatureCucumberTestRunnerTestNg...");
	}

	@Test(groups = { "gestionDatos" })
	@Override
	public void run_cukes() throws IOException {
		super.run_cukes();
	}
}
