package com.report;

import io.qameta.allure.Epic;

public class AllureEpic {

	private AllureEpic() {
	}

	@Epic("{0}")
	public static void logEpic(String epicInfo) {
		// stepInfo parameter provides the necessary logging details to be
		// included in Allure report
	}

}
