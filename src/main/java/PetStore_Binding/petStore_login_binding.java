package PetStore_Binding;

import static org.testng.Assert.assertEquals;

import java.util.List;

import Pages.PetStoreHomePage;
import Pages.PetStore_SignIn_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class petStore_login_binding {
	@Given("I am a user who launched the homepage of JPetStore")
	public void i_am_a_user_who_launched_the_homepage_of_j_pet_store() {
		// Write code here that turns the phrase above into concrete actions
// Page gets launched automatically through hooks class
	}

	@When("I click on the SignIn link")
	public void i_click_on_the_sign_in_link() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnSignInLink();
	}

	@Then("SignIn page should be opened")
	public void sign_in_page_should_be_opened() {
		// Write code here that turns the phrase above into concrete actions
		String signInText = PetStore_SignIn_Page.IsSignInPageVisible();
		assertEquals(signInText, "Please enter your username and password.");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		PetStore_SignIn_Page.typeIntoUserName(string);
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		// Write code here that turns the phrase above into concrete actions
//		Let the password be the same as the default
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		PetStore_SignIn_Page.ClickOnLoginBtn();
	}

	@Then("I should be logged in with my account")
	public void i_should_be_logged_in_with_my_account() {
		// Write code here that turns the phrase above into concrete actions
		String userName = PetStore_SignIn_Page.GetUserName();
		assertEquals(userName, "Welcome ABC!");
	}

	@When("I enter the username")
	public void i_enter_the_username(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> li = dataTable.asLists(String.class);
		PetStore_SignIn_Page.typeIntoUserName(li.get(1).get(0));
	}

	@When("I click on Fish link")
	public void i_click_on_fish_link() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnFishLink();
	}

	@When("I click on FI-SW-{int}")
	public void i_click_on_fi_sw(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnFishType();
	}

	@When("I click on EST-{int}")
	public void i_click_on_est(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnItemId(int1);
	}

	@When("I click on Add to Cart")
	public void i_click_on_add_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnAddCart();
	}

	@When("I click on Proceed to Checkout")
	public void i_click_on_proceed_to_checkout() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnCheckOut();
	}

	@When("I click on Continue")
	public void i_click_on_continue() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnContinueBtn();
	}

	@When("I click on Confirm")
	public void i_click_on_confirm() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnConfirmBtn();
	}

	@Then("My order must be placed")
	public void my_order_must_be_placed() {
		// Write code here that turns the phrase above into concrete actions
		boolean isOrderPlaced = PetStoreHomePage.CheckIfOrderPlaced();
		assertEquals(isOrderPlaced, true);
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {
		// Write code here that turns the phrase above into concrete actions
		PetStore_SignIn_Page.typeIntoUserName(string);
	}

	@When("I click on Bird link")
	public void i_click_on_bird_link() {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnBirdLink();
	}

	@When("I click on AV-CB-{int}")
	public void i_click_on_av_cb(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		PetStoreHomePage.ClickOnBirdType();
	}

}
