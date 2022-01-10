package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	String WEB_URL = "https://www.ebay.com/";

	By COMPANY_LOGO = By.xpath("//img[@id='gh-logo']");
	By SHPPOING_CART = By
			.xpath("//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-minicart-hover']/div[1]/a[1]/*[1]");
	By SIGN_OUT = By.xpath("//a[contains(text(),'Sign out')]");
	By LEFT_SCROLL_BUTTON = By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]");
	By RIGHT_SCROLL_BUTTON = By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[2]");
	By BANNER = By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[2]");
	By BANNER_PLAY = By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[3]");
	By SEARCH_FIELD = By.xpath("//input[@id='gh-ac']");
	By SEARCH_BUTTON = By.xpath("//input[@id='gh-btn']");

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void launchHomepage() {

		driver.get(WEB_URL);
	}

	public void searchProduct(String productName) {

		driver.findElement(SEARCH_FIELD).sendKeys(productName);
		driver.findElement(SEARCH_BUTTON).click();
	}

	public void scrollBannerLeft() {

		driver.findElement(RIGHT_SCROLL_BUTTON).click();
	}

	public void scrollBannerRight() {

		driver.findElement(LEFT_SCROLL_BUTTON).click();
	}

	public void clickOnBanner() {

		driver.findElement(BANNER).click();
	}

	public void visitShoppingCart() {

		driver.findElement(SHPPOING_CART).click();
	}

	public void userSignOut() {

		driver.findElement(SIGN_OUT).click();
	}

	public void bannerPlayPause() {

		driver.findElement(BANNER_PLAY).click();
	}

}
