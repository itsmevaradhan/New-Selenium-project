package org.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataEntry_Form 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("varadhan");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter EMail']"));
		email.sendKeys("varadha200198@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//input[@placeholder='Enter Phone']"));
		number.sendKeys("9842452571");
		
		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("Dno.845 philomina nagar 3rd street thanjavur");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='male']"));
		male.click();
		
		WebElement sunday = driver.findElement(By.xpath("//input[@value='sunday']"));
		sunday.click();
		
		
		WebElement country = driver.findElement(By.id("country"));
		country.click();
		
		WebElement ind = driver.findElement(By.xpath("//option[@value='india']"));
		ind.click();
		
		WebElement wednesday = driver.findElement(By.id("wednesday"));
		wednesday.click();
		
//		Thread.sleep(1000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		;
		
		WebElement el = driver.findElement(By.xpath("//tr[td[text()='Smartphone']]//input[@type='checkbox']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", el);
		
		
		 
		
		WebElement sm = driver.findElement(By.xpath("//tr[td[text()='Smartphone']]//input[@type='checkbox']"));
		sm.click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[td[text()='Smartphone']]//input[@type='checkbox']")));
	    
	    Thread.sleep(4000);
	    WebElement nxP = driver.findElement(By.xpath("//a[@class='active']"));
		nxP.click();
		
		WebElement tv = driver.findElement(By.xpath("//tr[td[text()='Television']]//input[@type='checkbox']"));
	    tv.click();
		
		
	}
}
