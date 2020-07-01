package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	
	private WebDriver driver;
    Logger logger = LoggerUtil.getLogger(DropDownHelper.class);
    
    public DropDownHelper(WebDriver driver)
    {
    	this.driver=driver;
    	logger.debug("DropDownHelper : " + this.driver.hashCode());
    }
    
	/* This method will select dropdown by visible text 
	 * @param element
	 * @param visibleValue
	 * */
    
    public void selectUsingVisibleText(WebElement element,String visibleText)
    {
    	Select select=new Select(element);
    	select.selectByVisibleText(visibleText);
    	logger.info("Locator: "+element +"selected by visble text "+visibleText);
    }
    
    /* This method will select dropdown by value 
	 * @param element
	 * @param visibleValue
	 * */
    public void selectUsingValue(WebElement element,String value)
    {
    	Select select=new Select(element);
    	select.selectByValue(value);
    	logger.info("Locator: "+element+"selected by value"+value);
    }
    
    /* This method will select dropdown by index 
	 * @param element
	 * @param index
	 * */
    public void selectUsingIndex(WebElement element,int index)
    {
    	Select select=new Select(element);
    	select.selectByIndex(index);
    	logger.info("Locator: "+element+"selected by index"+index);
    }
    
    
}
