package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By userEmail = By.xpath("//input[@id='userid']");
	By userPass = By.xpath("//input[@id='pass']");
	By continueBtn = By.xpath("//button[@id='signin-continue-btn']");
	By signInBtn = By.xpath("//button[@id='sgnBt']");
	By pageTitle = By.xpath("//head");
	
	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public void setUserEmail(String email) {

		driver.findElement(userEmail).sendKeys(email);
	}

	public void setPassword(String password) {

		driver.findElement(userPass).sendKeys(password);
	}

	public void clickContinue() {

		driver.findElement(continueBtn).click();
	}

	public void clickSignIn() {

		driver.findElement(signInBtn).click();
	}
	
	public String getLoginPageTitle() {
		
		return driver.findElement(pageTitle).getText();
	}

	public void ebaySignIn(String email, String password) throws InterruptedException {
		
		Thread.sleep(5000);
		this.setUserEmail(email);
		this.clickContinue();
		
		Thread.sleep(5000);
		this.setPassword(password);
		this.clickSignIn();
	}
}
