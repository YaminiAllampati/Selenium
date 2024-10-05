package selenium_assignments;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch_Relative_XPath {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8ipd9izczt_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154953&hvtargid=kwd-83014163717471:loc-90&hydadcr=5621_2377279&msclkid=c98b5dc3277216846ecc3b3643ee1173");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes" + Keys.ENTER); 
		//second way to for click option
		//WebElement sbutton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		//sbutton.click();
		
	}
	

}
