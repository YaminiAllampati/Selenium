package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Add_Address_Amazon_DDT {

		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

			FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");
			Workbook w = WorkbookFactory.create(f);
			
			Sheet s = w.getSheet("AmazonAddAddress");
			String email = NumberToTextConverter.toText(s.getRow(1).getCell(7).getNumericCellValue());
			String password = NumberToTextConverter.toText(s.getRow(1).getCell(8).getNumericCellValue());
					
			//name
			String name = s.getRow(1).getCell(0).getStringCellValue();
			//Mobile Number
			String MobileNum  =   NumberToTextConverter.toText(s.getRow(1).getCell(1).getNumericCellValue());
			//pincode
			String pincode  =   NumberToTextConverter.toText(s.getRow(1).getCell(2).getNumericCellValue());
			//flatno
			String flatNo = NumberToTextConverter.toText(s.getRow(1).getCell(3).getNumericCellValue());
			//street
			String Area =      s.getRow(1).getCell(4).getStringCellValue();
			//City
			String city = s.getRow(1).getCell(5).getStringCellValue();
			//state
			//String state = s.getRow(1).getCell(6).getStringCellValue();

			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
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
			Thread.sleep(2000); 
			//click on address
			WebElement a = driver.findElement(By.id("nav-global-location-popover-link"));
			a.click();
			Thread.sleep(2000);
			//click on link address
			WebElement l = driver.findElement(By.xpath("//a[.=\"Add an address or pick-up point \"]"));
			l.click();
			Thread.sleep(2000);
			//add adress
			WebElement add = driver.findElement(By.id("ya-myab-plus-address-icon"));
			add.click();
			
			Thread.sleep(2000);
			WebElement d = driver.findElement(By.xpath("(//span[@class=\"a-button-text a-declarative\"])[3]"));
			d.click();
			Thread.sleep(2000);
			
			//name
			WebElement n = driver.findElement(By.name("address-ui-widgets-enterAddressFullName"));
			n.sendKeys(name);
			
			//mobile number
			WebElement mn = driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber"));
			mn.sendKeys(MobileNum);
			
			//pincode
			WebElement pc = driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode"));
			pc.sendKeys(pincode);
			
			//flatno
			WebElement fn = driver.findElement(By.name("address-ui-widgets-enterAddressLine1"));
			fn.sendKeys(flatNo);
	
			//Area
			WebElement ar = driver.findElement(By.name("address-ui-widgets-enterAddressLine2"));
			ar.sendKeys(Area);
			
			//city
			//WebElement c = driver.findElement(By.name("address-ui-widgets-enterAddressCity"));
			//c.sendKeys(city);
			
			//select state
			List<WebElement> dropdownvalues =driver.findElements(By.xpath("//ul[@class=\"a-nostyle a-list-link\"]/li"));
			WebElement ap =dropdownvalues.get(1);
			System.out.println(ap.getText());
			ap.click();
			Thread.sleep(3000);
			
            WebElement btn=  driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[3]"));
            btn.click();
            
            
            driver.quit();
			
			
			
	}

}
