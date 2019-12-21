package com.tm.Libraries;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.tm.BaseClass.BaseClass;
import com.tm.reporting.Reports;

public class Weblibrary extends BaseClass {

	public static boolean launchApplication(String URL) {

		boolean status;
		try {
			driver.get(URL);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;
	}

	/*
	 * Method Name : setText
	 * 
	 * Description : This method is used to send the data to input text field
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */
	


		public static boolean setText(WebElement element, String value) {
		boolean status;

		try {			
			element.click();
			element.clear();
			element.sendKeys(value);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : setTextandEscape
	 * 
	 * Description : This method is used to send the data to input text field
	 * and Click on Escape button
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static boolean setTextandEscape(WebElement element, String value) {
		boolean status;

		try {
			element.click();
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.ESCAPE);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : logEvent
	 * 
	 * Description : This method is used to print the log status and take the
	 * screenshots
	 * 
	 * Input::boolean status, PassDescription , FailDescription
	 * 
	 * Output: Log status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static void logEvent(boolean status, String PassDescription, String FailDescription) {

		if (status) {
			Reports.logEvent("Pass", PassDescription);
			System.out.println("		<<>> " + PassDescription + " <<>>");

		} else {
			Reports.logEvent("Fail", FailDescription);
			System.out.println("		<<>> " + FailDescription + " <<>>");

		}

	}

	/*
	 * Method Name : clickElement
	 * 
	 * Description : This method is used to Click the Element
	 * 
	 * Input:: WebElement
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */
	public static boolean clickElement(WebElement element) {

		boolean status = false;

		try {
			/*List<WebElement> ele1=driver.findElements(By.id("//table[@id='dependent_list']/tbody/tr[1]/td"));
			
			for(int i=1;i<=ele1.size();i++){
				WebElement ele2=driver.findElement(By.id("//table[@id='dependent_list']/tbody/tr["+i+"]/td"));
			*/
			element.click();
			status = true;
			
		}
		catch (Exception e) 
		{
			status = false;
		}
		return status;
		
}
	
	
	/////////////////////////////
	public static boolean clickElement1(WebElement element,String str) {

		boolean status = false;

		try {
			/*List<WebElement> ele1=driver.findElements(By.id("//table[@id='dependent_list']/tbody/tr[1]/td"));
			
			for(int i=1;i<=ele1.size();i++){
				WebElement ele2=driver.findElement(By.id("//table[@id='dependent_list']/tbody/tr["+i+"]/td"));
			*/
			element.click();
			status = true;
			
		}
		catch (Exception e) 
		{
			status = false;
		}
		return status;
		
}
	//////////////////////
	public static boolean moveToElement(WebElement element) {

		boolean status;
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}
	
	public static boolean isExist(WebElement element) {

		boolean status;
		try {
			element.isDisplayed();
			System.out.println(element.getText());
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}	
	//////////////////////
	public static boolean Displayed(WebElement element) {
		boolean status;
		try {
			WebElement ele1=driver.findElement(By.xpath("//div[2][@class='modal-body']"));
			element.isDisplayed();
			System.out.println(ele1.getText());
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;
	}
		////////////////////////////////
	
	
	public static boolean footer(WebElement element) {
		boolean status;
		try {
			WebElement ele1=driver.findElement(By.xpath("//div[@id='footer']"));
			element.isDisplayed();
			System.out.println(ele1.getText());
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;
	}
	public static boolean selectByText(WebElement element, String Selected_value) {

		boolean status;
		
		try {
			Select sc=new Select(element);
			sc.selectByVisibleText(Selected_value);
			
			status=true;
		}
		
		catch (Exception e) 
		{
			status = false;
		}
		
		return status;
	}
	///////////////////////
	public static boolean TableReusable(WebElement element) {

		boolean status;

		try {
			
	//String[] str={"Date","Employee Name"	,"Leave Type","Leave Balance (Days)"	,"Number of Days",	"Status	" ,"Comments","Actions"};
			List<WebElement> ele=driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th/span"));
			int n=ele.size();
			System.out.println("headers are :"+n);
			for(int i=1;i<=n;i++){
			
				WebElement ele1=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th/span["+i+"]"));
		      String str2=ele1.getText();
		      System.out.println(str2);
		      
		      
		      
		   
			}
		      /*System.out.println(str2);
		      if(str.equals(str2)){
		    	  System.out.println("same");
		      }
		      else
		    	  System.out.println("not same");*/
		      
			
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;
	}
	
	
	public static void wait(int seconds)
	{
		try
		{
			Thread.sleep(seconds*1000);
		}
		catch(Exception e)
		{
			
		}
	}
		///////////////////////////////
		
		public static boolean deleteDependents(WebElement element){

			boolean status = true;

			try {
				List<WebElement> ele1=driver.findElements(By.id("//table[@id='dependent_list']/tbody/tr[1]/td"));
				for(int i=1;i<=ele1.size();i++){
			WebElement ele2=driver.findElement(By.id("//table[@id='dependent_list']/tbody/tr["+i+"]/td"));
			ele2.click();
			
			/*String str=ele2.getText();
			
			/*if(name.equals(str)){
			
				System.out.println(str);
					}
			else  {
			WebElement ele3=driver.findElement(By.id("//input[@id='delDependentBtn']"));
				ele3.click();*/
			
				}
			}
				
			catch (Exception e) 
			{
				status = false;
			}

			return status;
		}
		
		}