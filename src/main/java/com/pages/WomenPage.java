package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class WomenPage extends BasePage {
	private By womenPageTitle = By.cssSelector(".woocommerce-products-header");

	public String getWomenPageTitleText() {
		return Actions.getElementText(womenPageTitle);
	}


}
