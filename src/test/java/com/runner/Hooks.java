package com.runner;

import java.io.*;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	  public static WebDriver driver;

	  private static Properties properties = new Properties();

	    static {
	        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
	            properties.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @Before
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get(properties.getProperty("url"));
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
