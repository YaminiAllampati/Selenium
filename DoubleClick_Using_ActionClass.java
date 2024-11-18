package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Using_ActionClass {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.linkText("Gmail"));
        Actions a = new Actions(driver);
        a.doubleClick(e).perform();
        
	}

}
