package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelper {
	Logger logger = LoggerUtil.getLogger(ActionHelper.class);
	private WebDriver driver;

	public ActionHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void mouseHoverOnElement(WebElement element) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(element).build().perform();
		logger.info("Moved to element" + element);

	}

	public void mouseHoverAndClick(WebElement elementToHover, WebElement elementToClickable) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(elementToHover).click(elementToClickable).build().perform();
		logger.info("Moved to element and clicked" + elementToHover + elementToHover);

	}

}
