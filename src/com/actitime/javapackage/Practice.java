package com.actitime.javapackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice {

	static WebDriver driver;
	static String username = "admin";
	static String password = "manager";

	@Test
	public static void windowHandle() throws InterruptedException {
		// public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "D:\\eclips\\Javaproject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://desktop-bbliq8g/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		WebElement rdbt = driver.findElement(By.id("keepLoggedInCheckBox"));
		if (!rdbt.isSelected()) {
			rdbt.click();

		}
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[5][@class='navItem relative']/a//img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//td[9][@class='navItem relative']/a//img")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[13][@class='navItem relative']/a//img")).click();
		WebElement layout = driver.findElement(By.name("weekStartDay"));
		Select slt = new Select(layout);
		slt.selectByIndex(3);
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.linkText("Create new tasks")).click();

		String mainwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String str : childwindow) {
			driver.switchTo().window(str);
		}

		Select slt1 = new Select(driver.findElement(By.name("customerId")));
		slt1.selectByIndex(2);
		driver.findElement(By.xpath("//input[@onclick='cancelTasksCreation();']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.switchTo().window(mainwindow);

	}

}