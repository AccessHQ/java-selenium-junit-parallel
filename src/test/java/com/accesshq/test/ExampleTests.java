package com.accesshq.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accesshq.util.Config;

class ExampleTests {

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

	@Test
	void test1() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Human Quality ... because people make technology", h1Element.getText());
	}

	@Test
	void test2() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Human Quality ... because people make technology", h1Element.getText());
	}
	
	@Test
	void test3() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Human Quality ... because people make technology", h1Element.getText());
	}
	
	@Test
	void test4() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Human Quality ... because people make technology", h1Element.getText());
	}
}
