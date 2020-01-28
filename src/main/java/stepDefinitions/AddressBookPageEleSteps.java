package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddressBookPageEleSteps extends DriverFactory {
	

	@And("^User should see deafult addresses, default billing address,default shipping address, Change Billing Address,Change Shipping Address,Additional Address Entries,Add new address button$")
	public void user_should_see_deafult_addresses_default_billing_address_default_shipping_address_Change_Billing_Address_Change_Shipping_Address_Additional_Address_Entries_Add_new_address_button()
			throws Throwable {
     addressBookPage.addressBookPageEle();
	}
	
	@When("^User clicks Change Billing Address link$")
	public void user_clicks_Change_Billing_Address_link() throws Throwable {
		addressBookPage.clickChangeBillingAddressLink();
	}

	@Then("^User Place under edit address section$")
	public void user_Place_under_edit_address_section() throws Throwable {
		addressBookPage.getEditAddressPage();
	}

	@Then("^User should see Edit Address, Contact Information, First Name ,Last Name ,Company,Phone Number, Address,Street Address,City,State/Province,Zip/Postal Code, Country,Save Address$")
	public void user_should_see_Edit_Address_Contact_Information_First_Name_Last_Name_Company_Phone_Number_Address_Street_Address_City_State_Province_Zip_Postal_Code_Country_Save_Address() throws Throwable {
		addressBookPage.getEditAddressPageEle();
	}

	//Magento 2 Upgrade 2.3.1
/*	@When("^Click on the addressbook link under Addressbook$")
	public void click_on_the_addressbook_link_under_Addressbook() throws Throwable {
		addressBookPage.clickAddressBookLinkUnderAddressBookPage();
	}
*/
	//Magento 2 Upgrade 2.3.1
	
	@When("^User clicks Change Shipping Address link$")
	public void user_clicks_Change_Shipping_Address_link() throws Throwable {
		addressBookPage.clickChangeShippingAddressLink();
	}

	@When("^User clicks Add new address button$")
	public void user_clicks_Add_new_address_button() throws Throwable {
		addressBookPage.clickAddNewAddressBtn();
	 
	}

	@Then("^User Place Under Add New Address page$")
	public void user_Place_Under_Add_New_Address_page() throws Throwable {
		addressBookPage.addNewAddressPage();
	  
	}

    @Then("^User should see Contact Information, First Name ,Last Name ,Company,Phone Number, Address,Street Address,City,State/Province,Zip/Postal Code, Country,Use as my default billing address,Use as my default shipping address,Save Address$")
    public void user_should_see_Contact_Information_First_Name_Last_Name_Company_Phone_Number_Address_Street_Address_City_State_Province_Zip_Postal_Code_Country_Use_as_my_default_billing_address_Use_as_my_default_shipping_address_Save_Address() throws Throwable {
    	addressBookPage.addNewAddressPageEle();
    }
    
    @When("^User clicks saveaddress button$")
    public void user_clicks_saveaddress_button() throws Throwable {
    	addressBookPage.clickSaveAddressBtn();
       
    }
    @Then("^Phone Number,Street Address,City,Zip Postal Code fields are displayed This is a required field\\. message under textboxes and StateProvinc drop down is displayed Please select an option\\. under dropdown selection$")
	public void phone_Number_Street_Address_City_Zip_Postal_Code_fields_are_displayed_This_is_a_required_field_message_under_textboxes_and_StateProvinc_drop_down_is_displayed_Please_select_an_option_under_dropdown_selection()
			throws Throwable {
    	addressBookPage.addressBookRequiredFeilds();
	}

   //After magento upgrade fix 2.3.1
   @When("^User clicks back Navigation on webpage$")
   public void user_clicks_back_Navigation_on_webpage() throws Throwable {
	   addressBookPage.navigateBackAddressBook();
    }

   //After magento upgrade fix 2.3.1

}