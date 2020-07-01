package com.testdemo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CheckoutPage {
	
	
	@FindBy(id="billing_first_name")
	private @Getter WebElement firstName;
	
	@FindBy(id="billing_last_name_field")
	private @Getter WebElement lastName;
	
	@FindBy(id="billing_company")
	private @Getter WebElement compName;
	
	@FindBy(id="billing_email")
	private @Getter WebElement emailAddr;
	
	@FindBy(id="billing_phone")
	private @Getter WebElement phone;
	
	@FindBy(id="s2id_billing_country")
	private @Getter List<WebElement> country;
	
	@FindBy(id="billing_address_1")
	private @Getter WebElement strAddr;
	
	@FindBy(id="billing_address_2")
	private @Getter WebElement strAddr2;
	
	@FindBy(id="billing_city")
	private @Getter WebElement town;
	
	@FindBy(id="s2id_billing_state")
	private @Getter List<WebElement> state; 
	
	@FindBy(id="billing_postcode")
	private @Getter WebElement postcode;
	
	@FindBy(id="payment_method_cod")
	private @Getter WebElement cod;
	
	@FindBy(id="place_order")
	private @Getter WebElement placeBtn;
	
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
