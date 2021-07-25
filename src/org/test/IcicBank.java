package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcicBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  
	  WebElement txtboxName = driver.findElement(By.id("DUMMY1"));
	  txtboxName.sendKeys("Vinu");
	  
	  WebElement txtboxpassword = driver.findElement(By.id("DUMMY23"));
	  txtboxpassword.sendKeys("Icicibanl@123");
}
}
