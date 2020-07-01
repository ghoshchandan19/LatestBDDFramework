package com.testdemo.pageFeatures;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.testdemo.helpers.LoggerUtil;
import com.testdemo.pages.ShopPage;


public class ShopFeature {
	Logger logger = LoggerUtil.getLogger(ShopFeature.class);
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
		logger.info("Select Book"+sp.getHtmlBook());
	}

}
