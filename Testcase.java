package iTestListeners_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListeners_Concept.ITestListenersLogic.class)
public class TestCase extends ITestListenersLogic {
	
	
	@Test
	public void TC1()
	{
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    WebElement search = driver.findElement(By.name("q"));
    search.sendKeys("jr NTR" + Keys.ENTER);
	
	}
	

	@Test
	public void TC2()
	{
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    WebElement search = driver.findElement(By.name("qa"));
    search.sendKeys("India" + Keys.ENTER);
	
	}


}
