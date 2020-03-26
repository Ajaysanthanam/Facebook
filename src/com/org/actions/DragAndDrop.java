package com.org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement money = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement debit1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement debit2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement credit1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement credit2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDrop(money, debit2).build().perform();
		ac.dragAndDrop(money, credit2).build().perform();
		
		ac.dragAndDrop(sales, credit1).build().perform();
		ac.dragAndDrop(bank, debit1).build().perform();
		
		WebElement print = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		String text = print.getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
				
		
		
		
	}

}
