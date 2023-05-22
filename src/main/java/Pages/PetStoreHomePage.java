package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseActions.PageActions;
import PetStore_Binding.Hooks;

public class PetStoreHomePage extends Hooks {

//	Methods
//	Click on signIn link
	public static void ClickOnSignInLink() {
		WebElement signIn = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		PageActions.Click(signIn);
	}
	
//	Click on fish
	public static void ClickOnFishLink() {
		WebElement fishLink = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		PageActions.Click(fishLink);
	}
	
//	Click on F1-SW-01
	public static void ClickOnFishType() {
		WebElement fishType = driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']"));
		PageActions.Click(fishType);
	}
	
//	Click on EST-1
	public static void ClickOnItemId(int int1) {
		WebElement itemId = driver.findElement(By.xpath("//a[normalize-space()='EST-" + int1 + "']"));
		PageActions.Click(itemId);
	}
	
//	Click on add to cart
	public static void ClickOnAddCart() {
		WebElement addToCartBtn = driver.findElement(By.xpath("//a[@class='Button']"));
		PageActions.Click(addToCartBtn);
	}
	
//	Click on proceed to check out
	public static void ClickOnCheckOut() {
		WebElement checkOutBtn = driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']"));
		PageActions.Click(checkOutBtn);
	}
	
//	Click on continue
	public static void ClickOnContinueBtn() {
		WebElement continueBtn = driver.findElement(By.xpath("//input[@name='newOrder']"));
		PageActions.Click(continueBtn);
	}

//	Click on confirm
	public static void ClickOnConfirmBtn() {
		WebElement confirmBtn = driver.findElement(By.xpath("//a[@class='Button']"));
		PageActions.Click(confirmBtn);
	}
	
//	Check if the order has been placed
	public static boolean CheckIfOrderPlaced() {
		WebElement orderPlaced = driver.findElement(By.xpath("//li[normalize-space()='Thank you, your order has been submitted.']"));
		if (orderPlaced.getText().equals("Thank you, your order has been submitted.")) return true;
		return false;
	}
	
//	Click on Birds
	public static void ClickOnBirdLink() {
		WebElement birdLink = driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']"));
		PageActions.Click(birdLink);
	}
	
//	Click on birdType
	public static void ClickOnBirdType() {
		WebElement birdType = driver.findElement(By.xpath("//a[normalize-space()='AV-CB-01']"));
		PageActions.Click(birdType);
	}
		
}
