package stepDefinitions;


import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utils.DriverFactory;

public class ClickPrintOrderAndValidatePageSteps extends DriverFactory{

		
		
		@When("^user clicks on the Print Order link$")
		public void user_clicks_on_the_Sign_In_button() throws Throwable {
			clickPrintOrderAndValidatePage.clickPrintOrderLink();
		}
		
		@Then("^user placed under printing page$")
		public void user_placed_under_printing_page() throws Throwable {
			clickPrintOrderAndValidatePage.seePrintingPage();
		}
		
		@And("^user should see print button$")
		public void user_should_see_print_button() throws Throwable {
			clickPrintOrderAndValidatePage.seePrintButton();	
		}
		@And("^user should see cancel button$")
		public void user_should_see_cancel_button() throws Throwable {
			clickPrintOrderAndValidatePage.seeCancelButton();
		}
		@Then("^user should see the destination label$")
		public void user_should_see_the_destination_label() throws Throwable {
			clickPrintOrderAndValidatePage.seeDestinationLabel();	
		}
		@Then("^user should see the pages label$")
		public void user_should_see_the_pages_label() throws Throwable {
			clickPrintOrderAndValidatePage.seePagesLabel();
		}
		@Then("^user should see the layout label$")
		public void user_should_see_the_layout_label() throws Throwable {
			clickPrintOrderAndValidatePage.seeLayoutLabel();	
		}
		@Then("^user should see the color label$")
		public void uuser_should_see_the_color_label() throws Throwable {
			clickPrintOrderAndValidatePage.seeColorLabel();
		}
}