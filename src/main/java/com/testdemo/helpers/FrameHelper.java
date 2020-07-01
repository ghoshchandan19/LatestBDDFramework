package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	Logger logger = LoggerUtil.getLogger(FrameHelper.class);
	WebDriver driver;

	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
		logger.info("Switch to frame using locator:" + element);
	}

	public void switchToFrame(String fName) {
		driver.switchTo().frame(fName);
		logger.info("Switch to frame :" + fName);
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
		logger.info("Switch to frame with " + index);
	}

	public void switchToMainFrame() {
		driver.switchTo().parentFrame();
		logger.info("Switched to parent frame");
	}
}
