package com.herokuapp.internet.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

	private String pageUrl = "http://the-internet.herokuapp.com/";
	private By formAuthenticationkLocator = By.linkText("Form Authentication");

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	public void openPage() {
		openUrl(pageUrl);
	}

	public LoginPage clickonAuthenticationkLocator() {
		click(formAuthenticationkLocator);
		return new LoginPage(driver);
	}

}
