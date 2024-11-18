package testNG_Assignments;

import org.testng.annotations.Test;

public class Test_Annotation_3 {

	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(invocationCount=10)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
}
