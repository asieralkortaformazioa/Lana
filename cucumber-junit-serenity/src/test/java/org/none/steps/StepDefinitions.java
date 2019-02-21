package org.none.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class StepDefinitions {

	
	    @Steps
	    SiteSteps site;

	    @Given("I open the homepage (.*)")
	    public void openHomepage(String article) {
	        site.open_homepage();
	    }

	    @When("I search for items containing '(.*)'")
	    public void searchByKeyword(String keyword) {
	        site.searches_for_items_containing(keyword);
	    }

	    @Then("I should only see items related to '(.*)'")
	    public void resultsForACategoryAndKeywordInARegion(String keyword) {
	        site.should_see_items_related_to(keyword);
	    }
}
