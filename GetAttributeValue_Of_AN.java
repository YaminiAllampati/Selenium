package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue_Of_AN {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
        driver.get("https://www.google.com");
        
        List<WebElement> l = driver.findElements(By.tagName("a"));
        int a = l.size();
        System.out.println("Total No of Links : " + a);
        
        //to get the getText() - likedText of anchor Tag(<a>)
        for(int i=0; i<l.size(); i++)
        {
      	WebElement e = l.get(i);
      	//get attribute value of href --> link
      	String h = e.getAttribute("href");
      	System.out.println("href - AV : " + h);
      	//it can be any Attribute value
    	String h1 = e.getAttribute("class");
      	System.out.println("Class - AV : " + h1);
      	  
        }
	}

}
