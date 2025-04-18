package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class AboutPage extends BasePage {

	private By aboutTitle = By.cssSelector("h1.has-text-align-center");

	public String getAboutTitleText() {
		return Actions.getElementText(aboutTitle);
	}

}
