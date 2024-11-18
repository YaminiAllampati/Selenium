package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Using_Actions_Class {

	public static void main(String[] args) {
         
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//amazon sign-in
		WebElement e = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	    signin.click();
	    	
	  
		
	}

}
