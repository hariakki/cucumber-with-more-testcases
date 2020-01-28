package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class ClickViewOrderAndValidatePage extends BasePage{
	

	public  @FindBy(xpath = "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[1]/span") WebElement link_ViewOrder;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[1]/span") WebElement ReOrder_link;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span") WebElement printOrder_link;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/ul/li[1]/strong") WebElement itemsOrdered_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[1]") WebElement ProductName_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[2]") WebElement sku_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[3]") WebElement price_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[4]") WebElement qty_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/thead/tr/th[5]") WebElement SubTotal_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tfoot/tr[2]/th") WebElement ShippingAndHandling_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tfoot/tr[3]/th") WebElement tax_text;
	public  @FindBy(xpath = "//*[@id='my-orders-table']/tfoot/tr[4]/th/strong") WebElement GrandTotal_text;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/ul/li[2]") WebElement Invoices_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span") WebElement PrintAllInvoices_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a/span") WebElement PrintInvoices_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/ul/li[3]/a") WebElement OrderShipment_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span") WebElement PrintAllShipments_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a[1]/span") WebElement PrintShipments_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a[1]/span") WebElement TrackShipment_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/ul/li[4]/a") WebElement refunds_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span") WebElement PrintAllRefunds_tab;
	public  @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a/span") WebElement PrintRefunds_tab;
	
	
	
	public ClickViewOrderAndValidatePage() throws IOException{
		super();
	}
	
	public ClickViewOrderAndValidatePage clickOnViewOrderLink() throws InterruptedException, Exception {
	driver.findElement(By.xpath("//*[@id='my-orders-table']/tbody/tr[1]/td[6]/a[1]/span")).click();	
	System.out.println("User clicked on the View Order Link");
		Thread.sleep(7000);
		return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeReOrderLink() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[1]/span"));				
		Thread.sleep(7000);
		return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeOnPrintOrderLink() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[1]/div[2]/div/a[2]/span"));				
		Thread.sleep(7000);
		return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeItemsOrdered() throws  Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[1]/strong"));				
		Thread.sleep(7000);
		return new ClickViewOrderAndValidatePage();
	}
	 
	public ClickViewOrderAndValidatePage seeProductName() throws  Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[1]"));				
		Thread.sleep(7000);
		return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeSKU() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[2]"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}

	public ClickViewOrderAndValidatePage seePrice() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[3]"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeQty() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[4]"));    
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeSubTotal() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/thead/tr/th[5]"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeShippingAndHandling() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/tfoot/tr[2]/th"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seeTax() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/tfoot/tr[3]/th"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seeGrandTotal() throws Exception {
		driver.findElement(By.xpath("//*[@id='my-orders-table']/tfoot/tr[4]/th/strong"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seeInvoicesTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[2]")); 
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage clickInvoicesTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[2]")).click();     
	    Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seePrintAllInvoicesTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span"));
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seePrintInvoicesTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a/span"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seeOrderShipmentTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[3]"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage clickOrderShipmentTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[3]")).click();     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seePrintAllShipmentsTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span"));
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	public ClickViewOrderAndValidatePage seePrintShipmentsTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a[1]/span"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	public ClickViewOrderAndValidatePage seeTrackShipmentTab() throws Exception {
		driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a[1]/span"));     
		Thread.sleep(7000);
	    return new ClickViewOrderAndValidatePage();
	}
	
	//public ClickViewOrderAndValidatePage seeRefundsTab() throws Exception {
	//	driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[4]/a"));     
	 //   Thread.sleep(7000);
	 //   return new ClickViewOrderAndValidatePage();
	//}
	
	//public ClickViewOrderAndValidatePage clickRefundsTab() throws Exception {
	//	driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/ul/li[4]/a")).click();     
	//    Thread.sleep(7000);
	//    return new ClickViewOrderAndValidatePage();
	//}
	//public ClickViewOrderAndValidatePage seePrintAllRefundsTab() throws Exception {
	//	driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[1]/a/span"));     
	//    Thread.sleep(7000);
	//    return new ClickViewOrderAndValidatePage();
	//}
	//public ClickViewOrderAndValidatePage seePrintRefundsTab() throws Exception {
	//	driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div[1]/div[2]/div[2]/a/span"));     
	  //  Thread.sleep(7000);
	  //  return new ClickViewOrderAndValidatePage();
	//}
}
	
	 

