package testNG_Package;

import org.testng.annotations.Test;

public class Default_Test_Annotation {

	@Test(priority=4)
	public void test1()
	{
		System.out.println("Test-1");
	}
	@Test    //default test method - no need to mention the priority - it always implies to priority=0
	public void test2()
	{
		System.out.println("test-2");
	}
}
