package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions_Handle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.id("APjFqb"));
        e.sendKeys("bangalore");
        Thread.sleep(1000);
        List<WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int s = li.size();
        System.out.println(s);
        li.get(5).click();
        
	}

}
