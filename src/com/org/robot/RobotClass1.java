package com.org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RobotClass1 {
public static void main(String[] args) throws AWTException, InterruptedException {

	System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
    Robot r =new Robot();
    
    driver.findElement(By.name("q")).click();
    
    //TO TYPE
    
    r.keyPress(KeyEvent.VK_D);
    r.keyRelease(KeyEvent.VK_D);
    r.keyPress(KeyEvent.VK_U);
    r.keyRelease(KeyEvent.VK_U);
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_C);
    r.keyPress(KeyEvent.VK_K);
    r.keyRelease(KeyEvent.VK_K);
    
    //TO MOVE
    
    WebElement image = driver.findElement(By.xpath("(//a[@class='gb_g'])[2]"));
    
    Actions ac =new Actions(driver);
    		
    ac.contextClick(image).build().perform();
    
    Thread.sleep(1000);
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(10000);
    
    driver.quit();
}
}