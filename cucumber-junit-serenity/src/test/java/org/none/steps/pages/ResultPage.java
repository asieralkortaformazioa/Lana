package org.none.steps.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ResultPage extends PageObject {

	@FindBy(css = ".g")
	List<WebElement> listingCards;

	public List<String> getResultTitles() {
		return listingCards.stream().map(element -> element.getText()).collect(Collectors.toList());
	}

}
