package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin_using_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D154953%26hvtargid%3Dkwd-83014163717471%3Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3Ded0d22a8dc42159375d7445a24cd67de&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//enter mobile number
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("8374850038");
		//click on continue button
		WebElement continuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
		continuebtn.click();
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("9492335791");
		//click on Sign-in button
		WebElement Signinbtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		Signinbtn.click();
		

	}

}
