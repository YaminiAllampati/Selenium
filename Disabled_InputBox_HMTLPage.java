package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_InputBox_HMTLPage {

	public static void main(String[] args) {

		  ChromeDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
			driver.manage().window().maximize();
			WebElement lname = driver.findElement(By.xpath("(//input)[5]"));
			boolean b1 = lname.isDisplayed();	
			System.out.println(b1);
			boolean b2 = lname.isEnabled();
			System.out.println(b2);
			if(b2==false)
			{
				System.out.println("lname inputbox is disabled");
			}
			else
			{
				System.out.println("lname inputbox is not disabled");
			}
	}

}
