package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class NavigationTests extends BaseTest {

	@Step("Test to verify cart functionality")
	@Test
	public void verifyNavigation() {
		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(basePage.getWebsiteLogo(), "AskOmDch", "Page heading verification failed");

		basePage.clickStoreMenu();
		basePage.clickWomenMenu();

		softAssert.assertAll();
	}

}
