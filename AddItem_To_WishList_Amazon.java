package selenium_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItem_To_WishList_Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    e.sendKeys("top" + Keys.ENTER);
	    //click on second top for this class name : "s-image-padding"
	   WebElement top =   driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
	     top.click();
	     Set<String> w = driver.getWindowHandles();
	     System.out.println("Browser id's : " + w);
	     //perfrom iterator to get the seperate windows from set in string format 
	       Iterator<String> i = w.iterator();
	       
	       String Parent_Id = i.next();
	       String Child_Id = i.next();
	       
	       System.out.println("Parent_Id : "+ Parent_Id);
	       System.out.println("Child_Id  : "+ Child_Id );
	    
	     driver.switchTo().window(Child_Id);
	     
	     //add item to cart
	     WebElement wishList = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
	     wishList.click();
	     WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("8374850038");
			//click on continue button
			WebElement continuebtn = driver.findElement(By.id("continue"));
			continuebtn.click();
			WebElement password = driver.findElement(By.id("ap_password"));
			password.sendKeys("9492335791");
			//click on Sign-in button
			WebElement Signinbtn = driver.findElement(By.id("signInSubmit"));
			Signinbtn.click();
			WebElement wishList1 = driver.findElement(By.id("add-to-wishlist-button-submit"));
		     wishList1.click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-close\"]")).click();

	}

}
