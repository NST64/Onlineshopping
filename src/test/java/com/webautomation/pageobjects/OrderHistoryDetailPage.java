/**
 * 
 */
package com.webautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Anupam
 *
 */
public class OrderHistoryDetailPage extends BaseClass{

	
	//PageFactory 
			@FindBy(id="email")
			WebElement email;
			
			@FindBy(id="passwd")
			WebElement password;
			
			@FindBy(id="SubmitLogin")
			WebElement SubmitLogin;
			
		
		public OrderHistoryDetailPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String Validateloginpagetitle()
		{
			return driver.getTitle();
		}
		
		public HomeStorePage login(String emailid, String passwd) throws InterruptedException
		{
			email.sendKeys(emailid);
			password.sendKeys(passwd);
			SubmitLogin.click();
			Thread.sleep(4000);
			return new HomeStorePage();
		}
}
