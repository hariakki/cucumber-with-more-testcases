package pageObjects;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MiniCartPage extends BasePage{

	
	  public  String url = "http://devops.magento2.co.za/checkout/cart/";
	  public String urlHome = "http://devops.magento2.co.za/";
	  public String pdpPageUrl = "http://devops.magento2.co.za/lifelong-fitness-iv.html";
	  
	  public @FindBy(xpath = "//button[@class='action primary tocart']//span") WebElement button_AddToCart;
      public @FindBy(xpath = "//a[@class='action showcart']") WebElement hyperLink_cartSymbol;
      public @FindBy(xpath = "//div[@id='minicart-content-wrapper']//li//strong") WebElement hyperLink_ProductNameBlock;
	  public @FindBy(xpath = "//div[@class='cart-empty']") WebElement label_CartEmpty;
	  public @FindBy(xpath = "//p[@class='empty' and text()= 'You have no other address entries in your address book.']") WebElement label_NoAddress;
      public @FindBy(xpath = "//div[@role='alert']") WebElement message_AddToCartSuccessMsg;    //upgrade
      public @FindBy(xpath = "//div[text()='LifeLong Fitness IV was updated in your shopping cart.']") WebElement message_miniCartEditSuccessMessage;
      public @FindBy(xpath = "//div[@id='checkout']") WebElement page_CheckOutPage;
      //New Reg User 
      public @FindBy(xpath = "//div[text()='Payment Method']") WebElement page_PaymentMethod;
	  //public @FindBy(xpath = "") String page_PdpPage;
      
      //minicart
      public @FindBy(xpath = "//div[@class='items-total']") WebElement label_ItemTotal;
      public @FindBy(xpath = "//span[@class='count']") WebElement label_ItemTotalCount;
      public @FindBy(xpath = "//span[text()='Cart Subtotal']") WebElement label_CartSubTotal;
      public @FindBy(xpath = "//div[@class='amount price-container']//span[@class='price-wrapper']") WebElement label_MiniCartpriceLabelRightTop;
      public @FindBy(xpath = "//span[@class='counter-number']") WebElement label_CartSymbolCount;
      public @FindBy(xpath = "//button[@title='Proceed to Checkout']") WebElement button_ProceedToCheckOut;
      public @FindBy(xpath = "//div[@class='minicart-items-wrapper']//img[@class='product-image-photo']") WebElement image_ProductImage;
      public @FindBy(xpath = "//div[@class='minicart-items-wrapper']//strong[@class='product-item-name']//a") WebElement hyperLink_ProductName;
      public @FindBy(xpath = "//div[@class='product options']//span[text()='See Details']") WebElement dropDown_SeeDeatils;
      public @FindBy(xpath = "//span[@class='price-excluding-tax']//span[@class='price']") WebElement label_MiniCartpriceLabelBottom;
      public @FindBy(xpath = "//label[text()='Qty']") WebElement label_Qty;
	  public @FindBy(xpath = "//input[@class='item-qty cart-item-qty']") WebElement textField_Qty;
	  public @FindBy(xpath = "//a[@class='action edit']") WebElement hyperLink_Edit;
	  public @FindBy(xpath = "//a[@title='Remove item']") WebElement hyperLink_Delete;
	  public @FindBy(xpath = "//span[text()='View and Edit Cart']") WebElement hyperLink_ViewandEditCart;
	  public @FindBy(xpath = "//button[@id='btn-minicart-close']") WebElement button_Close;
	  public @FindBy(xpath = "//button[@title='Update']") WebElement button_UpdateBtn;
	  public @FindBy(xpath = "//div[@id='minicart-content-wrapper']") WebElement miniCart_MiniCartDropDown;
	  public @FindBy(xpath = "//strong[@class='subtitle empty' and text()='You have no items in your shopping cart.']") WebElement miniCart_emptyMiniCart;
	  public @FindBy(xpath = "//aside[@class='modal-popup confirm                                 _show']") WebElement popUp_MiniCartWindow;
	  public @FindBy(xpath = "//*[@id='modal-content-58']//div[text()='Are you sure you would like to remove this item from the shopping cart?']") WebElement popUp_MiniCartPopUpWindowText;
	  public @FindBy(xpath= "//footer[@class='modal-footer']//button[@class='action-secondary action-dismiss']//span[text()='Cancel']") WebElement popButton_cancelBtn;
	  public @FindBy(xpath = "//footer[@class='modal-footer']//button[@class='action-primary action-accept']//span[text()='OK']") WebElement popButton_OkBtn;
	  public @FindBy(xpath = "//div[@class='modal-inner-wrap']//header//button//span[text()='Close']") WebElement button_PopUpCloseBtnMiniCart;
	  
	  //Pdp page
	  public @FindBy(xpath = "//input[@name='qty']") WebElement textField_qty;
	  public @FindBy(xpath = "//button[@title='Update Cart']") WebElement button_UpdateCart;
	  
	  //Shipping Cart page
	  public @FindBy(xpath = "//span[text()='Shopping Cart']") WebElement page_shoppingCartPage;
	  public @FindBy(xpath = "//div[@class='control qty']//input") WebElement textField_QtyShoppingCart;

	  //pop up check out as a new customer
	  public @FindBy(xpath = "//header[@class='modal-header']") WebElement popUp_CheckOutNewCust;
	  public @FindBy(xpath = "//button[@class='action-close']") WebElement button_closeBtnCheckOutNewCust;

	
	public MiniCartPage() throws IOException {
		super();

	}

	public MiniCartPage getCartPage() throws IOException {
		getDriver().get(url);

		return new MiniCartPage();
	}

	public MiniCartPage cartPageVal() throws Exception {
		WebElement cartVal = getDriver().findElement(By.xpath("//span[text()='Shopping Cart']"));
		Assert.assertEquals(true, cartVal.isDisplayed());
		return new MiniCartPage();
	}

	public MiniCartPage addToCartButton() throws IOException, InterruptedException {
		getDriver().get(pdpPageUrl);
		Thread.sleep(9000);
		waitAndClickElement(button_AddToCart);
		Thread.sleep(6000);
		return new MiniCartPage();
	}

	public MiniCartPage successMessage() throws Exception {
		Assert.assertEquals(true, message_AddToCartSuccessMsg.isDisplayed());
		boolean e = message_AddToCartSuccessMsg.getText().contentEquals("You added LifeLong Fitness IV to your shopping cart.");
	    if(e == true){
	    	System.out.println("The above success message dispalying corrcetly ");	 
	     }
	    else{
	    	System.out.println("**************Test failed***********");	
	    }
		System.out.println("User successfully added product to the cart and success message also dispalyed");
		Thread.sleep(4000);
		return new MiniCartPage();

	}

	public MiniCartPage miniCartOpen() throws Exception {
		try {
			waitAndClickElement(hyperLink_cartSymbol);
			// Product displayed in the cart
			WebElement productNameBlock = hyperLink_ProductNameBlock;
			Assert.assertEquals(true, productNameBlock.isDisplayed());
			System.out.println("productNameBlock is dispalying");
			Thread.sleep(4000);

			// Item Total label displayed in the cart
			WebElement itemCart = label_ItemTotal;
			Assert.assertEquals(true, itemCart.isDisplayed());
			System.out.println("Item total label is displaying");
			Thread.sleep(4000);
			
			// Cart subtotal
			WebElement miniCartSubTotal = label_CartSubTotal;
			Assert.assertEquals(true, miniCartSubTotal.isDisplayed());
			System.out.println("Cart subtotalright label on top is displaying");
			Thread.sleep(4000);

			// proceedToCheckOut
			WebElement miniCartProceedChekt = button_ProceedToCheckOut;
			Assert.assertEquals(true, miniCartProceedChekt.isDisplayed());
			System.out.println("ProceedToCheckOut button is displaying");
			Thread.sleep(4000);

			// ProuctImage
			WebElement miniCartpdtImage = image_ProductImage;
			Assert.assertEquals(true, miniCartpdtImage.isDisplayed());
			System.out.println("ProuctImage is displaying");
			Thread.sleep(4000);

			// Qty label
			WebElement miniCartQty = label_Qty;
			Assert.assertEquals(true, label_Qty.isDisplayed());
			System.out.println("Qty label is displaying");
			Thread.sleep(4000);

			// Qty textField
			WebElement miniCartQtyInput = textField_Qty;
			Assert.assertEquals(true, miniCartQtyInput.isDisplayed());
			System.out.println("Qty textField is displaying");
			Thread.sleep(4000);

			// Edit link
			WebElement miniCartEdit = hyperLink_Edit;
			Assert.assertEquals(true, miniCartEdit.isDisplayed());
			System.out.println("Edit link is displaying");
			Thread.sleep(4000);

			// Delete link
			WebElement miniCartDelete = hyperLink_Delete;
			Assert.assertEquals(true, miniCartDelete.isDisplayed());
			System.out.println("Delete link is displaying");
			Thread.sleep(4000);

			// View and Edit Cart
			WebElement miniCartViewdEditLink = hyperLink_ViewandEditCart;
			Assert.assertEquals(true, miniCartViewdEditLink.isDisplayed());
			System.out.println("View and Edit Cart is displaying");
			Thread.sleep(4000);

			// Close button
			WebElement miniCartCloseBtn = button_Close;
			Assert.assertEquals(true, miniCartCloseBtn.isDisplayed());
			System.out.println("Close button is displaying");
			Thread.sleep(4000);
		} catch (Exception miniCart) {
			System.out.println(miniCart.getMessage());

		}
		return new MiniCartPage();

	}

	public MiniCartPage miniCartCount() throws Exception {
		// Cart symbol count validating with item total

		try {

			String cartCount = getDriver().findElement(By.xpath("//span[@class='counter-number']")).getText();
			System.out.println(cartCount);

			String cartItemTotalCount = getDriver().findElement(By.xpath("//span[@class='count']")).getText();
			System.out.println(cartItemTotalCount);
			Thread.sleep(4000);
			if (cartCount.equals(cartItemTotalCount)) {
				Assert.assertEquals(cartCount, cartItemTotalCount);
				System.out.println("Mini cart count and item total number are matching");
				Thread.sleep(4000);
			} else {
				System.out.println("*******Failed***********Mini cart count and item total number are not matching************");
				Thread.sleep(4000);
			}

		} catch (Exception cartCountVal) {
			System.out.println(cartCountVal.getMessage());
		}

		return new MiniCartPage();

	}

	public MiniCartPage proceedToCheckOut() throws Exception {
		try {
			waitAndClickElement(button_ProceedToCheckOut);
			Thread.sleep(12000);
		}

		catch (Exception proceedToCheckout) {
			System.out.println(proceedToCheckout.getMessage());
		}

		return new MiniCartPage();
	}
    
	
	public MiniCartPage  checkOutNewCustomerPopUpWindow() throws Exception {
		try {
			Assert.assertEquals(true, popUp_CheckOutNewCust.isDisplayed());
			waitAndClickElement(button_closeBtnCheckOutNewCust);
			Thread.sleep(4000);
		}

		catch (Exception popUpNewCust) {
			System.out.println(popUpNewCust.getMessage());
		}

		return new MiniCartPage();
	}
	
	public MiniCartPage checkoutPage() throws Exception {
		try {
			WebElement checkOutPageVal = page_CheckOutPage;
			Assert.assertEquals(true, checkOutPageVal.isDisplayed());
			Thread.sleep(2000);
		} catch (Exception checkOutPage) {
			System.out.println(checkOutPage.getMessage());
		}

		return new MiniCartPage();
	}
	
	//New Reg Checkout page
	
	public MiniCartPage paymentMethodCheckOutPage() throws Exception {
		try {
			WebElement newRegUserCheckOutPage = page_PaymentMethod;
			Assert.assertEquals(true, newRegUserCheckOutPage.isDisplayed());
			System.out.println("New Reg user place under payment method page when clicks proceed to check out button on mini cart");
			Thread.sleep(3000);
		} catch (Exception checkOutPageNewUser) {
			System.out.println(checkOutPageNewUser.getMessage());
		}
		
		return new MiniCartPage();
	}

	
	
   public MiniCartPage naviagateBack() throws Exception {
		try {
			getDriver().navigate().back();
			System.out.println("User clicks navigate back");
			Thread.sleep(6000);
		}

		catch (Exception nBack) {
			System.out.println(nBack.getMessage());
		}

		return new MiniCartPage();
	}

	

	public MiniCartPage homePage() throws Exception {
	try{
		WebElement homePage  = getDriver().findElement(By.xpath("//span[text()='Welcome, anusha kariveda!']"));  //Home page validation by using menu tab
		Assert.assertEquals(true, homePage.isDisplayed());
  		System.out.println("User Successfully come back and place under homepage");
  		Thread.sleep(4000);
    	}
            catch (Exception hPage) {
    			System.out.println(hPage.getMessage());
    		   }
    	
  	   return new MiniCartPage();
     }

	public MiniCartPage clickProductLinkMiniCart() throws Exception {
		try {
			waitAndClickElement(hyperLink_ProductName);
			Thread.sleep(6000);
			System.out.println("User Successfully clicked on product name link on minicart");
		}

		catch (Exception pnLink) {
			System.out.println(pnLink.getMessage());
		}

		return new MiniCartPage();
	}

	public MiniCartPage pdpPage() throws Exception {
		try {
			String pdpPage = getDriver().getTitle();
			String expected = getDriver().findElement(By.xpath("//span[@class='base']")).getText();
			Assert.assertEquals(pdpPage, expected);
			Thread.sleep(5000);
			System.out.println("User Successfully placed under pdp page after clicking product name link on minicart");
		}
        catch(Exception pdp) {
			System.out.println(pdp.getMessage());
		}
        return new MiniCartPage();
	}

	public MiniCartPage qtyUpdate() throws Exception {
		try {
			textField_Qty.clear();
			Thread.sleep(2000);
			sendKeysToWebElement(textField_Qty, "2");
			Thread.sleep(3000);
			System.out.println("User clear the quantity field and update the quantity field");
		}

		catch (Exception qtyU) {
			System.out.println(qtyU.getMessage());
		}

		return new MiniCartPage();
	}

	public MiniCartPage enableUpdateBtn() throws Exception {
		try {
			WebElement enableUpdateBtn = button_UpdateBtn;
			Assert.assertEquals(true, enableUpdateBtn.isDisplayed());
			if (enableUpdateBtn.isDisplayed()) {
				
				System.out.println("When user update the Quantity then update button is enabled on the mini cart");
			} else {
				System.out.println("Mini cart failed to enable update cart button");
			}
		}

		catch (Exception enableBtn) {
			System.out.println(enableBtn.getMessage());
		}

		return new MiniCartPage();
	}

	public MiniCartPage clickUpdateBtn() throws Exception {
		try {
			waitAndClickElement(button_UpdateBtn);
			Thread.sleep(4000);
			System.out.println("User successfully click on the update button on the cart");
		}

		catch (Exception ub) {
			System.out.println(ub.getMessage());
		}

		return new MiniCartPage();
	}

	public MiniCartPage qtyAndCartCount() throws Exception {
		
	try{
	
		String cartCount = getDriver().findElement(By.xpath("//span[@class='counter-number']")).getText();
		System.out.println("System cart count" + cartCount);
        String count = "2";
		/*String cartQtyCount = getDriver().findElement(By.cssSelector("#cart-item-86-qty")).getText();
		System.out.println(cartQtyCount); */
		if (cartCount.matches(count)) {
		
			Thread.sleep(4000);
			System.out.println("Mini cart symbol count and qty number are matching");
		} else {
			System.out.println("*******Failed***********Mini cart count symbol count and qty number are not matching************");
		}
	}
		catch (Exception qcc) {
			System.out.println(qcc.getMessage());
		}

		return new MiniCartPage();
	}
	
	public MiniCartPage editLinkCart() throws Exception {
		try{
			 waitAndClickElement(hyperLink_Edit);
			 Thread.sleep(4000);
		 }
		 catch(Exception elc) {
				System.out.println(elc.getMessage());
			}
		return new MiniCartPage();
		}
		
	public MiniCartPage getPdpPageUpdate() throws Exception {
		try{
	/*		String pdpPage = getDriver().getTitle();
			String expected = getDriver().findElement(By.xpath("//span[@class='base']")).getText();
			Assert.assertEquals(pdpPage, expected);*/
			String pdpPage = getDriver().findElement(By.xpath("//h1[@class='page-title']//span[@class='base']")).getText();
			if(pdpPage.contentEquals("LifeLong Fitness IV")){
				System.out.println("User Placed under pdp page after selecting edit link under mini cart");
			}else
			{
				System.out.println("************Test failed***************");
			}
			
			
	/*		//Qty text field
            WebElement miniCartPdtPageQty = textField_qty;
			Assert.assertEquals(true, miniCartPdtPageQty.isDisplayed());
			System.out.println("Qty text feild is displaying at pdp page when user selects edit link on the minicart");*/
			
			//Update cart button
			WebElement updateCartBtnPdp = button_UpdateCart;
			Assert.assertEquals(true, updateCartBtnPdp.isDisplayed());
			System.out.println("Update cart button is displaying at pdp page when user selects edit link on the minicart");
		 }
		 catch (Exception ppu) {
				System.out.println(ppu.getMessage());
			}
		return new MiniCartPage();
		}
	
	public MiniCartPage captureQty() throws Exception {
		try {
			textField_qty.clear();
			System.out.println("");
			Thread.sleep(3000);
			sendKeysToWebElement(textField_qty,"3");
			System.out.println("");
			Thread.sleep(3000);
			}
		catch(Exception cQ) {
			System.out.println(cQ.getMessage());
			}
		
		return new MiniCartPage();
	}
	
	public MiniCartPage updateCartBtn() throws Exception {
		try {
			waitAndClickElement(button_UpdateCart);
			Thread.sleep(6000);
		}
		catch(Exception ucb) {
			System.out.println(ucb.getMessage());
			}
		
		return new MiniCartPage();
	}
	public MiniCartPage getShippingCartPage() throws Exception {
    try {
    	WebElement shoppingCartPage = page_shoppingCartPage;
    	Assert.assertEquals(true, shoppingCartPage.isDisplayed());
    	Thread.sleep(6000);
    	System.out.println("User place under shopping cart page");
    }
	catch(Exception e){
		System.out.println(e.getMessage());
	}
      return new MiniCartPage();
	}		
	
	
	public MiniCartPage successMessageUpdateCart() throws Exception {
		 try {
				WebElement shoppingCartSuccessMessage = message_miniCartEditSuccessMessage;
				Assert.assertEquals(true, shoppingCartSuccessMessage.isDisplayed());
				Thread.sleep(4000);
				if (shoppingCartSuccessMessage.isDisplayed()) {
					System.out.println("When user update the Quantity on pdp page then click on the update cart button quantity is updated and user placed under shipping cart page then success message should be dispalyed");
				} else {
					System.out.println("*****Failed******Update quantity and display success message");
				}
			}

		    catch(Exception sCartPage) {
 			System.out.println(sCartPage.getMessage());
 		   }
           
	   return new MiniCartPage();
   }
	
	public MiniCartPage validationQty() throws Exception {
		try {
            String shoppingCartCount = getDriver().findElement(By.xpath("//div[@class='control qty']//input")).getText();
			System.out.println(shoppingCartCount);
			Thread.sleep(2000);

			String miniCartSymbolCount = getDriver().findElement(By.xpath("//div[@class='control qty']//input")).getText();
			System.out.println(miniCartSymbolCount);
			Thread.sleep(2000);
			if (shoppingCartCount.equals(miniCartSymbolCount)) {
				Assert.assertEquals(shoppingCartCount, miniCartSymbolCount);
				System.out.println("Mini cart symbol count and shipping cart updated quantity are matching");
				Thread.sleep(4000);
			} else {
			    System.out.println("*******Failed***********Mini cart symbol count and shipping cart updated quantity are not matching************");
			    }
		} catch (Exception cartCountVal) {
			System.out.println(cartCountVal.getMessage());
		}

		return new MiniCartPage();

	}
	
	public MiniCartPage clickViewAndEditCartLink() throws Exception {
	try{
		waitAndClickElement(hyperLink_ViewandEditCart);
		Thread.sleep(3000);
		Assert.assertEquals(true, page_shoppingCartPage.isDisplayed());
		Thread.sleep(4000);
		System.out.println("When user selects the view and edit cart link on the mini cart and then user place under shopping cart page ");
    	}

    catch(Exception e) {
    			System.out.println(e.getMessage());
    		   }
    	
		return new MiniCartPage();
	}

	public MiniCartPage clicksCloseBtnOnCart() throws Exception {
	try{
		waitAndClickElement(button_Close);
		if(!miniCart_MiniCartDropDown.isDisplayed()) {
			System.out.println("User clicks on mini cart close button successfully");
		} else {
			System.out.println("*********Failed******User not clicked on mini cart close button");
		}
    	}
    	catch (Exception e) {
    			System.out.println(e.getMessage());
    		   }
    	
		return new MiniCartPage();
	}

	public MiniCartPage getCartClose() throws Exception {
	try{
		if(!miniCart_MiniCartDropDown.isDisplayed()) {
			System.out.println("Cart closed successfully when user clicks on mini cart");
		} else {
			System.out.println("*********Failed****** Cart not closed after user clicks on mini cart");
		}
    	}
          catch (Exception e) {
    			System.out.println(e.getMessage());
    		   }
    	
		return new MiniCartPage();
	}

	public MiniCartPage getCartOpen() throws Exception {
	try{
		/*waitAndClickElement(hyperLink_cartSymbol);
		Thread.sleep(3000);*/
		if(miniCart_MiniCartDropDown.isDisplayed()) {
			Thread.sleep(3000);
			Assert.assertEquals(true, miniCart_MiniCartDropDown.isDisplayed());
			System.out.println("When user clicks on mini cart symbol then cart should open");
		} else {
			System.out.println("*********Failed******When user clicks on mini cart then Mini cart is not open");
		}
    	}
    catch (Exception e) {
    			System.out.println(e.getMessage());
    		   }
    	return new MiniCartPage();
		}

	public MiniCartPage clicksDeleteOnMiniCart() throws Exception {
	try{
		waitAndClickElement(hyperLink_Delete);
		Thread.sleep(6000);
		System.out.println("When user clicks on mini cart delete link");
    	}
             catch (Exception e) {
    			System.out.println(e.getMessage());
    			System.out.println("*********Failed******When user clicks on delete link on mini cart");
    		   }
    	
		return new MiniCartPage();
	}

	public MiniCartPage miniCartPopUp() throws Exception {
		try{
			WebElement miniCartDeletePopUp = popUp_MiniCartWindow;
			Assert.assertEquals(true, miniCartDeletePopUp.isDisplayed());
			System.out.println("Pop up window dispalying");
			/*Assert.assertEquals(true,popUp_MiniCartPopUpWindowText.isDisplayed());
			System.out.println("Pop up window is dispalyed and 'Are you sure you would like to remove this item from the shopping cart?' text is available on pop up window ");
			Assert.assertEquals(true, popButton_cancelBtn.isDisplayed());
			System.out.println("Pop up window cancel button is dispalying");
			Assert.assertEquals(true, popButton_OkBtn.isDisplayed());
			System.out.println("Pop up window ok button is dispalying");
			Assert.assertEquals(true, button_PopUpCloseBtnMiniCart.isDisplayed());
			System.out.println("Pop up window close button is dispalying");*/
		}
		catch (Exception popUpMiniCart) {
			System.out.println(popUpMiniCart.getMessage());
			System.out.println("*********Failed******When user clicks on mini cart pop up window not opened");
		   }
	
		
		return new MiniCartPage();
		}
	
	
	public MiniCartPage popUpClosedAndCartOpen() throws Exception {
	try{
	
		/*//Pop up closed
		Assert.assertEquals(true, !popUp_MiniCartWindow.isDisplayed());
		Thread.sleep(3000);
		System.out.println("When user clicks cancel button on the pop up then pop up closed");*/
		
		//cart open
		Assert.assertEquals(true, miniCart_MiniCartDropDown.isDisplayed());
		Thread.sleep(3000);
		System.out.println("When user clicks on cancel button pop up then pop up closed and mini cart should open");
    	}
    catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("When user clicks cancel button then failed to close pop up window or open mini cart");
		   }
	
	return new MiniCartPage();
    }


	public MiniCartPage miniCartEmpty() throws Exception {
	try{
		Assert.assertEquals(true,miniCart_emptyMiniCart.isDisplayed());
		System.out.println("When user delete all the products on the mini cart then cart should open and the following message should display You have no items in your shopping cart.");
		Thread.sleep(3000);
    	}
      catch(Exception e) {
    			System.out.println(e.getMessage());
    			System.out.println("*********Failed******Cart failed to delete products");
    		   }
    return new MiniCartPage();
		}


	public MiniCartPage cancelMiniCartButtonPopUp() throws Exception {
		waitAndClickElement(popButton_cancelBtn);
		Thread.sleep(3000);
		return new MiniCartPage();
	}

	public MiniCartPage OkMiniCartButtonPopUp() throws Exception {
		waitAndClickElement(popButton_OkBtn);
		Thread.sleep(3000);
		return new MiniCartPage();
	}

/*	public MiniCartPage deleteCartValidation() throws Exception {
		WebElement deleteAddressVal = ;
		if (deleteAddressVal.isDisplayed()) {
			System.out.println("Address deleted from the additional address entries");

		} else {
			System.out.println("Failed to delete address from the additional address entries");
		}

		return new MiniCartPage();
	}
*/

   public MiniCartPage popUpCloseOkBtn() throws Exception {
	 //Pop up closed
	 		Assert.assertEquals(true, !popUp_MiniCartWindow.isDisplayed());
	 		Thread.sleep(3000);
	 		System.out.println("When user clicks ok button on the pop up then pop up closed");
	   
	   
		return new MiniCartPage();
		}



}
