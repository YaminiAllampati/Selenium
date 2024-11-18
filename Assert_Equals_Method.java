package assert_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals_Method {
	
	@Test
	public void google()
	{
		ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        //Assert.assertEquals(expected, actual);
		Assert.assertEquals(search.isDisplayed(), true);
		search.sendKeys("India" + Keys.ENTER);
	}
	@Test
	public void google1()
	{
		ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();	
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        boolean b = search.isDisplayed();
        Assert.assertEquals(b, false,"element is not found");
		search.sendKeys("India" + Keys.ENTER);
	}


}
