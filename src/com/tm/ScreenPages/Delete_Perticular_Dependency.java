package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Delete_Perticular_Dependency extends Weblibrary{
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	// Dependents Link
	@FindBy(xpath = "//a[text()='Dependents']")
    public static WebElement Dependents;

	@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr[1]/td")
	public static WebElement Dependence_Table;
	//delete button
	@FindBy(xpath = "//input[@id='delDependentBtn']")
	public static WebElement delbutton;
	


public static void dependents(){
	boolean status;
	status = moveToElement(link_MyInfo);
	logEvent(status, "able to mouse over on Myinfo tab", "unable to mouse over on myinfo tab");
	
	status = clickElement(link_MyInfo);
	logEvent(status, "able to click myinfo button", "unable to click on myinfo button");

	status = clickElement(Dependents);
	logEvent(status, "able to click dependents button", "able to click dependent button");
	
	status = deleteDependents(Dependence_Table);

	logEvent(status, "able to click dependents button", "able to click dependent button");
	
	wait(2);
	status = clickElement(delbutton);
	logEvent(status, "able to delete dependents ", "unable to delete dependents");
	
}
}

	