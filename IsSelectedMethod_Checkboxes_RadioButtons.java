package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod_Checkboxes_RadioButtons {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.name("name2"));
			boolean b1 = e.isDisplayed();
			System.out.println(b1);
			boolean b2 = e.isSelected();
			System.out.println(b2);
			//still the checkbox is not checked
			if(b2==false)
			{
				System.out.println("not checked");
			}
			else
			{
				e.click();
			}
			/*if(b2==true)
			{
				System.out.println("not checked");
			}
			else
			{
				e.click();  -->output - click action
			}  */
			
			//radio button
			WebElement e1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			e1.click();
			boolean b3 = e1.isDisplayed();
			System.out.println(b3);
			boolean b4 = e1.isSelected();
			System.out.println(b4);	
			if(b3&&b4)
			{
				System.out.println("radio button selcted");
			}
			else
			{
				System.out.println("radio button not selcted");
			} 
			
			
	}

}
