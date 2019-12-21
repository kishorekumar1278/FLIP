package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Delete_Dependency;
import com.tm.ScreenPages.Login;

public class TC004_del_dependencies extends BaseClass {
	
	@Test
	public void TC104_delete_dependies() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		Delete_Dependency del_dependency = PageFactory.initElements(driver, Delete_Dependency.class);
		lp.LoginHRM(data[0],data[1]);
		del_dependency.delete_dependecys(data[2], data[3],data[4]);
		

		
		
		
	}
	

}
