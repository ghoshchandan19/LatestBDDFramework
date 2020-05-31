package com.testdemo.helpers;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerUtil {
	

	
private static boolean root=false;
	
	public static  <T> Logger getLogger(Class<T> cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
 
	
}

