package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class PdpPageLoggedOutUserSteps extends DriverFactory {

	@When("^user click fusion backpack$")
	public void user_click_fusion_backpak() throws Throwable {
		pdpPage.userClicksFusionBackpack();
		
	}

	@Then("^user see pdp page title$")
	public void user_see_pdp_page_title() throws Throwable {
		pdpPage.userSeeFusionPageTitle();
	}

	@And("^user see price$")
	public void user_see_price() throws Throwable {
		pdpPage.userSeeProductPrice();
	}

	@And("^user see in stock$")
	public void user_see_in_stock() throws Throwable {
		pdpPage.userSeeStock(); 
	}

	@And("^user see SKU$")
	public void user_see_SKU() throws Throwable {
		pdpPage.userSeeSku();
	}

	@And("^user see QTY text$")
	public void user_see_QTY_text() throws Throwable {
		pdpPage.userSeeQty();
	}

	@And("^user see QTY amount box$")
	public void user_see_QTY_amount_box() throws Throwable {
		pdpPage.userSeeQtyAmount(); 
	}

	@And("^user see add to cart button$")
	public void user_see_add_to_cart_button() throws Throwable {
		pdpPage.userSeeAddToCartButton();
	}

	@And("^user see add to wishlist button$")
	public void user_see_add_to_wishlist_button() throws Throwable {
		pdpPage.userSeeWishlistButton();
	}

	@And("^user see add to add to compare button$")
	public void user_see_add_to_add_to_compare_button() throws Throwable {
		pdpPage.userSeeAddToCompareButton();
	}

	@And("^user see email button$")
	public void user_see_email_button() throws Throwable {
		pdpPage.userSeeEmailButton();
	}

	@And("^user see details tab$")
	public void user_see_details_tab() throws Throwable {
		pdpPage.userSeeDetailsTab();
	}

	@And("^user see more information tab$")
	public void user_see_more_information_tab() throws Throwable {
		pdpPage.userSeeMoreInformationTab();
	}

	@And("^user see reviews tab$")
	public void user_see_reviews_tab() throws Throwable {
		pdpPage.userSeeReviewsTab();
	}


}
