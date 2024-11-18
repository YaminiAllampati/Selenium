package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
          driver.get("https://www.google.com");
          WebElement search = driver.findElement(By.name("q"));
          search.sendKeys("India" + Keys.ENTER);
          
         
          
          //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

          
	}

}
