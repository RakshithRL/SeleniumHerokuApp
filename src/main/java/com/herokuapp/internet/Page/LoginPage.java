package com.herokuapp.internet.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {

	private By UserNameLocator = By.id("username");
	private By UserPasswordLocator = By.id("password");
	private By LoginButtonLocator = By.className("radius");

	private By ErrorMessage = By.id("flash");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public SecurePage loginPage(String UserName, String UserPassword) {

		type(UserName, UserNameLocator);
		type(UserPassword, UserPasswordLocator);
		click(LoginButtonLocator);
		return new SecurePage(driver);
	}

	public SecurePage negativeloginPage(String UserName, String UserPassword) {

		type(UserName, UserNameLocator);
		type(UserPassword, UserPasswordLocator);
		click(LoginButtonLocator);
		return new SecurePage(driver);
	}

	public void waitForErrorMessage() {
	wait = new WebDriverWait((WebDriver) 
			driver.findElement(ErrorMessage), Duration.ofSeconds(5));
	}

	public String getErrorMessage() {
		return find(ErrorMessage).getText();
	}
}
