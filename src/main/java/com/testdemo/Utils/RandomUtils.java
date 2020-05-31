package com.testdemo.Utils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomUtils {
	
	/* This method will generate random userid 
	 */
	
	public static String userEmailId()
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		return "username"+randomInt+"@gmail.com";
	}
	
	/* This method will generate random password */
	
	public static String userPassword(int len)
	{
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		// each iteration of loop choose a character randomly from the given ASCII range
		// and append it to StringBuilder instance

		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}
        return sb.toString();
	}

}
