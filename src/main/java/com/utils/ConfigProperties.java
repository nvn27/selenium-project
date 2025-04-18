package com.utils;

import static com.utils.ConfigLoader.*;

public class ConfigProperties {

	public static final String APP_URL = PROPS.getProperty("app.url");
	public static final String BROWSER = PROPS.getProperty("browser");

}
