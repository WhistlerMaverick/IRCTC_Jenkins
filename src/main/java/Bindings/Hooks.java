package Bindings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	public static String URL = "https://www.nykaa.com/";

	@Before
	public void Start() {
		System.setProperty("webdriver.gecko.driver", "/Users/RA20463861/Documents/GeckoDriver/geckodriver");
		driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
	}

	@After
	public void End() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
