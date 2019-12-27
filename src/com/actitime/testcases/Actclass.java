package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Actclass {
	
	@Test
	public void launchbrowser()
	{
		
		System.setProperty("webdriver.firefox.marionette","D:\\Oxygen\\test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		
	}

}
