package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class StorePage extends BasePage {

	private By storeTitle = By.cssSelector(".woocommerce-products-header");

	public String getStoreTitleText() {
		return Actions.getElementText(storeTitle);
	}

}
