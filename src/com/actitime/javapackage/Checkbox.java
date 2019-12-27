package com.actitime.javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	WebDriver driver;
  @Test
  public void isenabled() {
	  System.setProperty("webdriver.chrome.driver","D:\\eclips\\Javaproject\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.calculator.net/mortgage-calculator.html");
	  driver.manage().window().maximize();
	  System.out.println("the output for isenabled :"+
	  driver.findElement(By.className("cbmark")).isEnabled());  
  
  }
}
