package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_FlipKart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.name("q"));
        e.sendKeys("Mobiles");
        Thread.sleep(1000);
        List<WebElement> l = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
      // size of list
        int s = l.size();
        System.out.println(s);
        //get the text of the selected dropdwon value
       String f =l.get(s-1).getText();
       System.out.println(f);
       //click on selected dropdown value
        l.get(s-1).click();
	}

}
