package com.org.handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	String fid = driver.getWindowHandle();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("mobiles", Keys.ENTER);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
	Thread.sleep(5000);
	
	Set<String> pid = driver.getWindowHandles();
	
	for (String x : pid) {
		driver.switchTo().window(x);
		String title = driver.getTitle();
		if(title.contains("Samsung"))
		{
			driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
			
		}
		else if(title.contains("OPPO"))
		{
			driver.findElement(By.id("add-to-cart-button")).click();
		}
		
	}
	
      Thread.sleep(10000);
      
      driver.quit();
}
}
