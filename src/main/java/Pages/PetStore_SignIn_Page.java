package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseActions.PageActions;
import PetStore_Binding.Hooks;

public class PetStore_SignIn_Page extends Hooks {
	
//	Methods
//	Check if signIn page is visible
	public static String IsSignInPageVisible() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[normalize-space()='Please enter your username and password.']")));
		WebElement signInPageText = driver.findElement((By.xpath("//p[normalize-space()='Please enter your username and password.']")));		
		return signInPageText.getText();
	}
	
//	Type the userName
	public static void typeIntoUserName(String userName) {
		WebElement userNameField = driver.findElement(By.xpath("//p[2]/input[1]"));
		PageActions.SendKeys(userNameField, userName);
	}
	
//	Click on the login button
	public static void ClickOnLoginBtn() {
		WebElement loginBtn = driver.findElement(By.name("signon"));
		PageActions.Click(loginBtn);
	}
	
//	Get userName
	public static String GetUserName() {
		WebElement userNameText = driver.findElement(By.id("WelcomeContent"));
		return userNameText.getText()
;	}
}
