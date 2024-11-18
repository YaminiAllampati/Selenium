package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {

	public static void main(String[] args) throws InterruptedException {
 

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement btn = driver.findElement(By.xpath("//button[.=\"Click \"]"));
		btn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}

}
