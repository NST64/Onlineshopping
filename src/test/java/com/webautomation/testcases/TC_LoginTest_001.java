/**
 * 
 */
package com.webautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webautomation.pageobjects.BaseClass;
import com.webautomation.pageobjects.HomeStorePage;
import com.webautomation.pageobjects.WebLoginpage;

/**
 * @author Anupam
 *
 */
public class TC_LoginTest_001 extends BaseClass{
	WebLoginpage loginpage;
	HomeStorePage Homepage;
	
	public TC_LoginTest_001()
	{
		super();
	}
	@BeforeMethod	
	public void setup()
	{
		initialization();
	loginpage = new WebLoginpage();	
	}
	@Test(priority=1)
	public void LoginpagetitleTest()
	{
		String title=loginpage.Validateloginpagetitle();
		Assert.assertEquals(title,"Login - My Store");
	}
	@Test(priority=2)
	public void LoginTest() throws InterruptedException
	{
		Homepage=loginpage.login(prop.getProperty("emailid"), prop.getProperty("passwd"));
		String title=loginpage.Validateloginpagetitle();
		Assert.assertEquals(title,"My account - My Store");
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
