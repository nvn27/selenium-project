package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class WomenPageTest extends BaseTest {

	@Step("Verify heading for Women page")
	@Test
	public void womenPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickWomenMenu();
		softAssert.assertEquals("Women", womenPage.getWomenPageTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Women page")
	@Test
	public void womenPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickWomenMenu();
		softAssert.assertEquals("Women", womenPage.getWomenPageTitleText());

		softAssert.assertAll();
	}

}
