package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Table_Resuable;
import com.tm.ScreenPages.Dependents_My_Info_page;

public class Table_Headers extends BaseClass {
	
	@Test
	public static void Headers(){
		//String[] data = ReadRowData(CurrentTestCaseName);
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home=PageFactory.initElements(driver, Home.class);
		Table_Resuable treusable=PageFactory.initElements(driver, Table_Resuable.class);
		//login As Team Member
		login.LoginHRM("user02","TM1234");
		//nav to myLeave
		treusable.Table_headers_MyLeave();
		
	
		//logout HRM
		home.Logout();

}
}
