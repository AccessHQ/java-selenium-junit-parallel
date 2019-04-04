package com.accesshq.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accesshq.util.Config;


class ExampleTests extends BaseTestSuite {

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
