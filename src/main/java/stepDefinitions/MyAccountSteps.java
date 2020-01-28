package stepDefinitions;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MyAccountPageTest;
import utils.DriverFactory;

public class MyAccountSteps extends DriverFactory{

	
	@When("^User Navigates to the myaccount page$")
	public void user_Navigates_to_the_myaccount_page() throws Throwable {
		myAccountPageTest.getMyAccountLink();
	}

	@Then("^User should see my account links section and myaccount page title sections$")
	public void user_should_see_my_account_links_section_and_myaccount_page_title_sections() throws Throwable {
		myAccountPageTest.getMyAccount();
	}

	@When("^Click on the addressbook link$")
	public void click_on_the_addressbook_link() throws Throwable {
		// Assert.fail();
		myAccountPageTest.clickAddressBookLink();
	}

	@Then("^User placed under addressbook section$")
	public void user_placed_under_addressbook_section() throws Throwable {
		myAccountPageTest.getAddressBookPage();
	}

}
