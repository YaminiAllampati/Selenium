package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParalellTesting_Launch {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void launch(String ChooseBrowser) throws InterruptedException
	{
		if(ChooseBrowser.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		if(ChooseBrowser.equals("Edge"))
		{
		driver = new EdgeDriver();
		}
		if(ChooseBrowser.equals("firefox"))
		{
		driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.manage().window().maximize();
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
		
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
