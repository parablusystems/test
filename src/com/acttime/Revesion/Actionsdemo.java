package com.acttime.Revesion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	
	Actions act=new Actions(driver);
	
	WebElement electronics=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	act.moveToElement(electronics).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Mobile Cases']")).click();
	WebElement mobile=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/a[2]"));
	
	String mw=driver.getWindowHandle();
	Set<String> newwindow=driver.getWindowHandles();
	for (String str : newwindow) {
		
		driver.switchTo().window(str);
	}
	
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung j7 prime new case cover");
 
	
}
}
