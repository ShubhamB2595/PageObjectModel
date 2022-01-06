package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	// driver and web element initialization
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='userid']")
	WebElement userEmail;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement userPass;
	@FindBy(xpath = "//button[@id='signin-continue-btn']")
	WebElement continueBtn;
	@FindBy(xpath = "//button[@id='sgnBt']")
	WebElement signInBtn;
	
	// Constructor
	public LoginPagePF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void setUserEmail(String email) {

		userEmail.sendKeys(email);
	}

	public void setPassword(String password) {

		userPass.sendKeys(password);
	}

	public void clickContinue() {

		continueBtn.click();
	}

	public void clickSignIn() {

		signInBtn.click();
	}

	public void ebaySignIn(String email, String password) {
		
		this.setUserEmail(email);
		this.clickContinue();
		this.setPassword(password);
		this.clickSignIn();
	}
}
