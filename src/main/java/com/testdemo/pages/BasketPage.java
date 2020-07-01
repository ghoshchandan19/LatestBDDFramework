package com.testdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class BasketPage {
	
	@FindBy(xpath="//input[@name='apply_coupon']")
	private WebElement coupnBtn;

	@FindBy(xpath="//a[@class='checkout-button button alt wc-forward']")
	private @Getter WebElement checkoutBtn;
	
	public BasketPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}
