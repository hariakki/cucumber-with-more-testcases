package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShoppingCartPage extends BasePage {
	
	public  String shoppingCartUrl = "http://devops.magento2.co.za/checkout/cart/";
	public String wishListUrl = "http://devops.magento2.co.za/wishlist/";
	
    public  @FindBy(xpath = "//h1[@class='page-title']//span[text()='Shopping Cart']") WebElement header_ShoppingCart;
    public  @FindBy(xpath = "//th[@class='col item']//span[text()='Item']") WebElement label_Item;
    public  @FindBy(xpath = "//th[@class='col price']//span[text()='Price']") WebElement label_Price;
    public  @FindBy(xpath = "//td[@class='col price']") WebElement textPrice_Price;
    public  @FindBy(xpath = "//th[@class='col qty']//span[text()='Qty']") WebElement label_Qty;
    public  @FindBy(xpath = "//input[@title='Qty']") WebElement textField_Qty;
    public  @FindBy(xpath = "//th[@class='col subtotal']//span[text()='Subtotal']") WebElement label_Subtotal;
    public  @FindBy(xpath = "//td[@class='col subtotal']") WebElement textSubtotal_Subtotal;
    public  @FindBy(xpath = "//tr//td//img[@class='product-image-photo']") WebElement image_ProductImage;
    public  @FindBy(xpath = "//table[@id='shopping-cart-table']//tr//td//a[text()='LifeLong Fitness IV']") WebElement hyperLink_ProductName;
   
    public  @FindBy(xpath = "//a//span[text()='Move to Wishlist']") WebElement hyperLink_MoveToWishList;
    public  @FindBy(xpath = "//a[@title='Edit item parameters']") WebElement hyperLink_Edit;
    public  @FindBy(xpath = "//a[@title='Remove item' and @class='action action-delete']") WebElement hyperLink_Delete;
    public  @FindBy(xpath = "//span[text()='Update Shopping Cart']") WebElement button_UpdateShoppingCart;
    public  @FindBy(xpath = "//strong[text()='Apply Discount Code']") WebElement label_ApplyDiscountCode;
    public  @FindBy(xpath = "//div[@class='title']//strong[@id='block-discount-heading']") WebElement dropDown_ApplyDiscountCode;
    public  @FindBy(xpath = "//input[@id='coupon_code']") WebElement textField_EnterDiscountCode;
    public  @FindBy(xpath = "//button[@value='Apply Discount']") WebElement button_ApplyDiscount;
    public  @FindBy(xpath = "//strong[text()='Summary']") WebElement header_Summary;
   // public  @FindBy(xpath = "//div[@class='title']//strong[@id='block-shipping-heading']") WebElement dropDown_EstimateShippingAndTax;
    public  @FindBy(xpath = "//strong[@id='block-shipping-heading']") WebElement label_EstimateShippingAndTax;
    public  @FindBy(xpath = "//span[text()='Country']") WebElement label_Country;
    public  @FindBy(xpath = "//select[@name='country_id']") WebElement dropDown_Country;
    public  @FindBy(xpath = "//span[text()='State/Province']") WebElement label_StateProvince;
    public  @FindBy(xpath = "//select[@name='region_id']") WebElement dropDown_StateProvince;
    public  @FindBy(xpath = "//span[text()='Zip/Postal Code']") WebElement label_ZipPostalCode;
    public  @FindBy(xpath = "//input[@name='postcode']") WebElement textField_ZipPostalCode;
    public  @FindBy(xpath = "//span[text()='Flat Rate']") WebElement label_FaltRate;
    public  @FindBy(xpath = "//input[@type='radio' and @id='s_method_flatrate_flatrate']") WebElement radioButton_FixedPrice;
    public  @FindBy(xpath = "//label[text()='Fixed']") WebElement label_FixedPrice;
    public  @FindBy(xpath = "//span[text()='Best Way']") WebElement label_BestWay;
    public  @FindBy(xpath = "//input[@id='s_method_tablerate_bestway']") WebElement radioButton_TableRate;
    public  @FindBy(xpath = "//label[text()='Table Rate']") WebElement label_TableRate;
    public  @FindBy(xpath = "//tr[@class='totals sub']//th[text()='Subtotal']") WebElement labelSubTotal_SubtotalSummary;
    public  @FindBy(xpath = "//tr[@class='totals-tax']//th[text()='Tax']") WebElement labelTax_TaxSummary;
    public  @FindBy(xpath = "//tr[@class='grand totals']//th//strong[text()='Order Total']") WebElement labelOrderTotal_OrderTotalSummary;
    public  @FindBy(xpath = "//button[@title='Proceed to Checkout']//span[text()='Proceed to Checkout']") WebElement button_ProceedToCheckOut;
    public  @FindBy(xpath = "//a//span[text()='Check Out with Multiple Addresses']") WebElement hyperLink_CheckOutWithMultipleAddresses;
   //Ship multiple addresses page
    public  @FindBy(xpath = "//h1[@class='page-title']//span[text()='Ship to Multiple Addresses']") WebElement page_ShipMultipleAddresses;
    
   //Messages
   public  @FindBy(xpath = "//div[text()='This is a required field.']") WebElement message_RequiredApplyDiscount;
   public  @FindBy(xpath = "//div[@role='alert']//div//div") WebElement message_SuccessCoupon;
   //public  @FindBy(xpath = "") WebElement message_InvalidCoupon;
   public  @FindBy(xpath = "//button[@class='action cancel primary']//span[text()='Cancel Coupon']") WebElement button_cancelCoupon; 
   public  @FindBy(xpath = "//div[text()='You canceled the coupon code.']") WebElement message_CancelCoupon;
   public  @FindBy(xpath = "//div[text()='LifeLong Fitness IV has been moved to your wish list.']") WebElement message_MoveShoppingCartToWishListMessage;
   public  @FindBy(xpath = "//p[text()='You have no items in your shopping cart.']") WebElement label_EmptyShoppingCart;
   public  @FindBy(xpath = "//p[text()='Click ']//a[@href='http://devops.magento2.co.za/']") WebElement hyperLink_Here;
   public  @FindBy(xpath = "//p[text()='Click ']") WebElement label_ClickHereToContinueShop;
   
   //WishList
   public @FindBy(xpath = "//span[text()='My Wish List']") WebElement page_WishListPage;
   public @FindBy(xpath = "//strong[@class='product-item-name']//a[@title='LifeLong Fitness IV']") WebElement hyperLink_WishListProductName;
   public @FindBy(xpath = "//button[@title='Add All to Cart']") WebElement button_AddAllToCartButton;
   public @FindBy(xpath = "//div[@class='message info empty']//span[text()='You have no items in your wish list.']") WebElement message_WishListEmptyMsg;
   
   public ShoppingCartPage() throws IOException {
		super();
	}	
	public ShoppingCartPage captureShoppingCartUrl() throws IOException, InterruptedException {
		getDriver().get(shoppingCartUrl);
		Thread.sleep(4000);
		
		return new ShoppingCartPage();
	}
	
	public ShoppingCartPage getShoppingCartPage() throws Exception {
		WebElement shoppingCartPage = header_ShoppingCart; //
		Assert.assertEquals(true, shoppingCartPage.isDisplayed());
		System.out.println("User placed under " + shoppingCartPage.getText());
		Thread.sleep(3000);
		return new ShoppingCartPage();

	}

	public ShoppingCartPage productInformationTableVal() throws Exception {

		// Shopping Cart Header
		try {
			WebElement shoppingCartHeader = header_ShoppingCart;
			if (shoppingCartHeader.isDisplayed()) {

				System.out.println("*******Shopping cart header is displaying***********");
			} else {
				System.out.println("*******TEST FAILED to dispaly Shopping cart header************");
			}

		} catch (Exception shoppingCartHeader) {
			System.out.println(shoppingCartHeader.getMessage());
		}

		// Item label
		try {
			WebElement itemLabel = label_Item;
			if (itemLabel.isDisplayed()) {

				System.out.println("*******Item Heading is displaying***********");
			} else {
				System.out.println("*******TEST FAILED to dispaly item header************");
			}

		} catch (Exception itemLabel) {
			System.out.println(itemLabel.getMessage());
		}
		

		// Price label
		
		try {
			WebElement priceLabel = label_Price;
			if (priceLabel.isDisplayed()) {

				System.out.println("*******Price Heading is displaying***********");
			} else {
				System.out.println("*******TEST FAILED to dispaly price header************");
			}

		} catch (Exception priceLabel) {
			System.out.println(priceLabel.getMessage());
		}

		// QTY label

		WebElement qtyLabel = label_Qty; 
		Assert.assertEquals(true, qtyLabel.isDisplayed());
		System.out.println("Quantity label is displaying as " + qtyLabel.getText());
		Thread.sleep(3000);
		
		// Subtotal label
		
		WebElement subTotal = label_Subtotal; 
		Assert.assertEquals(true, subTotal.isDisplayed());
		System.out.println("SubTotal label is displaying as " + subTotal.getText());
		Thread.sleep(3000);

		// Product image
		
		WebElement productImage = image_ProductImage;
		Assert.assertEquals(true, productImage.isDisplayed());
		System.out.println("Product image is displaying");
		Thread.sleep(3000);

		// Product link
		
		WebElement productNameLink = hyperLink_ProductName;
		Assert.assertEquals(true, productNameLink.isDisplayed());
		System.out.println("Product name link is displaying as " + productNameLink.getText());
		Thread.sleep(3000);
		
		// Price tabel value

		WebElement priceValueTextFiled = textPrice_Price; 
		Assert.assertEquals(true, priceValueTextFiled.isDisplayed());
		System.out.println("Price tabel value is displaying as " + priceValueTextFiled.getText());
		Thread.sleep(3000);
		
		// Qty input field
		WebElement qtyTextFiled = textField_Qty; 
		Assert.assertEquals(true, qtyTextFiled.isDisplayed());
		System.out.println("Qty input field is displaying");
		Thread.sleep(3000);
		
		
		// Subtotal table value
		WebElement subTotalValueTextFiled = textSubtotal_Subtotal;
		Assert.assertEquals(true, subTotalValueTextFiled.isDisplayed());
		System.out.println("Subtotal table value is displaying as " + subTotalValueTextFiled.getText());
		Thread.sleep(3000);

		// Move to wishlist link
		WebElement wishListLink = hyperLink_MoveToWishList; 
		Assert.assertEquals(true, wishListLink.isDisplayed());
		System.out.println("Move to wishlist link is displaying as " + wishListLink.getText());
		Thread.sleep(3000);

		// Edit link
		
		WebElement editLink = hyperLink_Edit;; 
		Assert.assertEquals(true, editLink.isDisplayed());
		System.out.println("Edit link is displaying as " + editLink.getText());
		Thread.sleep(3000);

		// Delete link
		
		WebElement deleteLink = hyperLink_Delete;; 
		Assert.assertEquals(true, deleteLink.isDisplayed());
		System.out.println("Delete link  is displaying as " + deleteLink.getText());
		Thread.sleep(3000);

		// Update shopping cart
		
		WebElement updateShoppingCartBtn = button_UpdateShoppingCart;
		Assert.assertEquals(true, updateShoppingCartBtn.isDisplayed());
		System.out.println("UpdateShoppingCart button is displaying as " + updateShoppingCartBtn.getText());
		Thread.sleep(3000);

		return new ShoppingCartPage();

	}

	public ShoppingCartPage summaryTabelVal() throws Exception {
		// Summary heading
		WebElement summaryHeader = header_Summary;
		Assert.assertEquals(true, summaryHeader.isDisplayed());
		System.out.println("Summary heading is displaying as " + summaryHeader.getText());
		Thread.sleep(3000);
		
		// Estimate shipping and tax dropdown label
		WebElement estimateShippingDropDown = label_EstimateShippingAndTax;
		Assert.assertEquals(true, estimateShippingDropDown.isDisplayed());
		System.out.println("Estimate shipping and tax dropdown label is displaying as " + estimateShippingDropDown.getText());
		Thread.sleep(3000);
		
		
		
		// Subtotal label under summary
		
		WebElement subTotalSummary = labelSubTotal_SubtotalSummary;
		Assert.assertEquals(true, subTotalSummary.isDisplayed());
		System.out.println("Subtotal label under summary is displaying as " + subTotalSummary.getText());
		Thread.sleep(3000);
		
	/*	// Tax label under summary
		
		WebElement taxLabelSummary = labelTax_TaxSummary;
		Assert.assertEquals(true, taxLabelSummary.isDisplayed());
		System.out.println("Tax label under summary is displaying as " + taxLabelSummary.getText());
		Thread.sleep(3000);*/
		
		// Order total label under summary
		
		WebElement orderTotalSummary = labelOrderTotal_OrderTotalSummary;
		Assert.assertEquals(true, orderTotalSummary.isDisplayed());
		System.out.println(" Order total label under summary is displaying as " + orderTotalSummary.getText());
		Thread.sleep(3000);
		
		// Proceed to checkout button
		
		WebElement proceedToCheckOutSummary = button_ProceedToCheckOut;
		Assert.assertEquals(true, proceedToCheckOutSummary.isDisplayed());
		System.out.println("Proceed to checkout button is displaying as " + proceedToCheckOutSummary.getText());
		Thread.sleep(3000);
		
	/*	// Checkout with multiple adddresses link
		
		WebElement checkOutMultiple = hyperLink_CheckOutWithMultipleAddresses;
		Assert.assertEquals(true, checkOutMultiple.isDisplayed());
		System.out.println("Checkout with multiple adddresses link is displaying as " + checkOutMultiple.getText());
		Thread.sleep(3000);*/
		
		return new ShoppingCartPage();

	}

	public ShoppingCartPage applyDisscountCodeVal() throws Exception {

		// Apply discount code dropdown label
		
		WebElement applyDiscount = label_ApplyDiscountCode;
		Assert.assertEquals(true, applyDiscount.isDisplayed());
		System.out.println("Apply discount code dropdown label is displaying as " + applyDiscount.getText());
		Thread.sleep(3000);
	
		
		return new ShoppingCartPage();

	}

	public ShoppingCartPage clickApplyDiscountCode() throws Exception {
		waitAndClickElement(label_ApplyDiscountCode);
		System.out.println("User succesfully clicked on the Apply discount drop down");
		Thread.sleep(4000);
		
		return new ShoppingCartPage();

	}

    public ShoppingCartPage getApplyDiscountCode() throws Exception {

		// Apply discount code text field
		
		WebElement applyDiscountCodeTextField = textField_EnterDiscountCode;
		Assert.assertEquals(true, applyDiscountCodeTextField.isDisplayed());
		System.out.println(" Apply discount code text field is displaying ");
		Thread.sleep(3000);
		
		// Apply discount button
		
		WebElement applyDiscountButton = button_ApplyDiscount;
		Assert.assertEquals(true, applyDiscountButton.isDisplayed());
		System.out.println("Apply discount buttonis displaying as " + applyDiscountButton.getText());
		Thread.sleep(3000);

        return new ShoppingCartPage();
    }
    
    
    public ShoppingCartPage clickEstimateShippingandTaxDropdown() throws Exception {
    	waitAndClickElement(label_EstimateShippingAndTax);
    	System.out.println("User succesfully clicked on the EstimateShippingTaxDropdown");
    	Thread.sleep(3000);
    	return new ShoppingCartPage();
    	}
    
    
    public ShoppingCartPage getEstimateShippingFields() throws Exception {
    	// Country label

		WebElement countryLabel = label_Country;
		Assert.assertEquals(true, countryLabel.isDisplayed());
		System.out.println("Country label is displaying as " + countryLabel.getText());
		Thread.sleep(3000);
		
		// Country drop down
		
		WebElement updateShoppingCartBtn = button_UpdateShoppingCart;
		Assert.assertEquals(true, updateShoppingCartBtn.isDisplayed());
		System.out.println("Country drop down is displaying as " + updateShoppingCartBtn.getText());
		Thread.sleep(3000);
		
	/*	// State/province label
		
		WebElement stateProvinceLabel = label_StateProvince;
		Assert.assertEquals(true, stateProvinceLabel.isDisplayed());
		System.out.println("State/province label is displaying as " + stateProvinceLabel.getText());
		Thread.sleep(3000);
		
		// State/province dropdown
		
		WebElement stateProvinceDropdown = dropDown_StateProvince;
		Assert.assertEquals(true, stateProvinceDropdown.isDisplayed());
		System.out.println("State/province dropdown is displaying as " + updateShoppingCartBtn.getText());
		Thread.sleep(3000);*/
		
		// Zip/postalcode label
		
		WebElement zipPostalCodeLabel = label_ZipPostalCode;;
		Assert.assertEquals(true, zipPostalCodeLabel.isDisplayed());
		System.out.println("Zip/postalcode label is displaying as " + zipPostalCodeLabel.getText());
		Thread.sleep(3000);
		
		// Zip/postalcode textfield
		
		WebElement zipPostalCodeTextField = textField_ZipPostalCode;
		Assert.assertEquals(true, zipPostalCodeTextField.isDisplayed());
		System.out.println("Zip/postalcode textfield is displaying");
		Thread.sleep(3000);
		/*
		// Flat Rate label
		
		WebElement flatRateLabel = label_FaltRate;
		Assert.assertEquals(true, flatRateLabel.isDisplayed());
		System.out.println("Flat Rate label is displaying as " + flatRateLabel.getText());
		Thread.sleep(3000);
		
		// Fixed radio button
		
		WebElement fixedRadioButton = radioButton_FixedPrice;
		Assert.assertEquals(true, fixedRadioButton.isDisplayed());
		System.out.println("Fixed radio button is displaying");
		Thread.sleep(3000);
		
		// Fixed label
		
		WebElement fixedLabel = label_FixedPrice;
		Assert.assertEquals(true, fixedLabel.isDisplayed());
		System.out.println(" Fixed label is displaying as " + fixedLabel.getText());
		Thread.sleep(3000);
		
		// Best way label
		
		WebElement bestWayLabel = label_BestWay;
		Assert.assertEquals(true, bestWayLabel.isDisplayed());
		System.out.println("Best way label is displaying as " + bestWayLabel.getText());
		Thread.sleep(3000);
		
		// Table rate radio button
		
		WebElement tableRateRadio = radioButton_TableRate;;
		Assert.assertEquals(true, tableRateRadio.isDisplayed());
		System.out.println("Table rate radio button is displaying");
		Thread.sleep(3000);
		
		// Table rate label
		
		WebElement tableRateLabel = label_TableRate;
		Assert.assertEquals(true, tableRateLabel.isDisplayed());
		System.out.println("Table rate label is displaying as " + tableRateLabel.getText());
		Thread.sleep(3000);*/
		return new ShoppingCartPage();
    	
   }
    
    public ShoppingCartPage clearQty() throws Exception {
         textField_Qty.clear();
         Thread.sleep(3000);
    	 System.out.println("User clear quantity under qunatity text field");
    	return new ShoppingCartPage();
  }     

    
    public ShoppingCartPage captureQty() throws Exception {
    	sendKeysToWebElement(textField_Qty,"2");
        Thread.sleep(3000);
   	    System.out.println("User capture quantity text field");
    	return new ShoppingCartPage();
    	
   }

    public ShoppingCartPage updateShoppingCartBtn() throws Exception {
    	waitAndClickElement(button_UpdateShoppingCart);
    	Thread.sleep(3000);
    	System.out.println("User clicks update shopping cart button");
    	return new ShoppingCartPage();
    	
   }

    public ShoppingCartPage editLinkShoppingCart() throws Exception {
    	waitAndClickElement(hyperLink_Edit);
    	Thread.sleep(3000);
    	System.out.println("User clicks on edit link under shopping cart page");
    	return new ShoppingCartPage();
    	
   }
    
    public ShoppingCartPage clickProceedtoCheckoutBtn() throws Exception {
    	
    	waitAndClickElement(button_ProceedToCheckOut);
    	Thread.sleep(3000);
    	System.out.println("User clicks on proceed to checkout button under shopping cart page");
    	return new ShoppingCartPage();
    	
    }

    public ShoppingCartPage clickCheckOutWithMultipleAddress() throws Exception {
    	waitAndClickElement(hyperLink_CheckOutWithMultipleAddresses);
    	Thread.sleep(3000);
    	System.out.println("User clicks on checkout with multiple addresses link under shopping cart page");
    	return new ShoppingCartPage();
    	
    }

	public ShoppingCartPage getShipMutipleAddressesPage() throws Exception {
       WebElement shipMultipleAddresses = page_ShipMultipleAddresses;
		Assert.assertEquals(true, shipMultipleAddresses.isDisplayed());
		System.out.println("User should be placed under ship to multiple addresses page section");
		return new ShoppingCartPage();

	}

	public ShoppingCartPage clickApplyDiscountBtn() throws Exception {
		waitAndClickElement(button_ApplyDiscount);
		Thread.sleep(8000);
		System.out.println("Usser clicks on apply discount button");
		return new ShoppingCartPage();
	}
	

	public ShoppingCartPage requiredMsgApplyDiscount() throws Exception {
		Assert.assertEquals(true, message_RequiredApplyDiscount.isDisplayed());
		System.out.println("This is required field message should dispaly when user clicks on apply discount button");
		return new ShoppingCartPage();

	}

	public ShoppingCartPage captureDiscountCode() throws Exception {
		sendKeysToWebElement(textField_EnterDiscountCode,"qacoupon");
		return new ShoppingCartPage();

	}

	public ShoppingCartPage successCouponMsg() throws Exception {
		
	 if(message_SuccessCoupon.getText().contains("You used coupon code")){
		 System.out.println("When user save success coupon then user get success message You used coupon code qacoupon "); 
	   }
	 else
	  {
		 System.out.println("*****************Failed****************** ");
	  }
		return new ShoppingCartPage();
      }

	public ShoppingCartPage cancelCouponBtn() throws Exception {
		Assert.assertEquals(true, button_cancelCoupon.isDisplayed());
		System.out.println("After user adding coupon and click on the apply discount coupon dropdown then user should see cancel coupon button");
		return new ShoppingCartPage();

	}

	public ShoppingCartPage captureInvalidCoupon() throws Exception {
		sendKeysToWebElement(textField_EnterDiscountCode,"qacoupon1");
		System.out.println("When user capture invalid coupon code in apply discount text field");
		return new ShoppingCartPage();
	}
	
	public ShoppingCartPage invalidCouponCodeMsg() throws Exception {
		WebElement errorCoupon = message_SuccessCoupon;
		if(errorCoupon.getText().contains("is not valid")){
			 System.out.println("When user capture invalid coupon then user get invalid message The coupon code 'qacoupon1' is not valid."); 
		   }
		 else
		  {
			 System.out.println("*****************Failed****************** ");
		  }
		//Assert.assertEquals(true, .isDisplayed());
		System.out.println("When user capture invalid coupon code then the following message should be displayed 'The coupon code qacoupon1 is not valid.'");
		return new ShoppingCartPage();
	}
	
	public ShoppingCartPage clickCancelBtn() throws Exception {
		waitAndClickElement(button_cancelCoupon);
    	Thread.sleep(3000);
    	System.out.println("User clicks cancle coupon");

		return new ShoppingCartPage();

	}

	public ShoppingCartPage cancelCouponMessage() throws Exception {
		Assert.assertEquals(true, message_CancelCoupon.isDisplayed());
		System.out.println("When user clicks cancel coupon button then the following message shoul be displayed You canceled the coupon code.");
		return new ShoppingCartPage();

	}

   public ShoppingCartPage clickMoveWishList() throws Exception {
	   waitAndClickElement(hyperLink_MoveToWishList);
	   Thread.sleep(7000);
	   return new ShoppingCartPage();

	}

   public ShoppingCartPage shoppingCartEmptyPage() throws Exception {
	   Assert.assertEquals(true, label_EmptyShoppingCart.isDisplayed());
	   Thread.sleep(2000);
	   System.out.println("When user move all products to wishlist then user place under empty shopping cart page the following text displayed 'You have no items in your shopping cart.'");
	   Assert.assertEquals(true, label_ClickHereToContinueShop.isDisplayed());
	   Thread.sleep(2000);
	   System.out.println("Click here to continue shopping. text also dispalyed under shopping cart page");
	   Assert.assertEquals(true, hyperLink_Here.isDisplayed());
	   Thread.sleep(2000);
	   System.out.println("link 'here' is dispalyed");
	   return new ShoppingCartPage();
   }

  public ShoppingCartPage moveShoppingCartToWishList() throws Exception {
	  Assert.assertEquals(true, message_MoveShoppingCartToWishListMessage.isDisplayed());
	   Thread.sleep(2000);
	   System.out.println("When user move all products to wishlist then user place under empty shopping cart page and the following message is displayed 'Fusion Backpack has been moved to your wish list.'");
	   return new ShoppingCartPage();
   }
  
  public ShoppingCartPage getWishlistPage() throws Exception {
	  getDriver().get(wishListUrl);
	   Thread.sleep(7000);
	   System.out.println("User navigate to the wishlist page");
	  return new ShoppingCartPage();
  }
  
  public ShoppingCartPage wishListPageVal() throws Exception {
	  Assert.assertEquals(true, page_WishListPage.isDisplayed());
	   Thread.sleep(3000);
	   System.out.println("When user navigate to the wishlist then user place under wishlist page");
	  
	  return new ShoppingCartPage();
  }

  public ShoppingCartPage wishListProductVal() throws Exception {
	  Assert.assertEquals(true, hyperLink_WishListProductName.isDisplayed());
	   Thread.sleep(2000);
	   System.out.println("User moved product from shopping cart to wishlist are now available under wishlist now");
	  return new ShoppingCartPage();
  }
  
  public ShoppingCartPage deleteLinkShoppingCart() throws Exception {
	waitAndClickElement(hyperLink_Delete);
  	Thread.sleep(3000);
  	System.out.println("User delete product from shopping cart");
  	 return new ShoppingCartPage();
  }
  
  public ShoppingCartPage addAllToCartBtnWishList() throws Exception {
	  waitAndClickElement(button_AddAllToCartButton);
	  	Thread.sleep(8000);
	  	System.out.println("User clicked addalltocart button under wishlist successfully");
	  	 return new ShoppingCartPage();
	  }
  
  public ShoppingCartPage wishListEmpty() throws Exception {
	  Assert.assertEquals(true,  message_WishListEmptyMsg.isDisplayed());
	  Thread.sleep(5000);
	  	System.out.println("Products moved from wishlist to cart successfully");
	  	 return new ShoppingCartPage();
	  }
  
  
}
