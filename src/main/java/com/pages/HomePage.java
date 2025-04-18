package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class HomePage extends BasePage {

	private By homePageTitle = By
			.cssSelector("h1.alignwide.has-text-align-center.has-white-color.has-text-color.has-huge-font-size");

	public String getHomePageTitleText() {
		return Actions.getElementText(homePageTitle);
	}

}
