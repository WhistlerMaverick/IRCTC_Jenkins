package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseActions.PageActions;
import Bindings.Hooks;

public class Nyka_homepage extends Hooks {

//	Locators
	public static WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
//	Methods
	public static void ClickAndEnterTextOnSearchBar(String searchText) {
		PageActions.Click(searchBar);
		PageActions.SendKeys(searchBar, searchText);
	}
	
	public static void EnterIntoSearchBar() {
		PageActions.EnterKey(searchBar);
	}
	
}
