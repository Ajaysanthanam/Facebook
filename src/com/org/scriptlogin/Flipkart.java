package com.org.scriptlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	
	WebElement x = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",x);
	Thread.sleep(3000);
	
	WebElement y = driver.findElement(By.xpath("//a[@class='_3Ep39l']"));
	js.executeScript("arguments[0].click()",y);
	Thread.sleep(3000);
	
	WebElement email = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	
	js.executeScript("arguments[0].setAttribute('value','9962614876')", email);
	Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	js.executeScript("arguments[0].setAttribute('value','dkhadshja12')", pass);
	Thread.sleep(1000);
	
	WebElement login = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	js.executeScript("arguments[0].click()",login);
	Thread.sleep(1000);
}
}
