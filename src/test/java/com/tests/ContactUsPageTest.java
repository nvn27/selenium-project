package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;

public class ContactUsPageTest extends BaseTest {

	@Step("Verify heading for Contact Us page")
	@Test
	public void contactUsPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickContactUsMenu();
		softAssert.assertEquals("Contact Us", contactUsPage.getContactUsTitleText());

		softAssert.assertAll();
	}

	@Step("Verify heading for Contact Us page")
	@Test
	public void contactUsPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickContactUsMenu();
		softAssert.assertEquals("Contact Us", contactUsPage.getContactUsTitleText());

		softAssert.assertAll();
	}

}
