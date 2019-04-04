package com.accesshq.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;

@Execution(ExecutionMode.CONCURRENT)
public class BaseTestSuite {

protected static ThreadLocal<WebDriver> driverInstance = new ThreadLocal<WebDriver>();
	
	protected WebDriver getDriver() {
		return driverInstance.get();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		driverInstance.set(DriverFactory.buildDriver());
	}
	
	@AfterEach
	void teardown() {
		getDriver().quit();
	}

}
