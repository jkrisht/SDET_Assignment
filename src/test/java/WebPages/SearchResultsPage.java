package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables_Locators.WebLocators;
import baseActions.BaseActions;

public class SearchResultsPage extends BaseActions {

	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Select first product from search results page
	public ProductDetailsPage selectFirstProduct() {
		
		if(super.verifyElement(WebLocators.searchPage_first_product_title)) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(WebLocators.searchPage_first_product_title));
			BaseActions.locateElements(WebLocators.searchPage_first_product_title).get(0).click();
		}else {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(WebLocators.searchPage_first_product_title_1));
			BaseActions.locateElements(WebLocators.searchPage_first_product_title_1).get(0).click();
		}
		
		return new ProductDetailsPage(driver);
		
	}
}
