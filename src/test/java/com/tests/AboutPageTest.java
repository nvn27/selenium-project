package com.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class AboutPageTest extends BaseTest {

	@Epic("EPIC - About Page Tests")
	@Feature("FEATURE - About Page Tests")
	@Story("STORY - About Page Tests")
	@Step("Verify heading for About page")
	@Test
	public void aboutPageTest1() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAboutMenu();
		softAssert.assertEquals("About Us", aboutPage.getAboutTitleText());

		softAssert.assertAll();
	}

	@Epic("EPIC - About Page Tests")
	@Feature("FEATURE - About Page Tests")
	@Story("STORY - About Page Tests")
	@Step("Verify heading for About page")
	@Test
	public void aboutPageTest2() {
		SoftAssert softAssert = new SoftAssert();

		basePage.clickAboutMenu();
		softAssert.assertEquals("About", aboutPage.getAboutTitleText());

		softAssert.assertAll();
	}

}
