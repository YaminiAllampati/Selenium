package testNG_Package;

import org.testng.annotations.Test;

public class InvocationCount_Parameter {
	
	@Test(invocationCount=3) //same test case will execute multiple times
	public void test()
	{
		System.out.println("test");
	}

	@Test(invocationCount=3) //same test case will execute multiple times
	public void abc()
	{
		System.out.println("abc");
	}

	

}

