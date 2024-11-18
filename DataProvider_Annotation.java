package testNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation {
	
	@DataProvider(name="set1")
	public Object[][] amazonSearch()
	{
		return new Object[][] {{"t-shirts"} ,{"shoes"}, {"mobile"},{"laptop"}};
		/*Object i[][] = new Object[2][1];
		i[0][0] = "t-shirst";
		i[1][0] = "shoes";
		return i; */
		
		
		

	}
	
	@Test(dataProvider="set1")
	public void amazon_Search(String s)
	{
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement s1 = driver.findElement(By.id("twotabsearchtextbox"));
		s1.sendKeys(s + Keys.ENTER);
		Reporter.log("Search Item is  -> "+ s); //to print the msge in generate report
		
	}

}
