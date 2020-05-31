package com.testdemo.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertHelper {
    private WebDriver driver;
    Logger logger = LoggerUtil.getLogger(AlertHelper.class);

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }

    /*
     * @Author Chandan Ghosh
     * Method to get alert
     * @Param 
     * return Alert
     * 
     */
    public Alert getAlert() {
        return driver.switchTo().alert();

    }

    /*
     * @Author Chandan Ghosh
     * @Param
     * return void
     */
    public void acceptAlert() {
        getAlert().accept();
        logger.info("Alert Accepted");
    }

    /*
     * @Author Chandan Ghosh
     * @Param
     * return void
     */
    public void dismissAlert() {
        getAlert().dismiss();
        logger.info("Alert Dismissed");
    }

    /*
     * @Author Chandan Ghosh
     * @Param
     * return String
     */
    public String getAlertText() {
    	logger.info("Get Text from Alert");
        return getAlert().getText();
        
    }
    
    /*
     * @Author Chandan Ghosh
     * @Param
     * return Boolean
     */

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            logger.info("Switched to Alert");
            return true;
        } catch (NoAlertPresentException e) {
            logger.info("Alert not found");
            return false;
        }

    }
    
    /*
     * @Author Chandan Ghosh
     * @Param
     * return void
     */

    public void dismissIfAlertPresent() {
        if (!isAlertPresent())
            return;
        dismissAlert();
        logger.info("Alert is dismissed");
    }

    /*
     * @Author Chandan Ghosh
     * @Param
     * return void
     */
    
    public void acceptIfAlertPresent() {
        if (!isAlertPresent())
            return;
        acceptAlert();
        logger.info("Alert is accepted");
    }
}
