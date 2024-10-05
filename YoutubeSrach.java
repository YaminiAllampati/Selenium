package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSrach {

	public static void main(String[] args) {
     
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		//search the Grow tech minds 
		 WebElement s = driver.findElement(By.name("search_query"));
		 s.sendKeys("Gro tech Minds");
		 WebElement b = driver.findElement(By.id("search-icon-legacy"));
		 b.click();
		 
		 
		  
		 
	}

}
