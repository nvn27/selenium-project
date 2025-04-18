package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class AccountPageTest extends BaseTest {

	@Step("Verify heading for Account page")
	@Test
	public void accountPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAccountMenu();
		softAssert.assertEquals("Account", accountPage.getAccountTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Account page")
	@Test
	public void accountPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAccountMenu();
		softAssert.assertEquals("Account", accountPage.getAccountTitleText());

		softAssert.assertAll();
	}

}
