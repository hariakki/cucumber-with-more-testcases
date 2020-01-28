package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPageTest extends BasePage{

	String url = "http://devops.magento2.co.za/customer/account/";
	 public @FindBy(xpath = "//a[text()='Address Book']") WebElement hyperlink_AddressBookLink;
	
	public MyAccountPageTest() throws IOException {
		super();
	}

	public MyAccountPageTest getMyAccountLink() throws IOException {
		getDriver().get(url);
        return new MyAccountPageTest();
	}

	public MyAccountPageTest getMyAccount() throws Exception {
		System.out.println("User should be taken to the my account page successfully");
		//After upgrade fix on the title
		WebElement myAccount = getDriver().findElement(By.xpath("//span[text()='My Account']"));
		//After upgrade fix on the title
		Assert.assertEquals(true, myAccount.isDisplayed());
		Thread.sleep(5000);
		return new MyAccountPageTest();
	}
    
	public MyAccountPageTest clickAddressBookLink() throws Exception {
		waitAndClickElement(hyperlink_AddressBookLink);
        Thread.sleep(4000);
		return new MyAccountPageTest();
   }
   
	public MyAccountPageTest getAddressBookPage() throws Exception {
		System.out.println("User should be taken to the AddressBook page");
		WebElement addressBook = getDriver().findElement(By.xpath("//span[text()='Address Book']"));
		Assert.assertEquals(true, addressBook.isDisplayed());
		Thread.sleep(5000);
		return new MyAccountPageTest();
	}

}
