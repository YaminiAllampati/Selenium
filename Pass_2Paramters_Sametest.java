package testNG_Package;

import org.testng.annotations.Test;

public class Pass_2Paramters_Sametest {
	
	@Test(priority = 1, invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}

}
