package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import BaseFolder.BaseClass;
import Pages.Homepage;

public class HomePageTest extends BaseClass {
		
//	Select "Chennai" in "From" field
	@Test
	public void TC1() throws InterruptedException {
		Homepage.clickOnFormField();
	}

//	Select "Pune" in "To" field
	@Test
	public void TC2() {
		Homepage.clickOnToField();
	}
	
//	Select a date
	@Test
	public void TC3() {
		Homepage.selectDate();
	}
	
//	Select a class
	@Test
	public void TC4() {
		Homepage.selectClass();
	}
	
//	Select compartment
	@Test
	public void TC5() {
		Homepage.selectCompartment();
	}
	
//	Select "Person with disability concession" checkBox
	@Test
	public void TC6() throws InterruptedException {
		Homepage.selectPersonDisablityCheck();
	}
	
//	Click on the "Search" button
	@Test
	public void TC7() {
		Homepage.clickSubmit();
	}

}
