package com.acttime.Revesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args)throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");

	WebDriver xpdrv=new ChromeDriver();
	
	xpdrv.manage().window().maximize();
	xpdrv.get("http://desktop-bbliq8g/login.do");
	
	String gt=xpdrv.findElement(By.xpath("//td[@class='header']")).getText();
	System.out.println(gt);
	WebElement img=xpdrv.findElement(By.xpath("//table[@class='warning']/tbody//td/img"));
	boolean image=img.isDisplayed();
	
		System.out.println(image);
	//xpdrv.findElement(By.xpath("//a[@target='_blank']")).click();
	
	//xpdrv.findElement(By.xpath("//a[@onclick='openLicensePopup();']")).click();
	
	xpdrv.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	xpdrv.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	
	WebElement rb=xpdrv.findElement(By.xpath("//input[@type='checkbox']"));
	if (!rb.isSelected()) {
		rb.click();
	}
	
	xpdrv.findElement(By.id("loginButton")).click();
	
	///xpdrv.findElement(By.linkText("Create new tasks")).click();
	Thread.sleep(3000);
	
	xpdrv.findElement(By.xpath("//table[@class='navTable']/tbody/tr/td[9]/a//img")).click();
	
	xpdrv.findElement(By.xpath("//input[@value='Create New User']")).click();
	
	xpdrv.findElement(By.className("logout")).click();
	
	}

}
