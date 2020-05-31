package com.testdemo.pages;

import lombok.Getter;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class MyAccountPage {

    @FindBy(how = How.ID, using = "username")
    private @Getter
    WebElement usnmText;

    @FindBy(id = "password")
    private @Getter
    WebElement password;

    @FindBy(name = "login")
    private @Getter
    WebElement loginBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    private @Getter
    WebElement loginErr;

    @FindBy(name = "email")
    private @Getter
    WebElement regEmailTxt;

    @FindBy(id = "reg_password")
    private @Getter
    WebElement regPwdTxt;
    
    @FindBy(name="register")
    private @Getter WebElement regBtn;
    
    @FindBy(xpath="//a[text()='Logout']")
    private @Getter WebElement logutBtn;


    public MyAccountPage(WebDriver driver)  {
    	

        PageFactory.initElements(driver, this);
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOf(getLoginBtn()));
		 */
		 
        
       }
    
	



}
