package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ShippingAndReviewPaymentsSteps extends DriverFactory{
	
	@When("^user click add to cart$")
	public void user_click_add_to_cart() throws Throwable {
		shippingAndPaymentsPage.userClicksAddToCart(); 
	} 
  
	@Then("^user see add to cart success message$")
	public void user_see_add_to_cart_success_message() throws Throwable {
		shippingAndPaymentsPage.userSeeSuccessAddToCartMessage();
	}

	@And("^user see product added to mini cart$")
	public void user_see_product_added_to_mini_cart() throws Throwable {
		shippingAndPaymentsPage.userSeeMiniCartQtyButton();
	}
 
	@When("^user click on mini cart$")
	public void user_click_on_mini_cart() throws Throwable {
		shippingAndPaymentsPage.userSeeMiniCartButton();
	}

	@Then("^user see proceed to checkout button$")
	public void user_see_proceed_to_checkout_button() throws Throwable {
		shippingAndPaymentsPage.userSeeProceedToCheckoutButton();
	}

	@When("^user clicks proceed to checkout button$")
	public void user_clicks_proceed_to_checkout_button() throws Throwable {
		shippingAndPaymentsPage.userClicksProceedToCheckoutButton();
	}

	@Then("^user see shipping page$")
	public void user_see_shipping_page() throws Throwable {
		shippingAndPaymentsPage.userSeeShippingPageTitle();
	}

	@And("^user see Company textbox name$")
	public void user_see_Company_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeeComanyTextboxName();
	}

	@And("^user see Company textbox$") 
	public void user_see_Company_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeeComanyTextbox();
	} 

	@And("^user see Street Address textbox name$")
	public void user_see_Street_Address_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeeStreetAddressTextboxName();
	}

	@And("^user see Street Address textbox one$")
	public void user_see_Street_Address_textbox_one() throws Throwable {
		shippingAndPaymentsPage.userSeeStreetAddressTextboxOne();
	}

	@And("^user see Street Address textbox two$")
	public void user_see_Street_Address_textbox_two() throws Throwable {
		shippingAndPaymentsPage.userSeeStreetAddressTextboxTwo();
	} 
 
	@And("^user see City textbox name$")
	public void user_see_City_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeeCityTextboxName();
	}

	@And("^user see City textbox$")
	public void user_see_City_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeeCityTextbox();
	}

	@And("^user see State/Province textbox name$")
	public void user_see_State_Province_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeeStateProvinceTextboxName();
	}

	@And("^user see State/Province textbox$")
	public void user_see_State_Province_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeeStateProvinceTextbox();
	} 
 
	@And("^user see Zip/Postal Code textbox name$")
	public void user_see_Zip_Postal_Code_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeePostalCodeTextboxName();
	}

	@And("^user see Zip/Postal Code textbox$")
	public void user_see_Zip_Postal_Code_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeePostalCodeTextbox();
	}

	@And("^user see Country textbox name$")
	public void user_see_Country_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeeCountryTextboxName();
	}

	@And("^user see Country textbox$")
	public void user_see_Country_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeeCountryTextbox();
	}

	@And("^user see Phone Number textbox name$")
	public void user_see_Phone_Number_textbox_name() throws Throwable {
		shippingAndPaymentsPage.userSeePhoneTextboxName();
	}

	@And("^user see Phone Number textbox$")
	public void user_see_Phone_Number_textbox() throws Throwable {
		shippingAndPaymentsPage.userSeePhoneTextbox();
	}

	@And("^user see Shipping Methods heading$")
	public void user_see_Shipping_Methods_heading() throws Throwable {
		shippingAndPaymentsPage.userSeeShippingMethodsHeading();
	}

	@And("^user see flat rate delivery tickbox$")
	public void user_see_flat_rate_delivery_tickbox() throws Throwable {
		shippingAndPaymentsPage. userSeeDeliveryOpt1tickbox();
	}

	@And("^user see best way delivery tickbox$")
	public void user_see_best_way_delivery_tickbox() throws Throwable {
		shippingAndPaymentsPage.userSeeDeliveryOpt2tickbox();
	}

	@And("^user see Order Summary$")
	public void user_see_Order_Summary() throws Throwable {
		shippingAndPaymentsPage.userSeeOrderSummaryHeading();
	}  

	@And("^user see Order Summary dropdown list button$")
	public void user_see_Order_Summary_dropdown_list_button() throws Throwable {
		shippingAndPaymentsPage.userSeeItemInCartButton();
	} 

	@Then("^user see next button$")
	public void user_see_next_button() throws Throwable {
		shippingAndPaymentsPage.userSeeNextButton();
	}
	

	

	@Then("^user enter \"([^\"]*)\" company$")
	public void user_enter_company(String company) throws Throwable {
		shippingAndPaymentsPage.userEnterCompany(company);
	}

	@Then("^user enter \"([^\"]*)\" street one$")
	public void user_enter_street_one(String street1) throws Throwable {
		shippingAndPaymentsPage.userEnterstreet1(street1);
	}

	@Then("^user enter \"([^\"]*)\" street two$")
	public void user_enter_street_two(String street2) throws Throwable {
		shippingAndPaymentsPage.userEnterstreet2(street2);
	}

	@Then("^user enter \"([^\"]*)\" city$")
	public void user_enter_city(String city) throws Throwable {
		shippingAndPaymentsPage.userEntercity(city);
	}

	@Then("^user enter \"([^\"]*)\" postal code$")
	public void user_enter_postal_code(String postalcode) throws Throwable {
		shippingAndPaymentsPage.userEnterPostalCode(postalcode);
	}

	@Then("^user enter \"([^\"]*)\" phone number$")
	public void userEnterPhoneNumber(String phonenumber) throws Throwable {
		shippingAndPaymentsPage.userEnterPhoneNumber(phonenumber);
	}


	@And("^user select province$")
	public void user_select_province() throws Throwable {
		shippingAndPaymentsPage.userEnterStateProvince();
}

	@And("^user select country$")
	public void user_select_United_States_country() throws Throwable {
		shippingAndPaymentsPage.userEnterCountry();
} 
	
	@When("^user clicks next button$")
	public void user_clicks_next_button() throws Throwable {
		shippingAndPaymentsPage.userClicksNextButton();
		Thread.sleep(5000);
	} 
 
	@And("^user see payment method page title$")
	public void user_see_payment_method_page_title() throws Throwable {
		shippingAndPaymentsPage.userSeePaymentMethodTitle();
	}
 
	
	@And("^user see My billing and shipping address are the same tickbox$")
	public void user_see_My_billing_and_shipping_address_are_the_same_tickbox() throws Throwable {
		shippingAndPaymentsPage.userSeeBillingAndShippingTickbox();
	}

	@And("^user see my billing and shipping address$")
	public void user_see_my_billing_and_shipping_address() throws Throwable {
		shippingAndPaymentsPage.userSeeBillingAndShippingText();
	}

	@And("^user see cart total$")
	public void user_see_cart_total() throws Throwable {
		shippingAndPaymentsPage.userSeeCartTotalText();
	}

	@And("^user see shipping$")
	public void user_see_shipping() throws Throwable {
		shippingAndPaymentsPage.userSeeShippingText();
	}
 
	@And("^user see order total$")
	public void user_see_order_total() throws Throwable {
		shippingAndPaymentsPage.userSeeOrderTotalRandText();
	}

	@And("^user see order total Rand amount$")
	public void user_see_order_total_Rand_amount() throws Throwable {
		shippingAndPaymentsPage.userSeeOrderTotalRandText();
	}

	@And("^user see qty items in cart$")
	public void user_see_qty_items_in_cart() throws Throwable {
		shippingAndPaymentsPage.userSeeQtyItemsInCart();
	}

	@And("^user see ship to$")
	public void user_see_ship_to() throws Throwable {
		shippingAndPaymentsPage.userSeeShipToText();
	}
 
	@And("^user see shipping method$")
	public void user_see_shipping_method() throws Throwable {
		shippingAndPaymentsPage.userSeeShippingMethodText();
	}

	@And("^user see apply discount code$")
	public void user_see_apply_discount_code() throws Throwable {
		shippingAndPaymentsPage.userSeeApplyDiscountCodeText();
	}

	@And("^user see apply discount code dropdown list button$")
	public void user_see_apply_discount_code_dropdown_list_button() throws Throwable {
		shippingAndPaymentsPage.userSeeApplyDiscountDropdownButton();
	} 

	@Then("^user see Place order button$")
	public void user_see_Place_order_button() throws Throwable {
		shippingAndPaymentsPage.userSeePlaceOrderButton();
	} 
	
	@Then("^user clicks Place order button$")
	public void clicks() throws Throwable {
		shippingAndPaymentsPage.userclicksPlaceOrderButton();
	}
	@Then("^user see success order placed page$")
	public void user_see_success_order_placed_page() throws Throwable {
			shippingAndPaymentsPage.userSeeSuccessOrderPlacedPageTitle();
} 
	@Then("^user clicks delivery option one$")
			public void user_clicks_delivery_option_one() throws Throwable {
		shippingAndPaymentsPage.userclicksDeliveryOption1Tickbox();
} 
 
	@Then("^user see new address button$")
		public void user_see_new_address_button() throws Throwable {
	shippingAndPaymentsPage.userSeeAddNewAddressButton();
	
	} 
	 
	@Then("^user clicks new address button$")
		public void user_clicks_new_address_button() throws Throwable {
	shippingAndPaymentsPage.userClicksAddNewAddressButton();
	  
	}  
	 
	@When("^user clicks save address button$")
		public void user_clicks_save_address_button() throws Throwable {
		shippingAndPaymentsPage.userClicksSaveAddressButton();
		
	}
	
			 

// add new address
	@Then("^user enter \"([^\"]*)\" postal code new$")
	public void user_enter_postal_code_new(String postcode) throws Throwable {
		shippingAndPaymentsPage.userEnterPostCode(postcode);
		 
		 
	}

	@Then("^user enter \"([^\"]*)\" phone number new$")
	public void user_enter_phone_number_new(String phonenumber) throws Throwable {
		shippingAndPaymentsPage.userEnterPhoneNumberNew(phonenumber);
		
	} 
	 
	@Then("^user see required field error messages$")
		public void user_see_required_field_error_messages() throws Throwable {
	shippingAndPaymentsPage.userSeeRequiredFieldErrorMessages(); 
} 
} 



