
package com.testdemo.stepdefinition;

import org.testng.Assert;

import com.testdemo.Utils.TestBase;
import com.testdemo.pageFeatures.MyAccountFeature;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends TestBase {

	MyAccountFeature maf;

	@When("User enter  {string} and {string}")
	public void user_enter_and(String username, String password) {
		maf = new MyAccountFeature(driver);
		maf.enterRegEmail(username);
		maf.enterRegPwd(password);
	}

	@When("User click on Register button")
	public void user_click_on_Register_button() {
		maf.clickRegBtn();
	}

	@Then("User will be register sucesfully")
	public void user_will_be_register_sucesfully() {
		Assert.assertEquals(maf.verifyRegistration(), "Dashboard");
	}

}
