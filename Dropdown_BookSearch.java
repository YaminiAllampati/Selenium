package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_BookSearch {

	public static void main(String[] args) {
      
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//select the book from dropdown
		Select s = new Select(e);
		s.selectByVisibleText("Books");
		//search book - power of minds
		WebElement book = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		book.sendKeys("Power of Minds");
		//search button
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		
		
	}

}
