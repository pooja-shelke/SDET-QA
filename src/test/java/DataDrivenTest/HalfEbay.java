package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbay {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void ebay(String FirstName,String LastName,String Email, String Password )
	{
		driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.id("create-account-link")).click();
		
		driver.findElement(By.id("firstname")).sendKeys(FirstName);
		driver.findElement(By.id("lastname")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	

}
