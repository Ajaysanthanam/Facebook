package com.org.scriptlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('Value','AJAY@gamil.com')", email);
	Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	js.executeScript("arguments[0].setAttribute('Value','dkhadshja12')", pass);
	Thread.sleep(1000);
	
	WebElement login = driver.findElement(By.xpath("//input[@id='u_0_4']"));
	js.executeScript("arguments[0].click()",login);
	Thread.sleep(1000);
	
	driver.quit();
}
}
