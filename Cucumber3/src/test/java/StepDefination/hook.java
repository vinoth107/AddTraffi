package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook {
	
    public static WebDriver driver;
	
	@Before()
	public static void luncher() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\VINOTH KUMAR\\git\\repository2\\Cucumber3\\driver\\geckodriver.exe");
    driver = new FirefoxDriver();
	
	
	}
	@After()
	public static void quit() {
		driver.quit();
	}

	
}


