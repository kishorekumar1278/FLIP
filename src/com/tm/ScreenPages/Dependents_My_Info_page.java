package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Dependents_My_Info_page extends Weblibrary{
	//myInfo Link 
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	// Dependents Link
	@FindBy(xpath = "//a[text()='Dependents']")
    public static WebElement Dependents;
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
		
	
	public void navDependentsLink(String name, String Relationship, String dob){
	boolean status;
	
	status = clickElement(link_MyInfo);
	logEvent(status, "able to click on my info is successful", "unable to click on my info ");
	status = moveToElement(Dependents);
	logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
	wait(2);		
	status=clickElement(Dependents);
	logEvent(status, "able to Navigate Myinfo page", "unable to Navigate Myinfo page");
	
	status=clickElement(Add_button);
	logEvent(status, "able to click on Add Button Link", "Unable to click on Add Button  Link");
	
	status=setText(Name_Box,name);
	logEvent(status, "able to enter on Dependents Name", "Unable to enter on Name");
			
	status=selectByText(Relation_ship,Relationship);
	logEvent(status, "able to click on Qualifications Link", "Unable to click on Qualifications Link");
	
	status=setTextandEscape(Dob,dob);
	logEvent(status, "able to Select on Relation_ship ", "Unable to Select on Relation_ship Link");
	
	status=clickElement(Save_btn);
	logEvent(status, "able to click On Save Button ", "Unable to click on Save button Link");
	
			}		
}	

