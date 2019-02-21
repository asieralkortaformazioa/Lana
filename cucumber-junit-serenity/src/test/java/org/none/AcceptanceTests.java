package org.none;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",
				plugin = {"pretty", "html:target/cucumber-html-report"},
				glue = { "org.none.steps.StepDefinitions" })
public class AcceptanceTests {

}
