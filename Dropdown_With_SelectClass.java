package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*dropdown:
 * 90% of the time dropdown  will have a select tag
 * select is a class
 * we have to create a object for the select class
 * by it ref var - we have to call the select methods
 * select class methods -->1)selectByvalue() 2)selectByIndex() 3)selectByvisibleText()
 * e - is the dropdown element
 * methods are used to select the options in dropdown.
 */

public class Dropdown_With_SelectClass {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select(e);
		//by using index method
		//s.selectByIndex(8);
		//by using value method
		//s.selectByValue("search-alias=fashion");
		//by using value method
		s.selectByVisibleText("Electronics");
				
		
		
	}

}
