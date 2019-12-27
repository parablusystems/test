package com.acttime.Revesion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firesel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\eclips\\geckodriver.exe");
		WebDriver selfire=new FirefoxDriver();
		selfire.manage().window().maximize();
		selfire.get("http://desktop-bbliq8g/login.do");
		

	}

}
