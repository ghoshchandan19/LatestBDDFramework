package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.util.concurrent.TimeUnit;

public class WaitHelper {
	Logger logger = LoggerUtil.getLogger(WaitHelper.class);
	
	private WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * This is to set implicit wait
	 * @param timeout
	 * @param unit 
	 * return void
	 */
	public void setImplicitWait(long timeout, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(timeout, unit);
		logger.info("Set Implicit wait");
	}
	
	/*
	 * This method is to wait for element to be visible
	 * @param elemnet
	 * @param timeOutInSeconds
	 * return void
	 */

	public void waitForElementToVisible(WebElement element, long timeOutInSeconds) {
		logger.info("Waiting for element to be visible"+ element);

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("Element is visible"+ element);

	}
	
	public WebElement waitForElementToBeClikable(long time,WebElement element) {
		logger.info("Waiting for element to be visible"+ element);
		WebDriverWait wait = new WebDriverWait(driver, time);
		logger.info("Element is Clickable"+ element);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		

	}
	
	
	

}
