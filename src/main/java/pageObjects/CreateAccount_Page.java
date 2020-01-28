package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreateAccount_Page extends BasePage{
    public  String url = "http://devops.magento2.co.za";
	public @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a") WebElement button_CreateAccount;
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span") WebElement pageTitle_CreateNewCustomerAccount;
	public @FindBy(xpath = "//*[@id=\"firstname\"]") WebElement textfield_FirstName;
	public @FindBy(xpath = "//*[@id=\"lastname\"]") WebElement textfield_LastName;
	public @FindBy(xpath = "//*[@id=\"is_subscribed\"]") WebElement button_SignUpNewsletter;
	public @FindBy(xpath = "//*[@id=\"email_address\"]") WebElement textfield_Email;
	public @FindBy(xpath = "//*[@id=\"password\"]") WebElement textfield_Password;
	public @FindBy(xpath = "//*[@id=\"password-confirmation\"]") WebElement textfield_ConfirmPassword;
	public @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span") WebElement button_CreateAnAccount;
	public @FindBy(xpath = "//*[@id=\"newsletter-validate-detail\"]/div[2]/button/span") WebElement button_NewsletterSubscribe;
	
	public @FindBy(xpath = "//span[@class='base']") WebElement pageTitle_MyDashboard;
	public @FindBy(xpath = "//div[@data-bind='html: message.text']") WebElement message_SuccessCreateAccount;
	// required textfields 
	public @FindBy(xpath = "//*[@id=\"firstname-error\"]") WebElement message_RequiredFiledFirstName;
	public @FindBy(xpath = "//*[@id=\"lastname-error\"]") WebElement message_RequiredFiledLastname;
	public @FindBy(xpath = "//*[@id=\"email_address-error\"]") WebElement message_RequiredFiledEmail;
	public @FindBy(xpath = "//*[@id=\"password-error\"]") WebElement message_RequiredFiledPassword;
	public @FindBy(xpath = "//*[@id=\"password-confirmation-error\"]") WebElement message_RequiredFiledConfirmPassword;
	// account already registered with Email and click here link to retrieve password
	public @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div") WebElement message_EmailAlreadyRegistered;
	public @FindBy(xpath = "//a[contains(.,'click here')]") WebElement message_GetPasswordLink;
	
	public CreateAccount_Page() throws IOException {
		super();
		
	}

	
	public CreateAccount_Page userClicksCreateAccountButton() throws IOException, InterruptedException {
		waitAndClickElement(button_CreateAccount);
		Thread.sleep(4000);
		return new CreateAccount_Page(); 
	
}
	
	public CreateAccount_Page seeCreateNewCustomerAccountPageTitle() throws IOException, InterruptedException {
		WebElement createAccountPageTitle = pageTitle_CreateNewCustomerAccount; 
		Assert.assertEquals(true, createAccountPageTitle.isDisplayed());
		System.out.println("Create Account Page Title is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page userEnterFirstname(String firstname) throws Exception {
		sendKeysToWebElement(textfield_FirstName, firstname); 
		return new CreateAccount_Page(); 
	}
	

    public CreateAccount_Page userEnterLastName(String lastname) throws Exception {
	    sendKeysToWebElement(textfield_LastName, lastname); 
	    return new CreateAccount_Page(); 
	
    } 
    public CreateAccount_Page userClickNewletterSubscribeTickbox() throws Exception {
    	waitAndClickElement(button_SignUpNewsletter); 
	    return new CreateAccount_Page(); 
	
    } 
    
    public CreateAccount_Page userEnterEmail(String email) throws Exception {
    	sendKeysToWebElement(textfield_Email, email); 
	    return new CreateAccount_Page(); 
	
    } 
    public CreateAccount_Page userEnterPassword(String password) throws Exception {
    	sendKeysToWebElement(textfield_Password, password); 
	    return new CreateAccount_Page(); 
	
    } 

    public CreateAccount_Page userEnterConfirmPassword(String password) throws Exception {
	   sendKeysToWebElement(textfield_ConfirmPassword, password); 
       return new CreateAccount_Page(); 

} 
    

    public CreateAccount_Page userClicksCreateAnAccountButton() throws IOException, InterruptedException {
	  waitAndClickElement(button_CreateAnAccount);
	  Thread.sleep(3000);
	  return new CreateAccount_Page(); 
	
}	
    
	public CreateAccount_Page seeSuccessCreateAccountMessage() throws IOException, InterruptedException {
		WebElement successMessage = message_SuccessCreateAccount; 
		Assert.assertEquals(true, successMessage.isDisplayed());
		System.out.println("Success Message is displaying");
		return new CreateAccount_Page(); 
}
	
	
	public CreateAccount_Page seeFirstNameTextfield() throws IOException, InterruptedException {
		WebElement firstnameTextfield = textfield_FirstName; 
		Assert.assertEquals(true, firstnameTextfield.isDisplayed());
		System.out.println("First Name is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seeLastNameTextfield() throws IOException, InterruptedException {
		WebElement lastnameTextfield = textfield_FirstName; 
		Assert.assertEquals(true, lastnameTextfield.isDisplayed());
		System.out.println("Last Name is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seeSignUpNewsletterTickbox() throws IOException, InterruptedException {
		WebElement signUpTickbox = button_SignUpNewsletter; 
		Assert.assertEquals(true, signUpTickbox.isDisplayed());
		System.out.println("Sign Up Tickbox is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seeEmailTextfield() throws IOException, InterruptedException {
		WebElement emailTextfield = textfield_Email; 
		Assert.assertEquals(true, emailTextfield.isDisplayed());
		System.out.println("Email Textfield is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seePasswordTextfield() throws IOException, InterruptedException {
		WebElement passwordTextfield = textfield_Password; 
		Assert.assertEquals(true, passwordTextfield.isDisplayed());
		System.out.println("Password Textfield is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seeConfirmPasswordTextfield() throws IOException, InterruptedException {
		WebElement confirmPasswordTextfield = textfield_ConfirmPassword; 
		Assert.assertEquals(true, confirmPasswordTextfield.isDisplayed());
		System.out.println("Confirm Password Textfield is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page seeCreateAccountButton() throws IOException, InterruptedException {
		WebElement createAccountButton = button_CreateAnAccount; 
		Assert.assertEquals(true, createAccountButton.isDisplayed());
		System.out.println("Create Account Button is displaying");
		return new CreateAccount_Page(); 
	}
	
	public CreateAccount_Page myDashboardPageTitle() throws IOException, InterruptedException {
		WebElement seeMyDashboardPageTitle = pageTitle_MyDashboard; 
		Assert.assertEquals(true, seeMyDashboardPageTitle.isDisplayed());
		System.out.println("MY ACCOUNT PAGE is displaying");
		return new CreateAccount_Page();  
	}
	
	public CreateAccount_Page seeSubscribeButton() throws IOException, InterruptedException {
		WebElement subscribeButton = button_NewsletterSubscribe; 
		Assert.assertEquals(true, subscribeButton.isDisplayed());
		System.out.println("subscribe Button is displaying");
		return new CreateAccount_Page(); 
	}
	
	
	
	public CreateAccount_Page seeFieldsErrorMessage() throws IOException, InterruptedException {
		WebElement requiredFiledFirstName = message_RequiredFiledFirstName; 
		Assert.assertEquals(true, requiredFiledFirstName.isDisplayed());
		System.out.println("Required Filed First Name Error is displaying");
		
		WebElement requiredFiledLastname = message_RequiredFiledLastname; 
		Assert.assertEquals(true, requiredFiledLastname.isDisplayed());
		System.out.println("Required Filed Lastname Error is displaying");
		
		WebElement requiredFiledEmail = message_RequiredFiledEmail; 
		Assert.assertEquals(true, requiredFiledEmail.isDisplayed());
		System.out.println("Required Filed Email Error is displaying");
		
		WebElement requiredFiledPassword = message_RequiredFiledPassword; 
		Assert.assertEquals(true, requiredFiledPassword.isDisplayed());
		System.out.println("Required Filed Email Error is displaying");
		
		WebElement rquiredFiledConfirmPassword = message_RequiredFiledConfirmPassword; 
		Assert.assertEquals(true, rquiredFiledConfirmPassword.isDisplayed());
		System.out.println("Required Filed Confirm Password Error is displaying");
		return new CreateAccount_Page(); 
	}
	
	//public CreateAccount_Page userAlreadyRegisteredEmail(String email) throws Exception {
		//sendKeysToWebElement(message_EmailAlreadyRegistered, email); 
		//return new CreateAccount_Page(); 
	
	public CreateAccount_Page seeGetPasswordLink() throws IOException, InterruptedException {
		WebElement getPasswordLink = message_GetPasswordLink; 
		Assert.assertEquals(true, getPasswordLink.isDisplayed());
		System.out.println("Get PAssword Click Here Link is displaying");
		return new CreateAccount_Page(); 
} 
	
	public CreateAccount_Page seeEmailAlreadyRegistered() throws IOException, InterruptedException {
		WebElement emailAlreadyRegistered = message_EmailAlreadyRegistered; 
		Assert.assertEquals(true, emailAlreadyRegistered.isDisplayed());
		System.out.println("Email already registered message is displaying");
		return new CreateAccount_Page(); 
	
	
		
	}		
}
