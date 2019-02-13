package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Variables_Locators.Variables;
import WebPages.HomePage;
import WebPages.ProductDetailsPage;
import WebPages.SearchResultsPage;
import baseActions.BaseActions;

public class SearchTestScript extends BaseActions {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = launchBrowser(Variables.browser);
	}

	// Search with 'Data Catalog' text and verify first product details
	@Test(description = "Search with 'Data Catalog' text and verify first product details")
	public void searchAndVerifyProductDetails() {
		// Navigate to Home Page
		HomePage homePage = new HomePage(driver);
		// Select 'Books' value from search drop down
		homePage.selectSearchValue("Books");
		// Search with ‘data catalog’ text
		SearchResultsPage resultsPage = homePage.searchWithText("data catalog");
		// Click on first product
		ProductDetailsPage detailsPage = resultsPage.selectFirstProduct();
		detailsPage.printProductDetails();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
