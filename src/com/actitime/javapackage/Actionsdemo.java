package com.actitime.javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actionsdemo {
	WebDriver driver;
	
	@BeforeMethod
		 public void driver() {
				
				System.setProperty("webdriver.firefox.marionette","D:\\eclips\\geckodriver.exe");
				driver=new FirefoxDriver();
				  driver.manage().window().maximize(); 	
				  
			}
	
  /*@Test
  public void amazon() {
	  
	  
	  driver.get("https://www.amazon.in/");
	  Actions amz=new Actions(driver);
	  WebElement source=driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  amz.moveToElement(source).build().perform();
	  //amz.dragAndDrop(source, target)
	  driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();  
	  
  }*/
  @Test
 
  public void droganddrop() throws InterruptedException{
	driver.get("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");  
	Actions drganddp =new Actions(driver);  
	WebElement From = driver.findElement(By.xpath("//a[@id='j1_3_anchor']"));
      WebElement To = driver.findElement(By.xpath("//a[@id='j2_5_anchor']"));
	Thread.sleep(6000);
	drganddp.clickAndHold(From).moveToElement(To).release(To).build().perform();
	
  }
  
  
}
