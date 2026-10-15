package org.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base
{
	public static WebDriver driver ;/// this is main driver

	
	public static void chromeDriver() 
	{
		driver= new ChromeDriver();
	}
	
	public static  void url(String url) 
	{
		driver.get(url);
	}

	public static void maximize() 
	{
		driver.manage().window().maximize();
	}

	public static void implicitWait(int Duration_In_Seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Duration_In_Seconds));
	}
	
	public static void sendkeys(By locator , String value)
	{
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void explicitWait(By locator, int Duration_Of_seconds) 
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Duration_Of_seconds));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement xpath(By path) 
	{
		WebElement element = driver.findElement(path);
		return element;
	}
	public static void xpathClick(By path) 
	{
			xpath(path).click();
	}
	public static WebElement scroll(By path) 
	{
		WebElement element = driver.findElement(path);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		return element;
	}
	
	
}
