package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.AddressBookPage;
import pageObjects.BackEnd_Page;
import pageObjects.ClickPrintOrderAndValidatePage;
import pageObjects.ClickStoredPaymentMethodsPage;
import pageObjects.ClickViewOrderAndValidatePage;
import pageObjects.CreateAccount_Page;
import pageObjects.MiniCartPage;
import pageObjects.MyAccountPageTest;
import pageObjects.MyAccount_Page;

//import pageObjects.MyAccountPage;

//import pageObjects.MyDashboardPage;

import pageObjects.NavigateToMyOrdersPage;
import pageObjects.NewsletterSubscriptionsPage;
import pageObjects.Pdp_Page;
import pageObjects.ProductReviews_Page;
import pageObjects.SearchFunctionalityPage;
import pageObjects.ShippingAndPayments_Page;
import pageObjects.ShoppingCartPage;
import pageObjects.SignInInvalid_Page;
import pageObjects.SignIn_Page;
import pageObjects.SigninPage;
import pageObjects.Wishlist_Page;




public class DriverFactory {
	
	public static WebDriver driver;
	public static SigninPage signinPage;

	//public static MyAccountPage myDashboardPage;

	//public static MyDashboardPage myDashboardPage;
	public static MyAccountPageTest myAccountPageTest;

    public static AddressBookPage addressBookPage;
    //neil
     
	public static CreateAccount_Page createAccountPage;
	public static Pdp_Page pdpPage;
	public static Wishlist_Page wishlistPage;    
	public static MyAccount_Page myAccountPage;
	public static SignInInvalid_Page signInInvalidPage;
	public static SignIn_Page signInPage;
	public static ShippingAndPayments_Page shippingAndPaymentsPage;
	public static ProductReviews_Page productReviewsPage;
	
	
	//Vuyo
	public static NavigateToMyOrdersPage navigateToMyOrdersPage;
	public static ClickViewOrderAndValidatePage clickViewOrderAndValidatePage;
	public static ClickPrintOrderAndValidatePage clickPrintOrderAndValidatePage;
	public static ClickStoredPaymentMethodsPage clickStoredPaymentMethodsPage;
	public static NewsletterSubscriptionsPage newsletterSubscriptionsPage;
	public static SearchFunctionalityPage searchFunctionalityPage;

	public static BackEnd_Page backEndPage; 

	public static MiniCartPage miniCartPage;
    public static ShoppingCartPage shoppingCartPage;
	

 
  
    public String user;
   
 
 
	public WebDriver getDriver() {
         try {
			// Read config
			
			//******old code********
			//ReadConfigFile file = new ReadConfigFile();
			//String browserName = file.getBrowser();
			// ******old code*******
			
		   Properties p = new Properties();
		   FileInputStream fi= new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
		   p.load(fi);
		   String browserName = p.getProperty("browser");	
		
			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					}
				break;

			case "chrome":
				// code

				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// Chrome options
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					 
				}

				break;

			case "ie":
				// code
				if (null == driver) {
					DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
			
					caps.setCapability("ignoreZoomSetting", true);
				
					caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					caps.setCapability("ignoreProtectedModeSettings", true);
			
					caps.setCapability("requireWindowFocus", true);
			
					driver = new InternetExplorerDriver(caps);
					//driver = new InternetExplorerDriver();
					driver.manage().window().maximize();

					
				        }
				break;

			}
		} catch (Exception e) {
		
		System.out.println("Unable to load message" + e.getMessage());
			
		}

		finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			signinPage = PageFactory.initElements(driver,SigninPage.class);

			//myDashboardPage = PageFactory.initElements(driver, MyAccountPage.class);

			//myDashboardPage = PageFactory.initElements(driver, MyDashboardPage.class);
			myAccountPageTest = PageFactory.initElements(driver, MyAccountPageTest.class);

			addressBookPage = PageFactory.initElements(driver, AddressBookPage.class);
			//neil
			
			createAccountPage = PageFactory.initElements(driver,CreateAccount_Page.class);
			pdpPage = PageFactory.initElements(driver,Pdp_Page.class);
			wishlistPage = PageFactory.initElements(driver,Wishlist_Page.class);
			myAccountPage = PageFactory.initElements(driver,MyAccount_Page.class);
			signInPage = PageFactory.initElements(driver,SignIn_Page.class);
			backEndPage = PageFactory.initElements(driver,BackEnd_Page.class);
			shippingAndPaymentsPage = PageFactory.initElements(driver,ShippingAndPayments_Page.class);
			productReviewsPage = PageFactory.initElements(driver,ProductReviews_Page.class);
		     
			navigateToMyOrdersPage = PageFactory.initElements(driver, NavigateToMyOrdersPage.class);
			clickViewOrderAndValidatePage = PageFactory.initElements(driver, ClickViewOrderAndValidatePage.class);
			clickPrintOrderAndValidatePage = PageFactory.initElements(driver, ClickPrintOrderAndValidatePage.class);
			clickStoredPaymentMethodsPage = PageFactory.initElements(driver, ClickStoredPaymentMethodsPage.class);
			newsletterSubscriptionsPage = PageFactory.initElements(driver, NewsletterSubscriptionsPage.class);
			searchFunctionalityPage = PageFactory.initElements(driver, SearchFunctionalityPage.class);
			miniCartPage = PageFactory.initElements(driver, MiniCartPage.class);
			shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
			
			 
		}
		return driver;
	}
}
