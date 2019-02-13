package WebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables_Locators.WebLocators;
import baseActions.BaseActions;

public class ProductDetailsPage extends BaseActions {
	
	WebDriver driver;
	WebElement kindleTab_element;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void printProductDetails() {
		
		// Print book title
		if(verifyElement(WebLocators.productDetails_title)) {
			System.out.println("Book Title: "+super.locateElement(WebLocators.productDetails_title).getText());
		}else {
			System.out.println("Book Title: "+super.locateElement(WebLocators.productDetails_title_1).getText());
		}
		
		// Print book author(s) name
		List<WebElement> elements = super.locateElements(WebLocators.productDetails_authors);
		if(!(elements.size() == 0)) {
			String authors = "";
			
			for (WebElement webElement : elements) {
				authors = authors + webElement.getText()+", ";
			}
		
			System.out.println("Book Author(s): "+authors);
		}
		
		// Print book available types
		List<WebElement> elements2 = super.locateElements(WebLocators.productDetils_tabs);
		String bookTypes = "";
		if(!(elements.size() == 0)) {
			for (WebElement webElement : elements2) {
				if(webElement.getText().contains("Paperback")) {
					bookTypes = bookTypes + webElement.getText()+", ";
				}else if(webElement.getText().contains("Kindle")) {
					kindleTab_element = webElement;
					bookTypes = bookTypes + webElement.getText()+", ";
				}else if(webElement.getText().contains("Hardcover")) {
					bookTypes = bookTypes + webElement.getText()+", ";
				}
			}
			System.out.println("Book Types: "+ bookTypes);
		}
		
		// Print book prices
		if(bookTypes.contains("Paperback")) {
			// Print new book price
			if(super.verifyElement(WebLocators.productDetils_paperback_new_price)) {
				System.out.println("Paperback new price: "+super.locateElement(WebLocators.productDetils_paperback_new_price).getText());
			}
			
			// Print old book price
			if(super.verifyElement(WebLocators.productDetils_paperback_old_price)) {
				System.out.println("Paperback old price: "+super.locateElement(WebLocators.productDetils_paperback_old_price).getText());
			}
		}
		
		// Kindle price
		if(bookTypes.contains("Kindle")) {
			// Click on 'Kindle' tab
			kindleTab_element.click();
			// Wait for the element
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(locateElement(WebLocators.productDetils_kindle_price)));
			// Print book price
			System.out.println("Kindle price: "+super.locateElement(WebLocators.productDetils_kindle_price).getAttribute("innerHTML"));
		}
		
		System.out.println();
	}
	
}
