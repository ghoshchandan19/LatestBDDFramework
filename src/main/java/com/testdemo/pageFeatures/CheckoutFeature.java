package com.testdemo.pageFeatures;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.testdemo.helpers.LoggerUtil;
import com.testdemo.helpers.WaitHelper;
import com.testdemo.pages.CheckoutPage;

public class CheckoutFeature {
	Logger logger = LoggerUtil.getLogger(CheckoutFeature.class);
	
	WebDriver driver;
	CheckoutPage cp;
	WaitHelper wait;
	
	public CheckoutFeature(WebDriver driver)
	{
		this.driver=driver;
		cp=new CheckoutPage(driver);
		 wait = new WaitHelper(driver);
		 wait.setImplicitWait(10, TimeUnit.SECONDS);
	}
	
	public void enterFirstName(String firstName)
	{
		cp.getFirstName().sendKeys(firstName);
		logger.info("Entered First Name"+firstName);
	}
	 public void enterLastName(String lastName)
	 {
		 cp.getLastName().sendKeys(lastName);
		 logger.info("Entered Last Name"+lastName);
	 }
	 
	public void enterCompany(String company)
	{
		cp.getCompName().sendKeys(company);
		logger.info("Entered Company Name"+company);
	}
	
	public void enterEmail(String email)
	{
		cp.getEmailAddr().sendKeys(email);
		logger.info("Entered email addr"+email);
	}
	
	public void enterPhn(String phnNumber)
	{
		cp.getPhone().sendKeys(phnNumber);
		logger.info("Entered phone number"+phnNumber);
	}
	
	public void enterAddr(String addr)
	{
		cp.getStrAddr().sendKeys(addr);
		cp.getStrAddr2().sendKeys(addr);
		logger.info("Entered adddress"+addr);
	}
	
	public void enterTown(String town)
	{
		cp.getTown().sendKeys(town);
		logger.info("Entered town"+town);
	}
	
	public void enterPost(String postcode)
	{
		cp.getPostcode().sendKeys(postcode);
		logger.info("Entered psotcode"+postcode);
	}
	
	public void cod()
	{
		cp.getCod().click();
		logger.info("Selected COD option");
	}
	
	public void placeOrder()
	{
		cp.getPlaceBtn().click();
		logger.info("Clicked on Place Order Button");
	}
	
	
	public void  enterBillingAddress(String firstName,String lastName,String company,String email,String phnNumber,String addr,String town,String postcode)
	{
		enterFirstName(firstName);
		enterLastName(lastName);
		enterCompany(company);
		enterEmail(email);
		enterPhn(phnNumber);
		enterAddr(addr);
		enterTown(town);
		enterPost(postcode);
		
		
		
		
		
	}

	
	
	
	
	
}
