package com.acttime.Revesion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoselenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclips\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver selenm=new ChromeDriver();
		selenm.manage().window().maximize();
		selenm.get("https:\\www.gmail.com");
		selenm.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		selenm.findElement(By.id("identifierId")).sendKeys("bingilavankumar");
		selenm.findElement(By.className("RveJvd")).click();
		
		
		selenm.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("9550061702");
		selenm.findElement(By.className("RveJvd")).click();
		
		
		selenm.findElement(By.xpath("//*[@id=\":ko\"]/div/div")).click();
		
	}

}
