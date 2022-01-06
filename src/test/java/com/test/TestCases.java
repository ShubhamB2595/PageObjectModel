package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.pages.LoginPage;

public class TestCases {

	WebDriver driver;
	LoginPage loginPage;// = new LoginPage(driver);

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Page Object Model\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
	}

	@Test
	public void testSignIn() throws InterruptedException {
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Sign in")).click();	

		loginPage.ebaySignIn("shubhu8698348143@gmail.com", "12345678");
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}

}
