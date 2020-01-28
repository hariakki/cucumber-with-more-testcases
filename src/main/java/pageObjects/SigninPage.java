package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SigninPage extends BasePage {
	
	  public  String url = "http://devops.magento2.co.za";
      public  @FindBy(xpath = "//input[@id='email']") WebElement textfield_Email;
	  public  @FindBy(xpath = "//input[@id='pass']") WebElement textfield_Password;
	  public  @FindBy(xpath = "//button[@id='send2']") WebElement button_SignIn;
	  public  @FindBy(xpath = "//div[@class='panel header']//li[@class='authorization-link']//a") WebElement hyperLink_Signin;
	  public @FindBy(xpath = "//span[text()='Welcome, anusha kariveda!']") WebElement label_CustomerLoginMessage;
	  
	  public @FindBy(xpath = "//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']") WebElement errorMessageLogin_LoginErrorMessage;
	
	    public @FindBy(xpath = "(//span[contains(.,'Create an Account')])[1]") WebElement button_CreateAccount;
		public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span") WebElement pageTitle_CreateNewCustomerAccount;
		public @FindBy(xpath = "//*[@id=\"firstname\"]") WebElement textfield_FirstName;
		public @FindBy(xpath = "//*[@id=\"lastname\"]") WebElement textfield_LastName;
		public @FindBy(xpath = "//*[@id=\"is_subscribed\"]") WebElement button_SignUpNewsletter;
		public @FindBy(xpath = "//*[@id=\"email_address\"]") WebElement textfield_EmailCreateAccount;
		public @FindBy(xpath = "//*[@id=\"password\"]") WebElement textfield_PasswordCreateAccount;
		public @FindBy(xpath = "//*[@id=\"password-confirmation\"]") WebElement textfield_ConfirmPassword;
		public @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span") WebElement button_CreateAnAccount;
		public @FindBy(xpath = "//*[@id=\"newsletter-validate-detail\"]/div[2]/button/span") WebElement button_NewsletterSubscribe;
		public @FindBy(xpath = "//div[@data-bind='html: message.text']") WebElement message_SuccessCreateAccount;
	
	public SigninPage() throws IOException {
		super();
}

	public SigninPage getMagentoSite() throws IOException, Exception {
     getDriver().get(url);
     Thread.sleep(9000);
        return new SigninPage();
    	 }
	
	
	   public SigninPage clickSigninlinktext() throws InterruptedException, Exception {
	    	waitAndClickElement(hyperLink_Signin);
			Thread.sleep(6000);
			 return new SigninPage();
	    }
	    
	   public SigninPage CustomerLoginPage() throws Exception {
		System.out.println("User should be taken to the successful login page");
	 WebElement customerLogin = getDriver().findElement(By.xpath("//span[text()='Customer Login']"));   //Customer login page validation by using customer login header
		//WebElement customerLogin = textfield_Email;
		Assert.assertEquals(true, customerLogin.isDisplayed());
		   return new SigninPage();
	   }

    public SigninPage enterEmail(String Email) throws Exception {
    	sendKeysToWebElement(textfield_Email,Email);
    	return new SigninPage();
    }
    
    public SigninPage enterPassword(String Password) throws Exception {
    	sendKeysToWebElement(textfield_Password,Password);
    	return new SigninPage();
    }

     public SigninPage clickSigninButton() throws Exception {
 		 waitAndClickElement(button_SignIn);
 		 Thread.sleep(5000);
	     return new SigninPage();
 }
     public SigninPage getHomepage() throws Exception {
    	//After Magento 2.3.upgrade fix on welcome message
  	    WebElement homePage  = getDriver().findElement(By.xpath("//span[text()='Welcome, anusha kariveda!']"));   //Home page validation by using menu tab
  	    //After Magento 2.3.upgrade fix on welcome message
  		Assert.assertEquals(true, homePage.isDisplayed());
  		System.out.println("User Successfully loggedin and placed under homepage");
  		Thread.sleep(4000);
    	return new SigninPage();
     }
     
     public SigninPage createUsersIfNotAvial(String firstname, String lastname,String email,String password) throws Exception {
 		try{
 		    boolean presentn;
 			try {
 				errorMessageLogin_LoginErrorMessage.isDisplayed();
 			presentn = true;
 			} 
 		 catch(Exception e) {
 			presentn = false;
 			System.out.println("User exist already");
 			}
 			
 			if(presentn == true){
 				boolean value = errorMessageLogin_LoginErrorMessage.isDisplayed();

 				System.out.println("Users not existed already in the backend and logged in successfully" + value);

 				waitAndClickElement(button_CreateAccount);
 				Thread.sleep(4000);

 				WebElement createAccountPageTitle = pageTitle_CreateNewCustomerAccount;
 				Assert.assertEquals(true, createAccountPageTitle.isDisplayed());
 				System.out.println("Create Account Page Title is displaying");

 				sendKeysToWebElement(textfield_FirstName, firstname);

 				sendKeysToWebElement(textfield_LastName, lastname);

 				waitAndClickElement(button_SignUpNewsletter);

 				sendKeysToWebElement(textfield_EmailCreateAccount, email);

 				sendKeysToWebElement(textfield_PasswordCreateAccount, password);

 				sendKeysToWebElement(textfield_ConfirmPassword, password);

 				waitAndClickElement(button_CreateAnAccount);
 				Thread.sleep(7000);

 				WebElement successMessage = message_SuccessCreateAccount;
 				Assert.assertEquals(true, successMessage.isDisplayed());

 				System.out.println("Success Message is displaying");

 				System.out.println("Deleted users created successfully");
 				Thread.sleep(3000);
 			}

 			else if(presentn == false){
 				Assert.assertEquals(true, label_CustomerLoginMessage.isDisplayed());
 				Thread.sleep(5000);
 			}else{
 				System.out.println("********************User placed under wrong window******************");
 				
 			}

 	     }	
 	catch(Exception e){
 		System.out.println("-------------- I have an error ----------------------");
 		System.out.println(e.getMessage());
 	}
 		
 		Thread.sleep(5000);
 		return new SigninPage();
 	}
 	 
}