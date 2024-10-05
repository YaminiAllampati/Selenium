package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//fn+f12 -->to inspect the webelement

public class SBI_Login {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e.click();
		WebElement username = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]"));
		boolean b1 = username.isDisplayed();
		System.out.println(b1);
		boolean b2 = username.isEnabled();
		System.out.println(b2);
		if(b1&&b2)
		{
			System.out.println("username inputbox is enabled");
			username.sendKeys("Yamini A");
			
		}
		else
		{
			System.out.println("username input box is not enabled");
		}
		WebElement password = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]"));
		password.sendKeys("Yamini@1428");
		WebElement captcha = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[3]"));
		captcha.sendKeys("34x46");
		WebElement loginbutton = driver.findElement(By.id("Button2"));
		loginbutton.click();
	
		
		
	}

}
