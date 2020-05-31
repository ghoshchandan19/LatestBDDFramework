package com.testdemo.pages;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private @Getter
    WebElement dashboardLink;

    public DashboardPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

}
