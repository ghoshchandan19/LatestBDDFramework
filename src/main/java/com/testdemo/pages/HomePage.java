package com.testdemo.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	
    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    private @Getter
    WebElement myAccount;
    
    @FindBy(xpath="//a[text()='Shop']")
    private @Getter WebElement shopMenu;

    public HomePage(WebDriver driver) {
    	
    	
    	
        PageFactory.initElements(driver, this);
    }
    
   
    
    
  


}
