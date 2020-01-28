package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddressBookPage extends BasePage{
	
	//Address Book
	public @FindBy(xpath = "//h1[@class='page-title']//span") WebElement label_AddressBook;
	public @FindBy(xpath = "//strong[text()='Default Addresses']") WebElement label_DefaultAddresses;
	public @FindBy(xpath = "//span[text()='Default Billing Address']") WebElement label_DefaultBillingAddress;
	public @FindBy(xpath = "//a//span[text()='Change Billing Address']") WebElement hyperlink_ChangeBillingAddress;
	public @FindBy(xpath = "//span[text()='Default Shipping Address']") WebElement label_DefaultShippingAddress;
	public @FindBy(xpath = "//a//span[text()='Change Shipping Address']") WebElement hyperlink_ChangeShippingAddress;
	public @FindBy(xpath = "//strong[text()='Additional Address Entries']") WebElement label_AdditionalAddressEntries;
	public @FindBy(xpath = "//button[@title='Add New Address']") WebElement button_AddNewAddress;
	//public @FindBy(xpath = "//span[text()='Edit Address']") WebElement hyperLink_editAddress;      //Upgrade magento 2.3.1
	//public @FindBy(xpath = "//span[text()='Delete Address']") WebElement hyperLink_deleteAddress;  //Upgrade magento 2.3.1

	//Add New Address
	public @FindBy(xpath = "//span[text()='Add New Address']") WebElement addNewAddressSection;
    public @FindBy(xpath = "//h1[@class='page-title']") WebElement label_EditAddress;
	public @FindBy(xpath = "//span[text()='Contact Information']") WebElement label_ContactInformation;
	public @FindBy(xpath = "//span[text()='First Name']") WebElement label_FirstName;
	public @FindBy(xpath = "//input[@id='firstname']") WebElement textfield_FirstName;
	public @FindBy(xpath = "//span[text()='Last Name']") WebElement label_LastName;
	public @FindBy(xpath = "//input[@id='lastname']") WebElement textfield_LastName;
	public @FindBy(xpath = "//div[@class='field company ']//span") WebElement label_Company;
	public @FindBy(xpath = "//input[@id='company']") WebElement textfield_Company;
	public @FindBy(xpath = "//div[@class='field telephone required']//span") WebElement label_PhoneNumber;
	public @FindBy(xpath = "//input[@id='telephone']") WebElement textfield_PhoneNumber;
	public @FindBy(xpath = "//span[text()='Address']") WebElement label_Address;

	public @FindBy(xpath = "//span[text()='Street Address']") WebElement label_StreetAddress;
	public @FindBy(xpath = "//input[@id='street_1']") WebElement textfield_StreetAddress1;
	public @FindBy(xpath = "//input[@id='street_2']") WebElement textfield_StreetAddress2;
	public @FindBy(xpath = "//span[text()='City']") WebElement label_City;
	public @FindBy(xpath = "//input[@id='city']") WebElement textfield_City;
	public @FindBy(xpath = "//span[text()='State/Province']") WebElement label_StateProvince;
	public @FindBy(xpath = "//input[@id='region']") WebElement textfield_StateProvince;
	public @FindBy(xpath = "//span[text()='Zip/Postal Code']") WebElement label_ZipPostalCode;
	public @FindBy(xpath = "//input[@id='zip']") WebElement textfield_ZipPostalCode;
	public @FindBy(xpath = "//span[text()='Country']") WebElement label_Country;
	public @FindBy(xpath = "//select[@id='country']") WebElement dropDown_Country;
	public @FindBy(xpath = "//input[@type='checkbox' and @id='primary_billing']") WebElement checkBox_myDefaultBillingAddress;
	public @FindBy(xpath = "//span[text()='Use as my default billing address']") WebElement Label_myDefaultBillingAddress;
	public @FindBy(xpath = "//input[@type='checkbox' and @id='primary_shipping']") WebElement checkbox_myShippingAddress;
	public @FindBy(xpath = "//span[text()='Use as my default shipping address']") WebElement Label_myShippingAddress;
	public @FindBy(xpath = "//select[@title='State/Province']") WebElement dropDown_stateProvince;
    public @FindBy(xpath = "//button[@title='Save Address']") WebElement button_SaveAddress;
    
    //Left hand side links
    public @FindBy(xpath = "//strong[text()='Address Book']") WebElement Link_AddressBook;
    
    //Required feilds under add new address
    public @FindBy(xpath = "//div[@id='telephone-error' and text()='This is a required field.']") WebElement textField_PhoneNumberRequired;
    public @FindBy(xpath = "//div[@id='street_1-error' and text()='This is a required field.']") WebElement textField_streetAddress1Required; 
    public @FindBy(xpath = "//div[@id='city-error' and text()='This is a required field.']") WebElement textField_CityRequired;
    public @FindBy(xpath = "//div[@id='region_id-error' and text()='Please select an option.']") WebElement StateProvinceRequired;
    public @FindBy(xpath = "//div[@id='zip-error' and text()='This is a required field.']") WebElement ZipPostalCodeRequired;
  
    //Messages
    public @FindBy(xpath= "//div[text()='You saved the address.']") WebElement successMessage_Address;
    public @FindBy(xpath = "//li[@class='item']//address") WebElement addressValidation_NewAddress;
    public @FindBy(xpath = "//div[@class='box box-address-billing']//address") WebElement addressValidation_defaultBillingAddress;
    public @FindBy(xpath = "//div[@class='box box-address-shipping']//address") WebElement addressValidation_defaultShippingAddress;
    
    //pop up
    public @FindBy(xpath = "//div[@class='modal-inner-wrap']") WebElement popUp_deleteAddressPopUpWindow;
    public @FindBy(xpath= "//button[@class='action-secondary action-dismiss']//span") WebElement popButton_cancelBtn;
    public @FindBy(xpath = "//button[@class='action-primary action-accept']//span") WebElement popButton_OkBtn ;
    public @FindBy(xpath = "//p[text()='You have no other address entries in your address book.']") WebElement addressVal_DeleteAddressValidation;
    
    //Upgrade magento 2.3.1
    //Additional address entries
    public @FindBy(xpath = "//tr//th[text()='First Name']") WebElement label_FirstNameTable;
    public @FindBy(xpath = "//tr//th[text()='Last Name']") WebElement label_LastNameTable;
    public @FindBy(xpath = "//tr//th[text()='Street Address']") WebElement label_StreetAddressTable;
    public @FindBy(xpath = "//tr//th[text()='City']") WebElement label_CityTable;
    public @FindBy(xpath = "//tr//th[text()='Country']") WebElement label_CountryTabele;
    public @FindBy(xpath = "//tr//th[text()='State']") WebElement label_StateTable;
    public @FindBy(xpath = "//tr//th[text()='Zip/Postal Code']") WebElement label_ZipPostalCodeTable;
    public @FindBy(xpath = "//tr//th[text()='Phone']") WebElement label_Phone;
    public @FindBy(xpath = "//a[@class='action edit']//span[text()='Edit']") WebElement hyperLink_Edit;
    public @FindBy(xpath = "//a[@class='action delete']//span[text()='Delete']") WebElement hyperLink_Delete;
    public @FindBy(xpath = "//strong[text()='Show']") WebElement label_ShowText;
    public @FindBy(xpath = "//select[@id='limiter' and @class='limiter-options']") WebElement dropDown_Show;
    public @FindBy(xpath = "//span[text()='per page']") WebElement label_PerPageText;
    public @FindBy(xpath = "//span[@class='toolbar-number']") WebElement label_ItemsToolBar;
    public @FindBy(xpath = "//div[@class='block-content']//p[text()='You have no other address entries in your address book.']") WebElement label_NoAdditionalAddress;
    
    //Table Values
    public @FindBy(xpath = "//td[@class='col streetaddress']") WebElement value_StreetAddress; 
    public @FindBy(xpath = "//td[@class='col firstname']") WebElement value_FirstName; 
    public @FindBy(xpath = "//td[@class='col lastname']") WebElement value_LastName;
    public @FindBy(xpath = "//td[@class='col city']") WebElement value_City; 
    public @FindBy(xpath = "//td[@class='col country']") WebElement value_Country; 
    public @FindBy(xpath = "//td[@class='col state']") WebElement value_State; 
    public @FindBy(xpath = "//td[@class='col zip']") WebElement value_ZipPostalCode; 
    public @FindBy(xpath = "//td[@class='col phone']") WebElement value_Phone;
    //Upgrade magento 2.3.1
	public AddressBookPage() throws IOException {
		super();

	}

	public AddressBookPage addressBookPageEle() throws Exception {
     // Address book label
		try {
			WebElement addressBookLabel = label_AddressBook;
			if (addressBookLabel.isDisplayed()) {
				Thread.sleep(3000);
				String expected = "Address Book";
				String actual = getDriver().getTitle();
				Assert.assertEquals(actual, expected);
				System.out.println("*******Address book label is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found addressbook label************");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Default Addresses label
		try {
			WebElement defaultAddressesLabel = label_DefaultAddresses;
			if (defaultAddressesLabel.isDisplayed()) {

				System.out.println("*******Default Addresses label is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Default Addresses label************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// DefaultBillingAddress label
		try {
			WebElement defaultBillingAddressLabel = label_DefaultBillingAddress;
			if (defaultBillingAddressLabel.isDisplayed()) {

				System.out.println("*******DefaultBilling Address Label is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Default Addresses label************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// hyperlink_ChangeBillingAddress link

		try {
			WebElement ChangeBillingAddressLink = hyperlink_ChangeBillingAddress;
			if (ChangeBillingAddressLink.isDisplayed()) {

				System.out.println("*******Change Billing Address link is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Change Billing Address link************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// DefaultShippingAddress label
		try {
			WebElement DefaultShippingAddressLabel = label_DefaultShippingAddress;
			if (DefaultShippingAddressLabel.isDisplayed()) {

				System.out.println("*******Change Billing Address link is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Change Billing Address link************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// ChangeShippingAddress link

		try {
			WebElement ChangeShippingAddressLink = hyperlink_ChangeShippingAddress;
			if (ChangeShippingAddressLink.isDisplayed()) {

				System.out.println("*******Change Billing Address link is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Change ShippingAddress link************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// AdditionalAddressEntries label

		try {
			WebElement AdditionalAddressEntriesLabel = label_AdditionalAddressEntries;
			if (AdditionalAddressEntriesLabel.isDisplayed()) {

				System.out
						.println("*******Additional AddressEntries label is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found AdditionalAddressEntries label************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		// Add New Address button

		try {
			WebElement AddNewAddressbutton = button_AddNewAddress;
			if (AddNewAddressbutton.isDisplayed()) {

				System.out.println("******* Add New Address button is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found  Add New Address button ************");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		return new AddressBookPage();
	}

	public AddressBookPage clickChangeBillingAddressLink() throws Exception {

		// Click on Change Billing Address

		waitAndClickElement(hyperlink_ChangeBillingAddress);
		Thread.sleep(3000);

		return new AddressBookPage();

	}

	public AddressBookPage getEditAddressPage() throws Exception {

		// Get Edit address book page getEditAddressPage()

		try {
			WebElement EditAddressLabel = label_EditAddress;
			if (EditAddressLabel.isDisplayed()) {
				Thread.sleep(3000);

				System.out.println("*******Edit Address Label  is dispalying on addressbook page***********");
			} else {
				System.out.println("*******TEST FAILED to found Edit Address label************");
			}

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		return new AddressBookPage();

	}

	public AddressBookPage getEditAddressPageEle() throws Exception {
		try{

		// First Name Label
		WebElement firstNameLabel = label_FirstName;
		Assert.assertEquals(true, firstNameLabel.isDisplayed());
		System.out.println("First Name label is dispalying");

		// First Name text field
		WebElement firstNameTextField = textfield_FirstName;
		Assert.assertEquals(true, firstNameTextField.isDisplayed());
		System.out.println("First Name text field is displaying");

		// Last Name Label
		WebElement lastNameLabel = label_LastName;
		Assert.assertEquals(true, lastNameLabel.isDisplayed());
		System.out.println("Last Name Label is dispalying");

		// Last Name text field
		WebElement lastNametextField = textfield_LastName;
		Assert.assertEquals(true, lastNametextField.isDisplayed());
		System.out.println("Last Name text field is dispalying");

		// Company Label
		WebElement companyLabel = label_Company;
		Assert.assertEquals(true, companyLabel.isDisplayed());
		System.out.println("Company Label is displaying");

		// Company text field
		WebElement companyTextField = textfield_Company;
		Assert.assertEquals(true, companyTextField.isDisplayed());
		System.out.println("Company text field is dispalying");

		// Phone Number Label
		WebElement phoneNumberLabel = label_PhoneNumber;
		Assert.assertEquals(true, phoneNumberLabel.isDisplayed());
		System.out.println("Phone number Label is displaying");

		// Phone Number text field
		WebElement phoneNumberTextField = textfield_PhoneNumber;
		Assert.assertEquals(true, phoneNumberTextField.isDisplayed());
		System.out.println("Phone number text field is dispalying");

		// Address Label
		WebElement addressLabel = label_Address;
		Assert.assertEquals(true, addressLabel.isDisplayed());
		System.out.println("Address Label is dispalying");

		// Street Address label
		WebElement streetAddressLabel = label_StreetAddress;
		Assert.assertEquals(true, streetAddressLabel.isDisplayed());
		System.out.println("Street Address label is dispalying");

		// Street Address textfield1
		WebElement streetAddressTextField1 = textfield_StreetAddress1;
		Assert.assertEquals(true, streetAddressTextField1.isDisplayed());
		System.out.println("Street Address textfield1 is displaying");

		// Street Address textfield2
		WebElement streetAddressTextField2 = textfield_StreetAddress2;
		Assert.assertEquals(true, streetAddressTextField2.isDisplayed());
		System.out.println("Street Address textfield2 is displaying");

		// City Label
		WebElement cityLabel = label_City;
		Assert.assertEquals(true, cityLabel.isDisplayed());
		System.out.println("City label is displaying");

		// City TextField
		WebElement cityTextField = textfield_City;
		Assert.assertEquals(true, cityTextField.isDisplayed());
		System.out.println("City text field is displaying");

		// State/Province
		WebElement stateProvinceLabel = label_StateProvince;
		Assert.assertEquals(true, stateProvinceLabel.isDisplayed());
		System.out.println("State Province Label is dispalying");

		// State/Province text Field
		//WebElement stateProvinceTextField = textfield_StateProvince;
		//Assert.assertEquals(true, stateProvinceTextField.isDisplayed());
		//System.out.println("State/Province text Field is displaying");

		// Zip/postal code
		WebElement zipPostalCodeLabel = label_ZipPostalCode;
		Assert.assertEquals(true, zipPostalCodeLabel.isDisplayed());
		System.out.println("Zip/postal code is dispalying");

		// Zip/postal code text Field
		WebElement zipPostalCodeTextField = textfield_ZipPostalCode;
		Assert.assertEquals(true, zipPostalCodeTextField.isDisplayed());
		System.out.println("/Zip/postal code text Field is displaying");

		// country
		WebElement country = label_Country;
		Assert.assertEquals(true, country.isDisplayed());
		System.out.println("Country Label is dispalying");

		// country dropdown
		WebElement countryDropDown = dropDown_Country;
		Assert.assertEquals(true, countryDropDown.isDisplayed());
		System.out.println("Country DropDown is displaying");

		// Save Address button
		WebElement saveAddressButton = button_SaveAddress;
		Assert.assertEquals(true, saveAddressButton.isDisplayed());
		System.out.println("Save Address button is displaying");
        Thread.sleep(3000);
		}
	catch(Exception editAddressBook){
		System.out.println(editAddressBook.getMessage());
		
		}
        
		return new AddressBookPage();
	}
	//Magento 2 Upgrade 2.3.1
	
/*	public AddressBookPage clickAddressBookLinkUnderAddressBookPage() throws Exception {
	waitAndClickElement(Link_AddressBook);
		return new AddressBookPage();
		}*/
//Magento 2 Upgrade 2.3.1
	
	//Change shipping address page
	public AddressBookPage clickChangeShippingAddressLink() throws Exception {
		waitAndClickElement(hyperlink_ChangeShippingAddress);
		Thread.sleep(3000);
		return new AddressBookPage();
		}
		
    
	public AddressBookPage clickAddNewAddressBtn() throws Exception {
		waitAndClickElement(button_AddNewAddress);
		Thread.sleep(3000);
        System.out.println("User clicks on add new address button under addressbook");
        return new AddressBookPage();
	}

	public AddressBookPage addNewAddressPage() throws Exception {
		WebElement addNewAddressPage = addNewAddressSection;
		Assert.assertEquals(true, addNewAddressPage.isDisplayed());
		System.out.println("Add new address page is dispalying");
	    return new AddressBookPage();
	}

	public AddressBookPage addNewAddressPageEle() throws Exception {
		try {

			// Other fields
			// First Name Label
			WebElement firstNameLabel = label_FirstName;
			Assert.assertEquals(true, firstNameLabel.isDisplayed());
			System.out.println("First Name label is dispalying");

			// First Name text field
			WebElement firstNameTextField = textfield_FirstName;
			Assert.assertEquals(true, firstNameTextField.isDisplayed());
			System.out.println("First Name text field is displaying");

			// Last Name Label
			WebElement lastNameLabel = label_LastName;
			Assert.assertEquals(true, lastNameLabel.isDisplayed());
			System.out.println("Last Name Label is dispalying");

			// Last Name text field
			WebElement lastNametextField = textfield_LastName;
			Assert.assertEquals(true, lastNametextField.isDisplayed());
			System.out.println("Last Name text field is dispalying");

			// Company Label
			WebElement companyLabel = label_Company;
			Assert.assertEquals(true, companyLabel.isDisplayed());
			System.out.println("Company Label is displaying");

			// Company text field
			WebElement companyTextField = textfield_Company;
			Assert.assertEquals(true, companyTextField.isDisplayed());
			System.out.println("Company text field is dispalying");

			// Phone Number Label
			WebElement phoneNumberLabel = label_PhoneNumber;
			Assert.assertEquals(true, phoneNumberLabel.isDisplayed());
			System.out.println("Phone number Label is displaying");

			// Phone Number text field
			WebElement phoneNumberTextField = textfield_PhoneNumber;
			Assert.assertEquals(true, phoneNumberTextField.isDisplayed());
			System.out.println("Phone number text field is dispalying");

			// Address Label
			WebElement addressLabel = label_Address;
			Assert.assertEquals(true, addressLabel.isDisplayed());
			System.out.println("Address Label is dispalying");

			// Street Address label
			WebElement streetAddressLabel = label_StreetAddress;
			Assert.assertEquals(true, streetAddressLabel.isDisplayed());
			System.out.println("Street Address label is dispalying");

			// Street Address textfield1
			WebElement streetAddressTextField1 = textfield_StreetAddress1;
			Assert.assertEquals(true, streetAddressTextField1.isDisplayed());
			System.out.println("Street Address textfield1 is displaying");

			// Street Address textfield2
			WebElement streetAddressTextField2 = textfield_StreetAddress2;
			Assert.assertEquals(true, streetAddressTextField2.isDisplayed());
			System.out.println("Street Address textfield2 is displaying");

			// City Label
			WebElement cityLabel = label_City;
			Assert.assertEquals(true, cityLabel.isDisplayed());
			System.out.println("City label is displaying");

			// City TextField
			WebElement cityTextField = textfield_City;
			Assert.assertEquals(true, cityTextField.isDisplayed());
			System.out.println("City text field is displaying");

			// State/Province
			WebElement stateProvinceLabel = label_StateProvince;
			Assert.assertEquals(true, stateProvinceLabel.isDisplayed());
			System.out.println("State Province Label is dispalying");

			// State/Province dropdown
			WebElement stateProvinceDropDown = label_StateProvince;
			Assert.assertEquals(true, stateProvinceDropDown.isDisplayed());
			System.out.println("State Province Label is dispalying");
			// Zip/postal code
			WebElement zipPostalCodeLabel = label_ZipPostalCode;
			Assert.assertEquals(true, zipPostalCodeLabel.isDisplayed());
			System.out.println("Zip/postal code is dispalying");

			// Zip/postal code text Field
			WebElement zipPostalCodeTextField = textfield_ZipPostalCode;
			Assert.assertEquals(true, zipPostalCodeTextField.isDisplayed());
			System.out.println("/Zip/postal code text Field is displaying");

			// country
			WebElement country = label_Country;
			Assert.assertEquals(true, country.isDisplayed());
			System.out.println("Country Label is dispalying");

			// country dropdown
			WebElement countryDropDown = dropDown_Country;
			Assert.assertEquals(true, countryDropDown.isDisplayed());
			System.out.println("Country DropDown is displaying");

			// Save Address button
			WebElement saveAddressButton = button_SaveAddress;
			Assert.assertEquals(true, saveAddressButton.isDisplayed());
			System.out.println("Save Address button is displaying");
			Thread.sleep(3000);

			// Use as my default billing address checkbox
			WebElement myDefaultBillingAddressCheckbox = checkBox_myDefaultBillingAddress;
			Assert.assertEquals(true, myDefaultBillingAddressCheckbox.isDisplayed());
			System.out.println("Use as my default billing address checkbox is displaying");
			Thread.sleep(3000);

			// Use as my default billing address Label
			WebElement myDefaultBillingAddressLabel = Label_myDefaultBillingAddress;
			Assert.assertEquals(true, myDefaultBillingAddressLabel.isDisplayed());
			System.out.println("Use as my default billing address Label is displaying");
			Thread.sleep(3000);

			// Use as my default shipping address checkbox
			WebElement myDefaultShippingAddressCheckbox = checkbox_myShippingAddress;
			Assert.assertEquals(true, myDefaultShippingAddressCheckbox.isDisplayed());
			System.out.println("Use as my default billing address checkbox is dispalying");
			Thread.sleep(3000);

			// Use as my default shipping address checkbox
			WebElement myDefaultShippingAddressLabel = Label_myShippingAddress;
			Assert.assertEquals(true, myDefaultShippingAddressLabel.isDisplayed());
			System.out.println("Use as my default shipping address label is displaying");
			Thread.sleep(3000);
		    } catch (Exception addBookFields) {
			System.out.println(addBookFields.getMessage());
		}
		return new AddressBookPage();
	}
	
	
	 public AddressBookPage clickSaveAddressBtn() throws Exception {
			waitAndClickElement(button_SaveAddress);
			Thread.sleep(3000); 
		  return new AddressBookPage();
	 }
	
	public AddressBookPage addressBookRequiredFeilds() throws Exception {
		// Phone Number text field required validation
		WebElement phoneNumberrequiredField = textField_PhoneNumberRequired;
		Assert.assertEquals(true, phoneNumberrequiredField.isDisplayed());
		System.out.println("Phone number text field is dispalying");

		// Street Address textfield1
		WebElement streetAddressRequiredField = textField_streetAddress1Required;
		Assert.assertEquals(true, streetAddressRequiredField.isDisplayed());
		System.out.println("Street Address textfield1 is displaying");

		// City TextField
		WebElement cityRequiredFiled = textField_CityRequired;
		Assert.assertEquals(true, cityRequiredFiled.isDisplayed());
		System.out.println("City text field is displaying");
		
		
		// State/Province text Field
		WebElement stateProvinceRequiredField = StateProvinceRequired;
		Assert.assertEquals(true, stateProvinceRequiredField.isDisplayed());
		System.out.println("State/Province text Field is displaying");
		
		// Zip/postal code text Field
		WebElement zipPostalCodeRequiredField = ZipPostalCodeRequired;
		Assert.assertEquals(true, zipPostalCodeRequiredField.isDisplayed());
		System.out.println("/Zip/postal code text Field is displaying");
		
		return new AddressBookPage();
	 }

   public AddressBookPage getSuccessMessages() throws Exception {
		
	   
	   WebElement changeBillingAddressMsg = successMessage_Address;
		Assert.assertEquals(true, changeBillingAddressMsg.isDisplayed());
		System.out.println("User saved change billing address and success message displayed at address book");
        return new AddressBookPage();
        
	 }

   public AddressBookPage captureNewAddress() throws Exception {
	   
	sendKeysToWebElement(textfield_PhoneNumber,"0738454870");
	clickOnTextFromDropdownList(dropDown_Country,"South Africa");
   	sendKeysToWebElement(textfield_StreetAddress1,"32 jamesion street");
   	sendKeysToWebElement(textfield_City,"Cape Town");
   	clickOnTextFromDropdownList(textfield_StateProvince,"Cape Town");
   	Thread.sleep(3000);
   	sendKeysToWebElement(textfield_ZipPostalCode,"7441");
   	
   	Thread.sleep(3000);
    return new AddressBookPage();
	 }


  public AddressBookPage additionalAddressEntries() throws Exception {
	  
/*	  	WebElement address = addressValidation_NewAddress;
		if(address.getText().contains("32 jamesion street")){
			System.out.println(address.getText());
			System.out.println("User saved new address dispalying at additional entries");
		}
		else{
			System.out.println("User Failed to save address under additional entiries");
		}
		*/
	  
	  
	   //After upgrade magento 2.3.1
	  
	    //First name label
	    Assert.assertEquals(true, label_FirstNameTable.isDisplayed());
		System.out.println("First Name label dispalying under additional entries");
		
	    //Last Name label
	    Assert.assertEquals(true, label_LastNameTable.isDisplayed());
		System.out.println("Last Name label dispalying under additional entries");
	   
		//Street Addresslabel
	    Assert.assertEquals(true, label_StreetAddressTable.isDisplayed());
		System.out.println("Street Addresslabel dispalying under additional entries");
	  
		//City label
		Assert.assertEquals(true, label_CityTable.isDisplayed());
		System.out.println("City label dispalying under additional entries");
		
	    //Country label	
	  
		Assert.assertEquals(true, label_CountryTabele.isDisplayed());
		System.out.println("Country label dispalying under additional entries");
		
	    //State label
		Assert.assertEquals(true, label_StateTable.isDisplayed());
		System.out.println("State label dispalying under additional entries");
		
	    //Zip/Postal Code label
	  
		Assert.assertEquals(true, label_ZipPostalCodeTable.isDisplayed());
		System.out.println("Zip/Postal Code label dispalying under additional entries");
	   
		//Phone label
	    Assert.assertEquals(true, label_Phone.isDisplayed());
		System.out.println("Phone label dispalying under additional entries");
		
		//Edit label
		Assert.assertEquals(true, hyperLink_Edit.isDisplayed());
		System.out.println("Edit label dispalying under additional entries");
		
		//Delete label
		Assert.assertEquals(true, hyperLink_Delete.isDisplayed());
		System.out.println("Delete label dispalying under additional entries");
		
		//Show label
		Assert.assertEquals(true, label_ShowText.isDisplayed());
		System.out.println("Show label dispalying under additional entries");
		
		//Drop down show
		Assert.assertEquals(true, dropDown_Show.isDisplayed());
		System.out.println("Drop down show dispalying under additional entries");
		
		//Per Page label
		Assert.assertEquals(true, label_PerPageText.isDisplayed());
		System.out.println("Per Page label dispalying under additional entries");
		
		//Items label
		Assert.assertEquals(true, label_ItemsToolBar.isDisplayed());
		System.out.println("Items label dispalying under additional entries");
		
		//Address Validation
		WebElement addressVal = value_StreetAddress;
		if(addressVal.getText().contains("32 jamesion street")){
			System.out.println(addressVal.getText());
			System.out.println("User saved new address dispalying at additional entries");
		}
		else{
			System.out.println("User Failed to save address under additional entiries");
		}
		
		//FirstName table value validation
		WebElement firstNameVal = value_FirstName;
		if(firstNameVal.getText().contains("anusha")){
			System.out.println(firstNameVal.getText());
			System.out.println("First Name table value dispalying corrcet");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		
		//Last Name Table value validation
		WebElement lastNameVal = value_LastName;
		if(lastNameVal.getText().contains("kariveda")){
			System.out.println(lastNameVal.getText());
			System.out.println("Last name table value dispalying correct");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		//City table value validation
		WebElement  cityVal= value_City;
		if(cityVal.getText().contains("Cape Town")){
			System.out.println(cityVal.getText());
			System.out.println("City table value dispalying correct");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		//Country table value validation
		WebElement countryVal = value_Country; 
		if(countryVal.getText().contains("South Africa")){
			System.out.println(countryVal.getText());
			System.out.println("Country table value dispalying corrcet");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		//State table value validation
		WebElement stateVal = value_State; 
		if(stateVal.getText().contains("Cape Town")){
			System.out.println(stateVal.getText());
			System.out.println("State table value table value dispalying corrcet");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		//Zip/Postal Code table value validation
		WebElement zipPostalCodeVal = value_ZipPostalCode; 
		if(zipPostalCodeVal.getText().contains("7441")){
			System.out.println(zipPostalCodeVal.getText());
			System.out.println("Zip/Postal Code table value table value dispalying corrcet");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		//Phone table value validation
		WebElement phoneVal= value_Phone;
		if(phoneVal.getText().contains("0738454870")){
			System.out.println(phoneVal.getText());
			System.out.println("Phone table value table value dispalying corrcet");
		}
		else{
			System.out.println("******Failed**********");
		}
		
		
		//After upgrade magento 2.3.1
	  
		 return new AddressBookPage();
  }

  public AddressBookPage editAddress() throws Exception {
	   waitAndClickElement(hyperLink_Edit);
		Thread.sleep(3000); 
	     return new AddressBookPage();
}
  public AddressBookPage checkBoxMyDefaultBillingAddress() throws Exception {
	  
	   waitAndClickElement(checkBox_myDefaultBillingAddress);
	   Thread.sleep(3000);
	     return new AddressBookPage();
  }
  
  public AddressBookPage defaultBillingAddressValidation() throws Exception {
	  WebElement billingAddress = addressValidation_defaultBillingAddress ;
		if(billingAddress.getText().contains("32 jamesion street")){
			System.out.println(billingAddress.getText());
			System.out.println("User successfully changed additional address as a default billing address");
		}
		else{
			System.out.println("User Failed to changed additional address as a default billing address");
		}
		
		return new AddressBookPage();
  }
  
  public AddressBookPage checkBoxMyDefaultShippingAddress() throws Exception {
	  waitAndClickElement(checkbox_myShippingAddress);
	  Thread.sleep(3000);
	  return new AddressBookPage();
  }
  
	public AddressBookPage defaultShippingAddressValidation() throws Exception {
		WebElement shippingAddress = addressValidation_defaultShippingAddress;
		if (shippingAddress.getText().contains("32 jamesion street")) {
			System.out.println(shippingAddress.getText());
			System.out.println("User successfully changed default billing address as shipping address");
		} else {
			System.out.println("User Failed to changed default billing address as shipping address");
		}

		return new AddressBookPage();
	}

	public AddressBookPage deleteAddress() throws Exception {
		waitAndClickElement(hyperLink_Delete);
		Thread.sleep(3000);

		return new AddressBookPage();
	}

	public AddressBookPage popUpMessage() throws Exception {
		WebElement popUpAddress = popUp_deleteAddressPopUpWindow;
		if (popUpAddress.isDisplayed()) {
			System.out.println("Pop up message is dispalyed when user clicks 'delete address'ink");

		} else {
			System.out.println("Failed to display popup message when user clicks 'delete address'ink");
		}

		return new AddressBookPage();
	}

	public AddressBookPage cancelButtonPopUp() throws Exception {
		waitAndClickElement(popButton_cancelBtn);
		Thread.sleep(3000);
		return new AddressBookPage();
	}

	public AddressBookPage OkButtonPopUp() throws Exception {
		waitAndClickElement(popButton_OkBtn);
		Thread.sleep(3000);
		return new AddressBookPage();
	}

	public AddressBookPage deleteAddressValidation() throws Exception {
		WebElement deleteAddressVal = addressVal_DeleteAddressValidation;
		if (deleteAddressVal.isDisplayed()) {
			System.out.println("Address deleted from the additional address entries");

		} else {
			System.out.println("Failed to delete address from the additional address entries");
		}

		return new AddressBookPage();
	}

    public AddressBookPage clearStreetAddress() throws Exception {
	   try{
		   WebElement updateEle = textfield_StreetAddress1;
		   updateEle.clear();
		   System.out.println("User clear the street address1 under default billing address"); 
	   }
	   catch(Exception upe){
		   System.out.println(upe.getMessage()); 
	   }

		return new AddressBookPage();
	}

   public AddressBookPage streetAddressVal() throws Exception {
	 
		System.out.println("User clear the street address1 under default billing address"); 
        return new AddressBookPage();
	}

   
  public AddressBookPage captureStreetAddress() throws Exception {
	  sendKeysToWebElement(textfield_StreetAddress1,"7 jamesion street");
      return new AddressBookPage();
	}

 //After upgrade fix magento 2.3.1
  public AddressBookPage navigateBackAddressBook() throws Exception {
	  getDriver().navigate().back();
	  System.out.println("User clicks navigate back");
	  Thread.sleep(6000);
	  return new AddressBookPage();
  }

//After upgrade fix magento 2.3
  
   public AddressBookPage preDeleteAdditionalAddressEntries() throws Exception {
		try{
		    boolean present;
			try {
				label_NoAdditionalAddress.isDisplayed();
			present = true;
			} 
		 catch(Exception e) {
			present = false;
			System.out.println("set present to false");
			}
			
			if(present == true){
				boolean value = label_NoAdditionalAddress.isDisplayed();
				System.out.println("There are no additional address entries dispalyed" + value);
				
			}else if(present == false){
				//pop up handle
				waitAndClickElement(hyperLink_Delete);
				popUpMessage();
				System.out.println("User placed under pop up  message");
			    Thread.sleep(3000);
				OkButtonPopUp();
				//Assert.assertEquals(true, label_NoAdditionalAddress.isDisplayed());
				
			}else{
				System.out.println("********************User placed under wrong window******************");
				
			}

	     }	
	catch(Exception e){
		System.out.println("-------------- I have an error ----------------------");
		System.out.println(e.getMessage());
	}
	
	   
	    return new AddressBookPage();
   }


   public AddressBookPage  conformDeletionSuccess() throws Exception {
   try{
	   label_NoAdditionalAddress.isDisplayed();
	   System.out.println("User successfuly delete address or there were no additional address");
   }
   catch(Exception failDel){
	   System.out.println(failDel.getMessage());  
   }
   return new AddressBookPage();
}
   public AddressBookPage addDefaultAddresses() throws Exception {
		try{
		    boolean present;
			try {
				button_SaveAddress.isDisplayed();
			present = true;
			} 
		 catch(Exception e) {
			present = false;
			System.out.println("Deafult addresses dispalyed");
			}
			
			if(present == true){
				boolean value = button_SaveAddress.isDisplayed();
				System.out.println("There are no address entries dispalyed" + value);
				captureNewAddress();
				Thread.sleep(3000);
				clickSaveAddressBtn();
				Thread.sleep(8000);
				getSuccessMessages();
				
				System.out.println("User successfully added new default address");
			}else if(present == false){
				
				System.out.println("There are default address exist already so user not adding extra addresses");
			    Thread.sleep(3000);
				
				Assert.assertEquals(true, label_DefaultAddresses.isDisplayed());
				
			}else{
				System.out.println("********************User placed under wrong window******************");
				
			}

	     }	
	catch(Exception e){
		System.out.println("-------------- I have an error ----------------------");
		System.out.println(e.getMessage());
	}
		   return new AddressBookPage();
  }
}