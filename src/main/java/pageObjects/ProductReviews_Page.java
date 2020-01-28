package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviews_Page extends BasePage {   

	public @FindBy(xpath = "//span[contains(.,'Your Rating')]") WebElement heading_Rating;
	// labels stars 1 to 5
	public @FindBy(xpath = "//label[@for='Rating_1']") WebElement star_Rating1;
	public @FindBy(xpath = "//label[@for='Rating_2']") WebElement star_Rating2;
	public @FindBy(xpath = "//label[@for='Rating_3']") WebElement star_Rating3;
	public @FindBy(xpath = "//label[@for='Rating_4']") WebElement star_Rating4;
	public @FindBy(xpath = "//label[@for='Rating_5']") WebElement star_Rating5;

	public @FindBy(xpath = "//span[contains(.,'Nickname')]") WebElement textboxName_Nickname;
	public @FindBy(xpath = "//input[@name='nickname']") WebElement textbox_Nickname;
	public @FindBy(xpath = "//span[contains(.,'Summary')]") WebElement textboxName_Summary;
	public @FindBy(xpath = "//input[contains(@name,'title')]") WebElement textbox_Summary;
	public @FindBy(xpath = "(//span[contains(.,'Review')])[1]") WebElement textboxName_Review;
	public @FindBy(xpath = "//textarea[contains(@name,'detail')]") WebElement textbox_Review;
	public @FindBy(xpath = "//button[contains(.,'Submit Review')]") WebElement button_SubmitReview;
	public @FindBy(xpath = "//div[contains(@data-bind,'html: message.text')]") WebElement message_SuccesSubmittedReview;
	public @FindBy(xpath = "//a[contains(.,'Reviews')]") WebElement tab_ReviewsTab;
	public @FindBy(xpath = "//a[contains(.,'My Product Reviews')]") WebElement button_MyProdcutReviews;
	public @FindBy(xpath = "//span[@class='base']") WebElement title_MyProdcutReviewsPage;
	public @FindBy(xpath = "//th[@class='col date']") WebElement coloumn_Created;
	public @FindBy(xpath = "//th[@class='col item']") WebElement coloumn_ProductReviews;
	public @FindBy(xpath = "//th[@class='col summary']") WebElement coloumn_Rating;
	public @FindBy(xpath = "//th[@class='col description']") WebElement coloumn_Review;
	
	
	

	public ProductReviews_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductReviews_Page userClicksReviewTabButton() throws IOException, InterruptedException {
		waitAndClickElement(tab_ReviewsTab);
		Thread.sleep(3000);
		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeRatingHeading() throws IOException, InterruptedException {
		WebElement seeRatingHeading = heading_Rating;
		if (seeRatingHeading.isDisplayed()) {
			System.out.println("Rating Heading  is displaying");

		} else {
			System.out.println("Rating Heading  NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeLabelRatingsOneToFive() throws IOException, InterruptedException {
		// see rating star 1
		WebElement seeStarRating1 = star_Rating1;
		if (seeStarRating1.isDisplayed()) {
			System.out.println("Rating Star 1 is displaying");

		} else {
			System.out.println("Rating Star 1 NOT DISPLAYING");
		}

		// see rating star 2
		WebElement seeStarRating2 = star_Rating2;
		if (seeStarRating2.isDisplayed()) {
			System.out.println("Rating Star 2 is displaying");

		} else {
			System.out.println("Rating Star 2 NOT DISPLAYING");
		}

		// see rating star 3
		WebElement seeStarRating3 = star_Rating3;
		if (seeStarRating3.isDisplayed()) {
			System.out.println("Rating Star 3 is displaying");

		} else {
			System.out.println("Rating Star 3 NOT DISPLAYING");
		}

		// see rating star 4
		WebElement seeStarRating4 = star_Rating4;
		if (seeStarRating4.isDisplayed()) {
			System.out.println("Rating Star 4 is displaying");

		} else {
			System.out.println("Rating Star 4 NOT DISPLAYING");
		}

		// see rating star 1
		WebElement seeStarRating5 = star_Rating5;
		if (seeStarRating5.isDisplayed()) {
			System.out.println("Rating Star 5 is displaying");

		} else {
			System.out.println("Rating Star 5 NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeNicknameTextboxName() throws IOException, InterruptedException {
		WebElement StreetAddresstboxName = textboxName_Nickname;
		if (StreetAddresstboxName.isDisplayed()) {
			System.out.println("Nickname Textbox Name is displaying");

		} else {
			System.out.println("Nickname Textbox Name NOT DISPLAYING");
		}

		return new ProductReviews_Page();
	}

	public ProductReviews_Page userSeeNicknameTextbox() throws IOException, InterruptedException {
		WebElement StreetAddresstbox = textbox_Nickname;
		if (StreetAddresstbox.isDisplayed()) {
			System.out.println("Nickname Textbox  is displaying");

		} else {
			System.out.println("Nickname Textbox  NOT DISPLAYING");
		}

		return new ProductReviews_Page();
	}

	public ProductReviews_Page userSeeSummaryTextboxName() throws IOException, InterruptedException {
		WebElement seeSummaryTextboxName = textboxName_Summary;
		if (seeSummaryTextboxName.isDisplayed()) {
			System.out.println("Summary Textbox Name  is displaying");

		} else {
			System.out.println("Summary Textbox Name NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeSummaryTextbox() throws IOException, InterruptedException {
		WebElement seeSummaryTextbox = textbox_Summary;
		if (seeSummaryTextbox.isDisplayed()) {
			System.out.println("Summary Textbox is displaying");

		} else {
			System.out.println("Summary Textbox NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeReviewTextboxName() throws IOException, InterruptedException {
		WebElement seeReviewTextboxName = textboxName_Review;
		if (seeReviewTextboxName.isDisplayed()) {
			System.out.println("Review Textbox Name  is displaying");

		} else {
			System.out.println("Review Textbox Name NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeReviewTextbox() throws IOException, InterruptedException {
		WebElement seeReviewTextbox = textbox_Review;
		if (seeReviewTextbox.isDisplayed()) {
			System.out.println("Review Textbox   is displaying");

		} else {
			System.out.println("Review Textbox  NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userSeeSubmitReviewButton() throws IOException, InterruptedException {
		WebElement seeSubmitReviewButton = button_SubmitReview;
		if (seeSubmitReviewButton.isDisplayed()) {
			System.out.println("Submit Review Button  is displaying");

		} else {
			System.out.println("Submit Review Button   NOT DISPLAYING");
		}

		return new ProductReviews_Page();

	}

	public ProductReviews_Page userStarRating5Button() throws IOException, InterruptedException {
		waitAndClickElement(star_Rating1);
		Thread.sleep(2000);
		return new ProductReviews_Page();

	}

	public ProductReviews_Page enterNickname(String nickname) throws Exception {
		sendKeysToWebElement(textbox_Nickname, nickname);
		return new ProductReviews_Page();
	}

	public ProductReviews_Page enterSummary(String summary) throws Exception {
		sendKeysToWebElement(textbox_Summary, summary);
		return new ProductReviews_Page();

	}

	public ProductReviews_Page enterReview(String review) throws Exception {

		sendKeysToWebElement(textbox_Review, review);
		return new ProductReviews_Page();
	}

	public ProductReviews_Page userClicksSubmitReviewButton() throws IOException, InterruptedException {
		waitAndClickElement(button_SubmitReview);
		Thread.sleep(3000);
		return new ProductReviews_Page();

	}

	
	public ProductReviews_Page userSeeSubmitReviewSuccessMessage() throws IOException, InterruptedException {
		WebElement seeSubmitReviewSuccessMessage = message_SuccesSubmittedReview;
		if (seeSubmitReviewSuccessMessage.isDisplayed()) {
			System.out.println("Submit Review Success Message  is displaying");

		} else {
			System.out.println("Submit Review Success Message  NOT DISPLAYING");
		}

		return new ProductReviews_Page();
		
	}

	public ProductReviews_Page userClicksMyProductsReviewButton() throws IOException, InterruptedException {
		waitAndClickElement(button_MyProdcutReviews);
		Thread.sleep(3000);
		return new ProductReviews_Page();
		
		
	}
	
	public ProductReviews_Page userSeeMyProductsReviewPageTitle() throws IOException, InterruptedException {
	WebElement seeSMyProdReviewsPageTitle = title_MyProdcutReviewsPage;
	if (seeSMyProdReviewsPageTitle.isDisplayed()) {
		System.out.println("My Products Review Page title is displaying");

	} else {
		System.out.println("My Products Review Page title NOT DISPLAYING");
	}

	return new ProductReviews_Page();
	
}
	
	public ProductReviews_Page userSeeCreatedColoumn() throws IOException, InterruptedException {
	WebElement seeCreatedColoumn = title_MyProdcutReviewsPage;
	if (seeCreatedColoumn.isDisplayed()) {
		System.out.println("Created Coloumn is displaying");

	} else {
		System.out.println("Created Coloumn  title NOT DISPLAYING");
	}

	return new ProductReviews_Page();
	
}
	
	public ProductReviews_Page userSeeRatingColumn() throws IOException, InterruptedException {
	WebElement seeRatingColoumn = coloumn_Rating;
	if (seeRatingColoumn.isDisplayed()) {
		System.out.println("Rating COloumn  is displaying");

	} else {
		System.out.println("Rating COloumn  title NOT DISPLAYING");
	}

	return new ProductReviews_Page();
	
}
	
	public ProductReviews_Page userSeeProductsReviewsColoumn() throws IOException, InterruptedException {
	WebElement seeCreatedColoumn = coloumn_ProductReviews;
	if (seeCreatedColoumn.isDisplayed()) {
		System.out.println("Created Coloumn is displaying");

	} else {
		System.out.println("Created Coloumn  title NOT DISPLAYING");
	}

	return new ProductReviews_Page();
		
		
	}
	}
