package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Delete_Perticular_Dependency;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Myinfo_Qualifications;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class delDependents extends BaseClass{
	@Test
	public static void TC106_deleteDependents(){
	
	String [] data=ReadRowData(CurrentTestCaseName); 
	
	Login login = PageFactory.initElements(driver, Login.class);
	
	Home home=PageFactory.initElements(driver, Home.class);
	
	Delete_Perticular_Dependency depent=PageFactory.initElements(driver, Delete_Perticular_Dependency.class);
	
	//login As Team Member
	login.LoginHRM(data[0],data[1]);
	//nav Dependence Link
	depent.dependents();
	//logout HRM
	//home.Logout();
}
}