package com.pages;

import org.openqa.selenium.By;

import com.utils.Actions;

public class BasePage extends AbstractPage {

	private By websiteLogo = By.xpath("//h1[@class='site-title']");
	private By homeMenu = By.id("menu-item-1226");
	private By storeMenu = By.id("menu-item-1227");
	private By menMenu = By.id("menu-item-1228");
	private By womenMenu = By.id("menu-item-1229");
	private By accessoriesMenu = By.id("menu-item-1230");
	private By accountMenu = By.id("menu-item-1237");
	private By aboutMenu = By.id("menu-item-1232");
	private By contactUsMenu = By.id("menu-item-1233");

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

	public void clickAccessoriesMenu() {
		Actions.click(accessoriesMenu);
	}

	public void clickAccountMenu() {
		Actions.click(accountMenu);
	}

	public void clickAboutMenu() {
		Actions.click(aboutMenu);
	}

	public void clickContactUsMenu() {
		Actions.click(contactUsMenu);
	}

	public String getWebsiteLogo() {
		return Actions.getElementText(websiteLogo);
	}

}
