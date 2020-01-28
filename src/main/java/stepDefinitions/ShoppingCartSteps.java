package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ShoppingCartSteps extends DriverFactory {
	
	
	@When("^User navigate to the shopping cart page$")
	public void user_navigate_to_the_shopping_cart_page() throws Throwable {
		shoppingCartPage.captureShoppingCartUrl();
	}

	@Then("^User placed under shopping cart page$")
	public void user_placed_under_shopping_cart_page() throws Throwable {
		shoppingCartPage.getShoppingCartPage();
	}


	@Then("^User should see product information table section under shopping cart page$")
	public void user_should_see_product_information_table_section_under_shopping_cart_page() throws Throwable {
		shoppingCartPage.productInformationTableVal();
	}

	@Then("^User should see summary table section under shopping cart page$")
	public void user_should_see_summary_table_section_under_shopping_cart_page() throws Throwable {
		shoppingCartPage.summaryTabelVal();
	}

	@Then("^User should see apply discount code section under shopping cart page$")
	public void user_should_see_apply_discount_code_section_under_shopping_cart_page() throws Throwable {
		shoppingCartPage.applyDisscountCodeVal();
	}

	@When("^User clicks Apply Discount Code$")
	public void user_clicks_Apply_Discount_Code() throws Throwable {
		shoppingCartPage.clickApplyDiscountCode();
	}

	@Then("^Apply discount code textfield, apply discount buttons should dispaly$")
	public void apply_discount_code_textfield_apply_discount_buttons_should_dispaly() throws Throwable {
		shoppingCartPage.getApplyDiscountCode();
	}

	@When("^User clicks Estimate Shipping and Tax drop down$")
	public void user_clicks_Estimate_Shipping_and_Tax_drop_down() throws Throwable {
		shoppingCartPage.clickEstimateShippingandTaxDropdown();
	}

	@Then("^Country,zip postal code fields should display$")
	public void country_zip_postal_code_fields_should_display() throws Throwable {
		shoppingCartPage.getEstimateShippingFields();
	}

	@When("^User selects the qty textfield and clear the textfield$")
	public void user_selects_the_qty_textfield_and_clear_the_textfield() throws Throwable {
		shoppingCartPage.clearQty();
	}

	@When("^User capture qty into textfield$")
	public void user_capture_qty_into_textfield() throws Throwable {
		shoppingCartPage.captureQty();
	}

	@When("^User clicks update shopping cart button$")
	public void user_clicks_update_shopping_cart_button() throws Throwable {
		shoppingCartPage.updateShoppingCartBtn();
	}

	@When("^User clicks edit link$")
	public void user_clicks_edit_link() throws Throwable {
		shoppingCartPage.editLinkShoppingCart();
	}

	@When("^User clicks on proceed to checkout button on shopping cart page$")
	public void user_clicks_on_proceed_to_checkout_button_on_shopping_cart_page() throws Throwable {
		shoppingCartPage.clickProceedtoCheckoutBtn();
	}

	@When("^User clicks checkout with multiple addresses link$")
	public void user_clicks_checkout_with_multiple_addresses_link() throws Throwable {
		shoppingCartPage.clickCheckOutWithMultipleAddress();
	}

	@Then("^User place under ship to multiple addresses magento commerce page$")
	public void user_place_under_ship_to_multiple_addresses_magento_commerce_page() throws Throwable {
		shoppingCartPage.getShipMutipleAddressesPage();
	}


	@When("^User clicks on apply discount button$")
	public void user_clicks_on_apply_discount_button() throws Throwable {
		shoppingCartPage.clickApplyDiscountBtn();  
	}

	@Then("^Required field message should be dispalyed as This is a required field$")
	public void required_field_message_should_be_dispalyed_as_This_is_a_required_field() throws Throwable {
		shoppingCartPage.requiredMsgApplyDiscount();
	}

	@When("^User capture discount code$")
	public void user_capture_discount_code() throws Throwable {
		shoppingCartPage.captureDiscountCode();
	}

	@Then("^You used coupon code qacoupon success message should be dispalyed$")
	public void you_used_coupon_code_qacoupon_success_message_should_be_dispalyed() throws Throwable {
		shoppingCartPage.successCouponMsg();
	}

	@Then("^Cancel coupon button should be dispalyed$")
	public void cancel_coupon_button_should_be_dispalyed() throws Throwable {
		shoppingCartPage.cancelCouponBtn();
	}

	@When("^User clicks on cancel coupon button$")
	public void user_clicks_on_cancel_coupon_button() throws Throwable {
		shoppingCartPage.clickCancelBtn();
	}

	@Then("^You canceled the coupon code message should be dispalyed$")
	public void you_canceled_the_coupon_code_message_should_be_dispalyed() throws Throwable {
		shoppingCartPage.cancelCouponMessage();
	}

	@When("^User capture invalid discount code$")
	public void user_capture_invalid_discount_code() throws Throwable {
		shoppingCartPage.captureInvalidCoupon();
	}

	@Then("^User get validation message$")
	public void user_get_validation_message() throws Throwable {
		shoppingCartPage.invalidCouponCodeMsg();
	}

	@When("^User clicks move to wishlist link$")
	public void user_clicks_move_to_wishlist_link() throws Throwable {
		shoppingCartPage.clickMoveWishList();
	}

	@Then("^User place under shopping cart section$")
	public void user_place_under_shopping_cart_section() throws Throwable {
		shoppingCartPage.shoppingCartEmptyPage();
	}

	@Then("^User get success message under shopping cart$")
	public void user_get_success_message_under_shopping_cart() throws Throwable {
		shoppingCartPage.moveShoppingCartToWishList(); 
	}

	@When("^User navigate to the wishlist$")
	public void user_navigate_to_the_wishlist() throws Throwable {
		shoppingCartPage.getWishlistPage();
	}

	@Then("^User place under wishlist section$")
	public void user_place_under_wishlist_section() throws Throwable {
		shoppingCartPage.wishListPageVal();
	}

	@Then("^User moved product should available here$")
	public void user_moved_product_should_available_here() throws Throwable {
		shoppingCartPage.wishListProductVal();
	}

    @When("^User click delete link under shopping cart$")
	public void user_click_delete_link_under_shopping_cart() throws Throwable {
		shoppingCartPage.deleteLinkShoppingCart();
	}
    
    @When("^User clicks AddAllToCart button under wishlist$")
    public void user_clicks_AddAllToCart_button_under_wishlist() throws Throwable {
    	shoppingCartPage.addAllToCartBtnWishList();
    }

    @Then("^Product moved from wishlist to cart$")
    public void product_moved_from_wishlist_to_cart() throws Throwable {
    	shoppingCartPage.wishListEmpty();
    }


}
