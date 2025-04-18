package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class HomePageTest extends BaseTest {

	@Step("Verify heading for Home page")
	@Test
	public void homePageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickHomeMenu();
		softAssert.assertEquals("Raining Offers for Hot Summer!", homePage.getHomePageTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Home page")
	@Test
	public void homePageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickHomeMenu();
		softAssert.assertEquals("Raining Offers for Hot Summer!", homePage.getHomePageTitleText());

		softAssert.assertAll();
	}

}
