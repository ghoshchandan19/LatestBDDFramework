package com.testdemo.pageFeatures;

import org.openqa.selenium.WebDriver;

import com.testdemo.helpers.WaitHelper;
import com.testdemo.pages.ProductPage;

public class ProductFeature {
	
	WebDriver driver;
	ProductPage pp;
	WaitHelper wait;
	
	public ProductFeature(WebDriver driver)
	{
		this.driver=driver;
		pp=new ProductPage(driver);
		 wait = new WaitHelper(driver);
				
	}
	
	
	public void enterQuantity()
	{
		wait.waitForElementToVisible(pp.getQuantityBox(),5);
		pp.getQuantityBox().clear();
		pp.getQuantityBox().sendKeys("2");
	}
	
	public void addToBasket()
	{
		pp.getAddBaskt().click();
	}

}
