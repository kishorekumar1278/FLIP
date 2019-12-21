package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Table_Resuable extends Weblibrary{
	//Leave Tab
			@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
			public static WebElement link_Leave;
	   
			//myleave tab
		@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
		public static WebElement lin_MyLeave;
		
		
		//My-leave table Headers
		@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th/span")
		public static  WebElement Table_thead;
		

		public static void Table_headers_MyLeave(){
			boolean status;
			status = moveToElement(link_Leave);
			logEvent(status, "mouse over to Leave menu is successful", "mouse over to Leave menu is unsuccessful");
			wait(2);		
			
			status = clickElement(link_Leave);
			logEvent(status, "Click on  Leave menu is successful", "unable to Click on Leave menu is unsuccessful");
			wait(2);		
			
			status = clickElement(lin_MyLeave);	
			logEvent(status, "Leave menu link clicked", "Leave menu link not clicked");
			
			status = TableReusable(Table_thead);
			logEvent(status, "MyLeave headers getting", "MyLeave headers not getting");
			
		}
}
