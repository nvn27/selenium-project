package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class AccessoriesPage extends BasePage {
	
	private By accessoriesTitle = By.cssSelector(".woocommerce-products-header");

	public String getAccessoriesTitleText() {
		return Actions.getElementText(accessoriesTitle);
	}


}
