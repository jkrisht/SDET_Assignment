package baseActions;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BaseActions {

	static WebDriver driver;

	// Launch browser
	public static WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			// Set chrome driver path details
			File file = new File("src/test/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			// Create webdriver (chrome) instance
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			// Set chrome driver path details
			File file = new File("src/test/resources/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			// Create webdriver (Firefox) instance
			driver = new FirefoxDriver();
		} else {
			Assert.assertTrue(false,
					"You have given invlid browser name. Please enter valid browser name (chrome or firefox).");
		}

		// Maximize the browser
		driver.manage().window().maximize();

		return driver;
	}

	// Locate given element
	public static WebElement locateElement(By by) {

		WebElement element = null;

		try {
			element = driver.findElement(by);
		} catch (NoSuchElementException noSuchElementException) {
			throw new NoSuchElementException("Element not found");
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return element;
	}
	
	// Locate given element
	public static List<WebElement> locateElements(By by) {

		List<WebElement> elements = null;

		try {
			elements = driver.findElements(by);
		} catch (NoSuchElementException noSuchElementException) {
			throw new NoSuchElementException("Element not found");
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return elements;
	}
	
	// Verify the given element is located or not and return the status
	public static boolean verifyElement(By by) {
		
		boolean status = false;
		
		try {
			driver.findElement(by);
			status = true;
		} catch (Exception exception) {
			status = false;
		}

		return status;
	}
	
	// Click an element using JavaScript
	public static void clickUsingJS(By by) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", locateElement(by));
	}
	
}
