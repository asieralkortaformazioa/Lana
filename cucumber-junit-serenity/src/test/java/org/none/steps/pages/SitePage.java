package org.none.steps.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.google.com")
public class SitePage extends PageObject {

	@FindBy(css = "button[name='btnK']")
	WebElement searchButton;

	public void searchFor(String keywords) {
		$("[name='q']").sendKeys(keywords);
		searchButton.click();
	}
}
