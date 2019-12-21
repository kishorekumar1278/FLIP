package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class Add_Dependents extends BaseClass {
	@Test
	public static void TC102_addDependent(){
		String[] data = ReadRowData(CurrentTestCaseName);
		
		Login login = PageFactory.initElements(driver, Login.class);
		Dependents_My_Info_page my_Info=PageFactory.initElements(driver, Dependents_My_Info_page.class);
		Home home=PageFactory.initElements(driver, Home.class);
		
		//login As Team Member
		login.LoginHRM(data[0],data[1]);
		
		//nav to my info
		home.navMyInfo();
		
		//nav Dependence Link
		my_Info.navDependentsLink(data[2],data[3],data[4]);
		//logout HRM
		home.Logout();
	

}
}
