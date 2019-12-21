package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Myinfo_Qualifications;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class Add_Qualifications extends BaseClass {
	@Test
	public static void TC103_AddQualifications(){
		String[] data = ReadRowData(CurrentTestCaseName);
		
		Login login = PageFactory.initElements(driver, Login.class);
		Dependents_My_Info_page my_Info=PageFactory.initElements(driver, Dependents_My_Info_page.class);
		Home home=PageFactory.initElements(driver, Home.class);
		Myinfo_Qualifications qualifications=PageFactory.initElements(driver, Myinfo_Qualifications.class);
		//login As Team Member
		login.LoginHRM("user02","TM1234");
		//nav to my info
		home.navMyInfo();
		//nav Dependence Link
		qualifications.TC103_addQualifications(data[2],data[3],data[4],data[5]);
		//logout HRM
		home.Logout();
	}


}
