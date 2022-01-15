package InterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_0_1 {
	
	WebDriver driver;
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	//	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("123456778");
	
		List<WebElement> e=driver.findElements(By.id("a"));
		
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getText());
		}

	}

}
