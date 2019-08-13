/**
 * 
 */
package com.webautomation.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Anupam
 *
 */
public class WebLoginpage extends BaseClass{

	
	//PageFactory 
		@FindBy(id="email")
		WebElement email;
		
		@FindBy(id="passwd")
		WebElement password;
		
		@FindBy(id="SubmitLogin")
		WebElement SubmitLogin;
		
	
	public WebLoginpage()
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
	
/**	public WebLoginpage(String Emailaddress, String pwd)
	{
		driver.findElement(username).sendKeys(Emailaddress);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(Loginbutton).click();
		
	} **/
/**	public void EnterUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void Enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void ClickOnLoginButton()
	{
		driver.findElement(Loginbutton).click();
	}  **/
}
