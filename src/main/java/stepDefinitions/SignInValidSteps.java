package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class SignInValidSteps extends DriverFactory {
	
	

	  
	

		@Given("^user access magneto two website$")
		public void user_access_magneto_two_website() throws Throwable {
		signInPage.getSignInPage(); 
	    
	} 

	@When("^user clicks sign in button$")
	public void user_clicks_sign_in_button() throws InterruptedException, IOException {
		
		signInPage.userClicksHomepageSignInButton();
		
	}

	@And("^user enter \"([^\"]*)\" email$")
	public void user_enter_email(String email) throws Exception {
		
		signInPage.userEnterEmail(email);
	}

	@And("^user enter \"([^\"]*)\" password$")
	public void user_enter_password(String password) throws Exception {
		
		signInPage.userEnterPassword(password);
	}
	
	
	@When("^user clicks sign in button on sign in page$")
	public void user_clicks_sign_in_button_on_sign_in_page() throws InterruptedException, IOException {
		
		signInPage.userClicksSignInButtonOnSignInPage();
	}


	@Then("^user successfully logged in$")
	public void user_successfully_logged_in() throws InterruptedException, IOException {
		
		signInPage.userSuccessfullyLoggedIn();
		
	}
}
