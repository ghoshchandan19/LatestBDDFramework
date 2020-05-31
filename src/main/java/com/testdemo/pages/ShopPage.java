package com.testdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ShopPage {
	
	@FindBy(xpath="//h3[text()='HTML5 Forms']")
	private @Getter WebElement htmlBook;
	
	public ShopPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}
