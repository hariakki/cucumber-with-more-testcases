package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class SigninSteps extends DriverFactory{


    @Given("^User navigates to Magento website$")
	public void user_navigates_to_Magento_website() throws Exception, Exception {
    	//Reporter.addStepLog("Failure sigin");
    signinPage.getMagentoSite();

	}
    
	@And("^Clicks on signin link on the homepage$")
	public void clicks_on_signin_link_on_the_homepage() throws Exception {
		signinPage.clickSigninlinktext(); 
	}

@Then("^User place under Customer Login page$")
public void user_place_under_Customer_Login_page() throws Exception {
	signinPage.CustomerLoginPage();
}

@When("^User enter valid \"([^\"]*)\" username$")
public void user_enter_valid_username(String Email) throws Exception {
	signinPage.enterEmail(Email);
}

@When("^User enter valid \"([^\"]*)\" password$")
public void user_enter_valid_password(String password) throws Exception {
	signinPage.enterPassword(password);
}

@When("^User clicks on the signin button$")
public void user_clicks_on_the_signin_button() throws Exception {
	signinPage.clickSigninButton();
}

@Then("^User successfully logged in and placed under homepage$")
public void user_successfully_logged_in_and_placed_under_homepage() throws Exception {
	//Assert.fail();
	signinPage.getHomepage();
}

@Then("^User successfully logged in and placed under myaccount if failed create accounts by using \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" firstname,lastname,email,password$")
public void user_successfully_logged_in_and_placed_under_myaccount_if_failed_create_accounts_by_using_firstname_lastname_email_password(String firstname, String lastname, String email, String password) throws Throwable {
 signinPage.createUsersIfNotAvial(firstname,lastname,email,password);
}


}

