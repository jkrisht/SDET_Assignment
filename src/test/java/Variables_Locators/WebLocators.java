package Variables_Locators;

import org.openqa.selenium.By;

public class WebLocators {
	
	// 'All' search button
	public static By homePage_search_All	 			= By.cssSelector("div[id='nav-search-dropdown-card'] div[class*='search-facade']");
	// Categories dropdown
	public static By homePage_search_dropdown 			= By.id("searchDropdownBox");
	// Search box element
	public static By homePage_search_box 				= By.cssSelector("input[id='twotabsearchtextbox']");
	
	// Product titles in search results page
	public static By searchPage_first_product_title 	= By.cssSelector("a h2");
	public static By searchPage_first_product_title_1 	= By.cssSelector("h5 a span");

	// Product details - book titles
	public static By productDetails_title 				= By.id("ebooksProductTitle");
	public static By productDetails_title_1 			= By.id("productTitle");
	
	public static By productDetails_authors				= By.cssSelector("div[id='bylineInfo'] a[class*='contributorNameID']");
	// 'Kindle', 'Paperback' etc
	public static By productDetils_tabs					= By.cssSelector("span[class='a-size-large mediaTab_title']");
	//'Paperback' book prices
	public static By productDetils_paperback_new_price	= By.cssSelector("div[id='newOfferAccordionRow'] span[class*='header-price']");
	public static By productDetils_paperback_old_price	= By.cssSelector("div[id='usedOfferAccordionRow'] span[class*='header-price']");
	
	// Book price if only new book available
	public static By productDetils_book_price			= By.cssSelector("div[id='mediaNoAccordion'] span[class*='header-price']");
	
}
