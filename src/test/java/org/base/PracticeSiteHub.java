package org.base;

import org.openqa.selenium.By;
public class PracticeSiteHub extends Base
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		chromeDriver();
		url("https://selectorshub.com/xpath-practice-page/");
		maximize();

		sendkeys(By.name("email"), "varadhan@1234");//name
		sendkeys(By.className("form-control"), "varadhan foundation");//classname
		sendkeys(By.xpath("//input[@title='Password']"), "varadhan123");//xpath of title
		sendkeys(By.xpath("//input[@type='number'][1]"), "998289992");//xpathe type
		sendkeys(By.xpath("//label[text()='Country']"), "japan");
		sendkeys(By.xpath("//input[@title='Enter your first crush name']"), "make that right");
		explicitWait(By.xpath("//tr[@class='row-2']//input[@type='checkbox']"), 10);
		
		scroll(By.xpath("//h6[text()='iframe and table']"));		
		Thread.sleep(3000);
		xpathClick(By.xpath("//tr[@class='row-2']//input[@type='checkbox']"));
	}
}

