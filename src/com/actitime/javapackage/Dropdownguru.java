package com.actitime.javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dropdownguru {
	WebDriver driver;
  @Test
  public void f() {
	 System.setProperty("webdriver.firefox.marionette", "D:\\eclips\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.guru99.com/test/newtours/register.php");
	  
  }
}
