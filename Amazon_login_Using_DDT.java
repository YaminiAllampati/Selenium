package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login_Using_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("AmazonLogin");
		//String email = s.getRow(1).getCell(0).getStringCellValue();
		//to convert numeric to string
		String email = NumberToTextConverter.toText(s.getRow(1).getCell(0).getNumericCellValue());
		String password = NumberToTextConverter.toText(s.getRow(1).getCell(1).getNumericCellValue());
				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=nav_signin&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154953&hvtargid=kwd-83014163717471%3Aloc-90&hydadcr=5621_2377279&msclkid=ed0d22a8dc42159375d7445a24cd67de");
		driver.manage().window().maximize();
		//enter mobile number
		WebElement e = driver.findElement(By.name("email"));
		e.sendKeys(email);
		//click on continue button
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
		WebElement p = driver.findElement(By.id("ap_password"));
		p.sendKeys(password);
		//click on Sign-in button
		WebElement Signinbtn = driver.findElement(By.id("signInSubmit"));
		Signinbtn.click();
		
		
		
	}
	

}
