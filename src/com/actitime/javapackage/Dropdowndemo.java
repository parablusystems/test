package com.actitime.javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowndemo {
	
	static WebDriver driver;
  @Test
  public void select() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\eclips\\Javaproject\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	  WebElement all=driver.findElement(By.className("nav-search-dropdown searchSelect"));
	  Select slt=new Select(all);
	  System.out.println(slt.getOptions());
	  slt.selectByValue("search-alias=electronics");
	  
	  
	  
	  Thread.sleep(2000);
	  
  }
}
