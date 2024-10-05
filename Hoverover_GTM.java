package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_GTM {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//div[@class=\"has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child\"]"));
	   Actions a = new Actions(driver);
	   a.moveToElement(e).perform();
	   WebElement c = driver.findElement(By.xpath("(//div[@class=\"popup4\"])[3]"));
	   String s = c.getText();
	   System.out.println(s);
	   c.click();
	}
	

}
