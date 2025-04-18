package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class MenPageTest extends BaseTest {

	@Step("Verify heading for Men page")
	@Test
	public void menPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickMenMenu();
		softAssert.assertEquals("Men", menPage.getMenPageTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Men page")
	@Test
	public void menPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickMenMenu();
		softAssert.assertEquals("Men", menPage.getMenPageTitleText());

		softAssert.assertAll();
	}

}
