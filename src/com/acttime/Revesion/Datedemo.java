package com.acttime.Revesion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datedemo {

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
	
	driver.findElement(By.xpath("//td[5][@class='navItem relative']/a//img")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[input[@name='task[0].deadline']]//img")).click();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	String currentdate=dateFormat.format(date);
	String Current_Month=currentdate.substring(5,7);
	System.out.println(Current_Month);
	String current_date=currentdate.substring(8);
	System.out.println(current_date);
	int Tablerow=driver.findElements(By.xpath("//table[@class='x-date-inner']//tbody/tr")).size();
	System.out.println(Tablerow);
		if (Current_Month.equalsIgnoreCase("10")) {
		//driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
	for (int i = 1; i <=Tablerow; i++) {
		int Tablecolumn=driver.findElements(By.xpath("//table[@class='x-date-inner']//tbody/tr["+i+"]/td")).size();
			for (int j = 1; j<=Tablecolumn; j++) {
				String dates=driver.findElement(By.xpath("//table[@class='x-date-inner']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(dates+"current date from td");
				if (current_date.equalsIgnoreCase(dates)) {
					driver.findElement(By.xpath("//table[@class='x-date-inner']//tbody/tr["+i+"]/td["+j+"]")).click();	
				}
			}	
	}
}
	
		
	}

}
