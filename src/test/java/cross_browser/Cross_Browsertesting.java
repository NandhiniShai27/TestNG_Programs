package cross_browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browsertesting {
	
	
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void facebook(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}
		 WebElement username = driver.findElement(By.id("email"));
		   username.sendKeys("nandhini");
		   WebElement password = driver.findElement(By.id("pass"));
		   password.sendKeys("Shai@27293");
		   WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
		   login.click();

	}

}
