package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddNewChangeAddressSteps extends DriverFactory {

    @Then("^User place under address book section and you saved the address message should display$")
    public void user_place_under_address_book_section_and_you_saved_the_address_message_should_display() throws Throwable {
        addressBookPage.addressBookPageEle();
        addressBookPage.getSuccessMessages();
    }
    
    @When("^User capture phonenumber,street address,city,state,zip,country fields$")
        public void user_capture_phonenumber_street_address_city_state_zip_country_fields() throws Throwable {
            addressBookPage.captureNewAddress();
        }
    @Then("^Data should be capture$")
    public void data_should_be_capture() throws Throwable {
        
    }


    @Then("^Saved address should display under additional address entires$")
    public void saved_address_should_display_under_additional_address_entires() throws Throwable {
        addressBookPage.additionalAddressEntries();
    }

    @When("^User clicks edit address link under additional address entries$")
    public void user_clicks_edit_address_link_under_additional_address_entries() throws Throwable {
        addressBookPage.editAddress();
    }

    @When("^User selects checkbox for Use as my default billing address$")
    public void user_selects_checkbox_for_Use_as_my_default_billing_address() throws Throwable {
        addressBookPage.checkBoxMyDefaultBillingAddress();
    }

    @Then("^Saved address should display under default addresses$")
    public void saved_address_should_display_under_default_addresses() throws Throwable {
        addressBookPage.defaultBillingAddressValidation();
    }
    

    @When("^User selects checkbox for Use as my default shipping address$")
    public void user_selects_checkbox_for_Use_as_my_default_shipping_address() throws Throwable {
        addressBookPage.checkBoxMyDefaultShippingAddress();
    }

    @Then("^Saved address should display under Default Shipping Address$")
    public void saved_address_should_display_under_Default_Shipping_Address() throws Throwable {
        addressBookPage.defaultShippingAddressValidation();
    }
    
    
    @When("^User clicks delete address link under additional address entries$")
    public void user_clicks_delete_address_link_under_additional_address_entries() throws Throwable {
        addressBookPage.deleteAddress();
    }

    @Then("^Popup window should display$")
    public void popup_window_should_display() throws Throwable {
        addressBookPage.popUpMessage();
    }

    @When("^User click Cancel button the popup window$")
    public void user_click_Cancel_button_the_popup_window() throws Throwable {
        addressBookPage.cancelButtonPopUp();
    }

    @Then("^Popup should be closed and user placed under address book section$")
    public void popup_should_be_closed_and_user_placed_under_address_book_section() throws Throwable {
        addressBookPage.addressBookPageEle();
    }

    @When("^User clicks ok button on the popup window$")
    public void user_clicks_ok_button_on_the_popup_window() throws Throwable {
        addressBookPage.OkButtonPopUp();
    }

    @Then("^Popup window will be closed$")
    public void popup_window_will_be_closed() throws Throwable {
        
    }

    @Then("^Address deleted from additional address entries$")
    public void address_deleted_from_additional_address_entries() throws Throwable {
        addressBookPage.deleteAddressValidation();
    }

    @When("^User clear street Address$")
    public void user_clear_street_Address() throws Throwable {
        addressBookPage.clearStreetAddress();
    }

    @Then("^Street address cleared$")
    public void street_address_cleared() throws Throwable {
        addressBookPage.streetAddressVal();
    }

    @When("^User capture streetaddress$")
    public void user_capture_streetaddress() throws Throwable {
        addressBookPage.captureStreetAddress();
    }


    @When("^User should delete the address if additional addresses are available$")
    public void user_should_delete_the_address_if_additional_addresses_are_available() throws Throwable {
    	addressBookPage.preDeleteAdditionalAddressEntries();
    }

    @Then("^User should see text You have no other address entries in your address book\\. under additional address entries$")
    public void user_should_see_text_You_have_no_other_address_entries_in_your_address_book_under_additional_address_entries() throws Throwable {
        addressBookPage.conformDeletionSuccess();
    }

    @When("^User capture phonenumber,street address,city,state,zip,country fields if user placed under add new address page$")
    public void user_capture_phonenumber_street_address_city_state_zip_country_fields_if_user_placed_under_add_new_address_page() throws Throwable {
    	addressBookPage.addDefaultAddresses();
    }

}