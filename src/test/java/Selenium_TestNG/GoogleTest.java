package Selenium_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");

	}

	@Test(priority = 1,groups = "title")
	public void Test_0_1() {
		
		String actual = driver.getTitle();

		String expected = "Google";

		Assert.assertEquals(actual, expected, "Both are not matched...");

	}

	@Test(priority = -3,groups = "Search")
	public void Test_0_3_1() {
	WebElement e=driver.findElement(By.xpath("//input[@name='q']"));
	e.sendKeys("Testing");
	e.sendKeys(Keys.ENTER);
	}
	
	@Test(priority = -4,groups = "Search")
	public void Test_0_3_2() {
	WebElement e=driver.findElement(By.xpath("//input[@name='q']"));
	e.sendKeys("Selenium");
	e.sendKeys(Keys.ENTER);
	}
	
	

	@Test(priority = 2,groups = "Search")
	public void Test_0_2() {

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
