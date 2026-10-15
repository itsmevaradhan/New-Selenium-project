package org.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='button']")));
	    
		WebElement span = driver.findElement(By.xpath("//span[@role='button']"));
		span.click();
		WebElement s = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More'][1]"));
		s.click();
		s.sendKeys("bike keychain");
		driver.findElement(By.xpath("//button[@class='XFwMiH']")).click();
		
	
	}
}
