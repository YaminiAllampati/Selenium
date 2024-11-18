package testNG_Package;

import org.testng.annotations.Test;

//it can only be possible when we have all test in a class(diff testing)
//we can do include & exclude based on our need.

public class Grouping_Concept {
	
	@Test(groups = {"smoke"})
	public void TC1()
	{
		
	}
	@Test(groups = {"smoke","Integration"})
	public void Tc2()
	{
		
	}
	@Test(groups = {"Integration"})
	public void TC3()
	{
		
	}
	@Test(groups = {"smoke"})
	public void TC4()
	{
		
	}
	@Test(groups = {"sanity"})
	public void TC5()
	{
		
	}
	
	
	

}
