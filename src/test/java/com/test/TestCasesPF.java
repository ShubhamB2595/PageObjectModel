package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.pages.LoginPagePF;

public class TestCasesPF {

	WebDriver driver;
	LoginPagePF loginPage;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Page Object Model\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPagePF(driver);
	}

	@Test
	public void testSignIn() {
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Sign in")).click();	

		loginPage.ebaySignIn("shubhu8698348143@gmail.com", "12345678");
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}

}
