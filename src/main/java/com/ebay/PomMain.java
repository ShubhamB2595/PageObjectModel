package com.ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebay.pages.LoginPage;

public class PomMain {

	static LoginPage loginPage;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Page Object Model\\src\\main\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		
		driver.get("https://www.ebay.com/");

		driver.findElement(By.linkText("Sign in")).click();
//		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("shubhu8698348143@gmail.com");
//		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		loginPage.ebaySignIn("shubhu8698348143@gmail.com", "12345678");
	}

}
