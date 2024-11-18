package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*isDisplayed():
 *  to check whether particular component present or not.
 *  Is for every component -->input boxes,checkboxes & Dropdown, so on... 
 * isEnabled() - to check whether particular component enable or not(it can eb anything input boxes...etc)
 * isSelected():
 * to check whether particular component selected or not
 * for checkboxes & Dropdown 
 * */

public class Check_Displayed_Enabled_Webelement {

	public static void main(String[] args) {
                 
	    ChromeDriver driver  = new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.xpath("//button"));
			//login button
			boolean b1 = e.isDisplayed();
			System.out.println(b1);
			boolean b2 = e.isEnabled();
			System.out.println(b2);
			if(b1 && b2)
			{
				e.click();
			}
			else
			{
				System.out.println("not displayed");
			}
			
			

		
	}

}
