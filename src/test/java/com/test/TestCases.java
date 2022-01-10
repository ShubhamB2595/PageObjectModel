package com.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.pages.LoginPage;

public class TestCases {

	WebDriver driver;
	LoginPage loginPage;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Page Object Model\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
	}

	@Test
	public void testSignIn() {
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Sign in")).click();	

		loginPage.ebaySignIn("shubhu8698348143@gmail.com", "Shubham@2595");
//		WebElement msg = driver.findElement(By.id("welcome-msg"));
		WebElement profileName = driver.findElement(By.xpath("//b[contains(text(),'Shubham')]"));	
	
		}
			
		

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}

}
