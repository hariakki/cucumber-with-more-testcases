package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class MyAccount_Page extends BasePage {

	
	public String url = "http://devops.magento2.co.za/customer/account/index/";
	public @FindBy(xpath = "/li[@class='customer-welcome']//span") WebElement button_ProfileDropsdownList;
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a") WebElement button_MyAccount;
	public @FindBy(xpath = "//span[@class='base']") WebElement title_MyDashboard;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[1]/strong") WebElement heading_AccountInformation;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[1]/strong/span") WebElement heading_ContactInformation;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[2]/strong/span") WebElement heading_Newsletter;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]/span") WebElement button_EditContactInformation;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[2]") WebElement button_ChangePassword;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/a/span") WebElement button_NewsletterEdit;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[1]/strong") WebElement heading_AddressBook;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[1]/a/span") WebElement button_ManageAddresses;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[2]/div[1]/strong/span") WebElement heading_DefaultBillingAddress;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/a/span") WebElement button_EditDefaultBillingAddress;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/a/span") WebElement button_EditNewsletter;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[2]/div[2]/strong/span") WebElement heading_DefaultShippingAddress;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/a/span") WebElement button_EditDefaultShippingAddress;
	
	public @FindBy(xpath = "//span[@class='base']") WebElement facet_AccountDashboardMyAccount;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a") WebElement facet_MyDownloadableProductsMyAccount;
	
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/ul/li[4]/a")WebElement facet_MyWishlistMyAccount;

	public MyAccount_Page() throws IOException {

		super(); 
		
	}
			
			public MyAccount_Page getMyAccountPage() throws IOException, InterruptedException {
			getDriver().get(url); 
			Thread.sleep(2000);
			return new MyAccount_Page();	
			 
			}

			public MyAccount_Page userSeeAccountDashboardFacet() throws IOException, InterruptedException {
				WebElement titleMyDashboardPageMyAccount = facet_AccountDashboardMyAccount;
				Assert.assertEquals(true, titleMyDashboardPageMyAccount.isDisplayed());
				System.out.println("MyDashbaord Facet  is dispalying");
				return new MyAccount_Page();
				
			}

			public MyAccount_Page userSeeMyDownloadableProductsMyAccount() throws IOException, InterruptedException {
				WebElement facetMyDownloadableProductsMyAccount = facet_MyDownloadableProductsMyAccount;
				Assert.assertEquals(true, facetMyDownloadableProductsMyAccount.isDisplayed());
				System.out.println("My Downloadable products My Accountin left facet is dispalying");
				return new MyAccount_Page();
			
			

	}
			
			public MyAccount_Page userSeeFacetMyWishlistMyAccount() throws IOException, InterruptedException {
				WebElement facetMyWishlistMyAccount = facet_MyWishlistMyAccount;
				Assert.assertEquals(true, facetMyWishlistMyAccount.isDisplayed());
				System.out.println("My Wishlist My Account in left facet is dispalying");
				return new MyAccount_Page();
				
			}

	public MyAccount_Page userClicksDropDownListUserProfile() throws IOException, InterruptedException {
		waitAndClickElement(button_ProfileDropsdownList);
		Thread.sleep(2000);
		return new MyAccount_Page();
	}

	public MyAccount_Page userClicksMyAccountOnUserProfile() throws IOException, InterruptedException {
		waitAndClickElement(button_MyAccount);
		Thread.sleep(2000);
		return new MyAccount_Page();
	}

	public MyAccount_Page userSeeMyDashboardPageTitle() throws IOException, InterruptedException {
		WebElement titleMyDashboardPage = title_MyDashboard;
		Assert.assertEquals(true, titleMyDashboardPage.isDisplayed());
		System.out.println("MyDashbaord Page Title is dispalying");
		return new MyAccount_Page();

	}

	public MyAccount_Page userSeeAccountInformationHeading() throws IOException, InterruptedException {
		WebElement HeadingSeeAccountInformation = heading_AccountInformation;
		Assert.assertEquals(true, HeadingSeeAccountInformation.isDisplayed());
		System.out.println("Account Information Heading is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeNewsletterHeading() throws IOException, InterruptedException {
		WebElement HeadingSeeNewsletter = heading_Newsletter;
		Assert.assertEquals(true, HeadingSeeNewsletter.isDisplayed());
		System.out.println("Newsletter Heading is dispalying");
		return new MyAccount_Page();
		 
	}

	public MyAccount_Page userSeeAccountInformationEditButton() throws IOException, InterruptedException {
		WebElement ButtonAccountInfoEdit = button_EditContactInformation;
		Assert.assertEquals(true, ButtonAccountInfoEdit.isDisplayed());
		System.out.println("Edit Account Information button is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeChangePasswordButton() throws IOException, InterruptedException {
		WebElement ButtonChangePassword = button_ChangePassword;
		Assert.assertEquals(true, ButtonChangePassword.isDisplayed());
		System.out.println("Change Password button is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeNewsletterEditButton() throws IOException, InterruptedException {
		WebElement ButtonNewsletterEdit = button_NewsletterEdit;
		Assert.assertEquals(true, ButtonNewsletterEdit.isDisplayed());
		System.out.println("Edit Account Information button is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeManageAddressBookButton() throws IOException, InterruptedException {
		WebElement ButtonManageAddressBook = button_ManageAddresses;
		Assert.assertEquals(true, ButtonManageAddressBook.isDisplayed());
		System.out.println("Manage Address Book button is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeDefaultBillingAddressHeading() throws IOException, InterruptedException {
		WebElement HeadingBillingAddress = heading_DefaultBillingAddress;
		Assert.assertEquals(true, HeadingBillingAddress.isDisplayed());
		System.out.println("Deafault Billing Address Heading is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeEdtDefaultBillingAddressButton() throws IOException, InterruptedException {
		WebElement ButtonEditBillingAddress = button_EditDefaultBillingAddress;
		Assert.assertEquals(true, ButtonEditBillingAddress.isDisplayed());
		System.out.println("Deafault Billing Address Button is dispalying");
		return new MyAccount_Page();
	}

	public MyAccount_Page userSeeDefaultShippingAddressHeading() throws IOException, InterruptedException {
		WebElement HeadingShippingAddress = heading_DefaultShippingAddress;
		Assert.assertEquals(true, HeadingShippingAddress.isDisplayed());
		System.out.println("Deafault Shipping Address Heading is dispalying");
		return new MyAccount_Page();
		
	}

	public MyAccount_Page userSeeEdtDefaultShippingAddressButton() throws IOException, InterruptedException {
		WebElement ButtonEditShippingAddress = button_EditDefaultShippingAddress;
		Assert.assertEquals(true, ButtonEditShippingAddress.isDisplayed());
		System.out.println("Deafault Billing Address Button is dispalying");
		return new MyAccount_Page();
	}
		
	

	

}
