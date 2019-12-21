package com.tm.BaseClass;

import org.openqa.selenium.WebDriver;


public class Config {
	
	public static WebDriver driver;
	public static String CurrentTestCaseName;
	public static String appURL = "https://testingmasters.com/hrm";
	//public static String appURL ="https://www.spicejet.com/";
	public String Browser = "chrome";
	public static String TestDataPath = "D:\\Kishore\\TM_HRM_Automation1\\TM_HRM_Automation1\\TestData\\HRM.xlsx";
		
}
