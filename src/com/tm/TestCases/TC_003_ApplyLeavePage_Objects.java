package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.TC_003_ApplyLeave;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class TC_003_ApplyLeavePage_Objects extends BaseClass{
	@Test
	public static void TC105_ApplyLeave(){
		String[] data = ReadRowData(CurrentTestCaseName);
		
		Login login = PageFactory.initElements(driver, Login.class);
		
		TC_003_ApplyLeave ap=PageFactory.initElements(driver, TC_003_ApplyLeave.class);
		//login As Team Member
		login.LoginHRM(data[0],data[1]);

		//nav Dependence Link
		ap.ApplyLeave(data[3],data[4],data[5]);
		//,data[6],data[7],data[8],data[9],data[10]
		//logout HRM
		//home.Logout();
	

}
}



