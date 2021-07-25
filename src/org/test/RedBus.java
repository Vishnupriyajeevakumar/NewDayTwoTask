package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
String title = driver.getTitle();
System.out.println(title);
	
String url = driver.getCurrentUrl();
System.out.println(url);
	
WebElement txtBoxName = driver.findElement(By.id("src"));
txtBoxName.sendKeys("chennai");
	
WebElement txtBox = driver.findElement(By.id("dest"));
 txtBox.sendKeys("madurai");
	
	
	}
}
