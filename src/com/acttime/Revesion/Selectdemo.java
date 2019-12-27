package com.acttime.Revesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");

		WebDriver seldrv=new ChromeDriver();
		seldrv.manage().window().maximize();
		seldrv.get("http://desktop-bbliq8g/login.do");
		WebElement display=seldrv.findElement(By.xpath("//table[@class='loginBox']/tbody/tr[3]/td[2]//table//tr//div/img"));
		Thread.sleep(2000);
		
			seldrv.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			seldrv.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");	
		Thread.sleep(2000);
		WebElement rbtn=seldrv.findElement(By.xpath("//input[@name='remember']"));
		if (!rbtn.isSelected()) {
			rbtn.click();
			seldrv.findElement(By.xpath("//a[@id='loginButton']")).click();
		}
		
		seldrv.findElement(By.xpath("//td[5][@class='navItem relative']/a//img")).click();
		seldrv.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
	WebElement customer=seldrv.findElement(By.xpath("//select[@name='customerId']"));
	Select se=new Select(customer);
	Thread.sleep(2000);
	se.selectByIndex(1);
	
	List<WebElement> dropdown=se.getOptions();
	for (WebElement element : dropdown) {
		System.out.println(element.getText());
		
		}
	Thread.sleep(5000);
	
	seldrv.navigate().back();
	
	
	
	seldrv.findElement(By.xpath("//td[9][@class='navItem relative']/a//img")).click();
	
	
	
	}
	
	

}
