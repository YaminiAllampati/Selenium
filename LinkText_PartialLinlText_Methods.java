package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinlText_Methods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//click on gmail link
		 WebElement link = driver.findElement(By.linkText("Gmail"));
		 link.click();
		  
		 
	}

}
