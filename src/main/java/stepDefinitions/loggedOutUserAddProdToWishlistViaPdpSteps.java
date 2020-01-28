package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class loggedOutUserAddProdToWishlistViaPdpSteps extends DriverFactory{

	
	@When("^user click Selene Yoga Hoodie$")
	public void user_click_Selene_Yoga_Hoodie() throws Throwable {
		wishlistPage.userClicksSeleneYogaHoodieButton();
	}

	@Then("^user see Selene Yoga Hoodie pdp page title$")
	public void user_see_Selene_Yoga_Hoodie_pdp_page_title() throws Throwable {
		wishlistPage.userSeeSeleneYogaHoodiePdpPageTitle();
	}

	@When("^user click add to wishlist on pdp Selene Yoga Hoodie$")
	public void user_click_add_to_wishlist_on_pdp_Selene_Yoga_Hoodie() throws Throwable {
		wishlistPage.userClicksSeleneYogaHoodieAddToWishlistPdpButton();
	}
}
