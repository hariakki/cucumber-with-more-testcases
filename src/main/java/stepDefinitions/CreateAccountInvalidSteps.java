package stepDefinitions;


import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;

import utils.DriverFactory;

public class CreateAccountInvalidSteps extends DriverFactory{
	
	

	


	@Then("^user see required fields error message$")
	public void user_see_required_fields_error_message() throws Throwable {
		createAccountPage.seeFieldsErrorMessage(); 
	
	
	}
	
	@And("^user see click here link to get password for account$")
	public void user_see_click_here_link_to_get_password_for_account() throws Throwable {
		createAccountPage.seeGetPasswordLink();
	}

	@Then("^user see account already registered$")
	public void user_see_account_already_registered() throws Throwable {
		createAccountPage.seeEmailAlreadyRegistered();
	}
	
}



