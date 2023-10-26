package io.qameta.allure.examples.cucumber7;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
        value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class CucumberTest {
}