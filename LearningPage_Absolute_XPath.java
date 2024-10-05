package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPage_Absolute_XPath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yamin/OneDrive/Documents/Learning.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("yamini Allampati");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("testing");
		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("Yamini@1428");///html/body/form[1]/input[1]
		WebElement fname = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		fname.sendKeys("Yamin"); 
		//((/html/body/form)[2]/input)[1]
		WebElement cb1 = driver.findElement(By.xpath("html/body/form[2]/input[1]"));
		cb1.click();
		WebElement cb2 = driver.findElement(By.xpath("html/body/form[2]/input[2]"));
		cb2.click(); 
		WebElement cb3 = driver.findElement(By.xpath("html/body/form[2]/input[3]"));
		cb3.click(); 
		///html/body/input[4]
		WebElement rb1 = driver.findElement(By.xpath("(html/body/input)[4]"));
		rb1.click();
		WebElement rb2 = driver.findElement(By.xpath("(html/body/input)[5]"));
		rb2.click();
		WebElement bnglrcb = driver.findElement(By.xpath("(html/body/input)[6]"));
		bnglrcb.click();
		WebElement link = driver.findElement(By.xpath("/html/body/a"));
		// or driver.findElement(By.tagName(a))
		link.click();
		
		
		
		
	}

}
