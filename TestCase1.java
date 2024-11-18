package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends ParalellTesting_Launch {
	
	@Test
	public void search()
	{
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoes" + Keys.ENTER);
	}
	
	

}
