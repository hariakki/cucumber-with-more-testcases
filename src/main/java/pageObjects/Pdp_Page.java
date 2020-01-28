package pageObjects;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Pdp_Page extends BasePage{ 
			
		public  String url = "http://devops.magento2.co.za";
		public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img") WebElement button_FusionBackpack;
		public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span") WebElement title_PageTitleFusionBackpack;
		public @FindBy(xpath = "//span[@class='price'][contains(.,'ZAR34.00')]") WebElement price_ProductPrice;
		public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[3]/div[2]/div[1]/span") WebElement product_Stock;
		public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div") WebElement product_Sku;
		public @FindBy(xpath = "//span[contains(.,'Qty')]") WebElement product_Qty;
		public @FindBy(xpath = "//*[@id=\"qty\"]") WebElement product_QtyAmount;
		public @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]") WebElement button_AddToCart;
		public @FindBy(xpath = "//span[contains(.,'Add to Wish List')]") WebElement button_AddToWishlist;
		public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[5]/div/a[2]/span") WebElement button_AddToCompare;
		public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[5]/a/span") WebElement button_Email;
		public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[5]/div/a[1]/span") WebElement tab_Details;
		public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[5]/div/a[2]/span") WebElement tab_MoreInformation;
		public @FindBy(xpath = "//a[contains(.,'Reviews')]") WebElement tab_Reviews;
		
		
		
		
		
		
		
		
		 public Pdp_Page() throws IOException {
				super();
}
		 public Pdp_Page getSignInPage() throws IOException {
				getDriver().get(url); 
				return new Pdp_Page(); 
		 
}
		 
		 public Pdp_Page userClicksFusionBackpack() throws IOException, InterruptedException {
				waitAndClickElement(button_FusionBackpack);
				Thread.sleep(3000);
				return new Pdp_Page();  
				
		 }
		 public Pdp_Page userSeeFusionPageTitle() throws Exception {
			 	WebElement pdpTitle = title_PageTitleFusionBackpack;
		       Assert.assertEquals(true, pdpTitle.isDisplayed());
		       System.out.println("Pdp  Title is dispalying");
		       return new Pdp_Page();
		         
		         
		         
	
		 }	
		 public Pdp_Page userSeeProductPrice() throws Exception {
			 WebElement productPrice = price_ProductPrice;
		       Assert.assertEquals(true, productPrice.isDisplayed());
		       System.out.println("Product Price is dispalying");
  	           return new Pdp_Page();
  	           
		 }
	       
  	         public Pdp_Page userSeeStock() throws Exception {
  				 WebElement productStock = product_Stock;
  			       Assert.assertEquals(true, productStock.isDisplayed());
  			       System.out.println("Product Stock is dispalying");
  	  	           return new Pdp_Page();
  	  	           
  	      }
  	       
  	         public Pdp_Page userSeeSku() throws Exception {
  				 WebElement productSku = product_Sku;
  			       Assert.assertEquals(true, productSku.isDisplayed());
  			       System.out.println("Product Sku is dispalying");
  	  	           return new Pdp_Page();     
  	       }
    	       
  	         public Pdp_Page userSeeQty() throws Exception {
  				 WebElement productQty = product_Qty;
  			       Assert.assertEquals(true, productQty.isDisplayed());
  			       System.out.println("Product Qty is dispalying");
  	  	           return new Pdp_Page(); 
  	  	           
  	       }
  	       
  	         public Pdp_Page userSeeQtyAmount() throws Exception {
  				 WebElement productQtyAmount = product_QtyAmount;
  			       Assert.assertEquals(true, productQtyAmount.isDisplayed());
  			       System.out.println("Product Qty Amount is dispalying");
  	  	           return new Pdp_Page(); 
  	  	       
  	       }
  	         
  	  	   public Pdp_Page userSeeAddToCartButton() throws Exception {
    				 WebElement productAddToCartButton = button_AddToCart;
    			       Assert.assertEquals(true, productAddToCartButton.isDisplayed());
    			       System.out.println("Add To Cart Button is dispalying");
    	  	           return new Pdp_Page();     
  	  	           
  	  	 }
	         
  	  	   public Pdp_Page userSeeWishlistButton() throws Exception {
    				 WebElement productAddToWishlistButton = button_AddToWishlist;
    			       Assert.assertEquals(true, productAddToWishlistButton.isDisplayed());
    			       System.out.println("Add To Wishlist Button is dispalying");
    	  	           return new Pdp_Page();   
  	  	 }
	         
  	  	   public Pdp_Page userSeeAddToCompareButton() throws Exception {
    				 WebElement productAddToCompareButton = button_AddToCompare;
    			       Assert.assertEquals(true, productAddToCompareButton.isDisplayed());
    			       System.out.println("Add To Compare Button is dispalying");
    	  	           return new Pdp_Page();   
  	  	 }
	         
  	  	   public Pdp_Page userSeeEmailButton() throws Exception {
    				 WebElement productEmailButton = button_Email;
    			       Assert.assertEquals(true, productEmailButton.isDisplayed());
    			       System.out.println("Product Email is dispalying");
    	  	           return new Pdp_Page();   
  	  	           
  	  	 }
	         
  	  	   public Pdp_Page userSeeDetailsTab() throws Exception {
    				 WebElement productDetailsTab = tab_Details;
    			       Assert.assertEquals(true, productDetailsTab.isDisplayed());
    			       System.out.println("Product Details Tab is dispalying");
    	  	           return new Pdp_Page();   
  	  	 }
	         
  	  	   public Pdp_Page userSeeMoreInformationTab() throws Exception {
    				 WebElement productMoreInformationTab = tab_MoreInformation;
    			       Assert.assertEquals(true, productMoreInformationTab.isDisplayed());
    			       System.out.println("Product More Information Tab is dispalying");
    	  	           return new Pdp_Page();   
  	  	 }
	         
  	  	   public Pdp_Page userSeeReviewsTab() throws Exception {
    				 WebElement productReviewsTab = tab_Reviews;
    			       Assert.assertEquals(true, productReviewsTab.isDisplayed());
    			       System.out.println("Prodyuct Reviews Tab is dispalying");
    	  	           return new Pdp_Page();  
	 }	
}
		 





