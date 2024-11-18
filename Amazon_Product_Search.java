package assert_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Product_Search {
	

	@Test
	public void amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoes" + Keys.ENTER);
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"));
		int s = l.size();
		System.out.println("Size : " + s);
		for(int i =0; i<l.size(); i++)
		{
			 String value = l.get(i).getText();
			 System.out.println("Shoes : " + value);
		}
		
		Assert.assertEquals(s>1, true,"please check again");
		System.out.println("successfully executed");
		
	}

}
