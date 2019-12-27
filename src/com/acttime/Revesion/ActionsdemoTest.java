package com.acttime.Revesion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsdemoTest {
	

	static WebDriver driver;
	static String username="admin";
	static String password="manager";
	
	@BeforeClass
	public void url() {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\Javaproject\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-bbliq8g/login.do");
	}
	
	@BeforeMethod 
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password); 
		
	Thread.sleep(2000);
	WebElement rbtn=driver.findElement(By.xpath("//input[@name='remember']"));
	if (!rbtn.isSelected()) {
		rbtn.click();
		
	}
	
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Create new tasks")).click();	
		
		
	}
    @Test
    public void newtask() throws InterruptedException {
    	
    driver.findElement(By.xpath("//table[@class='navTable']/tbody/tr/td[5]/a//img")).click();	
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
    
    @Test
    public void setting() {
    	
    	driver.findElement(By.xpath("//a[@class='content administration']//img")).click();
    	
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	
    	WebElement scrollarea=driver.findElement(By.xpath("//select[@name='weekStartDay']"));
    	

    	
    	js.executeScript("arguments[0].scrollIntoView();", scrollarea );
    	
    	Select layout=new Select(scrollarea);
    	
    	layout.selectByIndex(0);
    	
    }
    
    
    
    @AfterMethod
    public void logout() {
    	driver.findElement(By.className("logout")).click();
    	
    }
    
    @AfterClass
    public void afterclass() {
    driver.quit();	
    }
  
    
	  
	  
  }

