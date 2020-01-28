
package stepDefinitions;
import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class NavigateToMyOrdersSteps extends DriverFactory {
	@Given("^user access the Magento site$")
	public void user_access_the_Magento_site() throws Throwable {
		navigateToMyOrdersPage.getHomePage();
	}

	@When("^user clicks Sign In link$")
	public void user_clicks_Sign_In_link() throws Throwable {
		navigateToMyOrdersPage.clickOnLoginLink();
	}

	@Then("^user placed under customer login page$")
	public void user_placed_under_customer_login_page() throws Throwable {
		navigateToMyOrdersPage.seeCustomerLoginPage();
	}
		
		//@Then ("^User enter valid \"([^\"]*)\" username$")
		//public void user_enter_valid_username(String username) throws Throwable {
		//	navigateToMyOrdersPage.enterEmail(username);
		//}
		
		//@Then ("^User enter valid \"([^\"]*)\" password$")
		//public void user_enter_valid_password(String password) throws Throwable {
		//navigateToMyOrdersPage.enterPassword(password);
		//}
		
		@When("^user clicks on the Sign In button$")
		public void user_clicks_on_the_Sign_In_button() throws Throwable {
			navigateToMyOrdersPage.clickOnSignInButton();
			
		}
		
		@Then("^user placed under my home page$")
		public void user_placed_under_my_home_page() throws Throwable {
			navigateToMyOrdersPage.seeMagento2Logo();
		}
	
		@When("^user navigates to customer account$")
		public void user_navigates_to_customer_account() throws Throwable {
			navigateToMyOrdersPage.clickOnCustomerName();
		}
		
		@And("^user clicks on my orders tab$")
		public void user_clicks_on_my_orders_tab() throws Throwable {
			navigateToMyOrdersPage.clickOnMyOrders();
		}
		
		@Then("^user should see orders$")
		public void user_should_see_orders() throws Throwable {
			navigateToMyOrdersPage.seeMyOrders();	
		}
		@And("^user sees order number$")
		public void user_sees_orde_number() throws Throwable {
			navigateToMyOrdersPage.seeOrderNumber();	
		}
		
		@And("^user sees order date$")
		public void user_sees_order_date() throws Throwable {
			navigateToMyOrdersPage.seeDate();
		}
		
		@And("^user sees ship to$")
		public void user_sees_ship_to() throws Throwable {
			navigateToMyOrdersPage.seeShipTo();
		}
		@And("^user sees order total$")
		public void user_sees_order_total() throws Throwable {
			navigateToMyOrdersPage.seeOrderTotal();
		}
		@And("^user sees status$")
		public void user_sees_order_status() throws Throwable {
			navigateToMyOrdersPage.seeStatus();
		}
		
		@Then("^user sees action\\.$")
		public void user_sees_action() throws Throwable {
			navigateToMyOrdersPage.seeAction();
		}
}
