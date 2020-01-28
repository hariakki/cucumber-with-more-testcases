package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInInvalid_Page extends BasePage{
    public  String url = "http://devops.magento2.co.za";
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a") WebElement button_HomepageSignInInvalid;
	public @FindBy(xpath = "//*[@id=\"email\"]") WebElement textfield_EmailInvalid;
	public @FindBy(xpath = "//*[@id=\"pass\"]") WebElement textfield_PasswordInvalid;
	public @FindBy(xpath = "//*[@id=\"send2\"]/span") WebElement button_SignInInvalid;
	public @FindBy(xpath = "//li//span[text()='Welcome, Neil!']") WebElement message_WelcomeInvalid;
	
	public SignInInvalid_Page() throws IOException {
		super();
		
	}
	
	public SignInInvalid_Page getSignInInvalidPage() throws IOException {
		getDriver().get(url); 
		return new SignInInvalid_Page(); 
 
   }
	public SignInInvalid_Page userClicksHomepageSignInButtonInvalid() throws IOException, InterruptedException {
		waitAndClickElement(button_HomepageSignInInvalid);
		Thread.sleep(3000);
		return new SignInInvalid_Page(); 
		 
	}	


	public SignInInvalid_Page userEnterEmailInvalid(String emailinvalid) throws Exception {
		sendKeysToWebElement(textfield_EmailInvalid, emailinvalid); 
		return new SignInInvalid_Page(); 

 } 


   public SignInInvalid_Page userEnterPasswordInvalid(String password) throws Exception {
	   sendKeysToWebElement(textfield_PasswordInvalid, password); 
	   return new SignInInvalid_Page();   

}
   
   public SignInInvalid_Page userClicksSignInButtonOnSignInInvalidPage() throws IOException, InterruptedException {
		waitAndClickElement(button_SignInInvalid);
		Thread.sleep(6000);
		return new SignInInvalid_Page(); 
		
   }
   
   public SignInInvalid_Page userSeeErrorMessageForInvalidSignInInvalid() throws IOException, InterruptedException {
	   WebElement welcomeMessage = message_WelcomeInvalid;
       Assert.assertEquals(true, welcomeMessage.isDisplayed());
       System.out.println("Welcome message is dispalying");
	   return new SignInInvalid_Page(); 
		
		
		
	 
}
   
}
