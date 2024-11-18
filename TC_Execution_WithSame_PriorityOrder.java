package testNG_Package;

import org.testng.annotations.Test;

public class TC_Execution_WithSame_PriorityOrder {
	
	@Test(priority=2)
	public void xyz()
	{
		System.out.println("xyz");
	}
	@Test(priority=2)
	public void abc()
	{
		System.out.println("abc");
	}

}
