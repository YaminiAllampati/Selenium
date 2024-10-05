package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMessage_locator {

	public static void main(String[] args) {

		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/#:~:text=Enter%20your%20email%20or%20mobile%20number%20and%20request%20OTP%20to");
		driver.manage().window().maximize();
		//to perform action on fashion text
		WebElement e = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		e.click();
		//to perform action on become a seller text
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Become a Seller'])[2]"));
		e1.click();
		
		
	}

}
