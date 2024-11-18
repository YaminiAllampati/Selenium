package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClickOption_LauchGoogle_ClickonLink {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.linkText("Gmail"));
        e.sendKeys(Keys.ENTER);
	}

}
