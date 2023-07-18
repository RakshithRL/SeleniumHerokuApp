package com.herokuapp.internet.Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;

public class BasePageObject {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePageObject(WebDriver driver) {
		this.driver = driver;
	}

	protected void openUrl(String url) {
		driver.get(url);
	}

	protected WebElement find(By locators) {
		int attempts = 0;
		while (attempts < 2) {
			for (int i = 0; i < 5; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(3));
					wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
					driver.findElements(locators);
				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
		}
		return driver.findElement(locators);

	}

	protected List<WebElement> findall(By locators) {
		int attempts = 0;
		while (attempts < 2) {
			for (int i = 0; i < 5; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(5));
					wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
					driver.findElements(locators);
					break;
				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
		}
		return driver.findElements(locators);

	}

	protected void click(By locators) {

		for (int i = 0; i < 3; i++) {
			try {
				WebElement element = driver.findElement(locators);
				if (element.isDisplayed()) {
					find(locators).click();
					break;
				}
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
			}

		}
	}

	protected void type(String text, By locators) {

		for (int i = 0; i < 5; i++) {
			try {
				wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
				find(locators).sendKeys(text);
				break;
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
			}
		}
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
