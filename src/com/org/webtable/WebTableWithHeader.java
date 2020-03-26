package com.org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//web TABLE WITH HEADER

public class WebTableWithHeader {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		WebElement thead = table.findElement(By.tagName("thead"));
	  	
		List<WebElement> th = thead.findElements(By.tagName("th"));
		
		for(WebElement x:th) {
			String text = x.getText();
			System.out.print(text + "\t");
		}
		System.out.println();
		
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> tRows = body.findElements(By.tagName("tr"));
		for(WebElement y :tRows) {
			List<WebElement> tDatas = y.findElements(By.tagName("td"));
			for(WebElement z :tDatas)
			{
				System.out.print(z.getText() + "  |  ");
			}
			System.out.println();
		}
      } 
	 
		 
	}


