package stepDefinitions;





 

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class loggedInUserAddProdToWishlistViaCategoryPlpSteps extends DriverFactory{
	
	@And("^user click size xs$")
	public void user_click_size_xs() throws Throwable {
		wishlistPage.userClicksSizeXSButton();
	}

	@And("^user click orrange colour$")
	public void user_click_orrange_colour() throws Throwable {
		wishlistPage.userClicksOrangeColourButton();
	}

	@Then("^user see add product to wishlist success message$")
	public void user_see_add_product_to_wishlist_success_message() throws Throwable {
		wishlistPage.userSeeSuccessMessageProductAddedToWishlist();
	}

	@And("^user see Selene Yoga Hoodie product if in wishlist on wishlist page$")
	public void user_see_Selene_Yoga_Hoodie_product_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeProductListedInWishlist();
	}

	@And("^user see close button if in wishlist on wishlist page$")
	public void user_see_close_button_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeCloseIfInWishlistButton();
	} 

	@And("^user see go to wishlist button if in wishlist on wishlist page$")
	public void user_see_go_to_wishlist_button_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeUpdateWishlistButton();
	}

	@And("^user see price of item if in wishlist on wishlist page$")
	public void user_see_price_of_item_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeSeleneYogaHoodiePrice();
	}

	@And("^user see add to cart button if in wishlist on wishlist page$")
	public void user_see_add_to_cart_button_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeAddToCartIfInWishlistButton();
	}

	@And("^user see item picture if in wishlist on wishlist page$")
	public void user_see_item_picture_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeSeleneYogaHoodieProductImage();
	}

	@And("^user see qty of items if in wishlist on wishlist page$")
	public void user_see_qty_of_items_if_in_wishlist_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeSeleneYogaHoodieProductQty();
	}
	 

	@And("^user see see update wishlit button$")
	public void user_see_see_update_wishlit_button() throws Throwable {
		wishlistPage.userSeeUpdateWishlistButton();
	}

	@And("^user see see share wishlit button$")
	public void user_see_see_share_wishlit_button() throws Throwable {
		wishlistPage.userSeeShareWishlistButton();
	}
	
	@And("^user see details button$")
	public void user_see_details_button() throws Throwable {
		wishlistPage.userSeeDetailsButton();
		
		
	}
	@Then("^user see add to cart button on wishlist page$")
	public void user_see_add_to_cart_button_on_wishlist_page() throws Throwable {
		wishlistPage.userSeeAddToCartViaWishlistPageButton();
		
	}
	@When("^user clicks remove button$")
	public void user_clicks_remove_button() throws Throwable {
		wishlistPage.userClickCloseButton();
	}

	@Then("^user see removed product from wishlist success message$")
	public void user_see_removed_product_from_wishlist_success_message() throws Throwable {
		wishlistPage.userSeeItemSuccessfullyRemovedFromWishlistMessage();
	}
	
	@When("^user click share wihslist button$")
	public void user_click_share_wihslist_button() throws Throwable {
		wishlistPage.userClicksShareWishlistButtonViaWishlistPage();
	}

	@Then("^user see Wish List Sharing page title$")
	public void user_see_Wish_List_Sharing_page_title() throws Throwable {
		wishlistPage.userSeeWishlistSharingTitle();
	}

	@And("^user see Sharing Information$")
	public void user_see_Sharing_Information() throws Throwable {
		wishlistPage.userSeeSharingInformationText();
	}

	@And("^user see Email addresses, separated by commas$")
	public void user_see_Email_addresses_separated_by_commas() throws Throwable {
		wishlistPage.userSeeEmailText();
	}

	@And("^user see Email addresses, separated by commas textbox$")
	public void user_see_Email_addresses_separated_by_commas_textbox() throws Throwable {
		wishlistPage.userSeeEmailTextbox();
	}

	@And("^user see Message$")
	public void user_see_Message() throws Throwable {
		wishlistPage.userSeeEMessageText();
	}

	@And("^user see Message textbox$")
	public void user_see_Message_textbox() throws Throwable {
		wishlistPage.userSeeEMessageTextbox();
	}

	@Then("^user see share wishlist button$")
	public void user_see_share_wishlist_button() throws Throwable {
		wishlistPage.userSeeShareWishlistViWishlistPageButton();
	}



	@When("^user click share wishlist button$")
	public void user_click_share_wishlist_button() throws Throwable {
		wishlistPage.userSeeShareWishlistViWishlistPageButton();
	}

	@Then("^user see wishlist shared suucess message$")
	public void user_see_wishlist_shared_suucess_message() throws Throwable {
		wishlistPage.userClickShareWishlistButtonWishlistPageButton();
	}
	
	@When("^user enter data in addresses, separated by commas textbox$")
	public void user_enter_data_in_addresses_separated_by_commas_textbox(DataTable emailData) throws Throwable {
		wishlistPage.userEnterEmailShare(emailData, 0, 1);
		
		  
	}
 
	@And("^user enter data in Message textbox$")
	public void user_senter_data_in_Message_textbox(DataTable messageData) throws Throwable {
		wishlistPage.userEnterMessageShare(messageData, 0, 1);
		
		 
	} 
}
	
  


