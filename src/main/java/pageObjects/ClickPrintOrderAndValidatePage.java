package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class ClickPrintOrderAndValidatePage extends BasePage{
	
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[1]/span") WebElement viewOrder_link;
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
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[2]/span") WebElement ReOrder_link;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[1]/span") WebElement ViewOrder_link;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span") WebElement OrderNumber_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[1]/span") WebElement ReOrder2_link;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span") WebElement PrintOrder_link;
	public  @FindBy(xpath = "//*[@id='sidebar']/print-preview-header//div[1]/h1") WebElement printing_page;
	public  @FindBy(xpath = "*[@id='button-strip']/paper-button[1]") WebElement print_button;
	public  @FindBy(xpath = "//*[@id='button-strip']/paper-button[2]") WebElement cancel_button;
	public  @FindBy(xpath = "//input[@name='login[password]']") WebElement destination_label;
	public  @FindBy(xpath = "//*[@id='pages-label']") WebElement pages_label;
	public  @FindBy(xpath = "//*[@id='layout-label']") WebElement layout_label;
	public  @FindBy(xpath = "//*[@id='color-label']") WebElement color_label;;
	
	
	public ClickPrintOrderAndValidatePage() throws IOException {
		super();
		}
	
	 public  ClickPrintOrderAndValidatePage seeReOrderLink() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[2]/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	
	 public ClickPrintOrderAndValidatePage seeViewOrderLink() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[2]/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 
	 public ClickPrintOrderAndValidatePage clickViewOrderLink() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[2]/span")).click();				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 
	 public ClickPrintOrderAndValidatePage seeOrderNumber() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/h1/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seeReOrderLink2() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seePrintOrderLink() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage clickPrintOrderLink() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span")).click();				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seePrintingPage() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='sidebar']/print-preview-header//div[1]/h1"));				
			Thread.sleep(4000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seePrintButton() throws InterruptedException, Exception {
			driver.findElement(By.xpath("*[@id='button-strip']/paper-button[1]"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 
	 public ClickPrintOrderAndValidatePage seeCancelButton() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='button-strip']/paper-button[2]"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seeDestinationLabel() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//input[@name='login[password]']"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seePagesLabel() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='pages-label']"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seeLayoutLabel() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='layout-label']"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
	 public ClickPrintOrderAndValidatePage seeColorLabel() throws InterruptedException, Exception {
			driver.findElement(By.xpath("//*[@id='button-strip']/paper-button[2]"));				
			Thread.sleep(7000);
			return new ClickPrintOrderAndValidatePage();
		}
}
