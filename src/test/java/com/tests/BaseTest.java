package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.DriverManager;
import com.pages.BasePage;
import com.pages.StorePage;
import com.utils.ConfigProperties;

public class BaseTest {

	BasePage basePage = new BasePage();
	StorePage storePage = new StorePage();

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		System.out.println("setup");
		DriverManager.getDriver().get(ConfigProperties.APP_URL);
	}

	@AfterMethod(alwaysRun = true)
	public void exit() {
		System.out.println("Exit");
		DriverManager.clearDriver();
	}

}
