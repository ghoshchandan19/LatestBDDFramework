package com.testdemo.Utils;

import org.aeonbits.owner.Config;

import org.aeonbits.owner.Config.Sources;

@Sources({ "file:\\src\\test\\resources\\Config\\${env}.properties" })
public interface ConfigProperties extends Config {

	@Key("url")
	String geturl();
	
	

}
