package com.tm.ScreenPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Spicejet_Smple extends Weblibrary{
	
	//Leave Type field
	@FindBy(xpath = "//input[@id='ctl00_mainContent_rbtnl_Trip_1']")
	public static WebElement Radio_Btn;
	
	//Leave Type field
	@FindBy(xpath = "//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")
	public static WebElement from_icon;
	
	//from date field
	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	public static WebElement From_Place;
	
	//from date field
	@FindBy(xpath = "//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")
	public static WebElement To_icon;
	
	//To date field 
	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")
	public static WebElement To_place;
	
	
	//Apply button field
	@FindBy(xpath = "//input[@id='ctl00_mainContent_view_date1']")
	public static WebElement From_date;
    
	//from date valve
	@FindBy(xpath = "//a[@class='ui-state-default']")
	public static WebElement From_date_valve;

	
	//Apply button field
	@FindBy(xpath = "//input[@id='ctl00_mainContent_view_date2']")
	public static WebElement To_date;

	//Apply button field
		@FindBy(xpath = "//a[@class='ui-state-default ui-state-hover']")
		public static WebElement To_date_valve;
	
	
	//Apply button field
	@FindBy(xpath = "//div[@id='divpaxinfo']")
	public static WebElement Adult;

	//Apply button field
	@FindBy(xpath = "//select[@id='ctl00_mainContent_ddl_Adult']")
	public static WebElement adult_valve; 
	
	//currency button field
	@FindBy(xpath = "//select[@id='ctl00_mainContent_DropDownListCurrency']")
	public static WebElement Currency; 
	
	
	
	//Apply button field
	@FindBy(xpath = "//input[@id='ctl00_mainContent_btn_FindFlights']")
	public static WebElement Btn_Search; 
	
	//Apply button field
	@FindBy(xpath = "//a[@id='Login']")
	public static WebElement Nav_TC_Booking; 
		
	
		//=====================================================
		
	public void spicejet(){
		boolean status;
		
		status=launchApplication(appURL);
		logEvent(status, "Application launched Sucessfully", "Unable to launch the Application");
		wait(1);
		
		status = clickElement(Radio_Btn);
		logEvent(status, "Radio button selected", "Radio button not selected");
		wait(1);
	
		status = clickElement(from_icon);
		logEvent(status, "Radio button selected", "Radio button not selected");
		wait(2);
	
		
		status = setText(From_Place," Ahmedabad (AMD) ");
		From_Place.click();
		logEvent(status, "From From place  entered", "From place not entered");
		
        wait(5);
		
		status = clickElement(To_icon);
		logEvent(status, "Radio button selected", "Radio button not selected");
	
		status = setText(To_place," Delhi (DEL)");
		To_place.click();
		logEvent(status, "To place entered", "To place  not entered");
		

		status =  clickElement(From_date);
		logEvent(status, "from date entered", "from date not entered");

		status = clickElement(From_date_valve);
		logEvent(status, "from date valve selected", "from date valve not  selected");
		wait(1);
	
		status =  clickElement(To_date);
		logEvent(status, "To date entered", "To date not entered");
	
		status = clickElement(To_date_valve);
		logEvent(status, "To date valve selected", "To date valve not selected");
		wait(1);
	
		status =  clickElement(Adult);
		logEvent(status, "Audelts selected", "Audelts  not bselected");
		
		status =  selectByText(adult_valve,"1");
		logEvent(status, "Adult valve selected", "Adult valve not bselected");

		status =  selectByText(Currency,"INR");
		logEvent(status, "currency selected", "currency not selected");	
		
		status =  clickElement(Btn_Search);
		logEvent(status, "currency selected", "currency not selected");	
		
		status =  isExist(Nav_TC_Booking);
		logEvent(status, "currency selected", "currency not selected");	
	
	}
}
