package com.report;

import io.qameta.allure.Step;

public class AllureStep {

    private AllureStep() {
    }

    @Step("{0}")
    public static void logStep(String stepInfo) {
        // stepInfo parameter provides the necessary logging details to be
        // included in Allure report
    }

}
