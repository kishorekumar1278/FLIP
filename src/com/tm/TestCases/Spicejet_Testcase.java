package com.tm.TestCases;

import com.tm.BaseClass.BaseClass;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

import com.tm.ScreenPages.Spicejet_Smple;

	public class Spicejet_Testcase extends BaseClass{
  @Test
  public static void Spiceject(){
  String[] data = ReadRowData(CurrentTestCaseName);
	
	Spicejet_Smple login = PageFactory.initElements(driver, Spicejet_Smple.class);
		login.spicejet();


		}
}



