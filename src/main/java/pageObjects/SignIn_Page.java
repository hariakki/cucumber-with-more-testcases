package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignIn_Page extends BasePage{
    public  String url = "http://devops.magento2.co.za";
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a") WebElement button_HomepageSignIn;
	public @FindBy(xpath = "//*[@id=\"email\"]") WebElement textfield_Email;
	public @FindBy(xpath = "//*[@id=\"pass\"]") WebElement textfield_Password;
	public @FindBy(xpath = "//button[@class='action login primary']") WebElement button_SignIn;
	public @FindBy(xpath = "(//span[@class='logged-in'][contains(.,'Welcome, Neil Solomon!')])[1]") WebElement message_Welcome;
	public @FindBy(xpath = "//*[@id=\"email-error\"]") WebElement message_InvalidEmail;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div") WebElement message_InvalidPassword;
	
	
	public SignIn_Page() throws IOException {
		super();
		
	}
	
	public SignIn_Page getSignInPage() throws IOException {
		getDriver().get(url); 
		return new SignIn_Page(); 
 
   }
	public SignIn_Page userClicksHomepageSignInButton() throws IOException, InterruptedException {
		waitAndClickElement(button_HomepageSignIn);
		Thread.sleep(3000);
		return new SignIn_Page();   
		 
	}	


	public SignIn_Page userEnterEmail(String email) throws Exception {
		sendKeysToWebElement(textfield_Email, email); 
		return new SignIn_Page(); 

 } 


   public SignIn_Page userEnterPassword(String password) throws Exception {
	   sendKeysToWebElement(textfield_Password, password); 
	   return new SignIn_Page();   

}
   
   public SignIn_Page userClicksSignInButtonOnSignInPage() throws IOException, InterruptedException {
		waitAndClickElement(button_SignIn);
		Thread.sleep(6000);
		return new SignIn_Page(); 
		
   }
   
   public SignIn_Page userSuccessfullyLoggedIn() throws IOException, InterruptedException {
	   WebElement welcomeMessage = message_Welcome;
       Assert.assertEquals(true, welcomeMessage.isDisplayed());
       System.out.println("Welcome message is dispalying");
	   return new SignIn_Page(); 
	   
   }
   public SignIn_Page userSeeErrorMessageForInvalidSignIn () throws IOException, InterruptedException {
	   WebElement emailErrorMessage = message_InvalidEmail;
	   Assert.assertEquals(true, emailErrorMessage.isDisplayed());
       System.out.println("Welcome message is dispalying");
       WebElement passwordErrorMessage = message_InvalidPassword;
	   Assert.assertEquals(true, passwordErrorMessage.isDisplayed());
	   System.out.println("Welcome message is dispalying");
	   return new SignIn_Page();  
	   

		
		
	 
}
   
}












