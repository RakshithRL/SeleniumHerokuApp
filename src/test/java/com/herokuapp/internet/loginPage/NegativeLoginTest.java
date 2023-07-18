package com.herokuapp.internet.loginPage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.herokuapp.internet.BaseTest.TestUtilities;
import com.herokuapp.internet.Page.LoginPage;
import com.herokuapp.internet.Page.WelcomePage;

public class NegativeLoginTest extends TestUtilities {
	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeTest(String username, String password, String expectedErrorMessage) {
		System.out.println("Starting negativeTest");

		// open main page
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.openPage();

		// Click on Form Authentication link
		LoginPage loginpage = welcomepage.clickonAuthenticationkLocator();

		// enter username and password
		loginpage.negativeloginPage(username, password);

		// push log in button
//		loginpage.waitForErrorMessage();
//		String message = loginpage.getErrorMessage();
//
//		Assert.assertTrue(message.contains(expectedErrorMessage),"Error messgage is not matching");
//		System.out.println(expectedErrorMessage);

	}
}
