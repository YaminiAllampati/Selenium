package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Checked {

	public static void main(String[] args) {
             
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.name("name2"));
			e.click();
			boolean b1 = e.isDisplayed();
			System.out.println(b1);
			boolean b2 = e.isSelected();
			System.out.println(b2);			
			//The checkbox is checked now
			if(b2==true)
			{
				System.out.println("check-box is checked");
			}
			else
			{
				System.out.println("check-box is not checked");
			}
			
			
	}

}

	
