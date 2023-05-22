package Bindings;

import java.util.List;

import io.cucumber.datatable.DataTable;
//import Pages.Nyka_homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nyka_search_binding {

	public String SearchText = "Tshirt";

	@Given("I am a background task")
	public void i_am_a_background_task() {
	}

	@Given("I am a customer who launched the website to buy a tshirt")
	public void i_am_a_customer_who_launched_the_website_to_buy_a_tshirt(DataTable dataTable) {
		List<List<String>> li = dataTable.asLists(String.class);
		System.out.println(li.get(0).get(0) + " " + li.get(0).get(1));
	}

	@When("I am searching into the seach bar by typing tshirt")
	public void i_am_searching_into_the_seach_bar_by_typing_tshirt() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("Hit enter key to search")
	public void hit_enter_key_to_search() {
		// Write code here that turns the phrase above into concrete actions
//		Nyka_homepage.EnterIntoSearchBar();
	}

	@Then("I must be able to see tshirt in my products page")
	public void i_must_be_able_to_see_tshirt_in_my_products_page() {
		// Write code here that turns the phrase above into concrete actions
	}
}
