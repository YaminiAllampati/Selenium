package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_ProductInAmazon_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");
		Workbook w =WorkbookFactory.create(f);
		String url = w.getSheet("AmazonLogin").getRow(1).getCell(2).getStringCellValue();
		String serach = w.getSheet("AmazonLogin").getRow(1).getCell(3).getStringCellValue();
		
		//launch the url and sercah for product
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys(serach + Keys.ENTER);
		
	}

}
