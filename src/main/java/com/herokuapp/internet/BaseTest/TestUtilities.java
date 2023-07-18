package com.herokuapp.internet.BaseTest;

public class TestUtilities extends BaseTest {
	
	protected void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
