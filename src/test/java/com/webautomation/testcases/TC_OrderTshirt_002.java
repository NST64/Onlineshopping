/**
 * 
 */
package com.webautomation.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webautomation.pageobjects.BaseClass;
import com.webautomation.pageobjects.HomeStorePage;
import com.webautomation.pageobjects.OrderHistoryDetailPage;
import com.webautomation.pageobjects.PersonalInformationPage;
import com.webautomation.pageobjects.WebLoginpage;

/**
 * @author Anupam
 *
 */
public class TC_OrderTshirt_002 extends BaseClass {

	WebLoginpage loginpage;
	HomeStorePage Homepage;
	OrderHistoryDetailPage Orderpage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public TC_OrderTshirt_002()
	{
		super();
	}
	@BeforeMethod	
	public void setup()
	{
		initialization();
	Homepage = new HomeStorePage();	
    loginpage = new WebLoginpage();	
	}
	@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
		Homepage=loginpage.login(prop.getProperty("emailid"), prop.getProperty("passwd"));
		String title=loginpage.Validateloginpagetitle();
		Assert.assertEquals(title,"My account - My Store");
	}
	@Test(priority=2)
	public void OrderTshirtTest() throws InterruptedException
	{
		Homepage=loginpage.login(prop.getProperty("emailid"), prop.getProperty("passwd"));
		Orderpage=Homepage.Tshirts();
		String title=Homepage.Validatehomepagetitle();
		Assert.assertEquals(title,"T-shirts - My Store");
		Homepage.Mousehover();
		
		Orderpage=Homepage.Addtocart();
		Thread.sleep(3000);
		Homepage.Proceedtocheckout();
		Thread.sleep(3000);
		
	
		Homepage.Proceedtocheckoutfinal();
		Thread.sleep(3000);
		Homepage.Submit();
		Homepage.CheckboxChecked();
		Thread.sleep(2000);
		Homepage.Checkoutsubmit();
		Thread.sleep(3000);
		Homepage.Payment();
		
		Homepage.UserAccount();
		Thread.sleep(3000);
		
		Homepage.OrderHistory();
		
		
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
