package com.acttime.Revesion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\Javaproject\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.igoogleportal.com/");
		
		WebElement frm=driver.findElement(By.xpath("//iframe[@id='__gadget_gadget-site-1-6']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//span[@class='setup_button']")).click();
		
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//iframe[@id='__gadget_gadget-site-1-3']"));
		WebElement destination=driver.findElement(By.xpath("//iframe[@id='__gadget_gadget-site-1-7']"));
		
		act.clickAndHold(source).dragAndDrop(source, destination).build().perform();*/

	}

}
