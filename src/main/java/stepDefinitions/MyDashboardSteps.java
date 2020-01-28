//package stepDefinitions;
//
//
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import utils.DriverFactory;
//
//public class MyDashboardSteps extends DriverFactory{
//
//	
//	@When("^User Navigates to the Mydashboard page$")
//	public void user_Navigates_to_the_Mydashboard_page() throws Throwable {
//		myDashboardPage.getMyDashboardLink();
//	}
//
//	@Then("^User should see account dashboard and mydashboard sections$")
//	public void user_should_see_account_dashboard_and_mydashboard_sections() throws Throwable {
//		myDashboardPage.getMyDashboardPage(); 
//	}
//
//
//	@When("^Click on the addressbook link$")
//	public void click_on_the_addressbook_link() throws Throwable {
//		//Assert.fail();
//	    myDashboardPage.clickAddressBookLink();
//	}
//
//	@Then("^User placed under addressbook section$")
//	public void user_placed_under_addressbook_section() throws Throwable {
//	    myDashboardPage.getAddressBookPage();
//	}
//
//}
