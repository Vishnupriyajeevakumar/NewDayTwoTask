package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement txtbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtbox.sendKeys("vinu");
		WebElement txtboxName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtboxName.sendKeys("priya");
		WebElement txtboxAdd = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	    txtboxAdd.sendKeys("Door no 12 garden st,chennai");
	    WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
	    txtemail.sendKeys("abcd1703@gmail.com");
	    WebElement txtphno = driver.findElement(By.xpath("//input[@type='tel']"));
	    txtphno.sendKeys("9876543212");
	    WebElement txtpassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	    txtpassword.sendKeys("priya@123");
	    WebElement txtscndpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	    txtscndpassword.sendKeys("priya@123");
	    
	    
	    
		
		
		
	}

}
