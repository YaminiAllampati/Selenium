package testNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Google {
	
	
	@DataProvider(name="set1")
	public Object[][] method1()
	{
		return new Object[][] {{"India"},{"Srilanka"},{"Bangladesh"}};
	}
	@DataProvider(name="set2")
	public Object[][] method2()
	{
		return new Object[][] {{"Modi"},{"SRK"},{"Salman Khan"},{"Rahul Gandhi"},{"Ratan Tata"}};
	}
	@DataProvider(name="set3")
	public Object[][] metho3()
	{
		return new Object[][] {{100},{500},{700},{900},{1100}};
	}
	@Test(dataProvider="set1")
	public void method(int input)
	{
		
		int sum=100+input;
		Reporter.log("Addition is -> "+sum);
		
	}
	/*@Test(dataProvider="set2")
	public void search(String input)
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(input + Keys.ENTER);
	} */

}
