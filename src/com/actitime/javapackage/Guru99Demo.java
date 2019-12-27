package com.actitime.javapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Guru99Demo {
	WebDriver driver;
	
	
  @Test
  public void Demo() throws InterruptedException {
	driver=new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr163944");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YququgY");  
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();
  
  }
}
