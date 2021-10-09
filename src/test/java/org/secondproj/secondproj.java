package org.secondproj;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondproj{
	static WebDriver driver;
	@BeforeClass
	public static void sample1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Before
	public void sample2()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void sample3() throws InterruptedException
	{
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("priyanka");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("priyanka123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
	@AfterClass
	public static  void sample5()
	{
		driver.quit();
	}

}
