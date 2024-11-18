package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUp_Down {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//a[.=\"About Amazon\"]"));
		//scroll down up to "About Amazon" option at the bottom of the page
		//Scrolling down
	   //get the location of the webElement using getLocation() - method of Point Class
		Point p = e.getLocation();
		//get the x-axis & y-Axis value
		  int x = p.getX();
		  int y = p.getY();
		  System.out.println("X-Axis Value : " + x);
		  System.out.println("Y-Axis Value : " + y);
		  //scrolling down
		  JavascriptExecutor js = driver;
		  js.executeScript("window.scrollBy(0,"+y+")");
		  
		 // Thread.sleep(2000);
		
	}

	
}
