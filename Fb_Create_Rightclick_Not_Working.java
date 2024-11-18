package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//right click will not work for create button in fblogin page to inspect a element
//so we have to use = fn+f12-->to display fb page

public class Fb_Create_Rightclick_Not_Working {

	public static void main(String[] args) {

         ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//create button in fb login page
		WebElement e = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
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