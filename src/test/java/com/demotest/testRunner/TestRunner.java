package com.demotest.testRunner;



import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@CucumberOptions(

		features = "src/test/resources/Features", glue = { "com/testdemo/stepdefinition" }
	//plugin = {"pretty", "com.epam.reportportal.cucumber.StepReporter"}

)
public class TestRunner {
	
	  private TestNGCucumberRunner testNGCucumberRunner;
	  public static RemoteWebDriver connection = null;
	 
	  @BeforeClass(alwaysRun = true) public void setUpClass() throws Exception {
	 
	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	 
	  }
	 
	  @BeforeMethod(alwaysRun = true)
	  
	  @Parameters({ "browser", "version", "platform" }) public void
	 setUpClass(String browser, String version, String platform) throws Exception
	 {
	 
	
	  
	  DesiredCapabilities capability = new DesiredCapabilities();
	  capability.setCapability(CapabilityType.BROWSER_NAME, browser);
	  capability.setCapability(CapabilityType.VERSION, version);
	  capability.setCapability(CapabilityType.PLATFORM, platform);
	  
	  capability.setCapability("build", "Your Build Name");
	 
	  capability.setCapability("network", true); capability.setCapability("video",
	  true); 
	  capability.setCapability("console", true);
	  capability.setCapability("visual", true); 
	 }
	 
	  @Test(dataProvider = "features") 
	  public void feature(PickleEventWrapper eventwrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable { 
	  //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	  testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent()); }
	  
	  @DataProvider 
	  public Object[][] features() 
	  {
	 
	  return testNGCucumberRunner.provideScenarios(); 
	 }
	  
	  @AfterClass(alwaysRun = true) public void tearDownClass() throws Exception {
	  // Reporter.loadXMLConfig("src/test/resources/extentConfig.xml");
	  testNGCucumberRunner.finish();
	  
	 }
	 
}
