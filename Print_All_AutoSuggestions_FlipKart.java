package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_AutoSuggestions_FlipKart {

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
       /* for(WebElement i : l)
        {
        	String text = i.getText();
        	System.out.println(text);
       	}
        */
        for(int i=0; i<l.size();i++)
        {
        	       WebElement e1 = l.get(i);
        	       String s1 = e1.getText();
        	       System.out.println(s1);
         }
	}

}
