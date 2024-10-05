package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		//to launch the url
		driver.get("https://www.facebook.com/login/");
		//get the title of the page
		String s = driver.getTitle();
		System.out.println(s);
		//to get the parent window id
		String w = driver.getWindowHandle();
		System.out.println(w);
		//give data to input fields
		driver.findElement(By.id("email")).sendKeys("yaminiallampati@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("yamini");
	    driver.findElement(By.id("loginbutton")).click();
	}

}
