package com.testdemo.pageFeatures;

import org.openqa.selenium.WebDriver;

import com.testdemo.pages.ShopPage;


public class ShopFeature {
	
	WebDriver driver;
	ShopPage sp;
	public ShopFeature(WebDriver driver)
	{
		this.driver=driver;
		 sp=new ShopPage(driver);
	}
	
	
	public void selectHtmlBook()
	{
		sp.getHtmlBook().click();
	}

}
