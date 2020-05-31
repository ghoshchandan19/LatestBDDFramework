package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomLocators {
	Logger logger = LoggerUtil.getLogger(CustomLocators.class);
	WebDriver driver;
	
	public void click(String locator,String locatorType,String description)
	
	{
		try
		{
			if(locatorType.equalsIgnoreCase("XPATH"))
			{
				driver.findElement(By.xpath(locator)).click();
				logger.info("Step: "+description+"successfull");
			}
			else if(locatorType.equalsIgnoreCase("ID"))
			{

				driver.findElement(By.id(locator)).click();
				logger.info("Step: "+description+"successfull");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
