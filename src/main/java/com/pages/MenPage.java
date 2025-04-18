package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class MenPage extends BasePage {

	private By menTitle = By.cssSelector(".woocommerce-products-header");

	public String getMenPageTitleText() {
		return Actions.getElementText(menTitle);
	}

}
