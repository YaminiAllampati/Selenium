package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Fb {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: let java know the file location by creating a object of fileinputstream class by passing the paramter as file location - parameterized constructor
		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");
		//Step :2 now open the excel file by using a create method of  WorkbookFactory class
		Workbook w = WorkbookFactory.create(f);
		//Step3 : go to specific/actual sheet
		Sheet s =   w.getSheet("Login"); 
		//Step4 : Go to the particular row
		   Row r = s.getRow(1);
	    //Step5 : Go to the particular column
		   Cell c =r.getCell(0);
		//step6 : fetch the username from the cell
		    String un =  c.getStringCellValue();
		    System.out.println("username  : " + un);
		//to fetch the password
		    Row r1 = s.getRow(1);
		    Cell c1 =r1.getCell(1); 
			String p =  c1.getStringCellValue();
			System.out.println("password : " + p);
		//to fetch the url
			Row r2 = s.getRow(1);
			Cell c2 = r2.getCell(2);
			 String url = c2.getStringCellValue();	
			 System.out.println(url);
			//lauch the fb login page from fetching the data from excel sheet(workbook)
			ChromeDriver driver = new ChromeDriver();
			//to launch the url
			driver.get(url);
			//driver.get("https://www.facebook.com/login/");
			//get the title of the page
			String s1 = driver.getTitle();
			System.out.println(s1);
			//to get the parent window id
			String w1 = driver.getWindowHandle();
			System.out.println(w1);
			//give data to input fields
			driver.findElement(By.id("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(p);
		    driver.findElement(By.id("loginbutton")).click();
		    
		
		   

	}



}
