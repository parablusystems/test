package com.acttime.Revesion;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelnm {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\eclips\\\\\\\\Javaproject\\\\\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://desktop-bbliq8g/login.do");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	WebElement rbutton= driver.findElement(By.xpath("//input[@name='remember']"));
	
	if (!rbutton.isSelected()) {
		rbutton.click();
		
	}
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Create new tasks")).click();
	String mainWindow=driver.getWindowHandle();
	Set<String> newwindow=driver.getWindowHandles();
	for (String shift : newwindow) {
		driver.switchTo().window(shift);
		
	}
	
	WebElement dropdown=driver.findElement(By.xpath("//select[@name='customerId']"));
	Select customer=new Select(dropdown);
	customer.selectByIndex(2);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("this is our new project");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//input[@onclick='cancelTasksCreation();']")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Alert alt= driver.switchTo().alert();
	alt.accept();
		driver.switchTo().window(mainWindow);
	
	
	driver.findElement(By.xpath("//a[@class='content administration']//img")).click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement scrollarea=driver.findElement(By.xpath("//select[@name='weekStartDay']"));
	

	
	js.executeScript("arguments[0].scrollIntoView();", scrollarea );
	
	Select layout=new Select(scrollarea);
	
	layout.selectByIndex(0);
	
	
	
	
	
}
}
