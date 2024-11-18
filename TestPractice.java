package testNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//ouput is not popuping correctly for all 3 test cases together

public class TestPractice {
	
	@BeforeClass
	public void BC()
	{
		System.out.println("Before class - prac");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before method - prac");
	}

	@Test
	public void TC1()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void TC2()
	{
		System.out.println("Test Case 2");
	}

	@AfterClass
	public void AC()
	{
		System.out.println("After class - prac");
	}

}
