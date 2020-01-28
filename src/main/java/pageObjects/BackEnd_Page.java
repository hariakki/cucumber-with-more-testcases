package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BackEnd_Page extends BasePage {
	public String urlBackEnd = "http://devops.magento2.co.za/admin_riwnpv/";
	public @FindBy(xpath = "//button[contains(.,'Sign in')]") WebElement button_SignInBackEnd;
	public @FindBy(xpath = "//input[@type='text']") WebElement textfield_UserName;
	public @FindBy(xpath = "//input[@type='password']") WebElement textfield_Password;
	public @FindBy(xpath = "//h1[@class='page-title']") WebElement title_DashboardPageTitle;
	public @FindBy(xpath = "//a[@href='#'][contains(.,'Customers')]") WebElement button_Customers;
	public @FindBy(xpath = "//span[contains(.,'All Customers')]") WebElement button_AllCustomers;
	public @FindBy(xpath = "//h1[@class='page-title']") WebElement title_Customers;
	public @FindBy(xpath = "(//input[@type='text'])[3]") WebElement textfield_Search;
	public @FindBy(xpath = "(//button[contains(@class,'action-submit')])[2]") WebElement textfield_SearchButton;
	public @FindBy(xpath = "//a[contains(.,'Edit')]") WebElement button_EditUser;
	public @FindBy(xpath = "//span[contains(.,'Addresses')]") WebElement button_Addresses;
	public @FindBy(xpath = "//button[@class='action-select'][contains(.,'Select')]") WebElement button_EditSelect;
	public @FindBy(xpath = "//a[contains(.,'Delete')]") WebElement button_Delete;
	public @FindBy(xpath = "//button[contains(.,'OK')]") WebElement button_Ok;
	public @FindBy(xpath = "//button[contains(.,'Save Customer')]") WebElement button_Save;

	public @FindBy(xpath = "//button[@title='Delete Customer']") WebElement button_DeletCustomerBackEnd;
	public @FindBy(xpath = "(//span[@class='data-grid-cell-content'][contains(.,'ID')])[2]") WebElement button_CustomerId;
	public @FindBy(xpath = "//button[@class='action-secondary']") WebElement admin_DataCollectionWindow;

	public BackEnd_Page() throws IOException {
		super();

	}

	public BackEnd_Page getBackEndPage() throws IOException {
		getDriver().get(urlBackEnd);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksSignInBackEndButton() throws IOException, InterruptedException {
		waitAndClickElement(button_SignInBackEnd);
		Thread.sleep(4000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userEnterUsername(String username) throws Exception {
		sendKeysToWebElement(textfield_UserName, username);
		return new BackEnd_Page();

	}

	public BackEnd_Page userEnterPasswordBackEnd(String password) throws Exception {
		sendKeysToWebElement(textfield_Password, password);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksCustomersButton() throws IOException, InterruptedException {

		try {
			boolean adminWindow;
			try {
				admin_DataCollectionWindow.isDisplayed();
				adminWindow = true;
			} catch (Exception e) {
				adminWindow = false;

				System.out.println("Data collection window on admin login is NOT displaying");
			}

			if (adminWindow == true) {
				boolean value = admin_DataCollectionWindow.isDisplayed();
				waitAndClickElement(admin_DataCollectionWindow);
				Thread.sleep(3000);

				waitAndClickElement(button_Customers);
				Thread.sleep(3000);
				System.out.println("Data collection window on admin login is displaying" + value);
				Thread.sleep(3000);
			}

			else if (adminWindow == false) {
//				Assert.assertEquals(true, admin_DataCollectionWindow.isDisplayed());
//				Thread.sleep(5000);
				waitAndClickElement(button_Customers);
				Thread.sleep(3000);
			} else {
				System.out.println("********************User placed under wrong window******************");

			}

		} catch (Exception e) {
			System.out.println("-------------- I have an error ----------------------");
			System.out.println(e.getMessage());
		}

		Thread.sleep(5000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksAllCustomersButton() throws IOException, InterruptedException {
		waitAndClickElement(button_AllCustomers);
		Thread.sleep(3000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userEmailSearch(String regemail) throws Exception {

		sendKeysToWebElement(textfield_Search, regemail);
		Thread.sleep(3000);
		waitAndClickElement(textfield_SearchButton);
		Thread.sleep(3000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksEditUserButton() throws IOException, InterruptedException {
		waitAndClickElement(button_EditUser);
		Thread.sleep(3000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksAddressesrButton() throws IOException, InterruptedException {
		waitAndClickElement(button_Addresses);
		Thread.sleep(3000);

		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksEditSelectButton() throws IOException, InterruptedException {
		waitAndClickElement(button_EditSelect);
		Thread.sleep(5000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksDeleteButton() throws IOException, InterruptedException {
		waitAndClickElement(button_Delete);
		Thread.sleep(5000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksOkButton() throws IOException, InterruptedException {
		waitAndClickElement(button_Ok);
		Thread.sleep(7000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksSaveButton() throws IOException, InterruptedException {
		waitAndClickElement(button_Save);
		Thread.sleep(4000);
		return new BackEnd_Page();
	}

	public BackEnd_Page userClicksDeletCustomerButton() throws IOException, InterruptedException {
		waitAndClickElement(button_DeletCustomerBackEnd);
		Thread.sleep(3000);
		return new BackEnd_Page();

	}

	public BackEnd_Page userClicksCustomerIdButton() throws IOException, InterruptedException {
		waitAndClickElement(button_CustomerId);
		Thread.sleep(3000);
		return new BackEnd_Page();

	}
}
