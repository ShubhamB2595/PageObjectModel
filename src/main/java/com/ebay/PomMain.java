package com.ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebay.pages.Homepage;
import com.ebay.pages.LoginPage;

public class PomMain {

	static WebDriver driver;
	static LoginPage loginPage;
	static Homepage homePage;

	public static void main(String[] args) throws Exception {

		setWebDriverInit();
		
		loginPage = new LoginPage(driver);
		homePage = new Homepage(driver);
	
		homePage.launchHomepage();
		homePage.searchProduct("laptop");
		
//		driver.get("https://www.ebay.com/");
		driver.close();

//		loginPage.ebaySignIn("shubhu8698348143@gmail.com", "Shubham@2595");
	}

	public static void setWebDriverInit() {

		System.setProperty(BaseClass.DRIVER_NAME, BaseClass.DRIVER_LOCATION);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
}
