package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Not very anchor tag<a> will contain the link Text

public abstract class Find_Total_No_of_Links {

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
        	String s = e.getText();
        	System.out.println("Linked Text : " + s);
        
          }
          
	}

}
