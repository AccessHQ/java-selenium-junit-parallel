package com.accesshq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void clickLoginButton() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public void setEmail(String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	}
	
	public String getEmailError() {
		return driver.findElement(By.name("email-error")).getText();
	}
	
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public String getPasswordError() {
		return driver.findElement(By.name("password-error")).getText();
	}
	
	public void clickAgreeToTerms() {
		// 
	}
	
	public void login(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickAgreeToTerms();
		this.clickLoginButton();
	}
	
}
