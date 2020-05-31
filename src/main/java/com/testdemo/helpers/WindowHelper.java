package com.testdemo.helpers;

import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class WindowHelper {
	Logger logger = LoggerUtil.getLogger(WindowHelper.class);
	WebDriver driver;

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void goBack() {
		driver.navigate().back();
		logger.info("Navigated back");
	}

	public void goForward() {
		driver.navigate().forward();
		logger.info("Navigated forward");
	}

	public void refresh() {
		driver.navigate().refresh();
		logger.info("Refreshed the window");
	}
	
	
	/* 
	 * This method is used to get all the window ids
	 */

	public Set<String> getWindowHandles() {
		logger.info("Get all the window Handles");
		return driver.getWindowHandles();
	}

	
	public void switchToWindow(int index) {
		LinkedList<String> windowId = new LinkedList<String>(getWindowHandles());
		if (index < 0 || index > windowId.size())
			throw new IllegalArgumentException("Invalid Index : " + index);
		driver.switchTo().window(windowId.get(index));
		logger.info("Switched to window"+index);

	}
	
	/* 
	 * This method switches to parent window 
	 */
	public void switchToParentWindow()
	{
		LinkedList<String> windowId = new LinkedList<String>(getWindowHandles());
		driver.switchTo().window(windowId.get(0));
		logger.info("Switched to parent window");
	}
	
	
}
