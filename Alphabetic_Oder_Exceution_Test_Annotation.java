package testNG_Package;

import org.testng.annotations.Test;

public class Alphabetic_Oder_Exceution_Test_Annotation {

	@Test
	public void testCase_c() //5th
	{
		System.out.println("Test case - c");

	}
	@Test
	public void test() //3rd
	{
		System.out.println("Test case - a");
	}
	@Test
	public void testdase_b() //4th
	{
		System.out.println("Test case - b");

	}
	@Test
	public void login()   //1st
	{
		System.out.println("login");

	}
	@Test
	public void logout() //2nd
	{
		System.out.println("log-out");

	}
}
