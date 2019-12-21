package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class TC_003_ApplyLeave extends Weblibrary {
	
	    //Mouse over on leave tab
		@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
		public static WebElement Leave_tab;
		 //Mouse Over on Apply Leave Tab
		@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
		public static WebElement subTabs_of_Leave;
	   //Leave Type field
		@FindBy(xpath = "//select[@id='applyleave_txtLeaveType']")
		public static WebElement dd_LeaveType;

		//Leave Balance Link                              
		@FindBy(xpath = "//a[@id='leaveBalance_details_link']")
		public static WebElement leaveBalance_details_link;
		

		//Leave Balance Link Window
		@FindBy(xpath = "//div[2][@class='modal-body']")
		public static WebElement leaveBalance_details_window;
		
		//Leave Balance Link Window Table
		@FindBy(xpath = "//table/tbody/tr/td")
		public static WebElement leaveBalance__window_Table;

		//close button
		@FindBy(xpath = "//input[@id='closeButton']")
		public static WebElement closeButton;
		
		//from date field
		@FindBy(xpath = "//input[@id='applyleave_txtFromDate']")
		public static WebElement edit_fromDate;
		
		//To date field
		@FindBy(xpath = "//input[@id='applyleave_txtToDate']")
		public static WebElement edit_toDate;
		
		//Comment Box
		@FindBy(xpath = "//textarea[@id='applyleave_txtComment']")
		public static WebElement commentBox;
		
		//Apply button field
		@FindBy(xpath = "//input[@id='applyBtn']")
		public static WebElement btn_Apply;
	    //Footer of Page
		@FindBy(xpath = "//div[@id='footer']")
		public static WebElement footer;
	
		//==============================================
		//String s4,String s5,String s6,String s7,String s8
		 public static void ApplyLeave(String s1,String s2,String s3){
		boolean status;
		//
		status = moveToElement(Leave_tab);
		logEvent(status, "able to mouse over on Leave tab", "unable to mouse over on Leave tab");
		//
		
		//
		status = clickElement(subTabs_of_Leave);
		logEvent(status, "able to click Apply button", "unable to click on apply button");
		
		//
		status = selectByText(dd_LeaveType, "Annual Leave");
		logEvent(status, "Leave type selected", "Leave type not selected");
		//
		status = clickElement(leaveBalance_details_link);
		logEvent(status, "able to click leaveBalance_details_link ", "unable to click leaveBalance_details_link");
		//
		status = Displayed(leaveBalance_details_window);
		logEvent(status, "able to Display leaveBalance_details_window ", "unable to display leaveBalance_details_window");
		//
		status = isExist(leaveBalance__window_Table);
		logEvent(status, "able to get table valves ", "unable to get table valves");
		
		//
		status = clickElement(closeButton);
		logEvent(status, "able to click closeButton ", "unable to click closeButton");
		
		//
		status = setTextandEscape(edit_fromDate, "2019-10-26");
		logEvent(status, "From date entered", "From date not entered");
		//
		status = setTextandEscape(edit_toDate, "2019-10-26");
		logEvent(status, "To date entered", "To date not entered");
		
		//
		status = setText(commentBox, "Sick Leave");
		logEvent(status, "From date entered", "From date not entered");
		//
		status = clickElement(btn_Apply);
		logEvent(status, "Apply button clicked", "Apply button not clicked");
		//
		status = footer(footer);
		logEvent(status, "able to display Footer ", "unable to display footer");
		}
		
		//==============================================
		
	}

