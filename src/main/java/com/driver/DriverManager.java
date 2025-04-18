package com.driver;

import static com.utils.ConfigProperties.BROWSER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

	private static void setDriver() {
		if (BROWSER.equalsIgnoreCase("chrome"))
			DRIVER.set(new ChromeDriver());
		else
			System.out.println("Unsupported browser specified in config.propeties");
	}

	public static WebDriver getDriver() {
		if (DRIVER.get() == null)
			setDriver();

		DRIVER.get().manage().window().maximize();
		return DRIVER.get();
	}

	public static void clearDriver() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (DRIVER.get() != null) {
			DRIVER.get().close();
			DRIVER.get().quit();
			DRIVER.remove();
		}
	}

}
