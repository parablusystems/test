package com.actitime.javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicetestng {
	WebDriver driver;
	@BeforeTest
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		}
	
	@BeforeClass
	
	public void loginpage() {
		Actions act=new Actions(driver);
		
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
		
		act.moveToElement(signin).perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		
		
	}
	@BeforeMethod
	
	public void login() {
		driver.findElement(By.id("ap_email")).sendKeys("blkjgntm@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void logout() {	
		
		
	}
	
	@AfterClass
	
	public void close() {
		
	driver.quit();	
	}
  @Test
  public void createuser() {
	  
	  
  }
}
