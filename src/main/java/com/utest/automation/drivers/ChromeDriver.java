package com.utest.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver {
    public static WebDriver driver;

    public static ChromeDriver ChromeWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--allow-running-insecure-content --disable-popup-blocking --disable-dev-shm-usage");
        options.addArguments("--disable-infobars --test-type --disable-extensions --disable-translate");
        options.addArguments("--ignore-certificate-errors --incognito --disable-gpu --no-sandbox --disable-download-notification");
        driver = new org.openqa.selenium.chrome.ChromeDriver(options);

        return new ChromeDriver();
    }

    public static WebDriver on (String url) {
        driver.get(url);
        return driver;
    }
}
