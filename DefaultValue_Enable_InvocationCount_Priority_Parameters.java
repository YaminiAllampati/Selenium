package testNG_Package;

import org.testng.annotations.Test;

public class DefaultValue_Enable_InvocationCount_Priority_Parameters {
	
	@Test(enabled=true) //Specifically no need to mention
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(invocationCount=1)  //default test invocation count =0
	public void test2()
	{
		System.out.println("test2");
	}
	@Test //default priority = 0 - Specifically no need to mention
	public void test3()
	{
		System.out.println("test3");
	}
}


