package com.acttime.Revesion;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Windowhandle {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\eclips\\Javaproject\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://desktop-bbliq8g/login.do");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
		Thread.sleep(2000);
		WebElement rbtn=driver.findElement(By.xpath("//input[@name='remember']"));
		if (!rbtn.isSelected()) {
			rbtn.click();
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new tasks")).click();
		
		//window handling for next window
		Set<String> allwindow=driver.getWindowHandles();
		for (String antr : allwindow) {
			driver.switchTo().window(antr);			
		}
		
		Thread.sleep(4000);
		
		//select for dropdown box
		WebElement customer=driver.findElement(By.xpath("//select[@name='customerId']"));
		Select cstmrsel=new Select(customer);
		
		Thread.sleep(2000);
		cstmrsel.selectByIndex(2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("this is our new project");
		
		Thread.sleep(3000);
		
		// to click on cancel button
		driver.findElement(By.xpath("//input[@onclick='cancelTasksCreation();']")).click();
		
		//popup handling
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		
		
		
	}

}
