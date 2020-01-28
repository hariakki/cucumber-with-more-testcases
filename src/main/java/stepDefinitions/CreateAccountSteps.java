package stepDefinitions;


import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CreateAccountSteps extends DriverFactory {
	
	
	 
	
	
	@Then("^user see Create New Customer Account page title$")
	public void user_see_Create_New_Customer_Account_page_title() throws Throwable {
		createAccountPage.seeCreateNewCustomerAccountPageTitle();
	}

	@And("^user see First Name textfield$")
	public void user_see_First_Name_textfield() throws Throwable {
		createAccountPage.seeFirstNameTextfield();
		
	}

	@And("^user see Last Name textfield$")
	public void user_see_Last_Name_textfield() throws Throwable {
		createAccountPage.seeLastNameTextfield();
	}

	@And("^user see Sign Up for Newsletter tickbox$")
	public void user_see_Sign_Up_for_Newsletter_tickbox() throws Throwable {
		createAccountPage.seeSignUpNewsletterTickbox();
	}

	@And("^user see Email textfield$")
	public void user_see_Email_textfield() throws Throwable {
		createAccountPage.seeEmailTextfield();
	}

	@And("^user see Password textfield$")
	public void user_see_Password_textfield() throws Throwable {
		createAccountPage.seePasswordTextfield();
	}

	@And("^user see Confirm Password textfield$")
	public void user_see_Confirm_Password_textfield() throws Throwable {
		createAccountPage.seePasswordTextfield();
	}

	@And("^user see create account button$")
	public void user_see_create_account_button() throws Throwable {
		createAccountPage.seeConfirmPasswordTextfield();
	}

	@Then("^user see subscribe button$")
	public void user_see_subscribe_button() throws Throwable {
		createAccountPage.seeSubscribeButton();
	}
	
	@When("^user clicks create account button$")
	public void user_clicks_create_account_button() throws Throwable {
		createAccountPage.userClicksCreateAccountButton();
	}

	@When("^user click create account button$")
	public void user_click_create_account_button() throws Throwable {
		createAccountPage.userClicksCreateAnAccountButton();
	}


	@And("^user enter valid \"([^\"]*)\" First Name$")
	public void user_enter_valid_First_Name(String firstname) throws Throwable {
		createAccountPage.userEnterFirstname(firstname); 
	}

	@And("^user enter valid \"([^\"]*)\" Last Name$")
	public void user_enter_valid_Last_Name(String lastname) throws Throwable {
		createAccountPage.userEnterLastName(lastname);  
	}

	@And("^user tick Sign Up for Newsletter tickbox$")
	public void user_tick_Sign_Up_for_Newsletter_tickbox() throws Throwable {
		createAccountPage.userClickNewletterSubscribeTickbox(); 
	}

	@And("^user enter valid \"([^\"]*)\" Email$")
	public void user_enter_valid_Email(String email) throws Throwable {
		createAccountPage.userEnterEmail(email); 
	}

	@And("^user enter valid \"([^\"]*)\" Password$")
	public void user_enter_valid_Password(String password) throws Throwable {
		createAccountPage.userEnterPassword(password);  
	}

	@And("^user enter valid matching \"([^\"]*)\" Confirm Password$")
	public void user_enter_valid_matching_Confirm_Password(String password) throws Throwable {
		createAccountPage.userEnterConfirmPassword(password); 
	}

	

	@And("^user see My Dashboard page$")
	public void user_see_My_Dashboard_page() throws Throwable {
		createAccountPage.myDashboardPageTitle();  
	}

	@Then("^user see successful create account message$")
	public void user_see_successful_create_account_message() throws Throwable {
		createAccountPage.seeSuccessCreateAccountMessage(); 
	}
	
    
}


