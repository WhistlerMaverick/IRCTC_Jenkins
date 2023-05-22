package BaseFolder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static String URL = "https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void Start() {
		System.setProperty("webdriver.gecko.driver","/Users/RA20463861/Documents/GeckoDriver/geckodriver");
		driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
		driver.get(URL);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	@AfterTest
	public void End() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
}
