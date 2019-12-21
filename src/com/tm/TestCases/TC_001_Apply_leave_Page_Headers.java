package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.TC_001_Verify_Apply_LeavePage_Objects;

public class TC_001_Apply_leave_Page_Headers extends BaseClass{
	@Test	
	public void AP_Page_Objects() {
			
			//String[] data= ReadRowData(CurrentTestCaseName);
			
			Login login = PageFactory.initElements(driver, Login.class);
			Home home=PageFactory.initElements(driver, Home.class);
	TC_001_Verify_Apply_LeavePage_Objects objects=PageFactory.initElements(driver, TC_001_Verify_Apply_LeavePage_Objects.class);
		    //Step 1: Login as a team member
			login.LoginHRM("user02","TM1234");
					
			objects.AP_Page_Objects();
			
			//Step 6: Logout
			Home.Logout();
		}

}
