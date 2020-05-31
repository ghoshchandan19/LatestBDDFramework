package com.testdemo.pageFeatures;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.testdemo.helpers.LoggerUtil;
import com.testdemo.helpers.WaitHelper;
import com.testdemo.pages.DashboardPage;
import com.testdemo.pages.MyAccountPage;

public class MyAccountFeature {
	Logger logger = LoggerUtil.getLogger(MyAccountFeature.class);
	WebDriver driver;
	MyAccountPage ap;
	DashboardPage dbp;
	WaitHelper wait;

	public MyAccountFeature(WebDriver driver) {
		this.driver = driver;
		ap = new MyAccountPage(driver);
		dbp = new DashboardPage(driver);
		wait = new WaitHelper(driver);

	}

	public void enterUserName(String username) {
		ap.getUsnmText().sendKeys(username);
		logger.info("Entered username... " + username);
	}

	public void enterPwd(String password) {
		ap.getPassword().sendKeys(password);
		logger.info("Entered password... " + password);
	}

	public void clickLoginButton() {

		ap.getLoginBtn().click();
		logger.info("Clicked on Login Button... " + ap.getLoginBtn());
	}

	public String verifyLogin() {
		String text = dbp.getDashboardLink().getText();
		logger.info("Verifying Dashoboard Text " + dbp.getDashboardLink());
		return text;
	}

	public String verifyInvldLogin() {
		logger.info("Verifying Inavlid Login " + ap.getLoginErr());
		return ap.getLoginErr().getText();

	}

	public void enterRegEmail(String userName) {

		ap.getRegEmailTxt().sendKeys(userName);
		logger.info("Entered Registration Email " + userName);
	}

	public void enterRegPwd(String password) {
		ap.getRegPwdTxt().sendKeys(password);
		logger.info("Entered Registration password " + password);
		wait.waitForElementToBeClikable(20, ap.getRegBtn());
	}

	public void clickRegBtn() {
        
		ap.getRegBtn().click();
		logger.info("Clicked on  Register Button " + ap.getRegBtn());
	}

	public String verifyRegistration() {
		logger.info("Verifying Sucessfull Registration... ");
		return dbp.getDashboardLink().getText();

	}

	// Method to logout from the application
	public void clickLogout() {
		ap.getLogutBtn().click();
	}

	/*
	 * This method will login into the application
	 * 
	 * @param userName
	 * 
	 * @param password
	 */

	public void login(String userName, String password) {
		enterUserName(userName);
		enterPwd(password);
		clickLoginButton();
	}

}
