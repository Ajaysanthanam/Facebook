package com.org.hotelxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelXPath {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactin.com/HotelApp/index.php");
	
	WebElement userName = driver.findElement(By.xpath("//input [@name='username']"));
	userName.sendKeys("ajaysanthanam");
	Thread.sleep(1000);
	
	String attribute = userName.getAttribute("value");
	System.out.println("UserName"+ attribute);

	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("Ikomasteelseries1");
	Thread.sleep(1000);
	
	String attribute2 = password.getAttribute("value");
	System.out.println("password" + attribute2);
	
	
	WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	login.click();
	Thread.sleep(1000);
	
	WebElement place = driver.findElement(By.xpath("//option[@value='New York']"));
	place.click();
	Thread.sleep(1000);
	
	WebElement hotel = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
	hotel.click();
	Thread.sleep(1000);
	
	WebElement room = driver.findElement(By.xpath("//option[@value='Double']"));
	room.click();
	Thread.sleep(1000);
	
	WebElement numOfRooms = driver.findElement(By.xpath("//option[@value='6']"));
	numOfRooms.click();
	Thread.sleep(1000);
	
	WebElement checkIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	checkIn.clear();
	checkIn.sendKeys("15/03/2020");
	Thread.sleep(1000);
	
	WebElement checkOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	checkOut.clear();
	checkOut.sendKeys("20/03/2020");
	Thread.sleep(1000);
	
	WebElement numOfAdults = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
	numOfAdults.click();
	Thread.sleep(1000);
	
	WebElement numOfChildren = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
	numOfChildren.click();
	Thread.sleep(1000);
	
	WebElement search = driver.findElement(By.xpath("//input [@name='Submit']"));
	search.click();
	Thread.sleep(1000);
	
	WebElement select = driver.findElement(By.xpath("//input[contains (@type,'radio')]"));
	select.click();
	Thread.sleep(1000);
	
	
	WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
	conti.click();
	Thread.sleep(1000);
	
	
	WebElement firstName = driver.findElement(By.xpath("//input[contains (@name,'first_name')]"));
	boolean displayed = firstName.isDisplayed();
	boolean enabled = firstName.isEnabled();
	System.out.println("first Name"+ displayed);
	System.out.println("first Name"+ enabled);
	
	if(displayed && enabled) 
	{
		firstName.sendKeys("Ajay");
	}
	Thread.sleep(1000);
	
	WebElement lastName = driver.findElement(By.xpath("//input[contains(@name,'last_name')]"));
	if(lastName.isDisplayed()&&lastName.isEnabled())
	{
    lastName.sendKeys("Santhanam");
	}
	Thread.sleep(1000);
	
	WebElement address = driver.findElement(By.xpath("//textarea[contains(@name,'address')]"));
	if(address.isDisplayed() && address.isEnabled() ) {
		address.sendKeys("Address");
	}
	Thread.sleep(1000);
	
	WebElement creditCard = driver.findElement(By.xpath("//input[contains(@name,'cc_num')]"));
	creditCard.sendKeys("1234567890123456");
	Thread.sleep(1000);
	
	WebElement cardType = driver.findElement(By.xpath("//option[@value='VISA']"));
	cardType.click();
	Thread.sleep(1000);
	
	WebElement expMonth = driver.findElement(By.xpath("//option[@value='11']"));
	expMonth.click();
	Thread.sleep(1000);
	
	WebElement expYear = driver.findElement(By.xpath("//option[@value='2021']"));
	expYear.click();
	Thread.sleep(1000);
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("123");
	Thread.sleep(1000);
	
	WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
	book.click();
	Thread.sleep(10000);
	
	
	driver.quit();
}
}
