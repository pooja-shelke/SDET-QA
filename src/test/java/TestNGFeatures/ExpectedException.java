package TestNGFeatures;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1()
	{
		String x="100A";
		Integer.parseInt(x);
	}
  
}
