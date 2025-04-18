package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public static final Properties PROPS = new Properties();
	private static final String PROPERTIES_FILE_LOCATION = System.getProperty("user.dir")
			+ "/src/test/resources/config.properties";

	static {
		loadConfigProperties();
	}

	private static void loadConfigProperties() {
		try {
			PROPS.load(new FileInputStream(PROPERTIES_FILE_LOCATION));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
