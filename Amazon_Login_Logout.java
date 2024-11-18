package assert_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Login_Logout {
	
	@Test
	public void test() throws InterruptedException
	{
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	//enter mobile number
	WebElement e = driver.findElement(By.name("email"));
	e.sendKeys("8374850038");
	//click on continue button
	WebElement continuebtn = driver.findElement(By.id("continue"));
	continuebtn.click();
	WebElement p = driver.findElement(By.id("ap_password"));
	p.sendKeys("9492335791");
	//click on Sign-in button
	WebElement Signinbtn = driver.findElement(By.id("signInSubmit"));
	Signinbtn.click();
	Thread.sleep(2000); 
	
	WebElement h = driver.findElement(By.id("nav-link-accountList"));
	
	Actions a = new Actions(driver);
	a.moveToElement(h).perform();
	
	WebElement signout = driver.findElement(By.id("nav-item-signout"));
	signout.click();
	
	/*WebElement t = driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-logo\"]"));
	 
	String d = t.getText();
	System.out.println(d); */
	
	String heading = driver.findElement(By.xpath("//h1[@class=\"a-spacing-small\"]")).getText();
	System.out.println(heading);
	
	Assert.assertEquals(heading,"Sign in");
	
	System.out.println("succesfully logout");
	
	
	
	//String title = driver.getTitle();
	
	//Assert.assertEquals(title,"Amazon Sign In");
	
	//System.out.println("Succesfully logout");
	}

}
