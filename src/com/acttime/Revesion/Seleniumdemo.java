package com.acttime.Revesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https:\\www.facebook.com");
		
		
		ref.findElement(By.id("email")).sendKeys("blkjgntm@gmail.com");
		ref.findElement(By.id("pass")).sendKeys("9550061702");
		
		
		
		
		WebElement image=ref.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/img"));
		WebElement display=ref.findElement(By.id("u_0_2"));
		if(image.isDisplayed()) 
		display.click();
		
	}

}
