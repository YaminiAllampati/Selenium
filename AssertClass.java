package testNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertClass 
{
	@Test
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google","Sorry the test case is failed, please check again");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("India" + Keys.ENTER);		
		//expected-hand written
		//actual-predefined method
        
        
	}
	

}
