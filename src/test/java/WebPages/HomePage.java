package WebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables_Locators.Variables;
import Variables_Locators.WebLocators;
import baseActions.BaseActions;

public class HomePage extends BaseActions {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		navigateToHomePage();
	}

	public void navigateToHomePage() {
		// Form URL
		String url = Variables.protocol + Variables.environment + Variables.siteName;
		// Navigate to URL
		driver.get(url);
	}

	// Select given value from the drop down
	public void selectSearchValue(String param) {
		// Wait for the element
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.presenceOfElementLocated(WebLocators.homePage_search_dropdown));

		// Click on search dropdown to expand the details
		//driver.findElement(WebLocators.homePage_search_dropdown).click();
		super.clickUsingJS(WebLocators.homePage_search_All);

		// Select the value with given text
		Select select = new Select(BaseActions.locateElement(WebLocators.homePage_search_dropdown));
		select.selectByVisibleText(param);
	}

	// Search with given text
	public SearchResultsPage searchWithText(String searchText) {
		driver.findElement(WebLocators.homePage_search_box).sendKeys(searchText);
		driver.findElement(WebLocators.homePage_search_box).sendKeys(Keys.ENTER);

		return new SearchResultsPage(driver);
	}

}
