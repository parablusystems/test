package com.acttime.Revesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwebdriver {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\Javaproject\\chromedriver.exe");
		WebDriver drvref=new ChromeDriver();
		drvref.manage().window().maximize();
		drvref.get("http://desktop-bbliq8g/login.do");
		
		
		
		
		
		
		
		
		drvref.findElement(By.name("username")).sendKeys("admin");
		drvref.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement radiobutton=drvref.findElement(By.id("keepLoggedInCheckBox"));
		if (!radiobutton.isSelected()) {
			radiobutton.click();
			
		}
		drvref.findElement(By.id("loginButton")).click();
		
		//drvref.findElement(By.linkText("Create new tasks")).click();
		
		
		//WebElement ca=drvref.findElement(By.className("pagetitle"));
		
			//System.out.println(ca.getText());
		
		
		
		Thread.sleep(3000);
		List<WebElement> tagnames=drvref.findElements(By.tagName("a"));
		for (WebElement element : tagnames) {
			System.out.println(element.getText());
		}
		
		Thread.sleep(2000);
		
		WebElement select=drvref.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[9]/a/img"));
		
		
			select.click();

		drvref.findElement(By.xpath("//*[@id=\"container\"]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input")).click();
		
		
		
		
		
	}

}
