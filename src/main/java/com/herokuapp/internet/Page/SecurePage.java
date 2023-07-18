package com.herokuapp.internet.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePageObject {

	private String pageUrl = "http://the-internet.herokuapp.com/secure";

	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	private By message = By.id("flash");

	public SecurePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public boolean islogOutButtonVisibile() {
		return find(logOutButton).isDisplayed();
	}
	public String getsucessMessage() {
		return find(message).getText();
	}

}
