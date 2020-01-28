package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class NewsletterSubscriptionsSteps extends DriverFactory {

	@And("^user clicks on Newsletter Subscriptions tab$")
	public void user_clicks_on_Newsletter_Subscriptions_tab() throws Throwable {
		newsletterSubscriptionsPage.clickNewsletterSubscriptionsTab();
	}
	
	@Then("^user sees Newsletter Subscription text$")
	public void user_sees_Newsletter_Subscription_text() throws Throwable {
		newsletterSubscriptionsPage.seeNewsletterSubscriptionText();	
	}
	
	@And("^user sees Subscription option text$")
	public void user_sees_subscription_option_text() throws Throwable {
		newsletterSubscriptionsPage.seeSubscriptionOptionText();	
	}
	
	@And("^user sees General Subscription checkbox$")
	public void user_sees_General_Subscription_checkbox() throws Throwable {
		newsletterSubscriptionsPage.seeGeneralSubscriptionCheckbox();	
	}
	
	@When("^user checks on General Subscription checkbox$")
	public void user_schecks_on_General_Subscription_checkbox() throws Throwable {
		newsletterSubscriptionsPage.clickGeneralSubscriptionCheckbox();	
	}
	@And("^user clicks Save button$")
	public void user_Save_button() throws Throwable {
		newsletterSubscriptionsPage.clickSaveButton();	
	}
	
	@Then("^user sees We saved the subscription message$")
	public void user_sees_We_saved_the_subscription_message() throws Throwable {
		newsletterSubscriptionsPage.seeSubscribingMessage();	
	}
	@Then("^user sees We removed the subscription message$")
	public void user_sees_We_removed_the_subscription_message() throws Throwable {
		newsletterSubscriptionsPage.seeSubscribingMessage();	
	}
}
