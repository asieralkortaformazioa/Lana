package net.caf.tests.runners;

import java.io.IOException;

import net.caf.selenium.SeleniumSingleton;
import net.caf.selenium.SeleniumUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by developer on 10/9/14.
 */
@CucumberOptions(
		features = { "src/it/resources/genericCrudFeatures/" }, // features folder"
		format = { "html:target/cucumber - html  - report", "json:target/cucumber - json - report.json" },
		glue = { "net.caf.tests.stepdefs" },
		tags = { "@GenericCrud", "@active" })
@Test
public class GenericCrudCucumberTestRunnerTestNg extends
		AbstractTestNGCucumberTests {

	public GenericCrudCucumberTestRunnerTestNg() {
		System.out.println("Running GenericCrudCucumberTestRunnerTestNg...");
	}

	@Test(groups = { "GenericCrud" })
	@Override
	public void run_cukes() throws IOException {
		SeleniumUtils.cleanScreenshotDir();
		super.run_cukes();
		//		... get scenario results... reports....
	}

	//	@After("@browser")
	//	public void tearDown(Scenario scenario) {
	//		if (scenario.isFailed()) {
	//			final byte[] screenshot = ((TakesScreenshot) SeleniumSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
	//			scenario.embed(screenshot, "image/png"); //stick it in the report
	//		}
	//		SeleniumSingleton.getDriver().close();
	//	}
}
