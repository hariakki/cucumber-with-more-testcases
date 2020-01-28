package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoggedOutUserAddProductToWishlistViaCategoryPlpSteps extends DriverFactory {

	
	@When("^user click woman category$")
	public void user_click_woman_category() throws Throwable {
		wishlistPage.userClicksWomanCategoryButton(); 
		
	}

	@Then("^user see plp page title$")
	public void user_see_plp_page_title() throws Throwable {
		wishlistPage.userSeeWomanPlpPageTitle();
	}

	@And("^user see home in breadcrumb$")
	public void user_see_home_in_breadcrumb() throws Throwable {
		wishlistPage.userSeeHomeBreadcrum();
	}
	@And("^user see woman in breadcrumb$")
	public void user_see_woman_in_breadcrumb() throws Throwable {
		wishlistPage.userSeeWomanBreadcrum();
	}

	@And("^user see base page title woman$")
	public void user_see_base_page_title_woman() throws Throwable {
		wishlistPage.userSeeWomanPlpPageTitle(); 
	}

	@And("^user see sub category tops title$")
	public void user_see_sub_category_tops_title() throws Throwable {
		wishlistPage.userSeeSubCategoryHeadingTops();
	}

	@And("^user see sub category hoodies & sweatshirts under tops$")
	public void user_see_sub_category_hoodies_sweatshirts_under_tops() throws Throwable {
		wishlistPage.userSeeSubCategoryHoodiesAndSweatshirts(); 
	}

	@And("^user see sub category jackets under tops$")
	public void user_see_sub_category_jackets_under_tops() throws Throwable {
		wishlistPage.userSeeSubCategoryJackets();
	}

	@And("^user see sub category tees under tops$")
	public void user_see_sub_category_tees_under_tops() throws Throwable {
		wishlistPage.userSeeSubCategoryTees();
	}

	@And("^user see sub category bars & tanks under tops$")
	public void user_see_sub_category_bars_tanks_under_tops() throws Throwable {
		wishlistPage.userSeeSubCategoryBrasAndTanks();
	}

	@And("^user see sub category bottoms title$")
	public void user_see_sub_category_bottoms_title() throws Throwable {
		wishlistPage.userSeeSubCategoryHeadingBottoms();
	}

	@And("^user see sub category pants under bottoms$")
	public void user_see_sub_category_pants_under_bottoms() throws Throwable {
		wishlistPage.userSeeSubCategoryPants();
	}

	@And("^user see sub category shorts under bottoms$")
	public void user_see_sub_category_shorts_under_bottoms() throws Throwable {
		wishlistPage.userSeeSubCategoryShorts();
	}

	@And("^user see sub compare products heading Plp$")
	public void user_see_sub_compare_products_heading_Plp() throws Throwable {
		wishlistPage.userSeeListHeadingCompareProductsPlp();
	}

	@And("^user see products if in compare list Plp$")
	public void user_see_products_if_in_compare_list_Plp() throws Throwable {
		wishlistPage.userSeeListCompareProductsPlp();
	}

	@And("^user see my wishlist heading Plp$")
	public void user_see_my_wishlist_heading_Plp() throws Throwable {
		wishlistPage.userSeeListHeadingMyWishlistPlp();
		
	}
	
	@And("^user see products if in wishlist Plp$")
	public void user_see_products_if_in_wishlist_Plp() throws Throwable {
		wishlistPage.userSeeListWishlistProductsPlp();
		
	
	}
	
	@And("^user see sub compare products heading wishlist page$")
	public void user_see_sub_compare_products_heading_wishlist_page() throws Throwable {
		wishlistPage.userSeeListHeadingCompareProductsWishlistPage();
	}

	@And("^user see products if in compare list wishlist page$")
	public void user_see_products_if_in_compare_list_wishlist_page() throws Throwable {
		wishlistPage.userSeeListCompareProductsWishlistPage();
	}

	@And("^user see my wishlist heading wishlist page$")
	public void user_see_my_wishlist_heading_wishlist_page() throws Throwable {
		wishlistPage.userSeeListHeadingMyWishlistWishlistPage();
		
	}
	
	@And("^user see products if in wishlist wishlist page$")
	public void user_see_products_if_in_wishlist_wishlist_page() throws Throwable {
		wishlistPage.userSeeListWishlistProductsWishlistPage();
		
	}

	@And("^user see selene yoga hoodie product$")
	public void user_see_selene_yoga_hoodie_product() throws Throwable {
		wishlistPage.userSeeYogaHoodieProduct();
	}

	@And("^user see radiant tee product$")
	public void user_see_radiant_tee_product() throws Throwable {
		wishlistPage.userSeeRadiantTeeProduct();
		
	}
	
	@And("^user see breathe easy tank product$")
	public void user_see_breathe_easy_tank_product() throws Throwable {
		wishlistPage.userSeeBreatheEasyTankProduct();
		
	}  
		
	@And("^user click add to wshlist on product selene yoga hoodie$")
	public void user_click_add_to_wshlist_on_product_selene_yoga_hoodie() throws Throwable {
		wishlistPage.userClickAddToWishlistSeleneYogaHoodiePlpButton();
	}

	@And("^user see customer login page$")
	public void user_see_customer_login_page() throws Throwable {
		wishlistPage.userSeeCustomerLoginPage();
	}

	@And("^user see my wishlist base page$")
	public void user_see_my_wishlist_base_page() throws Throwable {
		wishlistPage.userSeeMyWishlistPage();
	}

	@And("^user see whats new; woman; men; gear; training and sale categories$")
	public void user_see_whats_new_woman_men_gear_training_and_sale_categories() throws Throwable {
		wishlistPage.userSeeMainCategories();
	}

	@And("^user see account dashboard$")
	public void user_see_account_dashboard() throws Throwable {
		wishlistPage.userSeeFacetAccountDashboard();
	}

	@And("^user see my orders$")
	public void user_see_my_orders() throws Throwable {
		wishlistPage.userSeeFacetMyOrders();
	}

	@And("^user see my downloadable products$")
	public void user_see_my_downloadable_products() throws Throwable {
		wishlistPage.userSeeMyDownloadableProducts(); 
	}

	@And("^user see my wishlist$")
	public void user_see_my_wishlist() throws Throwable {
		wishlistPage.userSeeFacetMyWishlist();
	}

	@And("^user see address book$")
	public void user_see_address_book() throws Throwable {
		wishlistPage.userSeeFacetAddressBook();
	}

	@And("^user see account information$")
	public void user_see_account_information() throws Throwable {
		wishlistPage.userSeeFacetAccountInformaton();
	}

	@And("^user see stored payment methods$")
	public void user_see_stored_payment_methods() throws Throwable {
		wishlistPage.userSeeFacetStoredPaymentMethods();
	}

	@And("^user see billing agreements$")
	public void user_see_billing_agreements() throws Throwable {
		wishlistPage.userSeeFacetBillingAgreements();
	}

	@And("^user see my product reviews$")
	public void user_see_my_product_reviews() throws Throwable {
		wishlistPage.userSeeFacetMyProductReviews();
	}

	@And("^user see newsletter subscribtions$")
	public void user_see_newsletter_subscribtions() throws Throwable {
		wishlistPage.userSeeFacetNewsletterSubscriptions();
	}

	@And("^user see message you have no items in your wishlist$")
	public void user_see_message_you_have_no_items_in_your_wishlist() throws Throwable {
		wishlistPage.userSeeNoItemsInWishlist();
	}

	@And("^user see search textbox$")
	public void user_see_search_textbox() throws Throwable {
		wishlistPage.userSeeSearchTextbox();
	}

	@And("^user see logged in welcome message$")
	public void user_see_logged_in_welcome_message() throws Throwable {
		wishlistPage.userSeeLoggedInWelcomeMessage();
	}

	@And("^user see user profile dropdown box$")
	public void user_see_user_profile_dropdown_box() throws Throwable {
		wishlistPage.userSeeDropdownBox();
	}

	@And("^user see mini cart$")
	public void user_see_mini_cart() throws Throwable {
		wishlistPage.userSeeMiniCart();
	}

	@And("^user see about us$")
	public void user_see_about_us() throws Throwable {
		wishlistPage.userSeeFooterAboutUs();
	}

	@And("^user see customer service$")
	public void user_see_customer_service() throws Throwable {
		wishlistPage.userSeeFooterCustomerService();
	}

	@And("^user see privacy and cookie policy$")
	public void user_see_privacy_and_cookie_policy() throws Throwable {
		wishlistPage.userSeeFooterPrivacyAndCookiePolicy();
	}

	@And("^user see search items$")
	public void user_see_search_items() throws Throwable {
		wishlistPage.userSeeFooterSearchTerms();
	}

	@And("^user see advanced search$")
	public void user_see_advanced_search() throws Throwable {
		wishlistPage.userSeeFooterAdvancedSearch();
	}

	@And("^user see contact us$")
	public void user_see_contact_us() throws Throwable {
		wishlistPage.userSeeFooterContactUs();
	}

	@Then("^user see subscribe button textbox$")
	public void user_see_subscribe_button_textbox() throws Throwable {
		wishlistPage.userSeesubscribeTextbox();
	
	}

		
	}

