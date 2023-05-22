package BaseActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class PageActions {
	
//	Click
	public static void Click(WebElement ele) {
		ele.click();
	}
	
//	SendKeys
	public static void SendKeys(WebElement ele, String content) {
		ele.sendKeys(content);
	}
	
// EnterKey
	public static void EnterKey(WebElement ele) {
		ele.sendKeys(Keys.ENTER);
	}
}
