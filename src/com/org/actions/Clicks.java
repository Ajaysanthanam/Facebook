package com.org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://artoftesting.com/sampleSiteForSelenium");
	
	WebElement rightClick = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	WebElement click = driver.findElement(By.xpath("//button[@id='idOfButton']"));
	WebElement doubleClick = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	WebElement text = driver.findElement(By.xpath("//input[@id='fname']"));
	
	Actions ac=new Actions(driver);
	
	ac.sendKeys(text, "HELLO");
	Thread.sleep(1000);
	
	ac.contextClick(rightClick).build().perform();
	Thread.sleep(1000);
	
	ac.click(click).build().perform();
	Thread.sleep(1000);
	
	ac.doubleClick(doubleClick).build().perform();
	
	Thread.sleep(5000);
	
	driver.quit();
	
}
}
