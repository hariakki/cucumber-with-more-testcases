package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class ClickPaymentMethodsSteps extends DriverFactory{
	
	@And("^user clicks on Stored Payment Methods tab$")
	public void user_clicks_on_Stored_Payment_Methods_tab() throws Throwable {
		clickStoredPaymentMethodsPage.clickStoredPaymentMethodsTab();
	}
	
	@Then("^user sees Stored Payment Methods text$")
	public void user_sees_Stored_Payment_Methods_text() throws Throwable {
		clickStoredPaymentMethodsPage.seeStoredPaymentMethodsText();	
	}
}
