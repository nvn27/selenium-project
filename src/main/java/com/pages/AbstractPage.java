package com.pages;

import static com.driver.DriverManager.getDriver;

public abstract class AbstractPage {

	public String getPageTitle() {
		return getDriver().getTitle();
	}

	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

}
