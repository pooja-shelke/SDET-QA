package com.Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_0_1 {

	WebDriver driver;

	@Test
	@Parameters({ "Url", "emailId" })
	public void loginYahoo(String Url, String email) {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);

		WebElement e = driver.findElement(By.id("login-username"));
		e.clear();
		e.sendKeys(email);

		driver.findElement(By.id("login-signin")).click();

	}
}
