package testNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Facebook_Login {
	
	@DataProvider(name="Fb_Login")
		public Object[][] login()
		{
			Object i[][] = new Object[5][2];
			//correct credentials
			i[0][0] = "Yamini@1428"; //username
			i[0][1] = "Test@1";//password
			//incorrect credentials
			i[1][0] = "Yamini@14"; //username
			i[1][1] = "Test1";//password
			//incorrect credentials
			i[2][0] = ""; //username
			i[2][1] = "Test1";
			//incorrect
			i[3][0] = "Yamini12"; //username
			i[3][1] = "";
			//incorrect
			i[4][0] = ""; //username
			i[4][1] = "";
			return i ;
			
		}
	
	
	//int a[] = new int[3];
	
	@Test(dataProvider="Fb_Login")
	public void fb(String Username, String Password)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys(Username);
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys(Password);
		//WebElement login = driver.findElement(By.id("loginbutton"));
		//login.click();
		
		
	}

}
