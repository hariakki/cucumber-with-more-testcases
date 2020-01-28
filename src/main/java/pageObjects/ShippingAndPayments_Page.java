package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.testng.Assert;

public class ShippingAndPayments_Page extends BasePage {

	// Shipping details page

	public @FindBy(xpath = "//button[@title='Add to Cart']") WebElement button_AddToCart;
	public @FindBy(xpath = "//div[@data-bind='html: message.text']") WebElement message_SuccessAddToCart;
	public @FindBy(xpath = "//span[@class='counter-number']") WebElement buttonQty_MiniCart;
	public @FindBy(xpath = "//a[@class='action showcart']") WebElement button_MiniCart;
	public @FindBy(xpath = "//button[contains(.,'Proceed to Checkout')]") WebElement button_ProceedToCheckout;
	public @FindBy(xpath = "(//div[contains(@class,'step-title')])[1]") WebElement title_ShippingPage;
	public @FindBy(xpath = "//span[contains(.,'Company')]") WebElement textboxName_Company;
	public @FindBy(xpath = "(//input[@type='text'])[3]") WebElement textbox_Company;
	public @FindBy(xpath = "//span[contains(.,'Street Address')]") WebElement textboxName_StreetAddress;
	public @FindBy(xpath = "(//input[@type='text'])[4]") WebElement textbox_StreetAddressOne;
	public @FindBy(xpath = "(//input[@type='text'])[5]") WebElement textbox_StreetAddressTwo;
	public @FindBy(xpath = "//span[contains(.,'City')]") WebElement textboxName_City;
	public @FindBy(xpath = "//input[@name='city']") WebElement textbox_City;
	public @FindBy(xpath = "(//span[contains(.,'State/Province')])[1]") WebElement textboxName_StateProvince;
	public @FindBy(xpath = "//select[@name='region_id']") WebElement textbox_StateProvince;
	public @FindBy(xpath = "//span[contains(.,'Country')]") WebElement textboxName_Country;
	public @FindBy(xpath = "(//select[@class='select'])[2]") WebElement textbox_Country;
	public @FindBy(xpath = "//span[contains(.,'Zip/Postal Code')]") WebElement textboxName_ZipPostalCode;
	
	public @FindBy(xpath = "//input[contains(@name,'postcode')]") WebElement textbox_ZipPostalCode;
	public @FindBy(xpath = "(//input[@type='text'])[8]") WebElement textbox_PostalCode;
	
	public @FindBy(xpath = "//span[contains(.,'Phone Number')]") WebElement textboxName_PhoneNumber;
	public @FindBy(xpath = "//input[@name='telephone']") WebElement textbox_PhoneNumber;
	public @FindBy(xpath = "(//div[@data-role='title'])[2]") WebElement heading_ShippingMethods;
	public @FindBy(xpath = "(//input[@class='radio'])[1]") WebElement buttonRadio_DeliveryOpt1;
	public @FindBy(xpath = "(//input[@class='radio'])[2]") WebElement buttonRadio_DeliveryOpt2;
	public @FindBy(xpath = "//span[@class='title']") WebElement heading_OrderSummary;
	public @FindBy(xpath = "(//div[contains(@role,'tab')])[7]") WebElement button_ItemsInCart;
	public @FindBy(xpath = "//button[@data-role='opc-continue']") WebElement button_Next;

	// Payments details page

	public @FindBy(xpath = "//select[contains(@id,'GBRL65F')]") WebElement heading_CheckMoneyOrder;
	public @FindBy(xpath = "//div[@class='step-title'][contains(.,'Payment Method')]") WebElement title_PaymentMethod;
	public @FindBy(xpath = "//input[contains(@name,'billing-address-same-as-shipping')]") WebElement tickbox_BillingAndShippingSameAddress;
	public @FindBy(xpath = "(//span[contains(.,'My billing and shipping address are the same')])[1]") WebElement text_BillingAndShippingSameAddress;
	public @FindBy(xpath = "//th[contains(@data-bind,'i18n: title')]") WebElement text_CartSubTotal;
	public @FindBy(xpath = "//span[@class='label'][contains(.,'Shipping')]") WebElement text_Shipping;
	public @FindBy(xpath = "//strong[@data-bind='i18n: title'][contains(.,'Order Total')]") WebElement text_OrderTotal;
	public @FindBy(xpath = "(//span[contains(@class,'price')])[8]") WebElement Text_OrderTotalRandAmount;

	public @FindBy(xpath = "//span[contains(.,'Ship To:')]") WebElement Text_ShipTo;
	public @FindBy(xpath = "//span[contains(.,'Shipping Method:')]") WebElement Text_ShippingMethod;
	public @FindBy(xpath = "(//span[contains(.,'Apply Discount Code')])[2]") WebElement Text_ApplyDiscountCode;
	public @FindBy(xpath = "//span[contains(@class,'action action-toggle')]") WebElement Button_ApplyDiscountCodeDropDown;
	public @FindBy(xpath = "//button[@class='action primary checkout']") WebElement Button_PlaceOrder;
	public @FindBy(xpath = "(//span[contains(.,'1')])[5]") WebElement Text_QtyItemsInCart;
	public @FindBy(xpath = "//span[contains(@class,'base')]") WebElement title_SuccessOrderplacedPageTitle;

	// add new address on shipping address page
	public @FindBy(xpath = "//button[@class='action action-show-popup']") WebElement Button_AddNewAddressShipPage;
	public @FindBy(xpath = "//button[contains(@class,'action primary action-save-address')]") WebElement Button_SaveAddressShipPage;
	public @FindBy(xpath = "//input[@name='telephone']") WebElement textbox_PhoneNumberAddNew;
	public @FindBy(xpath = "//input[@name='postcode']") WebElement textbox_PostCode;
	
	// required fields error messages
	public @FindBy(xpath = "(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[1]") WebElement message_StreetAddreesField;
	public @FindBy(xpath = "(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[2]") WebElement message_CityField;
	public @FindBy(xpath = "(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[4]") WebElement message_StateProvinceField;
	public @FindBy(xpath = "(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[4]") WebElement message_ZipPostalCodeField;
	public @FindBy(xpath = "(//span[@data-bind='text: element.error'][contains(.,'This is a required field.')])[5]") WebElement message_PhoneNumberField;

	public ShippingAndPayments_Page() throws IOException {

		super();

	}

	// click add to cart button
	public ShippingAndPayments_Page userClicksAddToCart() throws IOException, InterruptedException {
		waitAndClickElement(button_AddToCart);
		Thread.sleep(7000);
		return new ShippingAndPayments_Page();

	}

	// see success message product added to cart
	public ShippingAndPayments_Page userSeeSuccessAddToCartMessage() throws IOException, InterruptedException {
		WebElement messageSuccessAddTocart = message_SuccessAddToCart;
		if (messageSuccessAddTocart.isDisplayed()) {
			System.out.println("Success Add To cart is displayig");

		} else {
			System.out.println("Success Add To cart IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeMiniCartQtyButton() throws IOException, InterruptedException {
		WebElement miniCartQTYButton = buttonQty_MiniCart;
		if (miniCartQTYButton.isDisplayed()) {
			System.out.println("Mini CArt increased by 1");

		} else {
			System.out.println("Mini CArt increased by 1 NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeMiniCartButton() throws IOException, InterruptedException {
		waitAndClickElement(button_MiniCart);
		Thread.sleep(5000);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeProceedToCheckoutButton() throws IOException, InterruptedException {
		WebElement proceedToCheckoutButton = button_ProceedToCheckout;
		if (proceedToCheckoutButton.isDisplayed()) {
			System.out.println("Proceed To Checkout Button is displaying");

		} else {
			System.out.println("Proceed To Checkout Button is NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userClicksProceedToCheckoutButton() throws IOException, InterruptedException {
		waitAndClickElement(button_ProceedToCheckout);
		Thread.sleep(5000);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeShippingPageTitle() throws IOException, InterruptedException {
		WebElement titleShippingPage = title_ShippingPage;
		if (titleShippingPage.isDisplayed()) {
			System.out.println("Shipping Page is displaying");

		} else {
			System.out.println("Shipping Page is NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeComanyTextboxName() throws IOException, InterruptedException {
		WebElement companyTextboxName = textboxName_Company;
		if (companyTextboxName.isDisplayed()) {
			System.out.println("Company Textbox Name is displaying");

		} else {
			System.out.println("Company Textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeComanyTextbox() throws IOException, InterruptedException {
		WebElement companyTextbox = textbox_Company;
		if (companyTextbox.isDisplayed()) {
			System.out.println("Company Textbox is displaying");

		} else {
			System.out.println("Company Textbox NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeStreetAddressTextboxName() throws IOException, InterruptedException {
		WebElement StreetAddresstboxName = textboxName_StreetAddress;
		if (StreetAddresstboxName.isDisplayed()) {
			System.out.println("Street Address Textbox Name is displaying");

		} else {
			System.out.println("Street Address Textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeStreetAddressTextboxOne() throws IOException, InterruptedException {
		WebElement StreetAddressOnetboxName = textbox_StreetAddressOne;
		if (StreetAddressOnetboxName.isDisplayed()) {
			System.out.println("Street Address Textbox One is displaying");

		} else {
			System.out.println("Street Address Textbox One NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeStreetAddressTextboxTwo() throws IOException, InterruptedException {
		WebElement StreetAddressTwotboxName = textbox_StreetAddressOne;
		if (StreetAddressTwotboxName.isDisplayed()) {
			System.out.println("Street Address Textbox Two is displaying");

		} else {
			System.out.println("Street Address Textbox Two NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeCityTextboxName() throws IOException, InterruptedException {
		WebElement CitytboxName = textboxName_City;
		if (CitytboxName.isDisplayed()) {
			System.out.println("City Textbox Name is displaying");

		} else {
			System.out.println("City Textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeCityTextbox() throws IOException, InterruptedException {
		WebElement citytTextbox = textbox_City;
		if (citytTextbox.isDisplayed()) {
			System.out.println("City Textbox is displaying");

		} else {
			System.out.println("City Textbox NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeStateProvinceTextboxName() throws IOException, InterruptedException {
		WebElement StateProvince = textboxName_StateProvince;
		if (StateProvince.isDisplayed()) {
			System.out.println("State Province textbox Name is displaying");

		} else {
			System.out.println("State Province textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeStateProvinceTextbox() throws IOException, InterruptedException {
		WebElement StateProvince = textbox_StateProvince;
		if (StateProvince.isDisplayed()) {
			System.out.println("State Province textbox is displaying");

		} else {
			System.out.println("State Province textbox NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePostalCodeTextboxName() throws IOException, InterruptedException {
		WebElement postalCodeTextboxName = textboxName_ZipPostalCode;
		if (postalCodeTextboxName.isDisplayed()) {
			System.out.println("Postal Code textbox Name is displaying");

		} else {
			System.out.println("Postal Code Province textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePostalCodeTextbox() throws IOException, InterruptedException {
		WebElement postalCodeTextbox = textbox_ZipPostalCode;
		if (postalCodeTextbox.isDisplayed()) {
			System.out.println("Postal Code textbox is displaying");

		} else {
			System.out.println("Postal Code Province textbox NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeCountryTextboxName() throws IOException, InterruptedException {
		WebElement countryTextboxName = textboxName_Country;
		if (countryTextboxName.isDisplayed()) {
			System.out.println("Country textbox Name is displaying");

		} else {
			System.out.println("Country textbox Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeCountryTextbox() throws IOException, InterruptedException {
		WebElement countryTextbox = textbox_Country;
		if (countryTextbox.isDisplayed()) {
			System.out.println("Country textbox  is displaying");

		} else {
			System.out.println("Country textbox  NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePhoneTextboxName() throws IOException, InterruptedException {
		WebElement phoneTextboxName = textboxName_PhoneNumber;
		if (phoneTextboxName.isDisplayed()) {
			System.out.println("Phone Number Name is displaying");

		} else {
			System.out.println("hone Number Name NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePhoneTextbox() throws IOException, InterruptedException {
		WebElement phoneTextbox = textbox_PhoneNumber;
		if (phoneTextbox.isDisplayed()) {
			System.out.println("Phone Number  is displaying");

		} else {
			System.out.println("Phone Number  NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeShippingMethodsHeading() throws IOException, InterruptedException {
		WebElement seeShippingMethodsHeading = heading_ShippingMethods;
		Assert.assertEquals(true, seeShippingMethodsHeading.isDisplayed());
		System.out.println("Shipping Method Heading is dispalying");
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeDeliveryOpt1tickbox() throws IOException, InterruptedException {
		WebElement seeDeliveryOpt1Tickbox = buttonRadio_DeliveryOpt1;
		if (seeDeliveryOpt1Tickbox.isDisplayed()) {
			System.out.println("Delivery Option1 is displayig");

		} else {
			System.out.println("Delivery Option1 IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeDeliveryOpt2tickbox() throws IOException, InterruptedException {
		WebElement seeDeliveryOpt2Tickbox = buttonRadio_DeliveryOpt2;
		if (seeDeliveryOpt2Tickbox.isDisplayed()) {
			System.out.println("Delivery Option2 is displayig");

		} else {
			System.out.println("Delivery Option2 IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeOrderSummaryHeading() throws IOException, InterruptedException {
		WebElement seeOrderSummaryHeading = heading_OrderSummary;
		if (seeOrderSummaryHeading.isDisplayed()) {
			System.out.println("Order Summary is displayig");

		} else {
			System.out.println("Order Summary  IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeItemInCartButton() throws IOException, InterruptedException {
		WebElement seeItemInCartButton = button_ItemsInCart;
		if (seeItemInCartButton.isDisplayed()) {
			System.out.println("Item In Cart Dropdown list button is displayig");

		} else {
			System.out.println("Item In Cart Dropdown list button  IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeNextButton() throws IOException, InterruptedException {
		WebElement seeNextButton = button_Next;
		Thread.sleep(2000);
		if (seeNextButton.isDisplayed()) {
			System.out.println("Next button is displayig");

		} else {
			System.out.println("Next button  IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterCompany(String company) throws Exception {
		sendKeysToWebElement(textbox_Company, company);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterstreet1(String street1) throws Exception {
		sendKeysToWebElement(textbox_StreetAddressOne, street1);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterstreet2(String street1) throws Exception {
		sendKeysToWebElement(textbox_StreetAddressTwo, street1);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEntercity(String city) throws Exception {
		sendKeysToWebElement(textbox_City, city);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterPostalCode(String postalcode) throws Exception {
		sendKeysToWebElement(textbox_ZipPostalCode, postalcode);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterPhoneNumber(String phonenumber) throws Exception {
		sendKeysToWebElement(textbox_PhoneNumber, phonenumber);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterStateProvince() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//select[@name='region_id']")).sendKeys("A");
		Thread.sleep(3000);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userEnterCountry() throws IOException, InterruptedException {
		driver.findElement(By.xpath("(//select[@class='select'])[2]")).sendKeys("U");

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userClicksNextButton() throws IOException, InterruptedException {
		waitAndClickElement(button_Next);
		Thread.sleep(10000);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePaymentMethodTitle() throws IOException, InterruptedException {
		WebElement seeSeePaymentMethodTitle = title_PaymentMethod;
		if (seeSeePaymentMethodTitle.isDisplayed()) {
			System.out.println("Payment Page title is displaying");

		} else {
			System.out.println("Payment Page title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeBillingAndShippingTickbox() throws IOException, InterruptedException {
		WebElement seeBillingAndShippingTickbox = tickbox_BillingAndShippingSameAddress;
		if (seeBillingAndShippingTickbox.isDisplayed()) {
			System.out.println("Payment Page title is displaying");

		} else {
			System.out.println("Payment Page title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeBillingAndShippingText() throws IOException, InterruptedException {
		WebElement seeBillingAndShippingTickbox = tickbox_BillingAndShippingSameAddress;
		if (seeBillingAndShippingTickbox.isDisplayed()) {
			System.out.println("Payment Page title is displaying");

		} else {
			System.out.println("Payment Page title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeCartTotalText() throws IOException, InterruptedException {
		WebElement seeCartTotalText = text_CartSubTotal;
		if (seeCartTotalText.isDisplayed()) {
			System.out.println("Cart Total Text is displaying");

		} else {
			System.out.println("Cart Total Text title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeOrderTotalText() throws IOException, InterruptedException {
		WebElement seeOrderTotalText = text_CartSubTotal;
		if (seeOrderTotalText.isDisplayed()) {
			System.out.println("Order Total Text is displaying");

		} else {
			System.out.println("Order Total Text title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeShippingText() throws IOException, InterruptedException {
		WebElement seeShippingText = text_Shipping;
		if (seeShippingText.isDisplayed()) {
			System.out.println("Cart Total Text is displaying");

		} else {
			System.out.println("Cart Total Text title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeOrderTotalRandText() throws IOException, InterruptedException {
		WebElement seeOrderTotalRandText = text_OrderTotal;
		if (seeOrderTotalRandText.isDisplayed()) {
			System.out.println("Order Total Rand Text is displaying");

		} else {
			System.out.println("Order Total Rand Text title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeQtyItemsInCart() throws IOException, InterruptedException {
		WebElement seeQtyItemsInCart = Text_QtyItemsInCart;
		if (seeQtyItemsInCart.isDisplayed()) {
			System.out.println("Qty Items In cart is displaying");

		} else {
			System.out.println("Qty Items In cart IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeShipToText() throws IOException, InterruptedException {
		WebElement seeShipToText = Text_ShipTo;
		if (seeShipToText.isDisplayed()) {
			System.out.println("Ship to address text is displaying");

		} else {
			System.out.println("Ship to address text IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeShippingMethodText() throws IOException, InterruptedException {
		// shipping to Method text
		WebElement seeShippingMethodText = Text_ShippingMethod;
		if (seeShippingMethodText.isDisplayed()) {
			System.out.println("Ship Method text is displaying");

		} else {
			System.out.println("Ship Method text IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeApplyDiscountCodeText() throws IOException, InterruptedException {
		// Apply discount text showing
		WebElement seeApplyDiscountCodeText = Text_ApplyDiscountCode;
		if (seeApplyDiscountCodeText.isDisplayed()) {
			System.out.println("Apply Discount COde text is displaying");

		} else {
			System.out.println("Apply Discount COde text IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeeApplyDiscountDropdownButton() throws IOException, InterruptedException {
		// Apply discount button showing
		WebElement sApplyDiscountDropdownButton = Button_ApplyDiscountCodeDropDown;
		if (sApplyDiscountDropdownButton.isDisplayed()) {
			System.out.println("Apply Discount code dropdown button  is displaying");

		} else {
			System.out.println("Apply Discount code dropdown button IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userSeePlaceOrderButton() throws IOException, InterruptedException {
		// see place order buton
		WebElement seePlaceOrderButton = Button_PlaceOrder;
		if (seePlaceOrderButton.isDisplayed()) {
			System.out.println("Place Order button  is displaying");

		} else {
			System.out.println("Place order button IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userclicksPlaceOrderButton() throws IOException, InterruptedException {
		// see place order buton
		waitAndClickElement(Button_PlaceOrder);
		Thread.sleep(4000);
		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeSuccessOrderPlacedPageTitle() throws IOException, InterruptedException {
		// Apply discount button showing
		WebElement seeSuccessOrderPlacedPageTitle = title_SuccessOrderplacedPageTitle;
		if (seeSuccessOrderPlacedPageTitle.isDisplayed()) {
			System.out.println("Order success page title  is displaying");

		} else {
			System.out.println("Order success page title IS NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userclicksDeliveryOption1Tickbox() throws IOException, InterruptedException {
		// see clicks delivery opt1
		waitAndClickElement(buttonRadio_DeliveryOpt1);
		Thread.sleep(7000);
		return new ShippingAndPayments_Page();

	}

	public ShippingAndPayments_Page userClicksAddNewAddressButton() throws IOException, InterruptedException {
		waitAndClickElement(Button_AddNewAddressShipPage);
		Thread.sleep(2000);

		return new ShippingAndPayments_Page();
	}

	public ShippingAndPayments_Page userSeeAddNewAddressButton() throws IOException, InterruptedException {
		WebElement newAddressButton = Button_AddNewAddressShipPage;
		if (newAddressButton.isDisplayed()) {
			System.out.println("New Address button is displaying");

		} else {
			System.out.println("New Address button NOT DISPLAYING");
		}

		return new ShippingAndPayments_Page();

	}
	//user clicks save address button on new address window
	
	public ShippingAndPayments_Page userClicksSaveAddressButton() throws IOException, InterruptedException {
		waitAndClickElement(Button_SaveAddressShipPage);
		Thread.sleep(7000);

		return new ShippingAndPayments_Page();
		
	}
	
	public ShippingAndPayments_Page userEnterPostCode(String postcode) throws Exception {
		sendKeysToWebElement(textbox_PostCode, postcode);
		return new ShippingAndPayments_Page();
		
	} 
	
	
	public ShippingAndPayments_Page userEnterPhoneNumberNew(String phone) throws Exception {
		sendKeysToWebElement(textbox_PhoneNumberAddNew, phone);
		return new ShippingAndPayments_Page();
		
		
	}
	
	
	
		
		//user see required fields error message on shipping page
		//phone number error field
		public ShippingAndPayments_Page userSeeRequiredFieldErrorMessages() throws IOException, InterruptedException {
			WebElement seePhoneNumberFieldErrorMessage = message_PhoneNumberField;
			if (seePhoneNumberFieldErrorMessage.isDisplayed()) {
				System.out.println("phone number error field is displayig");

			} else {
				System.out.println("phone number error fieldy  IS NOT DISPLAYING");
			} 
			
			//Street Address error field
			
			WebElement seeStreetAddressFieldErrorMessage = message_StreetAddreesField;
			if (seeStreetAddressFieldErrorMessage.isDisplayed()) {
				System.out.println("Street Address error field is displayig");

			} else {
				System.out.println("Street Address error field  IS NOT DISPLAYING");
			}
			
			//City error field
			
			WebElement seeCityFieldErrorMessage = message_CityField;
			if (seeCityFieldErrorMessage.isDisplayed()) {
				System.out.println("City error field is displayig");

			} else {
				System.out.println("City error field  IS NOT DISPLAYING");
			}
			
			
			//State Province error field
			WebElement seeStateProvinceFieldError = message_StateProvinceField;
			if (seeStateProvinceFieldError.isDisplayed()) {
				System.out.println("State/Province is displayig");

			} else {
				System.out.println("State/Province IS NOT DISPLAYING");
			}
			
			
			//Zip/Postal Code error field
			WebElement seeZipPostalFieldErrorFieldError = message_ZipPostalCodeField;
			if (seeZipPostalFieldErrorFieldError.isDisplayed()) {
				System.out.println("Zip/Postal Code error field is displayig");

			} else {
				System.out.println("Zip/Postal Code error field  IS NOT DISPLAYING");
			}

			return new ShippingAndPayments_Page();
	
	
}
}