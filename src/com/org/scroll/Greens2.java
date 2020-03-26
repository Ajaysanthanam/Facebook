package com.org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens2 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com/");
	
   WebElement bottomValue = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("arguments[0].scrollIntoView(true)", bottomValue);
   String below = bottomValue.getText();
   System.out.println(below);
   
  
   Thread.sleep(5000);

   driver.quit();
}
}
