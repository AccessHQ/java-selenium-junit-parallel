package com.accesshq.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.accesshq.util.Config;

public class DriverFactory
{
	
    public static WebDriver buildDriver() throws MalformedURLException
    {
        WebDriver driver = null;

        switch (Config.RUN_TYPE)
        {
            case "local":
                driver = buildLocalDriver();
                break;
            case "remote":
                driver = buildRemoteDriver();
                break;
            default:
                throw new IllegalArgumentException(String.format("Invalid runType parameter - '%s'", Config.RUN_TYPE));
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Config.IMPLICIT_WAIT_SECONDS, TimeUnit.SECONDS);
        return driver;
    }

    private static WebDriver buildRemoteDriver() throws MalformedURLException
    {
        
        switch(Config.BROWSER)
        {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
                return new RemoteWebDriver(new URL(Config.HUB_URL), chromeOptions);
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
                return new RemoteWebDriver(new URL(Config.HUB_URL), firefoxOptions);
            default:
                throw new IllegalArgumentException(String.format("Invalid remote browser parameter - '%s'", Config.BROWSER));
        }

        
    }
    
	private static WebDriver buildLocalDriver() { 
		switch (Config.BROWSER) {
			case "chrome":
				return new ChromeDriver();
			case "firefox":
				return new FirefoxDriver();			
			default:
				throw new IllegalArgumentException(String.format("Invalid local browser parameter - '%s'", Config.BROWSER));
		}
	}
 
}