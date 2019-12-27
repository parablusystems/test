package com.acttime.Revesion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri {
	
@Test
	public void testing() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\\\eclips\\\\Javaproject\\\\chromedriver.exe");
	WebDriver nkri=new ChromeDriver();
	nkri.manage().window().maximize();
	nkri.get("https://www.naukri.com/");
	Thread.sleep(2000);
	nkri.findElement(By.xpath("//a[@title='Jobseeker Login']//div")).click();
	String mainWindow=nkri.getWindowHandle();
	Set<String> loginwindow=nkri.getWindowHandles();
	Iterator<String> itr= loginwindow.iterator();
	 while(itr.hasNext()){
	 String childWindow=itr.next(); 
	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
	 if(!mainWindow.equals(childWindow))
	 {
	 nkri.switchTo().window(childWindow);
	 //System.out.println(nkri.switchTo().window(childWindow).getTitle());
	 nkri.close();
	 }
	 }
	 nkri.switchTo().window(mainWindow);
	 Thread.sleep(5000);
	
	nkri.findElement(By.xpath("//input[@name='email']")).sendKeys("kumarmncl3@gmail.com");
	nkri.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Lavankumar$11");
	
	nkri.findElement(By.xpath("//button[@class='blueBtn']")).click();
	
	
	}

}
