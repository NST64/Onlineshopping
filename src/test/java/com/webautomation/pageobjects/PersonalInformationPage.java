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
public class PersonalInformationPage extends BaseClass{
	
	//PageFactory 
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")  
	WebElement Tshirts;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement Addtocart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement Proceedtocheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement Proceedtocheckoutfinal;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
	WebElement Submit;
	
	@FindBy(xpath="driver.findElement(By.id(\"vfb-6-0\"))")
	WebElement Checkbox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button")
	WebElement Checkoutsubmit;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement Payment;
	

	@FindBy(xpath=("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"))
	WebElement UserAccount;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement UpdatePersonelinfo;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement updatefirstname;

	public PersonalInformationPage()
{
	PageFactory.initElements(driver, this);
}

public String Validateloginpagetitle()
{
	return driver.getTitle();
}
public PersonalInformationPage UserAccount()
{
	UserAccount.click();
	return new PersonalInformationPage();
}
public PersonalInformationPage UpdatePersonelinfo() throws InterruptedException
{

	UpdatePersonelinfo.click();
	Thread.sleep(4000);
	return new PersonalInformationPage();
}
public PersonalInformationPage updatefirstname()
{
	updatefirstname.clear();
	updatefirstname.sendKeys("Rahul");
	return new PersonalInformationPage();
}



}
