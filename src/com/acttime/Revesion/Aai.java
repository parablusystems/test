package com.acttime.Revesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aai {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");

		WebDriver seldrv=new ChromeDriver();
		seldrv.manage().window().maximize();
		seldrv.get("https://www.facebook.com/");
		//seldrv.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("blkjgntm@gmail.com");
		
		
		//seldrv.findElement(By.xpath("//input[@name='pass']")).sendKeys("9550061702");
		//seldrv.findElement(By.xpath("//input[@value='Log In']")).click();
		
		WebElement day=seldrv.findElement(By.xpath("//select[@name='birthday_day']"));
		Select fb=new Select(day);
		Thread.sleep(2000);
		fb.selectByIndex(30);
		
		
		WebElement month=seldrv.findElement(By.xpath("//select[@name='birthday_month']"));
		Select fb1=new Select(month);
		Thread.sleep(2000);
		fb1.selectByVisibleText("Jun");
		
		WebElement year=seldrv.findElement(By.xpath("//select[@name='birthday_year']"));
		Select fb2=new Select(year);
		Thread.sleep(2000);
		fb2.selectByValue("1991");
		
		List<WebElement> dropdown=fb2.getOptions();
		for (WebElement element : dropdown) {
			
			System.out.println(element.getText());
		}
		
		Thread.sleep(2000);
		fb1.deselectByVisibleText("Jun");
		Thread.sleep(2000);
		fb2.deselectByValue("1991");
	}

}
