package com.report;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.driver.DriverManager;

import io.qameta.allure.Attachment;

public class AllureAttachments {

	@Attachment(value = "{0}", type = "image/png")
	public static byte[] attachScreenshot(String fileName) {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	}

}
