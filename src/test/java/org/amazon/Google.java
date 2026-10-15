package org.amazon;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
		element.click();
		element.sendKeys("https://www.flipkart.com/");
		WebElement element2 = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		element2.click();
	}
}
