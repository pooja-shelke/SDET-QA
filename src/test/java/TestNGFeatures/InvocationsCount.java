package TestNGFeatures;

import org.testng.annotations.Test;

public class InvocationsCount {
	
	
	@Test(invocationCount = 10)
	public void test1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is : "+c);
	}

}
