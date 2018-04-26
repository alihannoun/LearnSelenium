package com.seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
//For firefox Browser
		/*
		 * It is necessary to use Gecko Driver For Selenium 3, and Firefox above the version 47.0. 
		 * for Selenium 2 and firefox until 47 is not necessary
		 * Selenium 2 is not compatible with Firefox above version  47.o
		 */
		System.setProperty("webdriver.gecko.driver", "lib\\firefoxGeckodriver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.seleniumhq.org/");

// For Chrome Browser
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.seleniumhq.org/");

	}

}
