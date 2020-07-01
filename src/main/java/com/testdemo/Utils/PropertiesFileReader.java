package com.testdemo.Utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	private Properties prop;
	
	private  final String propertyFilePath = "C:\\Users\\Chandan Ghosh\\eclipse-workspace\\CucumberLearning\\src\\test\\resources\\Config\\qa.properties";

	public String ConfigFileReader() throws IOException {
		FileInputStream fis = new FileInputStream(propertyFilePath);
		// create Properties class object to access properties file
		 prop = new Properties();
		// load the properties file
		prop.load(fis);
		return prop.getProperty("url");
		
		
	}
	
	public void getApplicationUrl()
	{
		
	}
	
	public String getEnv()
	{
		String env = System.getProperty("env");
		return env;
	}
	
	
		
	
	
	

	
	
	public static void main(String args[]) throws IOException
	{
		PropertiesFileReader pf=new PropertiesFileReader();
		pf.ConfigFileReader();
		
	}
}
