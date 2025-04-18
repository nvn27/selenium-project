package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class AccountPage extends BasePage {

	private By accountTitle = By.cssSelector("h1.has-text-align-center");

	public String getAccountTitleText() {
		return Actions.getElementText(accountTitle);
	}

}
