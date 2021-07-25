package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   WebElement txtboxname = driver.findElement(By.id("location"));
	   txtboxname.sendKeys("Chennai");
	}

}
