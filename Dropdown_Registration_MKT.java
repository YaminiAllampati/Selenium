package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Registration_MKT {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		//select skills from dropdown
		WebElement e = driver.findElement(By.xpath("//select[@class='Skills ss form-control']"));
		Select s = new Select(e);
		s.selectByVisibleText("Technical Skills");
		//select country from dropdown
	    WebElement e1 = driver.findElement(By.xpath("//select[@class='Country ss form-control']"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("India");
		//select religion from dropdown
	    WebElement e2 = driver.findElement(By.xpath("//select[@class='Relegion ss form-control']"));
		Select s2 = new Select(e2);
		s2.selectByVisibleText("Hindu");
		
	}

}
