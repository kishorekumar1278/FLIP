package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Myinfo_Qualifications extends Weblibrary {
	//myInfo Link 
		@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
		public static WebElement link_MyInfo;
	 //Qualifications link
	@FindBy(xpath = "//a[text()='Qualifications']")
	public static WebElement Qualifications;
	
	//addwork experience button
	@FindBy(xpath = "//input[@id='addWorkExperience']")
	public static WebElement Add_button;
	
	//Company name Text_Field
	@FindBy(xpath = "//input[@id='experience_employer']")
	public static WebElement Text_Field;
	
	 //JobTittle Text Field
	@FindBy(xpath = "//input[@id='experience_jobtitle']")
	public static WebElement job_tittle;
	
	//Experience from date
	@FindBy(xpath = "//input[@id='experience_from_date']")
	public static WebElement fromdate;
	
	//experience todate
	@FindBy(xpath = "//input[@id='experience_to_date']")
	public static WebElement Todate;
	
	//Save Button
	@FindBy(xpath = "//input[@id='btnWorkExpSave']")
	public static WebElement SaveButton;
	
	
	
	//click On Qualifications Link
	
	public void TC103_addQualifications(String data, String data2, String data3,String data4) {
	boolean status;
	status = moveToElement(Qualifications);
	logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
	wait(2);		
	
	status=clickElement(Qualifications);
	logEvent(status, "Able to Open Qualifications link  ", "unable to Open Qualifications link");
	
	status = clickElement(Add_button);
	logEvent(status, "able to click on add button", "unable to click on add button ");

	status = setText(Text_Field,"Qis");
	logEvent(status, "Password enter Sucessfully", " unable to enter Password ");
	
	status = setText(job_tittle,"QA");
	logEvent(status, "Able to click the Login button", "unable to Click the Login button");
	
	status=setTextandEscape(fromdate,"10-06-1998");
	logEvent(status, "able to Select from date ", "Unable to Select from date");
	
	status=setTextandEscape(Todate,"10-06-1998");
	logEvent(status, "able to Select todate ", "Unable to Select todate");
	
	
	status=clickElement(SaveButton);
	logEvent(status, "able to click On Save Button ", "Unable to click on Save button Link");
	}
}






