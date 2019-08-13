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
public class TC_UpdatePersonalinfo_003 extends BaseClass{
	
	WebLoginpage loginpage;
	HomeStorePage Homepage;
	OrderHistoryDetailPage Orderpage;
	PersonalInformationPage Personaldetail;
	
	public TC_UpdatePersonalinfo_003()
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
	public void Updatepersonalinfo() throws InterruptedException
	{
//		Homepage=Personaldetail.login(prop.getProperty("firstname"));
		Personaldetail.UserAccount();
		Thread.sleep(3000);
		Personaldetail.UpdatePersonelinfo();
		
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
