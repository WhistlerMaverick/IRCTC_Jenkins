package BaseActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import BaseFolder.BaseClass;

public class KeyBoardActions extends BaseClass {
	
	public static Actions act = new Actions(driver);
	
//	Send value
	public static void SendValue(String content) {
		act.sendKeys(content).build().perform();;
	}
	
//	KeyDown
	public static void KeyDownArrow() {
		act.sendKeys(Keys.ARROW_DOWN).build().perform();;
	}
	
//	Enter key
	public static void KeyEnter() {
		act.sendKeys(Keys.ENTER).build().perform();;
	}
	
}
