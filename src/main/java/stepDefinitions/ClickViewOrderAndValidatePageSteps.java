package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;


public class ClickViewOrderAndValidatePageSteps extends DriverFactory {

/*	WebDriver driver;
	
	@Before()
	public void setup() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAUser\\Desktop\\Magento2\\Magento2\\src\\test\\java\\resources\\chromedriver.exe");
	this.driver = new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}*/

//	//WebDriver driver;
//	
//	//@Before()
//	//public void setup() 
//	{
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAUser\\Desktop\\Magento2\\Magento2\\src\\test\\java\\resources\\chromedriver.exe");
//	this.driver = new ChromeDriver();
//	this.driver.manage().window().maximize();
//	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		}

	
	@And("^user should see the Reorder link$")
	public void user_should_see_the_Reorder_link() throws Throwable {
		clickPrintOrderAndValidatePage.seeReOrderLink();
		
	}

	@Then("^user should see the View Order link$")
	public void user_should_see_the_View_Order_link() throws Throwable {
		clickPrintOrderAndValidatePage.seeViewOrderLink();
	}
	
	@When("^user clicks on view orders link$")
	public void user_clicks_on_view_orders_link() throws Throwable {
		clickViewOrderAndValidatePage.clickOnViewOrderLink();
	}

	@Then("^user placed under order page$")
			public void user_placed_under_order_page() throws Throwable {
			clickPrintOrderAndValidatePage.seeOrderNumber();
			}
	
	@Then("^user sees Reorder$")
	public void user_sees_Reorder() throws Throwable {
		clickViewOrderAndValidatePage.seeReOrderLink();
	
	}

	@And("^user sees Print Order$")
	public void user_sees_Print_Order() throws Throwable {
		clickViewOrderAndValidatePage.seeOnPrintOrderLink();	
	}

	@And("^user sees Items Ordered$")
	public void user_sees_Items_Ordered() throws Throwable {
		clickViewOrderAndValidatePage.seeItemsOrdered();	

	}
	@And("^user sees Product Name$")
	public void user_sees_Product_Name() throws Throwable {
		clickViewOrderAndValidatePage.seeProductName();	
}
	@And("^user sees SKU$")
		public void user_sees_SKU() throws Throwable {
		clickViewOrderAndValidatePage.seeSKU();	
}

@And("^user sees Price$")
public void user_sees_Price() throws Throwable {
	clickViewOrderAndValidatePage.seePrice();
}
@And("^user sees Qty$")
public void user_sees_Qty() throws Throwable {
	clickViewOrderAndValidatePage.seeQty();
}

@And("^user sees subtotal$")
public void user_sees_subtotal() throws Throwable {
	clickViewOrderAndValidatePage.seeSubTotal();	
}
@And("^user sees Shipping & Handling$")
public void user_sees_Shipping_Handling() throws Throwable {
	clickViewOrderAndValidatePage.seeShippingAndHandling();
}

@And("^user sees Tax$")
public void user_sees_Tax() throws Throwable {
	clickViewOrderAndValidatePage.seeTax();

}
@And("^user sees Grand Total$")
public void user_sees_Grand_Total() throws Throwable {
	clickViewOrderAndValidatePage.seeGrandTotal();
}
@And("^user sees Invoices tab$")
public void user_sees_Invoices_tab() throws Throwable {
	clickViewOrderAndValidatePage.seeInvoicesTab();	
}
@When("^user clicks Invoices tab$")
public void user_clicks_Invoices_tab() throws Throwable {
	clickViewOrderAndValidatePage.clickInvoicesTab();	
}

@Then("^user sees Print All Invoices link$")
public void user_sees_Printing_All_Invoices_link() throws Throwable {
	clickViewOrderAndValidatePage.seePrintAllInvoicesTab();
}

@And("^user sees Print Invoice link$")
public void user_sees_Printing_Invoice_link() throws Throwable {
	clickViewOrderAndValidatePage.seePrintInvoicesTab();	
}


@And("^user sees Order Shipments$")
public void user_sees_Order_Shipments() throws Throwable {
	clickViewOrderAndValidatePage.seeOrderShipmentTab();
}

@When("^user clicks Order Shipments$")
public void user_clicks_Order_Shipments() throws Throwable {
	clickViewOrderAndValidatePage.clickOrderShipmentTab();
}

@Then("^user sees Print All Shipments$")
public void user_sees_Print_All_Shipments() throws Throwable {
	clickViewOrderAndValidatePage.seePrintAllShipmentsTab();
}

@And("^user sees Print Shipment$")
public void user_sees_Print_Shipment() throws Throwable {
	clickViewOrderAndValidatePage.seePrintShipmentsTab();
}

@And("^user sees Track this shipment$")
public void user_sees_Track_this_shipment() throws Throwable {
	clickViewOrderAndValidatePage.seeTrackShipmentTab();
}
//@And("^user sees Refunds$")
///public void user_sees_Refunds() throws Throwable {
//	clickViewOrderAndValidatePage.seeRefundsTab();
//}
//@When("^user clicks Refunds$")
//public void user_clicks_Refunds() throws Throwable {
//	clickViewOrderAndValidatePage.clickRefundsTab();
//}
//@Then("^user sees Print All Refunds$")
//public void user_sees_Print_All_Refunds() throws Throwable {
//	clickViewOrderAndValidatePage.seePrintAllRefundsTab();
//}
//@And("^user sees Print Refunds$")
//public void user_sees_Print_Refunds() throws Throwable {
//	clickViewOrderAndValidatePage.seePrintRefundsTab();
//}

}
