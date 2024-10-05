package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {

	public static void main(String[] args) {

	
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.tagName("a"));
		username.click();

}
}
