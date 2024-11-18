package testNG_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon_SecondItem_WishList {
	
@BeforeMethod
public void FM()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement e = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    e.sendKeys("shirt" + Keys.ENTER);
}
	
	@Test
	public void FirstItem()
	{
		ChromeDriver driver = new ChromeDriver();

	    //click on first shirt for this class name : "s-image-padding"
	   WebElement fshirt =   driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
	     fshirt.click();
	     //change the control from parent window to child window
	     //Step1 : get the browser ids
	     //step2 : do the iterator to convert from set to string
	     //step3 : use to driver.switchTo().window(child browser id)
	     Set<String> w = driver.getWindowHandles();
	     System.out.println("Browser id's : " + w);
	     //perfrom iterator to get the seperate windows from set in string format
	     
	       Iterator<String> i = w.iterator();
	       
	       String Parent_Id = i.next();
	       String Child_Id = i.next();
	       
	       System.out.println("Parent_Id : "+ Parent_Id);
	       System.out.println("Child_Id  : "+ Child_Id );
	       
	     /*  while(i.hasNext())
	       {
	    	   Object window_id =i.next();
	    	   System.out.println(window_id);
	       } */
	     
	     driver.switchTo().window(Child_Id);
	     
	     //add item to cart
	     WebElement cart = driver.findElement(By.id("add-to-cart-button"));
	     cart.click();
	     System.out.println("first item added succesfully to the cart");

	     }
	@Test
	public void SecondItem()
	{
		ChromeDriver driver = new ChromeDriver();
		
	    //click on first shirt for this class name : "s-image-padding"
	   WebElement fshirt =   driver.findElement(By.xpath("(//div[@class='s-image-padding'])[2]"));
	     fshirt.click();
	     //change the control from parent window to child window
	     //Step1 : get the browser ids
	     //step2 : do the iterator to convert from set to string
	     //step3 : use to driver.switchTo().window(child browser id)
	     Set<String> w = driver.getWindowHandles();
	     System.out.println("Browser id's : " + w);
	     //perfrom iterator to get the seperate windows from set in string format
	     
	       Iterator<String> i = w.iterator();
	       
	       String Parent_Id = i.next();
	       String Child_Id = i.next();
	       
	       System.out.println("Parent_Id : "+ Parent_Id);
	       System.out.println("Child_Id  : "+ Child_Id );
	       
	     /*  while(i.hasNext())
	       {
	    	   Object window_id =i.next();
	    	   System.out.println(window_id);
	       } */
	     
	     driver.switchTo().window(Child_Id);
	     
	     //add item to cart
	     WebElement cart = driver.findElement(By.id("add-to-cart-button"));
	     cart.click();
	     System.out.println("Second item added succesfully to the cart");
	     }
	

	
	}


