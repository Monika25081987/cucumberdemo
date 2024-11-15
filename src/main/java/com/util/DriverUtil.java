package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtil {


	public WebDriver launchBrowser() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions chromeOptions = new ChromeOptions();

	    // Set options directly without DesiredCapabilities
	    chromeOptions.setCapability("browserName", "chrome");
	    chromeOptions.addArguments("--start-maximized");

	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    return driver;
	}

}
