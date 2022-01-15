package AssertionInTestNg;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _Assert_Methods {
	
	@Ignore
	@Test
	public void test_1()
	{
		System.out.println("test_1() execute ");
		Assert.assertEquals("Pooja", "pooja","Actual are Expected are not matched..");
		System.out.println("It will not execute coz  above assertion gets failed...");

	}
	
	@Test
	public void test_2()
	{
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("Pooja", "pooja","Both are matched");
		System.out.println("softAssert will execute even above assert condition gets failed");
		softAssert.assertEquals("Amir", "Amir");
		System.out.println("Execute");
		softAssert.assertAll();
	}

}
