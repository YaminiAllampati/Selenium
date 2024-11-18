package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovover_AmazonLangSelect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//amazon lang select
		WebElement e = driver.findElement(By.id("icp-nav-flyout"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();	
		Thread.sleep(3000);
	    WebElement lang = driver.findElement(By.xpath("(//i[@class='icp-radio'])[3]"));
	    lang.click();
	  
	}

}
