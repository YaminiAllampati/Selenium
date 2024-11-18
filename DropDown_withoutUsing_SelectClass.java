package selenium_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_withoutUsing_SelectClass {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e.click();
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);


		
		
	}

}
