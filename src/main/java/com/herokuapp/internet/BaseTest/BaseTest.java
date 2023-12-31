package com.herokuapp.internet.BaseTest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("chrome") String browser) {
		// Create driver
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver(); 
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("Close driver");
		// Close browser
		driver.quit();
	}
}
