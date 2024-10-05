package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestions_FlipKart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.name("q"));
        e.sendKeys("shirts");
        Thread.sleep(1000);
        List<WebElement> l = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
        int s = l.size();
        System.out.println(s);
        String f =l.get(2).getText();
        System.out.println(f);
        l.get(2).click();
        
	}
}
