package com.utest.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver {
    public static WebDriver driver;

    public static ChromeDriver ChromeWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--allow-running-insecure-content");
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);

        return new ChromeDriver();
    }

    public static WebDriver on (String url) {
        driver.get(url);
        return driver;
    }
}
