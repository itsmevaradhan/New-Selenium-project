package GreenKart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VegMarket 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize(); 
		
		
		//have to buy 2 kg onion 1kg beans watermelon 3 kg mushroom 5kg
		
		WebElement mushroom = driver.findElement(By.xpath("//h4[text()='Mushroom - 1 Kg']/../div[@class='stepper-input']//a[text()='+']"));//
		mushroom.click();
		mushroom.click();
		mushroom.click();
		mushroom.click();
		driver.findElement(By.xpath("//h4[text()='Mushroom - 1 Kg']/../div[@class='product-action']//button")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//h4[text()='Onion - 1 Kg']/../div[@class='stepper-input']//a[text()='+']")).click();
		driver.findElement(By.xpath("//h4[text()='Onion - 1 Kg']/../div[@class='product-action']//button")).click();
		Thread.sleep(2000);
		
		WebElement watermelon = driver.findElement(By.xpath("//h4[text()='Water Melon - 1 Kg']/../div[@class='stepper-input']//a[text()='+']"));
		watermelon.click();
		watermelon.click();
		driver.findElement(By.xpath("//h4[text()='Water Melon - 1 Kg']/../div[@class='product-action']//button")).click();
		Thread.sleep(3000);
				 
		driver.findElement(By.className("cart-icon")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(2000);

//		Select s=new Select(driver.findElement(By.xpath("//option[text()='Select']")));
//		s.selectByVisibleText("India");
		
		
		driver.findElement(By.xpath("//option[@value='India']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(4000);
		
	}
}
