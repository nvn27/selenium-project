package com.tests;

import org.testng.annotations.Test;

import io.qameta.allure.Step;

public class DummyTest extends BaseTest {

	@Step
	@Test
	public void dummyTest() {
		System.out.println(basePage.getPageTitle());
		System.out.println(basePage.getCurrentUrl());
		basePage.clickStoreMenu();

		System.out.println(storePage.getPageTitle());
		System.out.println(storePage.getCurrentUrl());

	}

}
