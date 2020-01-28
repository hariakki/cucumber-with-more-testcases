package stepDefinitions;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import utils.DriverFactory;

public class BackEndSteps extends DriverFactory {


@Given("^user access magneto two back end website$")
public void user_access_magneto_two_back_end_website() throws Throwable {
	backEndPage.getBackEndPage(); 
}   

@Given("^user enter \"([^\"]*)\" username$")
public void user_enter_username(String username) throws Throwable {
	backEndPage.userEnterUsername(username); 
} 

@And("^user enter \"([^\"]*)\" password back end$")
public void user_enter_password(String password) throws Throwable {
	backEndPage.userEnterPasswordBackEnd(password);  
} 

@When("^user clicks back end sign in button$")
public void user_clicks_back_end_sign_in_button() throws Throwable {
	backEndPage.userClicksSignInBackEndButton();
}



@And("^user clicks customers$")
public void user_clicks_customers() throws Throwable {
	backEndPage.userClicksCustomersButton(); 
}

@And("^user clicks all customers$")
public void user_clicks_all_customers() throws Throwable {
	backEndPage.userClicksAllCustomersButton(); 
}

@When("^user search for \"([^\"]*)\"$")
public void user_search_for(String regemail) throws Throwable {
	backEndPage.userEmailSearch(regemail);
	
}
@When("^user clicks edit button$")
public void user_clicks_edit_button() throws Throwable {
	backEndPage.userClicksEditUserButton();
}
@And("^user clicks addresses button$")
public void user_clicks_addresses_button() throws Throwable {
	backEndPage.userClicksAddressesrButton();
 
}

@And("^user clicks edit select button$")
public void user_clicks_edit_select_button() throws Throwable {
	backEndPage.userClicksEditSelectButton(); 
	
}
@And("^user clicks delete button$")
public void user_clicks_delete_button() throws Throwable {
	backEndPage.userClicksDeleteButton();  

}
@When("^user clicks ok button$")
public void user_clicks_ok_button() throws Throwable {
	backEndPage.userClicksOkButton(); 
	
}
@When("^user clicks save button$")
public void user_clicks_save_button() throws Throwable {
	backEndPage.userClicksSaveButton();  
	
}

@When("^user clicks delete customer button$")
public void user_clicks_delete_customer_button() throws Throwable {
	backEndPage.userClicksDeletCustomerButton();  
	
}

@When("^user clicks customer id button$")
public void user_clicks_customer_is_button() throws Throwable {
	backEndPage.userClicksCustomerIdButton();  
	
	 

	
}
}
