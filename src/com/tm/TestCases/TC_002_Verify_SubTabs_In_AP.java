package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.TC_002_AP_Sub_Tasks;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Myinfo_Qualifications;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class TC_002_Verify_SubTabs_In_AP extends BaseClass {
	@Test
	public static void SubTabs_In_AP(){
		//String[] data = ReadRowData(CurrentTestCaseName);
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home=PageFactory.initElements(driver, Home.class);
	     TC_002_AP_Sub_Tasks sub_Task=PageFactory.initElements(driver, TC_002_AP_Sub_Tasks.class);
		//login As Team Member
		login.LoginHRM("user02","TM1234");
		//nav to my info
		sub_Task.subTabs();
		//logout HRM
		home.Logout();
	}




}
