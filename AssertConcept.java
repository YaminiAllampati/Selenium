package testNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConcept {
	@Test
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
        driver.get("https://www.google.com");

        WebElement search_textfield = driver.findElement(By.name("q"));
        
        Assert.assertEquals(search_textfield.isDisplayed(), true,"Sorry the test case is failed, please chekc again");
       Assert.
        
        search_textfield.sendKeys("India" + Keys.ENTER);	
	}
}
