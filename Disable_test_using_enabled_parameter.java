package testNG_Package;

import org.testng.annotations.Test;

public class Disable_test_using_enabled_parameter {

	@Test(enabled=false)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
}

