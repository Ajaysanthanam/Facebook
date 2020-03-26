package com.org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "F:\\Selenium workspace\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactin.com/HotelApp/index.php");
	
	
	WebElement name = driver.findElement(By.name("username"));
	name.sendKeys("ajaysanthanam");
	Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("Ikomasteelseries1");
	Thread.sleep(1000);
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	Thread.sleep(1000);
	
	WebElement location = driver.findElement(By.name("location"));
	location.sendKeys("New York");
	Thread.sleep(1000);
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	hotel.sendKeys("Hotel Creek");
	Thread.sleep(1000);
	
	WebElement roomType = driver.findElement(By.id("room_type"));
	roomType.sendKeys("double");
	Thread.sleep(1000);
	
	WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
	numberOfRooms.sendKeys("6");
	Thread.sleep(1000);
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.clear();
	checkIn.sendKeys("15/03/2020");
    Thread.sleep(1000);

    WebElement checkOut = driver.findElement(By.id("datepick_out"));
    checkOut.clear();
    checkOut.sendKeys("20/03/2020");
    Thread.sleep(1000);
    
    WebElement numOfAdults = driver.findElement(By.name("adult_room"));
    numOfAdults.sendKeys("2");
    Thread.sleep(1000);
    
    WebElement numOfChildren = driver.findElement(By.name("child_room"));
    numOfChildren.sendKeys("2");
    Thread.sleep(1000);
    
    WebElement enter = driver.findElement(By.name("Submit"));
    enter.click();
    Thread.sleep(1000);
    
    WebElement select = driver.findElement(By.name("radiobutton_0"));
    select.click();
    Thread.sleep(1000);
    
    WebElement cont = driver.findElement(By.name("continue"));
    cont.click();
    Thread.sleep(1000);
    

    WebElement firstName = driver.findElement(By.name("first_name"));
    firstName.sendKeys("Ajay");
    Thread.sleep(1000);
    
    WebElement lastName = driver.findElement(By.name("last_name"));
    lastName.sendKeys("Santhanam");
    Thread.sleep(1000);
    
    WebElement address = driver.findElement(By.id("address"));
    address.sendKeys("Address");
    Thread.sleep(1000);
    
    WebElement creditCard = driver.findElement(By.id("cc_num"));
    creditCard.sendKeys("1234567890123456");
    Thread.sleep(1000);
    
    WebElement cardType = driver.findElement(By.id("cc_type"));
    cardType.sendKeys("VISA");
    Thread.sleep(1000);
    
    WebElement monthExp = driver.findElement(By.id("cc_exp_month"));
    monthExp.sendKeys("November");
    Thread.sleep(1000);
    
    WebElement dateExp = driver.findElement(By.id("cc_exp_year"));
    dateExp.sendKeys("2021");
    Thread.sleep(1000);
    
    WebElement cvv = driver.findElement(By.id("cc_cvv"));
    cvv.sendKeys("123");
    Thread.sleep(1000);
    
    WebElement book = driver.findElement(By.name("book_now"));
    book.click();
    Thread.sleep(10000);
    
    driver.quit();
    		
    
}
}
