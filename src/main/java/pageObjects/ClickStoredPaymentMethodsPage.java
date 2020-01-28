package pageObjects;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ClickStoredPaymentMethodsPage extends BasePage{

	
	public  @FindBy(xpath = "//*[@id='block-collapsible-nav']/ul/li[8]") WebElement StoredPaymentMethods_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span") WebElement StoredPaymentMethods_text;
	
	public ClickStoredPaymentMethodsPage() throws IOException {
		super();
		}
	
	 public  ClickStoredPaymentMethodsPage clickStoredPaymentMethodsTab() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='block-collapsible-nav']/ul/li[8]")).click();
			Thread.sleep(7000);
			return new ClickStoredPaymentMethodsPage();
		}
	
	 public ClickPrintOrderAndValidatePage seeStoredPaymentMethodsText() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
}
