package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.DriverManager;
import com.pages.AboutPage;
import com.pages.AccessoriesPage;
import com.pages.AccountPage;
import com.pages.BasePage;
import com.pages.ContactUsPage;
import com.pages.HomePage;
import com.pages.MenPage;
import com.pages.StorePage;
import com.pages.WomenPage;
import com.utils.ConfigProperties;

public class BaseTest {

	BasePage basePage = new BasePage();
	HomePage homePage = new HomePage();
	StorePage storePage = new StorePage();
	MenPage menPage = new MenPage();
	WomenPage womenPage = new WomenPage();
	AccessoriesPage accessoriesPage = new AccessoriesPage();
	AccountPage accountPage = new AccountPage();
	AboutPage aboutPage = new AboutPage();
	ContactUsPage contactUsPage = new ContactUsPage();

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		DriverManager.getDriver().get(ConfigProperties.APP_URL);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		DriverManager.clearDriver();
	}

}
