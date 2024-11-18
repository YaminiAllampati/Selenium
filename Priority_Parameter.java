package testNG_Package;

import org.testng.annotations.Test;

public class Priority_Parameter {


		@Test(priority=0)
		public void test() 
		{
			System.out.println("test");
		}
		@Test(priority=1)
		public void xyz() 
		{
			System.out.println("xyz");

		}
		@Test(priority=-1)
		public void login()  
		{
			System.out.println("login");

		}
		@Test(priority=3)
		public void logout() 
		{
			System.out.println("log-out");

		}
	}

