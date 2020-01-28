package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class addAllToCartViaWishlistPageSteps extends DriverFactory{

	

@When("^user click add all to cart$")
public void user_click_add_all_to_cart() throws Throwable {
	wishlistPage.userClickAddAllToCartVaWishlistButton();
}

@And("^user see add all to cart from wishlist success message$")
public void user_see_add_all_to_cart_from_wishlist_success_message() throws Throwable {
	wishlistPage.userSeeAddAllToCartViaWishlistSuccessMessage();
}

@Then("^user see item added to mini cart$")
public void user_see_item_added_to_mini_cart() throws Throwable {
	wishlistPage.userSeeItemAddedToCart();
}

}
