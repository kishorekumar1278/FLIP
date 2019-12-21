package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.personalDeatailsMyInfo;

public class Personal_deat_Myinfo extends BaseClass{
	@Test
	public void personal_Deatails(){

	String data[]=ReadRowData(CurrentTestCaseName); 
	Login login=PageFactory.initElements(driver, Login.class);
	
	personalDeatailsMyInfo pDeatails=PageFactory.initElements(driver, personalDeatailsMyInfo.class);
	
	login.LoginHRM(data[0], data[1]);
	
	pDeatails.addPersonal_Deatails(data[2], data[3], data[4], data[5],data[6], data[7], data[8]);
	
	//login.closeBrowser();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

