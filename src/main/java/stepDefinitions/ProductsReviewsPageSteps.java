package stepDefinitions;
 
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductsReviewsPageSteps extends DriverFactory{
	
	@When("^user clicks reviews tab$") 
	public void user_clicks_reviews_tab() throws Throwable {
		productReviewsPage.userClicksReviewTabButton();
	}  
 
	@Then("^user see your rating header$")
	public void user_see_your_rating_header() throws Throwable {
		productReviewsPage.userSeeRatingHeading();
	}  

	@And("^user see label rating one to five$")
	public void user_see_label_rating_one_to_five() throws Throwable {
		productReviewsPage.userSeeLabelRatingsOneToFive();
	} 

	@And("^user see nickname textbox name$")
	public void user_see_nickname_textbox_name() throws Throwable {
		productReviewsPage.userSeeNicknameTextboxName();
	}

	@And("^user see nickname textbox$")
	public void user_see_nickname_textbox() throws Throwable {
		productReviewsPage.userSeeNicknameTextbox();
	}

	@And("^user see summary textbox name$")
	public void user_see_summary_textbox_name() throws Throwable {
		productReviewsPage.userSeeSummaryTextboxName();
	}

	@And("^user see summary textbox$")
	public void user_see_summary_textbox() throws Throwable {
		productReviewsPage.userSeeSummaryTextbox();
	}

	@And("^user see review textbox name$")
	public void user_see_review_textbox_name() throws Throwable {
		productReviewsPage.userSeeReviewTextboxName();
	}

	@And("^user see review textbox$")
	public void user_see_review_textbox() throws Throwable {
		productReviewsPage.userSeeReviewTextbox();
	}

	@And("^user see submit review button$")
	public void user_see_submit_review_button() throws Throwable {
		productReviewsPage.userSeeSubmitReviewButton();
	}
 
	@And("^user clicks label rating five$")
	public void user_clicks_label_rating_five() throws Throwable {
		productReviewsPage.userStarRating5Button();
	}

	@And("^user enter \"([^\"]*)\" nickname$")
	public void user_enter_nickname(String nickname) throws Throwable {
		productReviewsPage.enterNickname(nickname);
	}
 
	@And("^user enter \"([^\"]*)\" summary$")
	public void user_enter_summary(String summary) throws Throwable {
		productReviewsPage.enterSummary(summary);
	} 

	@And("^user enter \"([^\"]*)\" review$")
	public void user_enter_review(String review) throws Throwable {
		productReviewsPage.enterReview(review);
	} 

	@When("^user clicks submit review button$")
	public void user_clicks_submit_review_button() throws Throwable {
		productReviewsPage.userClicksSubmitReviewButton();
	}

	@Then("^user see success submitted review message$")
	public void user_see_success_submitted_review_message() throws Throwable {
		productReviewsPage.userSeeSubmitReviewSuccessMessage();
	} 
		@When("^user clicks my product reviews$")
		public void user_clicks_my_product_reviews() throws Throwable {
			productReviewsPage.userClicksMyProductsReviewButton();
		}

		@Then("^user see My Product Reviews Page$")
		public void user_see_My_Product_Reviews_Page() throws Throwable {
			productReviewsPage.userSeeMyProductsReviewPageTitle();
		}

		@And("^user see created coloumn$")
		public void user_see_created_coloumn() throws Throwable {
			productReviewsPage.userSeeCreatedColoumn();
		}

		@And("^user see product name coloumn$")
		public void user_see_product_name_coloumn() throws Throwable {
			productReviewsPage.userSeeProductsReviewsColoumn(); 
		}

		@And("^user see rating coloumn$")
		public void user_see_rating_coloumn() throws Throwable {
			productReviewsPage.userSeeRatingColumn();
		}

		@And("^user see review coloumn$")
		public void user_see_review_coloumn() throws Throwable {
			productReviewsPage.userSeeProductsReviewsColoumn();
		
		
		}
		
}

	