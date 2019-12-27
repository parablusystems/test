package com.acttime.Revesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seldemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");

		WebDriver seldrv=new ChromeDriver();
		seldrv.manage().window().maximize();
		seldrv.get("http://www.uitestpractice.com/Students/Select");
		WebElement multiple=seldrv.findElement(By.id("countriesMultiple"));
		Select fb=new Select(multiple);
		fb.selectByIndex(0);
		fb.selectByValue("china");
		fb.selectByVisibleText("United states of America");
		
		List<WebElement> element=fb.getAllSelectedOptions();
		for (WebElement selected : element) {
			
			System.out.println(selected.getText());
			
		}
		WebElement element1=fb.getFirstSelectedOption();
		System.out.println(element1.getText());
		
		Thread.sleep(2000);
		fb.deselectAll();
		
		Thread.sleep(10000);
		seldrv.quit();
		
	}

}
