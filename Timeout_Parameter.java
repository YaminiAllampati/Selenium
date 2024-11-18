package testNG_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_Parameter {
	
	@Test(timeOut=1000)
	public void test()
	{
		ChromeDriver driver = new ChromeDriver();//it failed due to it exceeded the given timeout
		
	}

}
