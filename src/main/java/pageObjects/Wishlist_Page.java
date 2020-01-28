package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

import cucumber.api.DataTable; 

public class Wishlist_Page extends BasePage {
	public String url = "http://devops.magento2.co.za";
	public @FindBy(xpath = "//*[@id=\"ui-id-4\"]/span[2]") WebElement button_WomanCategory;
	public @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[1]/a") WebElement breadcrum_Home;
	public @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/strong") WebElement breadcrum_Woman;
	public @FindBy(xpath = "/html/body/div[1]/main/div[1]/h1/span") WebElement title_PageTitleWoman;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/strong[1]/span") WebElement subCategoryHeading_Tops;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a") WebElement subCategory_HoodiesAndSweatshirts;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[2]/a") WebElement subCategory_Jackets;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[3]/a") WebElement subCategory_Tees;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[2]/div/div/ul[1]/li[4]/a") WebElement subCategory_BrasAndTanks;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[2]/div/div/strong[2]/span") WebElement subCategoryHeading_Bottoms;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[1]/a") WebElement subCategory_Pants;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[2]/a") WebElement subCategory_Shorts;
	// Plp
	public @FindBy(xpath = "//*[@id=\"block-compare-heading\"]") WebElement listHeading_CompareProductsPlp;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[3]/div[1]/div[2]") WebElement list_CompareProductsPlp;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[3]/div[2]/div[1]/strong") WebElement listHeading_MyWishlistPlp;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[3]/div[2]/div[2]/div") WebElement list_MyWishlistPlp;
	
	// MyWishlistPage
	public @FindBy(xpath = "//*[@id=\"block-compare-heading\"]") WebElement listHeading_CompareProductsWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[1]/div[2]") WebElement list_CompareProductsWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[1]/strong") WebElement listHeading_MyWishlistWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/div") WebElement list_MyWishlistWishlistPage;

	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/a/span/span/img") WebElement plpProduct_SelenYogaHoodie;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img") WebElement plpProduct_RadiantTee;
	public @FindBy(xpath = "/html/body/div[1]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/a/span/span/img") WebElement plpProduct_BreatheEasyTank;

	// my wishlist page element validation

	public @FindBy(xpath = "//span[contains(.,'Add to Wish List')]") WebElement button_AddToWishlistSeleneYogaHoodie;
	public @FindBy(xpath = "/html/body/div[1]/main/div[1]/h1/span") WebElement title_PageCustomerLogin;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div[1]/h1/span") WebElement title_PageMyWishlist;

	// categories
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[1]/a/span") WebElement category_WhatsNew;
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[2]/a/span[2]") WebElement category_Woman;
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[3]/a/span[2]") WebElement category_Men;
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[4]/a/span[2]") WebElement category_Gear;
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[5]/a/span[2]") WebElement category_Training;
	public @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/nav/ul/li[6]/a/span") WebElement category_Sale;
	// left facet

	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/ul/li[1]/a") WebElement facet_AccountDashboard;
	public @FindBy(xpath = "//a[contains(.,'My Orders')]") WebElement facet_MyOrders;
	public @FindBy(xpath = "//a[contains(.,'My Downloadable Products')]") WebElement facet_MyDownloadableProducts;
	public @FindBy(xpath = "(//a[contains(.,'My Wish List')])[3]") WebElement facet_MyWishlist;
	public @FindBy(xpath = "//a[contains(.,'Address Book')]") WebElement facet_AddressBook;
	public @FindBy(xpath = "//a[contains(.,'Account Information')]") WebElement facet_AccountInformation;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/ul/li[8]/a") WebElement facet_StoredPaymentMethods;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[2]/div[1]/div[2]/ul/li[9]/a") WebElement facet_BillingAgreements;
	public @FindBy(xpath = "//a[contains(.,'My Product Reviews')]") WebElement facet_MyProductReviews;
	public @FindBy(xpath = "//a[contains(.,'Newsletter Subscriptions')]") WebElement facet_NewsletterSubscriptions;

	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[1]/span") WebElement message_NoItemsInWishlist;
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[1]/span") WebElement message_Welcome;
	public @FindBy(xpath = "//*[@id=\"search\"]") WebElement textbox_Search;
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button") WebElement dropdownBox_UserName;
	public @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]/a") WebElement cart_MiniCart;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/div[2]/div/ul/li[1]/a") WebElement footerLink_AboutUs;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/div[2]/div/ul/li[2]/a") WebElement footerLink_CustomerService;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/ul/li[1]/a") WebElement footerLink_PrivacyAndCookiePolicy;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/ul/li[3]/a") WebElement footerLink_SearchTerms;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/ul/li[3]/a") WebElement footerLink_AdvancedSearch;
	public @FindBy(xpath = "/html/body/div[1]/footer/div/ul/li[4]/a") WebElement footerLink_ContactUs;
	public @FindBy(xpath = "//*[@id=\"newsletter\"]") WebElement textbox_Subscribe;

	// Pdp

	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h1/span") WebElement title_SeleneYogaHoodiePdp;
	public @FindBy(xpath = "//span[contains(.,'Add to Wish List')]") WebElement button_AddToWishlistSeleneYogaHoodiePdp;

	// Wishlist page validation logged in user and item in wishlist

	// Click
	public @FindBy(xpath = "(//div[@role='option'])[1]") WebElement button_SizeXS;
	public @FindBy(xpath = "//div[@option-label='Blue']") WebElement button_OrangeColour;

	// See
	public @FindBy(xpath = "//div[@data-bind='html: message.text']") WebElement see_SuccessMessageProductAddToWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[1]/ol/li/div/strong/a") WebElement see_ProductListedOnWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[1]/ol/li/div/div[2]/span") WebElement button_SeeDetails;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[2]/div[1]/button[2]/span") WebElement button_UpdateWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[2]/div[1]/button[1]/span") WebElement button_ShareWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[2]/div[1]/button[3]/span") WebElement button_AddToCartViaWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/ol/li/div/div/div[1]/div/p/span/span/span") WebElement see_Price;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/ol/li/div/div/strong/a/span") WebElement see_ProductInWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/ol/li/div/div/div[2]/div[2]/a") WebElement button_CloseIfInWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/div/div/a/span") WebElement button_GoToWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/ol/li/div/div/div[2]/div[1]/button/span") WebElement see_AddToCartIfInWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[2]/ol/li/div/a/span/span/img") WebElement see_ProductImageIfInWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[3]/div[3]/div[1]/span") WebElement see_QtyOfItemtIfInWishlistPage;

	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[1]") WebElement message_ItemRemovedfromwishlist;
	
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[2]/div[1]/button[2]/span") WebElement button_ShareWishlistViaWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]") WebElement title_WishlistSharingPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/fieldset/legend/span") WebElement see_SharingInformation;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/fieldset/div[1]/label/span") WebElement text_EmailAddressTextboxText;
	public @FindBy(xpath = "//*[@id=\"email_address\"]") WebElement textbox_EmailAddressTextbox;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/fieldset/div[1]/label/span") WebElement text_MessageText;
	public @FindBy(xpath = "//*[@id=\"message\"]") WebElement textbox_MessageTextbox;
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div/div[1]/button/span") WebElement button_ShareWishlistViaShareWishlistPage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[2]/div/div/div") WebElement message_SuccessfullySharedWishlist;
	
	//add all to cart via wishlist
	public @FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/form/div[2]/div[1]/button[3]/span") WebElement button_AddAllToCartViaWishlist;
	public @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[2]/div/div/div") WebElement message_AddAllToCartViaWishlistSuccessMessage;
	public @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[2]/div/div/div") WebElement miniCart_ItemAddedToMiniCart;
	
	
	
	public Wishlist_Page() throws IOException {
		super();

	}

	public Wishlist_Page userClicksWomanCategoryButton() throws IOException, InterruptedException {
		waitAndClickElement(button_WomanCategory);
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	// public Wishlist_Page userSeeHomeBreadcrum() throws IOException,
	// InterruptedException {
	// WebElement homeBreadcrum = breadcrum_Home;
	// Assert.assertEquals(true, homeBreadcrum.isDisplayed());
	// System.out.println("Home breadcrum is dispalying");
	// return new Wishlist_Page();

	public Wishlist_Page userSeeHomeBreadcrum() throws IOException, InterruptedException {
		WebElement homeBreadcrum = getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a"));
		Assert.assertEquals(true, homeBreadcrum.isDisplayed());
		System.out.println("Home breadcrum is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeWomanBreadcrum() throws IOException, InterruptedException {
		WebElement womanBreadcrum = breadcrum_Woman;
		Assert.assertEquals(true, womanBreadcrum.isDisplayed());
		System.out.println("Woman breadcrum is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeWomanPlpPageTitle() throws IOException, InterruptedException {
		WebElement womanPageTitle = title_PageTitleWoman;
		Assert.assertEquals(true, womanPageTitle.isDisplayed());
		System.out.println("Woman Page Title is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryHeadingTops() throws IOException, InterruptedException {
		WebElement womanTopsSubCategory = subCategoryHeading_Tops;
		Assert.assertEquals(true, womanTopsSubCategory.isDisplayed());
		System.out.println("Woman Tops Sub Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryHoodiesAndSweatshirts() throws IOException, InterruptedException {
		WebElement womanTopsHoodiesAndSweatshirts = subCategory_HoodiesAndSweatshirts;
		Assert.assertEquals(true, womanTopsHoodiesAndSweatshirts.isDisplayed());
		System.out.println("Woman Page Title is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryJackets() throws IOException, InterruptedException {
		WebElement womanTopsJackets = subCategory_Jackets;
		Assert.assertEquals(true, womanTopsJackets.isDisplayed());
		System.out.println("Woman Jackets Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryTees() throws IOException, InterruptedException {
		WebElement womanTopsTees = subCategory_Tees;
		Assert.assertEquals(true, womanTopsTees.isDisplayed());
		System.out.println("Woman Tees Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryBrasAndTanks() throws IOException, InterruptedException {
		WebElement womanTopsBrasAndTanks = subCategory_BrasAndTanks;
		Assert.assertEquals(true, womanTopsBrasAndTanks.isDisplayed());
		System.out.println("Woman Bras And Tanks Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryHeadingBottoms() throws IOException, InterruptedException {
		WebElement womanBottomsSubCategory = subCategoryHeading_Bottoms;
		Assert.assertEquals(true, womanBottomsSubCategory.isDisplayed());
		System.out.println("Woman Bottoms Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryPants() throws IOException, InterruptedException {
		WebElement womanBottomsPants = subCategory_Pants;
		Assert.assertEquals(true, womanBottomsPants.isDisplayed());
		System.out.println("Woman Pants Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSubCategoryShorts() throws IOException, InterruptedException {
		WebElement womanBottomsShorts = subCategory_Shorts;
		Assert.assertEquals(true, womanBottomsShorts.isDisplayed());
		System.out.println("Woman Shorts Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListHeadingCompareProductsPlp() throws IOException, InterruptedException {
		WebElement compareProductsHeadingPlp = listHeading_CompareProductsPlp;
		Assert.assertEquals(true, compareProductsHeadingPlp.isDisplayed());
		System.out.println("Woman Compare Products on Plp is dispalying");
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListCompareProductsPlp() throws IOException, InterruptedException {
		WebElement compareProductslistPlp = list_CompareProductsPlp;
		Assert.assertEquals(true, compareProductslistPlp.isDisplayed());
		System.out.println("Woman Compare Products list on Plp is dispalying");
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListHeadingMyWishlistPlp() throws IOException, InterruptedException {
		WebElement wishlistHeadingPlp = listHeading_MyWishlistPlp;
		Assert.assertEquals(true, wishlistHeadingPlp.isDisplayed());
		System.out.println("Woman Wishlist on Plp is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListWishlistProductsPlp() throws IOException, InterruptedException {
		WebElement wishlistListPlp = list_MyWishlistPlp;
		Assert.assertEquals(true, wishlistListPlp.isDisplayed());
		System.out.println("Woman Wishlist list on Plp is dispalying");
		return new Wishlist_Page();

	}
 
	public Wishlist_Page userSeeListHeadingCompareProductsWishlistPage() throws IOException, InterruptedException {
		WebElement compareProductsHeadingWishlistPage = listHeading_CompareProductsWishlistPage;
		Assert.assertEquals(true, compareProductsHeadingWishlistPage.isDisplayed());
		System.out.println("Woman Compare Products on Wishlist Page is dispalying");
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListCompareProductsWishlistPage() throws IOException, InterruptedException {
		WebElement compareProductslistWishlistPage = list_CompareProductsWishlistPage;
		Assert.assertEquals(true, compareProductslistWishlistPage.isDisplayed());
		System.out.println("Woman Compare Products list on Wishlist Page is dispalying");
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListHeadingMyWishlistWishlistPage() throws IOException, InterruptedException {
		WebElement wishlistHeadingWishlistPage = listHeading_MyWishlistWishlistPage;
		Assert.assertEquals(true, wishlistHeadingWishlistPage.isDisplayed());
		System.out.println("Woman Wishlist on Wishlist Page is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeListWishlistProductsWishlistPage() throws IOException, InterruptedException {
		WebElement wishlistListWishlistPage = list_MyWishlistWishlistPage;
		Assert.assertEquals(true, wishlistListWishlistPage.isDisplayed());
		System.out.println("Woman Wishlist list on Wishlist Page is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeYogaHoodieProduct() throws IOException, InterruptedException {
		WebElement productSeeYogaHoodie = plpProduct_SelenYogaHoodie;
		Assert.assertEquals(true, productSeeYogaHoodie.isDisplayed());
		System.out.println("Woman Selene Yoga Hodie product Category is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeRadiantTeeProduct() throws IOException, InterruptedException {
		WebElement productSeeRadiantTee = plpProduct_RadiantTee;
		Assert.assertEquals(true, productSeeRadiantTee.isDisplayed());
		System.out.println("Woman Radiant Tank product is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeBreatheEasyTankProduct() throws IOException, InterruptedException {
		WebElement productSeeBreatheEasyTank = plpProduct_BreatheEasyTank;
		Assert.assertEquals(true, productSeeBreatheEasyTank.isDisplayed());
		System.out.println("Woman Breathe Easy Tank product is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userClickAddToWishlistSeleneYogaHoodiePlpButton() throws IOException, InterruptedException {
		waitAndClickElement(button_AddToWishlistSeleneYogaHoodie);
		Thread.sleep(2000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeCustomerLoginPage() throws IOException, InterruptedException {
		WebElement customerLoginPage = title_PageCustomerLogin;
		Assert.assertEquals(true, customerLoginPage.isDisplayed());
		System.out.println("Customer Login Page is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeMyWishlistPage() throws IOException, InterruptedException {
		WebElement myWishlistPage = title_PageMyWishlist;
		Assert.assertEquals(true, myWishlistPage.isDisplayed());
		System.out.println("My Wishlist Page is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeMainCategories() throws IOException, InterruptedException {
		WebElement categoryWhatsNew = category_WhatsNew;
		Assert.assertEquals(true, categoryWhatsNew.isDisplayed());
		System.out.println("Whats New category is dispalying");

		WebElement categoryWoman = category_Woman;
		Assert.assertEquals(true, categoryWoman.isDisplayed());
		System.out.println("Woman category is dispalying");

		WebElement categoryMen = category_Men;
		Assert.assertEquals(true, categoryMen.isDisplayed());
		System.out.println("Men category is dispalying");

		WebElement categoryGear = category_Gear;
		Assert.assertEquals(true, categoryGear.isDisplayed());
		System.out.println("Gear category is dispalying");

		WebElement categoryTraining = category_Training;
		Assert.assertEquals(true, categoryTraining.isDisplayed());
		System.out.println("Traning category is dispalying");

		WebElement categorySale = category_Sale;
		Assert.assertEquals(true, categorySale.isDisplayed());
		System.out.println("Sale category is dispalying");

		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetAccountDashboard() throws IOException, InterruptedException {
		WebElement facetAccountDashboard = facet_AccountDashboard;
		Assert.assertEquals(true, facetAccountDashboard.isDisplayed());
		System.out.println("Account Dashboard in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetMyOrders() throws IOException, InterruptedException {
		WebElement facetMyOrders = facet_MyOrders;
		Assert.assertEquals(true, facetMyOrders.isDisplayed());
		System.out.println("My Orders in left facet is dispalying");
		return new Wishlist_Page();
	}

	public Wishlist_Page userSeeMyDownloadableProducts() throws IOException, InterruptedException {
		WebElement facetMyDownloadableProducts = facet_MyDownloadableProducts;
		Assert.assertEquals(true, facetMyDownloadableProducts.isDisplayed());
		System.out.println("My Downloadable products in left facet is dispalying");
		return new Wishlist_Page(); 

	}

	public Wishlist_Page userSeeFacetMyWishlist() throws IOException, InterruptedException {
		WebElement facetMyWishlist = facet_MyWishlist;
		Assert.assertEquals(true, facetMyWishlist.isDisplayed());
		System.out.println("My Wishlist in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetAddressBook() throws IOException, InterruptedException {
		WebElement facetMyWishlist = facet_AddressBook;
		Assert.assertEquals(true, facetMyWishlist.isDisplayed());
		System.out.println("*************************************Address Boook in left facet is dispalying**************************");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetAccountInformaton() throws IOException, InterruptedException {
		WebElement facetAccountInformaton = facet_AddressBook;
		Assert.assertEquals(true, facetAccountInformaton.isDisplayed());
		System.out.println("----------------------------Account Information in left facet is dispalying-------------------------------");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetStoredPaymentMethods() throws IOException, InterruptedException {
		WebElement facetStoredPaymentMethods = facet_StoredPaymentMethods;
		Assert.assertEquals(true, facetStoredPaymentMethods.isDisplayed());
		System.out.println("Stored Payment Methodsn in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetBillingAgreements() throws IOException, InterruptedException {
		WebElement facetBillingAgreements = facet_BillingAgreements;
		Assert.assertEquals(true, facetBillingAgreements.isDisplayed());
		System.out.println("Billing Agreement in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetMyProductReviews() throws IOException, InterruptedException {
		WebElement facetMyProductReviews = facet_MyProductReviews;
		Assert.assertEquals(true, facetMyProductReviews.isDisplayed());
		System.out.println("Billing Agreement in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFacetNewsletterSubscriptions() throws IOException, InterruptedException {
		WebElement facetNewsletterSubscriptions = facet_NewsletterSubscriptions;
		Assert.assertEquals(true, facetNewsletterSubscriptions.isDisplayed());
		System.out.println("Newsletter Sunscribtions in left facet is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeNoItemsInWishlist() throws IOException, InterruptedException {
		WebElement noWishlistItemsListed = message_NoItemsInWishlist;
		Assert.assertEquals(true, noWishlistItemsListed.isDisplayed());
		System.out.println("No Wishlist Items is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSearchTextbox() throws IOException, InterruptedException {
		WebElement searchTextbox = textbox_Search;
		Assert.assertEquals(true, searchTextbox.isDisplayed());
		System.out.println("Search Textbox is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeLoggedInWelcomeMessage() throws IOException, InterruptedException {
		WebElement welcomeLoggedInMessage = message_Welcome;
		Assert.assertEquals(true, welcomeLoggedInMessage.isDisplayed());
		System.out.println("Welcome Logged In Message is dispalying");
		return new Wishlist_Page();
	}

	public Wishlist_Page userSeeDropdownBox() throws IOException, InterruptedException {
		WebElement profileDropdownBox = dropdownBox_UserName;
		Assert.assertEquals(true, profileDropdownBox.isDisplayed());
		System.out.println("Profile Dropdown Box is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeMiniCart() throws IOException, InterruptedException {
		WebElement miniCart = cart_MiniCart;
		Assert.assertEquals(true, miniCart.isDisplayed());
		System.out.println("Profile Dropdown Box is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterAboutUs() throws IOException, InterruptedException {
		WebElement footerAboutUs = footerLink_AboutUs;
		Assert.assertEquals(true, footerAboutUs.isDisplayed());
		System.out.println("About Us Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterCustomerService() throws IOException, InterruptedException {
		WebElement footerCustomerService = footerLink_CustomerService;
		Assert.assertEquals(true, footerCustomerService.isDisplayed());
		System.out.println("Customer Service Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterPrivacyAndCookiePolicy() throws IOException, InterruptedException {
		WebElement footerPrivacyAndCookiePolicy = footerLink_PrivacyAndCookiePolicy;
		Assert.assertEquals(true, footerPrivacyAndCookiePolicy.isDisplayed());
		System.out.println("Privacy And Cookie Policy Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterSearchTerms() throws IOException, InterruptedException {
		WebElement footerSearchTerms = footerLink_SearchTerms;
		Assert.assertEquals(true, footerSearchTerms.isDisplayed());
		System.out.println("Search Terms Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterAdvancedSearch() throws IOException, InterruptedException {
		WebElement footerAdvancedSearch = footerLink_AdvancedSearch;
		Assert.assertEquals(true, footerAdvancedSearch.isDisplayed());
		System.out.println("Advanced Search Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeFooterContactUs() throws IOException, InterruptedException {
		WebElement footerContactUs = footerLink_ContactUs;
		Assert.assertEquals(true, footerContactUs.isDisplayed());
		System.out.println("Contact Us Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeesubscribeTextbox() throws IOException, InterruptedException {
		WebElement textboxSubscribe = textbox_Subscribe;
		Assert.assertEquals(true, textboxSubscribe.isDisplayed());
		System.out.println("Contact Us Footer is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userClicksSeleneYogaHoodieButton() throws IOException, InterruptedException {
		waitAndClickElement(plpProduct_SelenYogaHoodie);
		Thread.sleep(4000);
		return new Wishlist_Page();

	}

	public Wishlist_Page userSeeSeleneYogaHoodiePdpPageTitle() throws IOException, InterruptedException {
		WebElement titleSeleneYogaHoodiePdpPageTitle = title_SeleneYogaHoodiePdp;
		Assert.assertEquals(true, titleSeleneYogaHoodiePdpPageTitle.isDisplayed());
		System.out.println("Selen Yoga Hoodie Page Title is dispalying");
		return new Wishlist_Page();

	}

	public Wishlist_Page userClicksSeleneYogaHoodieAddToWishlistPdpButton() throws IOException, InterruptedException {
		waitAndClickElement(button_AddToWishlistSeleneYogaHoodiePdp);
		Thread.sleep(2000);
		return new Wishlist_Page();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


public Wishlist_Page userClicksSizeXSButton() throws IOException, InterruptedException {
	waitAndClickElement(button_SizeXS);
	Thread.sleep(1000);
	return new Wishlist_Page();
}

public Wishlist_Page userClicksOrangeColourButton() throws IOException, InterruptedException {
	waitAndClickElement(button_OrangeColour);
	Thread.sleep(1000);
	return new Wishlist_Page();
}









public Wishlist_Page userSeeSuccessMessageProductAddedToWishlist() throws IOException, InterruptedException {
	WebElement seeSuccessMessageProductAddedToWishlist = see_SuccessMessageProductAddToWishlist;
	Assert.assertEquals(true, seeSuccessMessageProductAddedToWishlist.isDisplayed());
	System.out.println("Product Successfully added to wishlist message is dispalying");
	return new Wishlist_Page();

}

public Wishlist_Page userSeeProductListedInWishlist() throws IOException, InterruptedException {
	WebElement seeProductListedInWishlist = see_ProductListedOnWishlist;
	Assert.assertEquals(true, seeProductListedInWishlist.isDisplayed());
	System.out.println("Product listed as wishlist item is dispalying");
	return new Wishlist_Page();

}

public Wishlist_Page userSeeDetailsButton() throws IOException, InterruptedException {
	WebElement seeDetailsButton = button_SeeDetails;
	Assert.assertEquals(true, seeDetailsButton.isDisplayed());
	System.out.println("See details button is dispalying");
	return new Wishlist_Page();

}

public Wishlist_Page userSeeUpdateWishlistButton() throws IOException, InterruptedException {
	WebElement seeUpdateWishlistButton = button_UpdateWishlist;
	Assert.assertEquals(true, seeUpdateWishlistButton.isDisplayed());
	System.out.println("Update wishlist button is dispalying");
	return new Wishlist_Page();

}

public Wishlist_Page userSeeShareWishlistButton() throws IOException, InterruptedException {
	WebElement seeShareWishlistButton = button_ShareWishlist;
	Assert.assertEquals(true, seeShareWishlistButton.isDisplayed());
	System.out.println("Share wishlist button is dispalying");
	return new Wishlist_Page();

}



public Wishlist_Page userSeeSeleneYogaHoodiePrice() throws IOException, InterruptedException {
	WebElement seeSeleneYogaHoodiePrice = see_Price;
	Assert.assertEquals(true, seeSeleneYogaHoodiePrice.isDisplayed());
	System.out.println("Product price is dispalying");
	return new Wishlist_Page();



}

public Wishlist_Page userSeeCloseIfInWishlistButton() throws IOException, InterruptedException {
	WebElement seeCloseIfInWishlistButton = button_CloseIfInWishlistPage;
	Assert.assertEquals(true, seeCloseIfInWishlistButton.isDisplayed());
	System.out.println("Close button is dispalying");
	return new Wishlist_Page();
	




	
}

public Wishlist_Page userSeeAddToCartIfInWishlistButton() throws IOException, InterruptedException {
	WebElement seeAddToCartIfInWishlistButton = see_AddToCartIfInWishlistPage;
	Assert.assertEquals(true, seeAddToCartIfInWishlistButton.isDisplayed());
	System.out.println("Add to cart button if in wishlist is dispalying");
	return new Wishlist_Page();

	
}

public Wishlist_Page userSeeSeleneYogaHoodieProductImage() throws IOException, InterruptedException {
	WebElement seeSeleneYogaHoodieProductImage = see_ProductImageIfInWishlistPage;
	Assert.assertEquals(true, seeSeleneYogaHoodieProductImage.isDisplayed());
	System.out.println("Product Image is dispalying");
	return new Wishlist_Page();
	
}

public Wishlist_Page userSeeSeleneYogaHoodieProductQty() throws IOException, InterruptedException {
	WebElement seeSeleneYogaHoodieProductQty = see_QtyOfItemtIfInWishlistPage;
	Assert.assertEquals(true, seeSeleneYogaHoodieProductQty.isDisplayed());
	System.out.println("Product QTY is dispalying");
	return new Wishlist_Page();

}
	
	public Wishlist_Page userSeeAddToCartViaWishlistPageButton() throws IOException, InterruptedException {
		WebElement seeAddToCartViaWishlistPageButton = button_AddToCartViaWishlist;
		Assert.assertEquals(true, seeAddToCartViaWishlistPageButton.isDisplayed());
		System.out.println("Add to cart via wishlistAnd user click Selene Yoga Hoodie is dispalying");
		return new Wishlist_Page();

	}
	

       public Wishlist_Page userClickCloseButton() throws IOException, InterruptedException {
	    waitAndClickElement(button_CloseIfInWishlistPage);
	   Thread.sleep(2000);
	    return new Wishlist_Page();
	
	
}
       

public Wishlist_Page userSeeItemSuccessfullyRemovedFromWishlistMessage() throws IOException, InterruptedException {
	WebElement seeItemSuccessfullyRemovedFromWishlistMessage = message_ItemRemovedfromwishlist;
	Assert.assertEquals(true, seeItemSuccessfullyRemovedFromWishlistMessage.isDisplayed());
	System.out.println("Successfully removed item from wishlist is dispalying");
	return new Wishlist_Page();

	
	
	
	
	
	
	
	
	
	
	
	
	
}

public Wishlist_Page userClicksShareWishlistButtonViaWishlistPage() throws IOException, InterruptedException {
	waitAndClickElement(button_ShareWishlistViaWishlistPage);
	Thread.sleep(2000);
	return new Wishlist_Page();


}


public Wishlist_Page userSeeWishlistSharingTitle() throws IOException, InterruptedException {
	WebElement seeWishlistSharingTitle = title_WishlistSharingPage;
	Assert.assertEquals(true, seeWishlistSharingTitle.isDisplayed());
	System.out.println("Wishlist Sharing Page Title is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeSharingInformationText() throws IOException, InterruptedException {
	WebElement seeSharingInformationText = see_SharingInformation;
	Assert.assertEquals(true, seeSharingInformationText.isDisplayed());
	System.out.println("Sharing Information Text is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeEmailText() throws IOException, InterruptedException {
	WebElement ueeEmailText = text_EmailAddressTextboxText;
	Assert.assertEquals(true, ueeEmailText.isDisplayed());
	System.out.println("Email Text is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeEmailTextbox() throws IOException, InterruptedException {
	WebElement seeEmailTextbox = textbox_EmailAddressTextbox;
	Assert.assertEquals(true, seeEmailTextbox.isDisplayed());
	System.out.println("Email textbox is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeEMessageText() throws IOException, InterruptedException {
	WebElement seeEMessageText = text_MessageText;
	Assert.assertEquals(true, seeEMessageText.isDisplayed());
	System.out.println("SMessage text is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeEMessageTextbox() throws IOException, InterruptedException {
	WebElement seeEMessageTextbox = textbox_MessageTextbox;
	Assert.assertEquals(true, seeEMessageTextbox.isDisplayed());
	System.out.println("Successfully removed item from wishlist is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userSeeShareWishlistViWishlistPageButton() throws IOException, InterruptedException {
	WebElement seeShareWishlistViWishlistPageButton = button_ShareWishlistViaShareWishlistPage;
	Assert.assertEquals(true, seeShareWishlistViWishlistPageButton.isDisplayed());
	System.out.println("Successfully removed item from wishlist is dispalying");
	return new Wishlist_Page();
	
}


public Wishlist_Page userEnterEmailShare(DataTable emailData, int row, int column) throws Exception {
	List<List<String>> data = emailData.raw();
	sendKeysToWebElement(text_EmailAddressTextboxText,data.get(row).get(column));
	return new Wishlist_Page(); 
	
		
	
}

public Wishlist_Page userEnterMessageShare(DataTable messageData, int row, int column) throws Exception {
	List<List<String>> data = messageData.raw();
	sendKeysToWebElement(textbox_MessageTextbox, data.get(row).get(column));
	return new Wishlist_Page(); 
	
} 
	
	
	
	
	
	
	
	
	
 

public Wishlist_Page userClickShareWishlistButtonWishlistPageButton() throws IOException, InterruptedException {
	waitAndClickElement(button_ShareWishlistViaWishlistPage);
	return new Wishlist_Page(); 
	
}


public Wishlist_Page userSeeSuccessMessageShareWishlistMessage() throws IOException, InterruptedException {
	WebElement seeSuccessMessageShareWishlistMessage = message_SuccessfullySharedWishlist;
	Assert.assertEquals(true, seeSuccessMessageShareWishlistMessage.isDisplayed());
	System.out.println("Your wish list has been shared is dispalying");
	return new Wishlist_Page();
	


	
	
}

public Wishlist_Page userClickAddAllToCartVaWishlistButton() throws IOException, InterruptedException {
	waitAndClickElement(button_AddAllToCartViaWishlist);
	return new Wishlist_Page(); 


}


public Wishlist_Page userSeeAddAllToCartViaWishlistSuccessMessage() throws IOException, InterruptedException {
	WebElement seeeeAddAllToCartViaWishlistSuccessMessage = message_AddAllToCartViaWishlistSuccessMessage;
	Thread.sleep(2000);
	Assert.assertEquals(true, seeeeAddAllToCartViaWishlistSuccessMessage.isDisplayed());
	System.out.println("Add All to cart via wishlist success message is dispalying");
	return new Wishlist_Page();


}


public Wishlist_Page userSeeItemAddedToCart() throws IOException, InterruptedException {
	WebElement seeItemAddedToCart = miniCart_ItemAddedToMiniCart;
	Thread.sleep(2000);
	Assert.assertEquals(true, seeItemAddedToCart.isDisplayed());
	System.out.println("Item Added to cart on mini cart is dispalying");
	return new Wishlist_Page();


}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

