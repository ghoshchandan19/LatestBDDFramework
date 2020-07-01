package com.testdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ProductPage {
	
	@FindBy(name="quantity")
	private @Getter WebElement quantityBox;
	
	@FindBy(xpath="//button[text()='Add to basket']")
	private @Getter WebElement addBaskt;
	
	@FindBy(xpath="//span[@class='cartcontents']")
	private @Getter WebElement shoppingCart;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
