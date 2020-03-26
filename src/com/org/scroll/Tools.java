package com.org.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/");
	
	Thread.sleep(2000);
	
	
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(3000);
	 
	 js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	 Thread.sleep(5000);
	 
	 driver.quit();
}
}
