package PetStore_Binding;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String URL = "https://petstore.octoperf.com/actions/Catalog.action";

	@Before
	public void Start() {
		System.setProperty("webdriver.gecko.driver", "/Users/RA20463861/Documents/GeckoDriver/geckodriver");
		driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get(URL);
	}

	@After
	public void End() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
