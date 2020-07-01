
  package com.testdemo.pageFeatures;
  
  import com.testdemo.helpers.LoggerUtil;
import com.testdemo.helpers.WaitHelper;
import com.testdemo.pages.HomePage;
import com.testdemo.pages.MyAccountPage;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
  
  public class HomePageFeature {
	  
  Logger logger=LoggerUtil.getLogger(HomePageFeature.class);
  WebDriver driver;
  HomePage hp;
  MyAccountPage map;
  WaitHelper wait;
  public HomePageFeature(WebDriver driver) { 
	this.driver = driver; 
	hp = new HomePage(driver);
	map=new MyAccountPage(driver);
	wait=new WaitHelper(driver);
	}
  
  public void clickOnMyAccount() { 
	  hp.getMyAccount().click();
	  logger.info("Clicked on My Account");
	  wait.waitForElementToVisible(map.getLoginBtn(), 10);
	  
  
  }
  
  public void clickOnShopMenu()
  {
	  hp.getShopMenu().click();
	  logger.info("Clicked on Shop");
  }
  
  }
 