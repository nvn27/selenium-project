package com.utils;

import static com.driver.DriverManager.getDriver;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.logs.Logger;

public class Actions {

	private static final org.apache.logging.log4j.Logger LOGGER = LogManager
			.getLogger(Thread.currentThread().getClass().getName());

	public static void click(By locator) {
		LOGGER.info("Clicking element with locator - " + locator);
		getDriver().findElement(locator).click();
	}

	public static String getElementText(By locator) {
		Logger.logInfo("Extracting text of element with locator - " + locator);
		return getDriver().findElement(locator).getText();
	}

	public static void waitAndClick(int secondsToWait, By locator) {
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(getDriver());
		fluentWait.withTimeout(Duration.ofSeconds(secondsToWait));

		try {
			Logger.logInfo("Waiting for element with locator - " + locator);
			fluentWait.pollingEvery(Duration.ofMillis(100));
			fluentWait.ignoring(TimeoutException.class);
			fluentWait.ignoring(StaleElementReferenceException.class);
			fluentWait.ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException | NoSuchElementException | StaleElementReferenceException e) {
			e.printStackTrace();
			Logger.logInfo(e.toString());
		}

		getDriver().findElement(locator).click();
		Logger.logInfo("Wait finished, element located; clicking element with locator - " + locator);
	}

}
