package com.testdemo.stepdefinition;

import com.testdemo.Utils.ConfigProperties;
import com.testdemo.Utils.PropertiesFileReader;
import com.testdemo.Utils.TestBase;
import com.testdemo.helpers.LoggerUtil;
import com.testdemo.pageFeatures.HomePageFeature;
import com.testdemo.pageFeatures.MyAccountFeature;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginSteps  extends TestBase{
	
	
	Logger logger = LoggerUtil.getLogger(LoginSteps.class);
	MyAccountFeature maf = new MyAccountFeature(driver);
	HomePageFeature hpf = new HomePageFeature(driver);
	WebDriverWait wait;
	PropertiesFileReader propfilereader;

	@Given("User open the browser and entered the URL")
	public void user_open_the_browser_and_entered_the_URL() throws IOException {
		/*
		 * ConfigFactory.setProperty("environment","qa"); ConfigProperties testenv =
		 * ConfigFactory.create(ConfigProperties.class);
		 */
		propfilereader=new PropertiesFileReader();
        TestBase.launchBrowser("chrome",propfilereader.ConfigFileReader());
		//driver.get("http://practice.automationtesting.in/");

	}

	@When("User click on My Account Menu")
	public void user_click_on_My_Account_Menu() {

		hpf = new HomePageFeature(driver);
		hpf.clickOnMyAccount();
		
		
	}

	@When("User enter registered username and password")
	public void user_enter_registered_username_and_password() {

		maf = new MyAccountFeature(driver);
		maf.enterUserName("ghoshchandan19@gmail.com");
		maf.enterPwd("Priyadarshinicollege");

	}

	@When("User click on the Login Button")
	public void user_click_on_the_Login_Button() {

		maf.clickLoginButton();
	}

	@Then("User is able to login into the application")
	public void user_is_able_to_login_into_the_application() {
		Assert.assertEquals(maf.verifyLogin(), "Dashboard");
		logger.info("User succesfully login into the application");
	}
	
	@Then("User succesfully logout from the application")
	public void user_succesfully_logout_from_the_application() {
		maf.clickLogout();
	}

	@When("User enter registered username and invalid password")
	public void user_enter_registered_username_and_invalid_password() throws InterruptedException {

		maf = new MyAccountFeature(driver);
		maf.enterUserName("ghoshchandan19@gmail.com");
		maf.enterPwd("Priyadarshinicoll");

	}

	@Then("User is not able to login into the application")
	public void user_is_not_able_to_login_into_the_application() {
		Assert.assertEquals(maf.verifyInvldLogin(), "ERROR");
		logger.info("User not able to login with incorrect credentials");
	}

}
