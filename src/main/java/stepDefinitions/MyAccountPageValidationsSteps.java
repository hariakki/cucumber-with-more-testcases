package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class MyAccountPageValidationsSteps extends DriverFactory{
	

	@When("^user navigate to my account page$")
	public void user_navigate_to_my_account_page() throws Throwable {
		myAccountPage.getMyAccountPage(); 
				
	}
	
	@And("^user see my downloadable products my account$")
	public void user_see_my_downloadable_products_my_account() throws Throwable {
		myAccountPage.userSeeMyDownloadableProductsMyAccount(); 
		
	}
		@And("^user see my wishlist my account$")
		public void user_see_my_wishlist_my_account() throws Throwable {
			myAccountPage.userSeeFacetMyWishlistMyAccount();
	
	} 
	
	@And("^user see account dashboard my account page$")
	public void user_see_account_dashboard_my_account_page() throws Throwable {
		myAccountPage.userSeeAccountDashboardFacet(); 
	}
	
	
	@And("^user click profile dropdown arrow$")
	public void user_click_profile_dropdown_arrow() throws Throwable {
		myAccountPage.userClicksDropDownListUserProfile();
	}

	@And("^user click my account$")
	public void user_click_my_account() throws Throwable {
		myAccountPage.userClicksMyAccountOnUserProfile();
	}

	@And("^user see my dashboard page title$")
	public void user_see_my_dashboard_page_title() throws Throwable {
		myAccountPage.userSeeMyDashboardPageTitle();
	}

	@And("^user see account information heading$")
	public void user_see_account_information_heading() throws Throwable {
		myAccountPage.userSeeAccountInformationHeading();
	}

	@And("^user see contact information heading$")
	public void user_see_contact_information_heading() throws Throwable {
		myAccountPage.userSeeAccountInformationHeading();
	}

	@And("^user see newsletters heading$")
	public void user_see_newsletters_heading() throws Throwable {
		myAccountPage.userSeeNewsletterHeading();
	}

	@And("^user see contact information edit button$")
	public void user_see_contact_information_edit_button() throws Throwable {
		myAccountPage.userSeeAccountInformationEditButton();
	}

	@And("^user see change password button$")
	public void user_see_change_password_button() throws Throwable {
		myAccountPage.userSeeChangePasswordButton();
	}

	@And("^user see newsletters edit button$")
	public void user_see_newsletters_edit_button() throws Throwable {
		myAccountPage.userSeeNewsletterEditButton();
	}

	@And("^user see manage address book button$")
	public void user_see_manage_address_book_button() throws Throwable {
		myAccountPage.userSeeManageAddressBookButton();
	}

	@And("^user see default billing address heading$")
	public void user_see_default_billing_address_heading() throws Throwable {
		myAccountPage.userSeeDefaultBillingAddressHeading();
	}

	@And("^user see default billing address edit address button$")
	public void user_see_default_billing_address_edit_address_button() throws Throwable {
		myAccountPage.userSeeEdtDefaultBillingAddressButton();
	}

	@And("^user see default shipping address heading$")
	public void user_see_default_shipping_address_heading() throws Throwable {
		myAccountPage.userSeeDefaultShippingAddressHeading();
	}

	@Then("^user see default shipping address edit address button$")
	public void user_see_default_shipping_address_edit_address_button() throws Throwable {
		myAccountPage.userSeeEdtDefaultShippingAddressButton();
	}

}
