package com.testdemo.managers;

import org.openqa.selenium.WebDriver;

import com.testdemo.pageFeatures.BasketFeature;

public class PageObjectManager {
	WebDriver driver;
	BasketFeature basketFeature;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public BasketFeature getBasketFeature()
	{
		
		return (basketFeature==null)?basketFeature=new BasketFeature(driver):basketFeature;
	}

}
