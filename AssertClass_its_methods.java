package assert_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Assert is class and it will have a static methods in it
 * we call those methods By Classname.methodname -->Assert.assertEquals();
 */

public class AssertClass_its_methods {

	@Test
	public void assert1()
	{
		//Assert.assertTrue(true);
		Assert.assertTrue(1>3);
	}
	@Test
	public void assert2()
	{
		Assert.assertTrue(1>2, "please check the assert-2 condition");
	}
	@Test
	public void assert3()
	{
		Assert.assertFalse(false, "please check the condition");
	}
	@Test
	public void assert4()
	{
		Assert.assertFalse(true, "please check the assert-4 condition");
	}
	

}



