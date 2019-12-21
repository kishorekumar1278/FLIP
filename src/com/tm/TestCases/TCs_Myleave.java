package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.My_leave;

public class TCs_Myleave extends BaseClass{
	@Test
	public static void My_leave_Functionality(){
		String data[]=ReadRowData(CurrentTestCaseName); 
		Login login=PageFactory.initElements(driver, Login.class);
		Home home=PageFactory.initElements(driver, Home.class);
		My_leave myleave=PageFactory.initElements(driver, My_leave.class);
		login.LoginHRM(data[0],data[1]);
		myleave.nav_myleave(data[2],data[3]);
		myleave.statuses();
	
		
	}
	
	

}
