package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class MiniCartSteps extends DriverFactory{
	
	
	@When("^User clicks addtocart button on the product under pdp page$")
	public void user_clicks_addtocart_button_on_the_product_under_pdp_page() throws Throwable {
		miniCartPage.addToCartButton();
	}

	@Then("^User get success message and product successfully added to the cart$")
	public void user_get_success_message_and_product_successfully_added_to_the_cart() throws Throwable {
		miniCartPage.successMessage();
	}

	@When("^User clicks on the minicart$")
	public void user_clicks_on_the_minicart() throws Throwable {
		miniCartPage.miniCartOpen();
	}

	@Then("^Cart should have added product count and cart item total and cart symbol count should match$")
	public void cart_should_have_added_product_count_and_cart_item_total_and_cart_symbol_count_should_match() throws Throwable {
		miniCartPage.miniCartCount();
	}

	@When("^User clicks on the proceed to checkout button on minicart$")
	public void user_clicks_on_the_proceed_to_checkout_button_on_minicart() throws Throwable {
		miniCartPage.proceedToCheckOut();
	}
  
	@Then("^User should get popup window checkout as new customer$")
	public void user_should_get_popup_window_checkout_as_new_customer() throws Throwable {
		miniCartPage.checkOutNewCustomerPopUpWindow();
	}

	
	@Then("^User placed under checkout$")
	public void user_placed_under_checkout() throws Throwable {
		miniCartPage.checkoutPage();
	}
	
	@Then("^New user placed under payment method$")
	public void new_user_placed_under_payment_method() throws Throwable {
		miniCartPage.paymentMethodCheckOutPage();
	}


/*	@When("^User clicks back Navigation$")
	public void user_clicks_back_Navigation() throws Throwable {
		miniCartPage.naviagateBack();
	}*/
	@Then("^User place under homepage$")
	public void user_place_under_homepage() throws Throwable {
		miniCartPage.homePage();
	}
	
    @When("^User clicks on the productname link on the mini cart$")
	public void user_clicks_on_the_productname_link_on_the_mini_cart() throws Throwable {
    	miniCartPage.clickProductLinkMiniCart();
	}

	@Then("^User should place under pdp page of that product$")
	public void user_should_place_under_pdp_page_of_that_product() throws Throwable {
		miniCartPage.pdpPage();
	}

	@When("^User selects Quantity text field and update the Quantity$")
	public void user_selects_Quantity_text_field_and_update_the_Quantity() throws Throwable {
		miniCartPage.qtyUpdate();
	}

	@Then("^User should see enable update button$")
	public void user_should_see_enable_update_button() throws Throwable {
		miniCartPage.enableUpdateBtn();
	}

	@When("^User clicks on update button$")
	public void user_clicks_on_update_button() throws Throwable {
		miniCartPage.clickUpdateBtn();
	}

	@Then("^Quantity should be updated with new quantity$")
	public void quantity_should_be_updated_with_new_quantity() throws Throwable {
		miniCartPage.qtyAndCartCount();
	}

	@When("^User selects the edititem link$")
	public void user_selects_the_edititem_link() throws Throwable {
		miniCartPage.editLinkCart();
	}

	@Then("^User place under pdp page$")
	public void user_place_under_pdp_page() throws Throwable {
		miniCartPage.pdpPage();
		miniCartPage.getPdpPageUpdate();
	}

	@Then("^Update cart button are available$")
	public void update_cart_button_are_available() throws Throwable {
		miniCartPage.getPdpPageUpdate();
	}

	@When("^User selects Quantity text field$")
	public void user_selects_Quantity_text_field() throws Throwable {
		miniCartPage.captureQty();
	}

	@When("^Click on update cart button$")
	public void click_on_update_cart_button() throws Throwable {
		miniCartPage.updateCartBtn();
	}

	@Then("^User place under shopping cart page and updated quantity should display$")
	public void user_place_under_shopping_cart_page_and_updated_quantity_should_display() throws Throwable {
		miniCartPage.getShippingCartPage();
	}

	@Then("^Success message should be displayed$")
	public void success_message_should_be_displayed() throws Throwable {
		miniCartPage.successMessageUpdateCart();
	}

	@Then("^Qty should be match to the shopping cart page quantity$")
	public void qty_should_be_match_to_the_shopping_cart_page_quantity() throws Throwable {
		miniCartPage.validationQty();
	}

	@When("^User clicks View and Edit Cart link$")
	public void user_clicks_View_and_Edit_Cart_link() throws Throwable {
		miniCartPage.clickViewAndEditCartLink();
	}

	@When("^User clicks on the close button on the cart$")
	public void user_clicks_on_the_close_button_on_the_cart() throws Throwable {
		miniCartPage.clicksCloseBtnOnCart();
	}

	@Then("^Cart should close$")
	public void cart_should_close() throws Throwable {
		miniCartPage.getCartClose();
	}

	@Then("^Mini cart should open$")
	public void mini_cart_should_open() throws Throwable {
		miniCartPage.getCartOpen();
	}

	@When("^User clicks on delete link$")
	public void user_clicks_on_delete_link() throws Throwable {
		miniCartPage.clicksDeleteOnMiniCart();
	}

    @Then("^Popup window should display for mini cart deletion$")
    public void popup_window_should_display_for_mini_cart_deletion() throws Throwable {
    	miniCartPage.miniCartPopUp();
     }

	@Then("^Popup window closed and minicart still open$")
	public void popup_window_closed_and_minicart_still_open() throws Throwable {
		miniCartPage.popUpClosedAndCartOpen();
	}

	@Then("^Cart should be empty and following msg should show on the cart You have no items in your shopping cart$")
	public void cart_should_be_empty_and_following_msg_should_show_on_the_cart_You_have_no_items_in_your_shopping_cart() throws Throwable {
		miniCartPage.miniCartEmpty();
	}
	@When("^User click Cancel button the popup window on mini cart$")
	public void user_click_Cancel_button_the_popup_window_on_mini_cart() throws Throwable {
		miniCartPage.cancelMiniCartButtonPopUp();
	}
	
	
	@When("^User clicks ok button on the popup window for minicart deletion$")
	public void user_clicks_ok_button_on_the_popup_window_for_minicart_deletion() throws Throwable {
		miniCartPage.OkMiniCartButtonPopUp();
	}

	@Then("^Popup window will be closed after deleting products$")
	public void popup_window_will_be_closed_after_deleting_products() throws Throwable {
		miniCartPage.popUpCloseOkBtn();
	}
}