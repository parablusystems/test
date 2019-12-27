package com.acttime.Revesion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Revision {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclips\\\\Javaproject\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.igoogleportal.com/");
		Thread.sleep(2000);
		
		WebElement frameh=driver.findElement(By.xpath("//iframe[@id='__gadget_gadget-site-1-7'"));
		
		driver.switchTo().frame(frameh);
		
		//driver.switchTo().frame(7);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='button block action']")).click();
		
		driver.switchTo().defaultContent();
		String mainwindow=driver.getWindowHandle();
		Set<String> nextwindow=driver.getWindowHandles();
		driver.findElement(By.xpath(""));
		for (String nxt : nextwindow) {
			
		driver.switchTo().window(nxt);
		}
		
		
	}
	
}
