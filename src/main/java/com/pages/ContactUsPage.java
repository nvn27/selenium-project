package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class ContactUsPage extends BasePage {
	private By contactUsTitle = By.cssSelector("h1.has-text-align-center");

	public String getContactUsTitleText() {
		return Actions.getElementText(contactUsTitle);
	}

}
