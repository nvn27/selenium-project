package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class BasePage extends AbstractPage {

	private By siteTitle = By.xpath("//h1[@class='site-title']");
	private By homeMenu = By.id("menu-item-1226");
	private By storeMenu = By.id("menu-item-1227");
	private By menMenu = By.id("menu-item-1228");
	private By womenMenu = By.id("menu-item-1229");

	public void clickHomeMenu() {
		Actions.click(homeMenu);
	}

	public void clickStoreMenu() {
		Actions.click(storeMenu);
	}

	public void clickMenMenu() {
		Actions.click(menMenu);
	}

	public void clickWomenMenu() {
		Actions.click(womenMenu);
	}
	
	public String getPageHeading() {
		return Actions.getElementText(siteTitle);
	}

}
