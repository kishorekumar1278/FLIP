package com.tm.ScreenPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class My_leave extends Weblibrary{
	
	//click on leave tab
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement leave_tab;
	
	//from date field
	@FindBy(xpath="//input[@id='calFromDate']")
	public static WebElement from_Date;
	
	//To date field
	@FindBy(xpath="//input[@id='calToDate']")
	public static WebElement To_Date;
	
	//toggle tip
	@FindBy(xpath="//a[@class='toggle tiptip']")
	public static WebElement toggle_tip;
	
	//toggle tip
	@FindBy(xpath="//a[@class='toggle tiptip activated']")
	public static WebElement toggle_tip_Activated;
			
	/*//leave statuses fied
	@FindBy(xpath="//input[@id='btnReset']")
	public static WebElement Reset_btn;*/



      public void nav_myleave(String s1,String s2){
	         
    boolean status;
	status=clickElement(leave_tab);
	logEvent(status,"able to click on my leave tab","unable to click on my leave tab");
	
	status=setTextandEscape(from_Date,s1);
	logEvent(status,"able to enter on from date","unable to enter on from date");
	
	status=setTextandEscape(To_Date,s2);
	logEvent(status,"able to enter on to date","unable to enter on to date");
	
	status=clickElement(leave_tab);
	logEvent(status,"able to click on my leave tab","unable to click on my leave tab");
	
	/*status=statuses(Leave_statuses);
	logEvent(status,"able to click on leave statuses","unable to click on leave statuses");*/
	
	status=clickElement(toggle_tip);
	logEvent(status,"able to click on toggle tip","unable to click on toggle tip");
	
	status=clickElement(toggle_tip_Activated);
	logEvent(status,"able to click on toggle tip Activated","unable to click on toggle tip Activated");

	
	/*status=clickElement(Reset_btn);
	logEvent(status,"by click on reset buttonBy default all status are selected","unable click on reset button all status are not selected");

	*/
}
    public static boolean statuses(){
		boolean status;
		try{
			status=true;
			List<WebElement> ele1=driver.findElements(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/input"));
			
			int n=ele1.size();
			System.out.println("statuses are:"+n);

			for(int i=1;i<=n;i++){
				
			WebElement ele2=driver.findElement(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/input["+i+"]"));
			ele2.click();
			
			List<WebElement> ele3=driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
			for(WebElement el: ele3)
			{
				String s1=el.getText();
				
				/*String s="[^A-Za-z0-9]";
				
				String s1=s.replaceAll(s,"").replace("()","");*/
				
				System.out.println(el.getText());
				String s=driver.findElement(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/label["+i+"]")).getText();
				if(s1.contains(s)){
					System.out.println("equal");
				}
					else
						System.out.println("not equal");
				}
				WebElement ele4=driver.findElement(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/input["+i+"]"));
				ele4.click();
			}
			
			}
		
			//check box get text
			/*
			//search_btn
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();		
			
			
			
		    //table status row
			List<WebElement> ele3=driver.findElements(By.xpath(" //table[@id='resultTable']/tbody/tr/td[6]/a"));
			
			int n1= ele3.size();
			for(int j=1;j<n1;j++){
				
			//table statuses
			WebElement ele4=driver.findElement(By.xpath(" //table[@id='resultTable']/tbody/tr/td[6]/a["+j+"]"));
			System.out.println(ele4.getText());
				
			String s=driver.findElement(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/label["+i+"]")).getText();	
			System.out.println("status names :"+s);
			if(ele3.contains(s)){
		
			System.out.println("same");
			}
			else{
			System.out.println("not same");
		
			}
			ele4.click();
			
			}
			driver.findElement(By.xpath("//input[@id='btnReset']")).click();		
			}
		    }*/
    catch(Exception e){
	
			status=false;
			}
			return status;

    }
}

	
    
    





