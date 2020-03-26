package com.org.scriptlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactin.com/HotelApp/index.php");
	
	
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','ajaysanthanam')", userName);
	Thread.sleep(1000);
	


	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	
	js.executeScript("arguments[0].setAttribute('value','Ikomasteelseries1')", password);
	Thread.sleep(1000);
	
	WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	js.executeScript("arguments[0].click()",login);
	Thread.sleep(10000);
	
	driver.quit();
}
}
