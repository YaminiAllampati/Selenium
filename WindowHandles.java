package selenium_Learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8ipd9izczt_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154953&hvtargid=kwd-83014163717471:loc-90&hydadcr=5621_2377279&msclkid=ed0d22a8dc42159375d7445a24cd67d");
		driver.manage().window().maximize();
		//click on customer service link
		 WebElement link = driver.findElement(By.partialLinkText("Customer"));
		 link.click();
		 Set<String> s = driver.getWindowHandles();
	     System.out.println(s);
	}

}
