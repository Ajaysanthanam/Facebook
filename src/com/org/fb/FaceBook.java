package com.org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.Facebook.com/");
	
	WebElement firstName = driver.findElement(By.name("firstname"));
	firstName.sendKeys("ajay");
	Thread.sleep(1000);
	
	WebElement lastName = driver.findElement(By.name("lastname"));
	lastName.sendKeys("Santhanam");
	Thread.sleep(1000);
	
	WebElement mail = driver.findElement(By.name("reg_email__"));
	mail.sendKeys("9986372845");
	Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.name("reg_passwd__"));
	pass.sendKeys("fghjggjhasd12");
	Thread.sleep(1000);
	
	WebElement date = driver.findElement(By.id("day"));
	date.sendKeys("1");
	Thread.sleep(1000);
	
	WebElement month = driver.findElement(By.id("month"));
	month.sendKeys("Nov");
	Thread.sleep(1000);
	
	WebElement year = driver.findElement(By.id("year"));
	year.sendKeys("1997");
	Thread.sleep(1000);
	
	WebElement gender = driver.findElement(By.id("u_0_a"));
	gender.click();
	Thread.sleep(1000);
	
	WebElement login = driver.findElement(By.name("websubmit"));
	login.click();
	
Thread.sleep(10000);

driver.quit();
}
}
