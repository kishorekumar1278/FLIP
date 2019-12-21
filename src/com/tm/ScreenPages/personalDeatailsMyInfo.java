package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class personalDeatailsMyInfo extends Weblibrary {
	
	//myInfo Link 
		@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
		public static WebElement link_MyInfo;
		//edit btn 
		@FindBy(xpath = "//input[@id='btnSave']")
		public static WebElement edit_btn;
		
		// first name 
		@FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
		public static WebElement Full_name;
		//middle name
		@FindBy(xpath = "//input[@id='personal_txtEmpMiddleName']")
		public static WebElement middle_name;
		
		//last name
		@FindBy(xpath = "//input[@id='personal_txtEmpLastName']")
		public static WebElement last_name;
		
		//other id 
		@FindBy(xpath = "//input[@id='personal_txtOtherID']")
		public static WebElement other_Id;
		//licence exp date 
		@FindBy(xpath = "//input[@id='personal_txtLicExpDate']")
		public static WebElement licence_exp_date;
		//marital status
		@FindBy(xpath = "//select[@id='personal_cmbMarital']")
		public static WebElement marital_status;
		
		//nationality
		@FindBy(xpath = "//select[@id='personal_cmbNation']")
		public static WebElement person_nation;
		//save btn
		@FindBy(xpath = "//input[@id='btnSave']")
		public static WebElement save_btn;
		
		public  void addPersonal_Deatails(String s1,String s2,String s3,String s4,String s5,String s6,String s7){
			boolean status;
			status = clickElement(link_MyInfo);
			logEvent(status, "able to click on my info is successful", "unable to click on my info ");
			
			status = clickElement(edit_btn);
			logEvent(status, "click on edit button ", "unable to click on edit button");
			wait(2);		
			
			status=setText(Full_name,s1);
			logEvent(status, "able toenter full name", "unable to enter full name");
			
			status=setText(middle_name,s2);
			logEvent(status, "able to enter middle name", "Unable to enter middle name");
			
			status=setText(last_name,s3);
			logEvent(status, "able to enter last name", "Unable to enter last name");
					
			status=setText(other_Id,s4);
			logEvent(status, "able to enter other id", "Unable to enter other id");
			
			status=setText(licence_exp_date,s5);
			logEvent(status, "able to enter licence exp date ", "Unable to enter licence exp date");
			wait(2);
			status=selectByText(marital_status,s6);
			logEvent(status, "able to select marital status", "Unable to select marital status");
			wait(2);
			status=selectByText(person_nation,s7);
			logEvent(status, "able to Select on nation ", "Unable to Select on nation");
			wait(2);
			status=clickElement(save_btn);
			logEvent(status, "able to click On Save Button ", "Unable to click on Save button Link");
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
