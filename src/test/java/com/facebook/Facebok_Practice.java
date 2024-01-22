package com.facebook;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.thread.ThreadTimeoutException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebok_Practice {
	
	public static WebDriver driver;
	public static long startingtest;
	public static long endtime;
	
//@Test
//	public void browserlaunch() {
//		//System.setProperty(", null)
//       startingtest = System.currentTimeMillis();
//	   WebDriverManager.chromedriver().setup();
//	   driver = new ChromeDriver();
//	   driver.manage().window().maximize();
	  
	   
	   
	 //}
@Test
	public static void facebook() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
//	   SoftAssert a = new SoftAssert();
//	   //a.assertEquals("https://www.facebook.com/", "https://www.google.com/", "Assertisworking");
//	   a.assertEquals(1, 2);
	 // assertEquals("https://www.facebook.com/", "https://www.google.com/"); 
	   WebElement username = driver.findElement(By.id("email"));
	   username.sendKeys("nandhini");
	   WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys("Shai@27293");
	   WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
	   login.click();
      	   
	   
//	   assertEquals("https://www.facebook.com/", "https://www.facebook.com/1");
        
}
@Test

public static void instagram() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	WebElement user = driver.findElement(By.name("username"));
    user.sendKeys("ShaiKrishna");
    WebElement pass = driver.findElement(By.name("password"));
    pass.sendKeys("Shai@238565");
    WebElement login = driver.findElement(By.linkText("Log in"));
    login.click();
} 
//@Test
//	public void quitbrowser() {
//		driver.quit();
//		 endtime = System.currentTimeMillis();
//		long totaltime= endtime -  startingtest;
//		System.out.println(totaltime);
	//}
	
}

