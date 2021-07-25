package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		WebElement txtboxName = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		txtboxName.sendKeys("vinu.priya");
		WebElement txtboxpass = driver.findElement(By.name("password"));
		txtboxpass.sendKeys("vinu@123");
		
		
	}

}
