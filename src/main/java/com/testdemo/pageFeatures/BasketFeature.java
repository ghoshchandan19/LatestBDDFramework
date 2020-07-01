package com.testdemo.pageFeatures;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.testdemo.helpers.LoggerUtil;
import com.testdemo.helpers.WaitHelper;
import com.testdemo.pages.BasketPage;


public class BasketFeature {
	
	Logger logger = LoggerUtil.getLogger(BasketFeature.class);
	
    WebDriver driver;
    BasketPage bp;
    WaitHelper wait;
	
	public BasketFeature(WebDriver driver)
	{
		this.driver=driver;
		bp=new BasketPage(driver);
		 wait = new WaitHelper(driver);
		
	}
	
	public void clickOnCheckout()
	{
		wait.waitForElementToVisible(bp.getCheckoutBtn(),5);
		bp.getCheckoutBtn().click();
		logger.info("Clicked on checkout Button "+bp.getCheckoutBtn());
	}


}
