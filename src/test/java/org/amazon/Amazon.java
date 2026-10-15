package org.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_4uhrie6xi7_e&adgrpid=155259814713&hvpone=&hvptwo=&hvadid=825671333426&hvpos=&hvnetw=g&hvrand=12908405085172081309&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061928&hvtargid=kwd-776851800707&hydadcr=5619_2518703&mcid=11c0c69d7e1c3f8b89596be6ab98a91e&hvocijid=12908405085172081309--&hvexpln=nav&gad_source=1");
		driver.manage().window().maximize();
		WebElement ama = driver.findElement(By.id("twotabsearchtextbox"));
		ama.click();
		ama.sendKeys("water bottle");
		
//		Thread.sleep(1000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button")));
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		 	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Borosil 800ml Duo Sport Stainless Steel Water Bottle | ISI Certified…')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Borosil 800ml Duo Sport Stainless Steel Water Bottle | ISI Certified…')]")).click();
		
	}
}
