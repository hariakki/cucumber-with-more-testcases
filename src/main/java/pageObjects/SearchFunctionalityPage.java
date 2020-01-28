package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionalityPage extends BasePage {
	public  @FindBy(xpath = "//*[@id='search']") WebElement textfield_search;
	public  @FindBy(xpath = "//button[@title='Search']") WebElement Search_icon;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[1]/h1/span") WebElement PLP_page;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a") WebElement ProductName_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[1]/div[2]/a/span") WebElement Reviews_text;
	public  @FindBy(xpath = "//*[@id='product-price-1385']/span") WebElement Price_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[3]/div[1]/div") WebElement Sizes_tab;
		
	public SearchFunctionalityPage() throws IOException {
		super();
		}
	
	public SearchFunctionalityPage enterProductName(String productname) throws Exception{
	       sendKeysToWebElement(textfield_search,productname);
	       return new SearchFunctionalityPage();
	   }
	
	public  SearchFunctionalityPage clickSearchIcon() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(6000);
		return new SearchFunctionalityPage();
	}

	public SearchFunctionalityPage seeProductListingPage() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/h1/span"));				
		Thread.sleep(6000);
		return new SearchFunctionalityPage();
	}
	public SearchFunctionalityPage seeProductName() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a"));				
		Thread.sleep(6000);
		return new SearchFunctionalityPage();
	}
	public SearchFunctionalityPage seeReviews() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[1]/div[2]/a/span"));				
		Thread.sleep(6000);
		return new SearchFunctionalityPage();
	}
	public SearchFunctionalityPage seePrice() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='product-price-1385']/span"));				
		Thread.sleep(7000);
		return new SearchFunctionalityPage();
	}
	public SearchFunctionalityPage seeSizes() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/div[3]/div[1]/div"));				
		Thread.sleep(7000);
		return new SearchFunctionalityPage();
	}
}
