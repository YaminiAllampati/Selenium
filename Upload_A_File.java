package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_A_File {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("file"));
		e.sendKeys("C:\\Users\\yamin\\Downloads\\Automation batch 45.xlsx");
		WebElement e1 = driver.findElement(By.xpath("//input[@id=\"relocate\"]"));
		boolean b1 = e1.isEnabled();
		System.out.println(b1);
		boolean b2 = e1.isSelected();
		System.out.println("before selected : " + b2);
		//after Selection
		e1.click();
		boolean b3 = e1.isSelected();
		System.out.println("After selected : " + b3);
		e1.click();
		boolean b4 = e1.isSelected();
		System.out.println("After dislecting : " + b4);
		

		
	}

}
