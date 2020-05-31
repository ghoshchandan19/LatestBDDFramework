
  package com.testdemo.pageFeatures;
  
  import com.testdemo.pages.DashboardPage; import
  org.openqa.selenium.WebDriver;
  
  public class DashboardFeature {
  
 	   WebDriver driver; DashboardPage dp;
  
  DashboardFeature(WebDriver driver) { this.driver = driver; new
  DashboardPage(driver); }
  
  
  }
 