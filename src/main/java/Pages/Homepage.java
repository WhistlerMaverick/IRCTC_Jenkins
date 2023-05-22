package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseActions.KeyBoardActions;
import BaseActions.MouseActions;
import BaseFolder.BaseClass;

public class Homepage extends BaseClass {

//	Locators
	public static WebElement fromField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
	public static WebElement toField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
	public static WebElement dateField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/input"));
	public static WebElement classField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[2]/p-dropdown/div/div[2]/span"));
	public static WebElement compartmentField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[3]/div/div/p-dropdown/div"));
	public static WebElement submitSearch = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
	public static WebElement personDisablityCheck = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[1]/label"));
	
//	Methods
	
//	Select value in "To" field
	public static void clickOnFormField() {
		MouseActions.Click(fromField);
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyEnter();
	}
	
//	Select value in "From" field
	public static void clickOnToField() {
		MouseActions.Click(toField);
		MouseActions.Click(toField);
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyEnter();
	}
	
//	Select a date in "DD/MM/YYYY" field
	public static void selectDate() {
		MouseActions.Click(dateField);
		WebElement date = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/div/div/div[2]/table/tbody/tr[5]/td[4]/a"));
		MouseActions.Click(date);
	}
	
//	Select a class from "Class" field
	public static void selectClass() {
		MouseActions.Click(classField);
		MouseActions.Click(classField);
		MouseActions.Click(classField);
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyEnter();
	}
	
//	Select a compartment from "Compartment field
	public static void selectCompartment() {
		MouseActions.Click(compartmentField);
		KeyBoardActions.KeyDownArrow();
		KeyBoardActions.KeyEnter();
		KeyBoardActions.KeyEnter();
	}
	
//	Select "Person with disablity concession" checkbox
	public static void selectPersonDisablityCheck() throws InterruptedException {
		MouseActions.Click(personDisablityCheck);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/p-confirmdialog/div/div/div[3]/button/span[2]"))));
		WebElement confirmBtnPopUp = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/p-confirmdialog/div/div/div[3]/button/span[2]"));

		MouseActions.Click(confirmBtnPopUp);
	}
	
	
//	Click on the submit button
	public static void clickSubmit() {
		submitSearch.submit();
	}
	
}
