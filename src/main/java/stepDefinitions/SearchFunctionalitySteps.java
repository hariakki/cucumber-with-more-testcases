package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class SearchFunctionalitySteps extends DriverFactory{
	@When("^user enters valid \"([^\"]*)\" product name$")
	public void user_enters_valid_product_name(String productname) throws Throwable {
		searchFunctionalityPage.enterProductName(productname);	
	}
	@And("^user clicks on the Search Icon$")
	public void user_clicks_on_the_Search_Icon() throws Throwable {
		searchFunctionalityPage.clickSearchIcon();	
	}
	
	@Then("^user placed under product listing page$")
	public void user_placed_under_product_listing_page() throws Throwable {
		searchFunctionalityPage.seeProductListingPage();	
	}
	
	@Then("^user sees \"([^\"]*)\"$")
	public void user_sees(String productname) throws Throwable {
		searchFunctionalityPage.seeProductName();	
	}

	@And("^user sees reviews$")
	public void user_sees_reviews() throws Throwable {
		searchFunctionalityPage.seeReviews();	
	}

	@And("^user sees price$")
	public void user_sees_price() throws Throwable {
		searchFunctionalityPage.seePrice();	
	}

	@And("^user sees sizes$")
	public void user_sees_sizes() throws Throwable {
		searchFunctionalityPage.seeSizes();	
	}
}


