package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Delete_Dependency extends Weblibrary {
	//myInfo Link 
		@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
		public static WebElement link_MyInfo;
		// Dependents Link
		@FindBy(xpath = "//a[text()='Dependents']")
	    public static WebElement Dependents;
		//Select All Dependents using checkBox 
		@FindBy(xpath = "//input[@id='checkAll']")
		public static WebElement Checkbox;
		// Dependents Link
		@FindBy(xpath = "//input[@id='delDependentBtn']")
	    public static WebElement Delete_Button;
		
		//Dependents Add button
		@FindBy(xpath = "//input[@id='btnAddDependent']")
		public static WebElement Add_button;
		
		//Dependent NameText box 
		@FindBy(xpath = "//input[@id='dependent_name']")
		public static WebElement Name_Box;

		//Dependent NameText box 
		@FindBy(xpath = "//select[@id='dependent_relationshipType']")
		public static WebElement Relation_ship;

		//Dob Of dependent
		@FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
		public static WebElement Dob;
		//Save Button dependent
			@FindBy(xpath = "//input[@id='btnSaveDependent']")
			public static WebElement Save_btn;

		public void delete_dependecys(String s1,String s2,String s3){
		boolean status;
		//==================================================================
		status = moveToElement(link_MyInfo);
		logEvent(status, "mouse over to MyInfo menu is successful", "mouse over to MyInfo menu is unsuccessful");
		wait(2);		
		status=clickElement(link_MyInfo);
		logEvent(status, "able to Navigate Dependents page", "unable to Navigate Dependents  page");
		
		//==================================================================
		status=clickElement(Dependents);
		logEvent(status, "able to open Dependents page", "unable to Navigate Dependents page");
		
		//======================================================================
		status=clickElement(Checkbox);
		logEvent(status, "able to click on check box ", "Unable to click on check box ");
		
		//=======================================================
		status=clickElement(Delete_Button);
		logEvent(status, "able to delete dependecyies ", "unable to delete dependecyies");
		
		//==========================================================/
		status=clickElement(Add_button);
		logEvent(status, "able to click on Add Button Link", "Unable to click on Add Button  Link");
		
		//===========================================================
		status=setText(Name_Box,s1);
		logEvent(status, "able to enter on Dependents Name", "Unable to enter on Name");
		
		//=================================================================
		status=selectByText(Relation_ship,s2);
		logEvent(status, "able to select relation", "Unable to select relation");
		
		//=============================================================================
		status=setTextandEscape(Dob,s3);
		logEvent(status, "able to enter date ", "Unable to enter date");
		
		//===================================================================
		status=clickElement(Save_btn);
		logEvent(status, "able to click On Save Button ", "Unable to click on Save button Link");
		
		}

}
