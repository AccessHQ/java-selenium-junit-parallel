package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accesshq.util.Config;


class ExampleTests extends BaseTestSuite {

	@Test
	void testHomePageHeading() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Human Quality ... because people make technology", h1Element.getText());
	}

	@Test
	void testCareersPageHeading() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        driver.findElement(By.linkText("Careers")).click();
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Careers", h1Element.getText());
	}
	
	@Test
	void testAboutPageHeading() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        driver.findElement(By.linkText("About us")).click();
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("About Us", h1Element.getText());
	}
	
	@Test
	void testFailingHomePageHeading() {
		WebDriver driver = getDriver();
		driver.get(Config.APP_URL);
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        Assertions.assertEquals("Quality Humans ... because people make technology", h1Element.getText());
	}
}
