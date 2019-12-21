package com.tm.ScreenPages;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	import com.tm.BaseClass.BaseClass;

	import com.tm.ScreenPages.Home;
	import com.tm.ScreenPages.Login;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.tm.Libraries.Weblibrary;

	public class TC_001_Verify_Apply_LeavePage_Objects extends Weblibrary{
		       //Orange HRM Img
				@FindBy(xpath = "//div[@id='branding']/a/img")
				public static WebElement Hrm_img;
				
				//Page Tabs
				@FindBy(xpath = "//div[@class='menu']/ul/li/a")
				public static WebElement Tabs;
				
				//SubModules
				@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']/following::ul[1]/li")
				public static WebElement Sub_Tab;
				
				
				public static void AP_Page_Objects() {
					boolean status;
				status = isExist(Hrm_img);
				logEvent(status, "Hrm_img Displayed", "Hrm_img not Displayed");
				wait(2);
				
				status = isExist(Tabs);
				logEvent(status, "able to display Tabs ", "Unable to displayed Tabs");
				wait(2);
				
				status = moveToElement(Tabs);
				logEvent(status, "able to mouse over on leave Tab", "unable to mouse over on leave Tab");
				wait(2);
				
				status = isExist(Sub_Tab);
				logEvent(status, "Able to Display Sub Tabs", "unAble to Display Sub Tabs");
				wait(2);
		}

	

}
