package com.org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableParticularValue {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
	
	List<WebElement> tRows = table.findElements(By.tagName("tr"));
  	for(int i=1; i<tRows.size(); i++)
    {
    List<WebElement> tDatas = tRows.get(i).findElements(By.tagName("td"));
    for(int j=0; j<4; j++) {
    
    if(tDatas.get(j).equals("					Jet Airways					"))	
    {
    	System.out.println(driver.findElement(By.xpath("//table//tr["+(i+1)+"]//td[3]")).getText());
    }
    else
    {
    	System.out.println("NOOOOO");
    }
   }
    }}}


