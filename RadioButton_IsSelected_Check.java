package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_IsSelected_Check {

	public static void main(String[] args) {

		 ChromeDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			boolean b3 = e1.isDisplayed();
			System.out.println(b3);
			boolean b4 = e1.isSelected();
			System.out.println(b4);
			//radio button not selected
			if(b4==false)
			{
				e1.click();
				System.out.println("radio button selcted");
			}
			else
			{
				System.out.println("radio button not selcted");
			} 
	}

}
