package com.acttime.Revesion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon {
	
@Test 
public void testing() {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
}
}
