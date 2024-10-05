package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Revert_MKT {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("drag6"));//source element
		WebElement e2 = driver.findElement(By.xpath("//div[@id='div2']"));//target element
		 Actions a = new Actions(driver);
		 a.dragAndDrop(e1, e2).perform();
		 //to return to original position - need to check 
		// Actions a1 = new Actions(driver);
		// WebElement e3 = driver.findElement(By.id("drag6"));
		 WebElement e4 = driver.findElement(By.xpath("//div[@id='container-5']"));
		 a.dragAndDrop(e1, e4).perform();
		 					
	}

}
