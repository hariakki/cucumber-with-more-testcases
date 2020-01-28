package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterSubscriptionsPage extends BasePage{

	public  @FindBy(xpath = "//*[@id='block-collapsible-nav']/ul/li[12]") WebElement NewsletterSubscriptions_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/h1") WebElement NewsletterSubscription_text;
	public  @FindBy(xpath = "//*[@id='form-validate']/fieldset/legend/span") WebElement SubscriptionOption_text;
	public  @FindBy(xpath = "//input[@id='subscription']") WebElement GeneralSubscription_checkbox;
	public  @FindBy(xpath = "//button[@title='Save']") WebElement Save_button;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[1]/div[2]/div/div") WebElement GeneralSubscription_message;
	
	public NewsletterSubscriptionsPage() throws IOException {
		super();
		}
	public  NewsletterSubscriptionsPage clickNewsletterSubscriptionsTab() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='block-collapsible-nav']/ul/li[12]")).click();
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}

	public NewsletterSubscriptionsPage seeNewsletterSubscriptionText() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/h1"));				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}

	public NewsletterSubscriptionsPage seeSubscriptionOptionText() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='form-validate']/fieldset/legend/span"));				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}

	public NewsletterSubscriptionsPage seeGeneralSubscriptionCheckbox() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//input[@id='subscription']"));				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}
	
	public NewsletterSubscriptionsPage clickGeneralSubscriptionCheckbox() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//input[@id='subscription']")).click();				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}

	public NewsletterSubscriptionsPage clickSaveButton() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//button[@title='Save']")).click();				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}
	public NewsletterSubscriptionsPage seeSubscribingMessage() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div"));				
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}
	public NewsletterSubscriptionsPage seeUnSubscribingMessage() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div"));
		Thread.sleep(7000);
		return new NewsletterSubscriptionsPage();
	}
}
