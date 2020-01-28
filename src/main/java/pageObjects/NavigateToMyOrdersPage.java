package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class NavigateToMyOrdersPage extends BasePage {
	
	public  @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a") WebElement link_Login;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[1]/h1/span") WebElement customer_login;
	public  @FindBy(xpath = "/html/body/div[1]/header/div[2]/strong/img") WebElement home_page;
	public  @FindBy(xpath = "//input[@name='login[username]']") WebElement textfield_username;
	public  @FindBy(xpath = "//input[@name='login[password]']") WebElement textfield_password;
	public  @FindBy(xpath = "//*[@id='send2']/span") WebElement button_Login;
	public  @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[1]") WebElement magento2_logo;//home page
	public  @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button/span") WebElement customer_name;
	public  @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a") WebElement myAccount_tab;
	public  @FindBy(xpath = "/*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span") WebElement dashboard_page;
	public  @FindBy(xpath = "//*[@id='block-collapsible-nav']/ul/li[2]/a") WebElement my_orders_tab;
	public  @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a") WebElement myOrders_page;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[1]") WebElement OrderNumber_text;
   	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[2]") WebElement Date_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span") WebElement ShipTo_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[1]/span") WebElement OrderTotal_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span") WebElement Status_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[1]/span") WebElement Action_text;
	
	
	public NavigateToMyOrdersPage() throws IOException{
		super();
	}
	public NavigateToMyOrdersPage getHomePage() throws IOException {
		getDriver().get("http://devops.magento2.co.za/");
		
		return new NavigateToMyOrdersPage();
	}
	
	public NavigateToMyOrdersPage clickOnLoginLink() throws InterruptedException, Exception {
		getDriver().findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();				
		Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
	
	public NavigateToMyOrdersPage seeCustomerLoginPage() throws  Exception {
		getDriver().findElement(By.xpath("//*[@id='maincontent']/div[1]/h1/span"));				
		Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
		
	public NavigateToMyOrdersPage enterEmail(String username) throws Exception{
	       sendKeysToWebElement(textfield_username,username);
	       Thread.sleep(7000);
	       return new NavigateToMyOrdersPage();
	   }

	   public NavigateToMyOrdersPage enterPassword(String Password) throws Exception{
	       sendKeysToWebElement(textfield_password,Password);
	       Thread.sleep(7000);
	       return new NavigateToMyOrdersPage();
	   }

	   
	public NavigateToMyOrdersPage clickOnSignInButton() throws Exception {
		getDriver().findElement(By.xpath("//*[@id='send2']/span")).click();     
		Thread.sleep(7000);
	    return new NavigateToMyOrdersPage();
	}
	public NavigateToMyOrdersPage seeMagento2Logo() throws Exception {
		System.out.println("User should be taken to home page successfully and Magento2 logo should be displayed");
		WebElement magento2_logo = getDriver().findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]"));
		Assert.assertEquals(true, magento2_logo.isDisplayed());
		Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
	
	public NavigateToMyOrdersPage clickOnCustomerName() throws Exception {
	    getDriver().get("http://devops.magento2.co.za/customer/account/");
	    Thread.sleep(7000);
	    return new NavigateToMyOrdersPage();
	}
	
	public NavigateToMyOrdersPage clickOnMyOrders() throws Exception {
		getDriver().findElement(By.xpath("//*[@id='block-collapsible-nav']/ul/li[2]/a")).click();     
		Thread.sleep(7000);
	    return new NavigateToMyOrdersPage();
	}
	
	public NavigateToMyOrdersPage seeMyOrders() throws Exception {
		System.out.println("User should be taken to my orders page successfully and My Orders should be displayed");
		WebElement myAccount = getDriver().findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span"));
		Assert.assertEquals(true, myAccount.isDisplayed());
		Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
	public  NavigateToMyOrdersPage seeOrderNumber() throws InterruptedException, Exception {
		getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[1]"));				
		Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
}
public NavigateToMyOrdersPage seeDate() throws InterruptedException, Exception {
	   getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[2]"));				
	   Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
} 
 public NavigateToMyOrdersPage seeShipTo() throws InterruptedException, Exception {
	 getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[3]"));				
	 Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
}
 
 public NavigateToMyOrdersPage seeOrderTotal() throws InterruptedException, Exception {
	 getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[4]"));				
	 Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
 
 
 public NavigateToMyOrdersPage seeStatus() throws InterruptedException, Exception {
	 getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[5]"));				
	 Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
 
 public NavigateToMyOrdersPage seeAction() throws InterruptedException, Exception {
	 getDriver().findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[6]"));				
	 Thread.sleep(7000);
		return new NavigateToMyOrdersPage();
	}
 


}