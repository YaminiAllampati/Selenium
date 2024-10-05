package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			e.sendKeys("Shoe");
			Thread.sleep(1000);
			List<WebElement> l= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
			System.out.println(l.size()); 
			l.get(1).click();
	}

}
