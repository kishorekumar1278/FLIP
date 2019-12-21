package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class TC_002_AP_Sub_Tasks extends Weblibrary{
	//Mouse over on leave tab
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement Leave_tab;
	 //Mouse Over on Leave Tab
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']/preceding::ul[1]/li")
	public static WebElement subTabs_of_Leave;
	
	
	//Mouse Over on Entittlement Tab
	@FindBy(xpath = "//a[@id='menu_leave_Entitlements']")
	public static WebElement Entittlement;
	
	//Sub Tab Entitlements
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveEntitlements']")
	public static WebElement Sub_Tab_entittlement;
	
	//Mouse Over on Reports Tab
		@FindBy(xpath = "//a[@id='menu_leave_Reports']")
		public static WebElement Reports;
		
		//SubTab on Reports Tab
		@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveBalanceReport']")
		public static WebElement UsageReport;

        public void subTabs(){
        	/////////////
        	boolean status;
        	status = moveToElement(Leave_tab);
			logEvent(status, "able to mouse over on leave Tab", "unable to mouse over on leave Tab");
			wait(2);
			status = isExist(subTabs_of_Leave);
			logEvent(status, "able to Display Apply sub_Tab", "unable to Display Apply sub_Tab");
			//////////
			status = moveToElement(Entittlement);
			logEvent(status, "able to mouse over on entittlements Tab", "unable to mouse over on entittlements Tab");
			wait(2);
			status = isExist(Sub_Tab_entittlement);
			logEvent(status, "able to Display MyEntittlements sub_Tab", "unable to Display MyEntittlements sub_Tab");
			wait(2);
			//////////////
			status = moveToElement(Reports);
			logEvent(status, "able to mouse over on Reports Tab", "unable to mouse over on Reports Tab");
			wait(2);
			status = isExist(UsageReport);
			logEvent(status, "able to Display UsageReport sub_Tab", "unable to Display UsageReport sub_Tabs");
			wait(2);
			}	
             }
