package com.org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	WebElement bottomValue = driver.findElement(By.xpath("//span[text()='Up to 60% off headphones & speakers | Amazon Brands & more']"));
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView(true)", bottomValue);
	   String below = bottomValue.getText();
	   System.out.println(below);
	   Thread.sleep(2000);
	   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	   Thread.sleep(1000);
	   
	   WebElement topValue = driver.findElement(By.xpath("//h2[text()='Recharges, bills, travel tickets & more']"));
	   
	   String above = topValue.getText();
	   System.out.println(above);
	   Thread.sleep(1000);
	   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	   Thread.sleep(5000);

	   driver.quit();
	
}
}
