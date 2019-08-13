/**
 * 
 */
package com.webautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Anupam
 *
 */
public class HomeStorePage extends BaseClass{

	JavascriptExecutor js = (JavascriptExecutor) driver;
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
			
			@FindBy(xpath=("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"))
			WebElement UserAccount;
			
			@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
			WebElement OrderHistory;
			
		public HomeStorePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String Validatehomepagetitle()
		{
			return driver.getTitle();
		}
		
		public OrderHistoryDetailPage Tshirts() throws InterruptedException
		{
		
			Tshirts.click();
			Thread.sleep(4000);
			return new OrderHistoryDetailPage();
		}

		public OrderHistoryDetailPage Addtocart() {
			js.executeScript("window.scrollBy(0,1000)");
			Addtocart.click();
			return new  OrderHistoryDetailPage();
		}
		public OrderHistoryDetailPage Proceedtocheckout() throws InterruptedException
		{
			Proceedtocheckout.click();
			return new OrderHistoryDetailPage();
			
		}
		public OrderHistoryDetailPage Proceedtocheckoutfinal() throws InterruptedException
		{
			Proceedtocheckoutfinal.click();
			return new OrderHistoryDetailPage();
			
		}
		public OrderHistoryDetailPage Submit()
		{
			Submit.click();
			return new OrderHistoryDetailPage();
		}
		public void CheckboxChecked()
		{
			WebElement option1 = driver.findElement(By.id("cgv"));
			option1.click();
		}
		public OrderHistoryDetailPage Checkoutsubmit()
		{
			Checkoutsubmit.click();
			return new OrderHistoryDetailPage();
		}
		public OrderHistoryDetailPage Payment()
		{
			Payment.click();
			return new OrderHistoryDetailPage();
		}
		public OrderHistoryDetailPage Mousehover() throws InterruptedException
		{
			js.executeScript("window.scrollBy(10,600)");
			
			Actions act = new Actions(driver);
		//	act.moveByOffset(400, 600).click();
		//	Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement Addtocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")));
			act.moveToElement(Addtocart).moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"))).click().build().perform();
			return new OrderHistoryDetailPage();
		}
		
		public OrderHistoryDetailPage UserAccount()
		{
			UserAccount.click();
			return new OrderHistoryDetailPage();
		}
		public OrderHistoryDetailPage OrderHistory()
		{
			OrderHistory.click();
			return new OrderHistoryDetailPage();
		}
	
}
