package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("drag6"));//source element
		WebElement e2 = driver.findElement(By.xpath("//div[@id='div2']"));//target element
		 Actions a = new Actions(driver);
		 a.dragAndDrop(e1, e2).perform();
		 
		 

		
	}

}
