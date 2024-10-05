package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_AllAutosuggestion_GoogleSearch {

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
        for(int i =0;i<li.size();i++)
        {
        	  String s1 = li.get(i).getText();
        	  System.out.println(s1z);
        }
	}

}
