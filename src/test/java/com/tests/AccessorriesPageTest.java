package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class AccessorriesPageTest extends BaseTest {

	@Step("Verify heading for Accessories page")
	@Test
	public void accessoriesPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAccessoriesMenu();
		softAssert.assertEquals("Accessories", accessoriesPage.getAccessoriesTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Accessories page")
	@Test
	public void accessoriesPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAccessoriesMenu();
		softAssert.assertEquals("Accessories", accessoriesPage.getAccessoriesTitleText());

		softAssert.assertAll();
	}

}
