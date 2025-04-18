package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class StorePageTest extends BaseTest {

	@Step("Verify heading for Store page")
	@Test
	public void storePageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickStoreMenu();
		softAssert.assertEquals("Store", storePage.getStoreTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Store page")
	@Test
	public void storePageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickStoreMenu();
		softAssert.assertEquals("Store", storePage.getStoreTitleText());

		softAssert.assertAll();
	}

}
