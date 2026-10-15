package org.base;

import org.openqa.selenium.By;

public class Sample extends Base
{
	public static void main(String[] args) 
	{
		chromeDriver();
		url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		maximize();
		implicitWait(3);
		sendkeys(By.name("username"), "Admin");
		sendkeys(By.name("password"), "admin");
		xpathClick(By.xpath("//button[text()=' Login ']"));
		implicitWait(10);
		
		if (xpath(By.xpath("//p[text()='Invalid credentials']")).isDisplayed())
		{
		    xpathClick(By.xpath("//p[text()='Forgot your password? ']"));
		}
		else
		{
		    System.out.println("its not working");
		}
		
		
		
//		chromeDriver();
//		url("https://www.facebook.com/");
//		maximize();
//		implicitWait(5);
//		sendkeys(By.name("email"),"varadhan");
//		
//		sendkeys(By.name("pass"), "73893");
//		xpathClick("//span[text()='Log in']");
//
//		if(xpath("//span[text()='The password you've entered is incorrect.']").isDisplayed()
//				||(xpath("//span[text()='The email address or mobile number you entered isn't connected to an account. ']")).isDisplayed()) 
//		{
//			xpathClick("//span[text()='Forgotten password?']");
//
//		}
		
		
	
	}
}
