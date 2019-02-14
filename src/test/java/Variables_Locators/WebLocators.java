package Variables_Locators;

import org.openqa.selenium.By;

public class WebLocators {

	public static By homePage_search_dropdown 			= By.id("searchDropdownBox");

	public static By homePage_search_box 				= By.cssSelector("input[id='twotabsearchtextbox']");
	
	public static By searchPage_first_product_title 	= By.cssSelector("a h2");
	public static By searchPage_first_product_title_1 	= By.cssSelector("h5 a span");

	// Product details
	public static By productDetails_title 				= By.id("ebooksProductTitle");
	public static By productDetails_title_1 			= By.id("productTitle");
	
	public static By productDetails_authors				= By.cssSelector("div[id='bylineInfo'] a[class*='contributorNameID']");
	// 'Kindle', 'Paperback' etc
	public static By productDetils_tabs					= By.cssSelector("span[class='a-size-large mediaTab_title']");
	//'Paperback' book prices
	public static By productDetils_paperback_new_price	= By.cssSelector("div[id='newOfferAccordionRow'] span[class*='header-price']");
	public static By productDetils_paperback_old_price	= By.cssSelector("div[id='usedOfferAccordionRow'] span[class*='header-price']");
	
	// 'Kindle' edition price
	public static By productDetils_kindle_price			= By.cssSelector("div[id='mediaNoAccordion'] span[class*='header-price']");
	
}
