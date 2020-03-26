package com.org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement mouseOver = driver.findElement(By.xpath("//a[@class='activeLink']"));
		WebElement mouseOver2 = driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(mouseOver).build().perform();
		Thread.sleep(1000);
		
		ac.moveToElement(mouseOver2).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
