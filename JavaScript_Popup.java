package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning_AleartMessage.html");
		driver.switchTo().alert().accept();
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("yamini Allampati");
		//driver.manage().window().maximize();
		
	}

}
