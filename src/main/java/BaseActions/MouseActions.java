package BaseActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseFolder.BaseClass;

public class MouseActions extends BaseClass {

	public static Actions act = new Actions(driver);

//		Click
	public static void Click(WebElement ele) {
		act.moveToElement(ele).click().build().perform();
	}

}
