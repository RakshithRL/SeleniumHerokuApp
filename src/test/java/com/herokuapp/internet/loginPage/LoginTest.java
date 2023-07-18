package com.herokuapp.internet.loginPage;

import org.testng.annotations.Test;

import com.herokuapp.internet.BaseTest.TestUtilities;
import com.herokuapp.internet.Page.LoginPage;
import com.herokuapp.internet.Page.SecurePage;
import com.herokuapp.internet.Page.WelcomePage;

public class LoginTest extends TestUtilities {

	@Test
	public void logInTest() {
		System.out.println("Starting logIn test");

		// open main page
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.openPage();

		// Click on Form Authentication link
		LoginPage loginpage = welcomepage.clickonAuthenticationkLocator();

		// enter username and password
		SecurePage securepage = loginpage.loginPage("tomsmith" , "SuperSecretPassword!");

		// verifications
		// new url
//       Assert.assertEquals(securepage.getCurrentUrl(), securepage.getPageUrl());
//
//		// log out button is visible
//		Assert.assertTrue(securepage.islogOutButtonVisibile(), "Logout Button is not visibile");
//		// Successful log in message
//
//		String expectedSuccessMessage = "You logged into a secure area!";
//		String actualSuccessMessage = driver.findElement(By.id("flash")).getText();
//		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
//				"actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
//						+ expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
	}

}
